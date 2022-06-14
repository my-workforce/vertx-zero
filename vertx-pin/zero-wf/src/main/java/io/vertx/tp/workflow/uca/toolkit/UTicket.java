package io.vertx.tp.workflow.uca.toolkit;

import cn.vertxup.workflow.domain.tables.daos.WTicketDao;
import cn.vertxup.workflow.domain.tables.daos.WTodoDao;
import cn.vertxup.workflow.domain.tables.pojos.WTicket;
import cn.vertxup.workflow.domain.tables.pojos.WTodo;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.workflow.atom.configuration.MetaInstance;
import io.vertx.tp.workflow.atom.runtime.WRecord;
import io.vertx.tp.workflow.atom.runtime.WTransition;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.em.ChangeFlag;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import org.camunda.bpm.engine.runtime.ProcessInstance;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class UTicket {
    private final transient MetaInstance metadata;

    public UTicket(final MetaInstance metadata) {
        this.metadata = metadata;
    }

    // ------------- Generate Operation ----------------------
    public Future<WRecord> generateAsync(final JsonObject requestJ, final WTransition wTransition, final WRecord record) {
        final WTicket ticket = record.ticket();
        Objects.requireNonNull(ticket);
        return Ux.Jooq.on(WTicketDao.class).updateAsync(record.ticket()).compose(updated -> {
            record.ticket(updated);
            return Ux.future(updated);
        }).compose(updated -> {
            return Ux.future(record);
        });
    }

    // ------------- Insert Operation ----------------------
    // Save = Insert + Update
    public Future<WRecord> insertAsync(final JsonObject params, final WTransition wTransition) {
        return this.insertTicket(params, wTransition).compose(record -> {
            final WTicket inserted = record.ticket();
            final JsonObject gearInput = params.copy();
            return wTransition.end(gearInput, inserted)
                .compose(Ux.Jooq.on(WTodoDao.class)::insertAsync)
                .compose(tasks -> {
                    record.task(tasks);
                    return Ux.future(record);
                });
        });
    }


    /*
     * Code Logical 1:
     * Here the system will create new ticket, it means that related `MODEL_KEY` is null, the structure is:
     * {
     *      "key": null,
     *      "record": {
     *          "key": null or has value
     *      }
     * }
     * We should prepare the whole key related here to build relationship between
     * -- WTicket + Extension Ticket
     * -- WTicket + Extension Entity
     *
     */
    public Future<WRecord> saveAsync(final JsonObject params, final WTransition wTransition) {
        /*
         * Ticket Data Updating
         * 1. Fetch record by `traceId` field
         * 2. If null, create new ticket with todo ( Closed )
         */
        final JsonObject ticketJson = params.copy();
        final String tKey = ticketJson.getString(KName.Flow.TRACE_ID);
        final UxJooq tJq = Ux.Jooq.on(WTicketDao.class);
        return tJq.<WTicket>fetchByIdAsync(tKey).compose(ticket -> {
            if (Objects.isNull(ticket)) {
                return this.insertAsync(params, wTransition);
            } else {
                final WRecord record = WRecord
                    .create(true, ChangeFlag.UPDATE)
                    .bind(wTransition.vague());


                return this.updateTicket(params, ticket, record)
                    .compose(processed -> this.updateExtension(params, processed))
                    .compose(processed -> this.updateTodo(params, processed));
            }
        });
    }

    public Future<WRecord> updateAsync(final JsonObject params, final WTransition wTransition) {
        /*
         * Ticket Data Updating
         * 1. Extract key from `traceId` field
         * 2. Remove `key` because here the `key` field is W_TODO
         */
        final String tKey = params.getString(KName.Flow.TRACE_ID);
        final WRecord record = WRecord
            .create(true, ChangeFlag.UPDATE)
            .bind(wTransition.vague());


        /*
         * Steps:
         * 1. WTicket
         * 2. Extension
         * 3. WTodo
         */
        return Ux.Jooq.on(WTicketDao.class).<WTicket>fetchByIdAsync(tKey)
            .compose(processed -> this.updateTicket(params, processed, record))
            .compose(processed -> this.updateExtension(params, processed))
            .compose(processed -> this.updateTodo(params, processed));
    }

    // ------------- Private Update Operation ----------------------
    private Future<WRecord> insertTicket(final JsonObject params, final WTransition wTransition) {
        final WRecord record = WRecord
            .create(true, ChangeFlag.ADD)
            .bind(wTransition.vague());

        // Todo Build
        return this.metadata.todoInitialize(params)
            .compose(normalized -> {
                // Ticket Workflow ( normalized = params )
                final JsonObject ticketJ = normalized.copy();
                ticketJ.remove(KName.KEY);
                final WTicket ticket = Ux.fromJson(ticketJ, WTicket.class);
                /*
                 * null value when ticket processed
                 *
                 *  - code: came from serial
                 * 「Camunda」
                 *  - flowDefinitionKey: came from json
                 *  - flowDefinitionId: came from json
                 *  - flowInstanceId: came from process
                 *  - flowEnd: false when insert todo
                 *
                 * 「Flow」
                 *  - cancelBy
                 *  - cancelAt
                 *  - closeBy
                 *  - closeAt
                 *  - closeSolution
                 *  - closeCode
                 *
                 * 「Future」
                 *  - metadata
                 *  - modelCategory
                 *  - category
                 *  - categorySub
                 */
                ticket.setKey(normalized.getString(KName.Flow.TRACE_KEY));      // Connect ticket key
                ticket.setFlowEnd(Boolean.FALSE);
                final ProcessInstance instance = wTransition.instance();
                ticket.setFlowInstanceId(instance.getId());
                return Ux.Jooq.on(WTicketDao.class).insertAsync(ticket).compose(inserted -> {
                    record.ticket(inserted);
                    return Ux.future(normalized);
                });
            })
            .compose(dataJ -> this.updateExtension(dataJ, record));
    }

    private Future<WRecord> updateTicket(final JsonObject params, final WTicket ticket, final WRecord recordRef) {
        /*
         * Here recordRef contains:
         * 1) Current record data
         * 2) Prev record reference
         */
        Objects.requireNonNull(recordRef.prev());
        final WRecord prev = recordRef.prev();
        prev.ticket(ticket);

        final UxJooq tJq = Ux.Jooq.on(WTicketDao.class);
        final JsonObject ticketJ = params.copy();

        // Compress Json
        this.compressJ(ticketJ);
        final WTicket combine = Ux.updateT(ticket, ticketJ);
        return tJq.updateAsync(combine).compose(updated -> {
            /*
             * Key Point for attachment linkage here, the linkage must contain
             * serial part in params instead of distinguish between ADD / EDIT
             */
            if (!params.containsKey(KName.SERIAL)) {
                params.put(KName.SERIAL, ticket.getSerial());
            }
            // 「Record」Bind Updated
            recordRef.ticket(updated);
            return Ux.future(recordRef);
        });
    }


    private Future<WRecord> updateTodo(final JsonObject params, final WRecord recordRef) {
        final UxJooq tJq = Ux.Jooq.on(WTodoDao.class);
        final String key = params.getString(KName.KEY);
        return tJq.<WTodo>fetchByIdAsync(key).compose(query -> {
            Objects.requireNonNull(query);
            final WRecord prev = recordRef.prev();
            if (Objects.nonNull(prev)) {
                // 「Record」Bind Original
                prev.task(query);
            }

            final JsonObject todoJ = params.copy();

            // Compress Json
            this.compressJ(todoJ);
            final WTodo updated = Ux.updateT(query, todoJ);
            return tJq.updateAsync(updated).compose(todo -> {
                // 「Record」Bind Updated
                recordRef.task(todo);
                return Ux.future(recordRef);
            });
        });
    }

    /*
     * {
     *     "children": {
     *         "dao": "xxx",
     *         "fields": [
     *             "xxx"
     *         ],
     *         "auditor": [
     *         ]
     *     }
     * }
     */
    private Future<WRecord> updateExtension(final JsonObject params, final WRecord recordRef) {
        /*
         * children -> dao
         *
         * 1. When the extension Dao has not been configured, ignore this step
         * 2. The configuration is as above
         */
        final UxJooq tJq = this.metadata.childDao();
        if (Objects.isNull(tJq)) {
            return Ux.future(recordRef);
        }


        /*
         * children -> fields
         *
         * Here the data will contain `children` fields only
         * Extract the data based on fields.
         */
        // JsonObject data for child
        final JsonObject data = this.metadata.childData(params);


        /*
         * The WTicket and childJ shared `key` between ticket / child ticket
         * W_TICKET JOIN W_XXX ON W_TICKET.KEY = W_XXX.KEY
         */
        final WTicket ticket = recordRef.ticket();
        data.put(KName.KEY, ticket.getKey());
        return tJq.fetchJOneAsync(KName.KEY, ticket.getKey())
            .compose(queryJ -> {
                /*
                 * Because of updating on child record
                 * The `original` child JsonObject must exist and also you
                 * should bind the `original` child JsonObject to
                 * `prev` ( Previous ) record reference.
                 */
                Objects.requireNonNull(queryJ);
                final WRecord prev = recordRef.prev();
                if (Objects.nonNull(prev)) {
                    // 「Record」Bind Original
                    prev.ticket(queryJ);
                }



                /*
                 * CombineJ contains:
                 * 1. data          -> Input JsonObject ( Data )
                 * 2. queryJ        -> Original JsonObject
                 * The direction is as:
                 * queryJ <- data
                 * The data will overwrite the queryJ here.
                 */
                final JsonObject combineJ = queryJ.copy().mergeIn(data, true);
                if (Ut.isNil(queryJ)) {
                    // Does not Exist
                    return tJq.insertJAsync(combineJ);
                } else {
                    // Existing
                    return tJq.updateJAsync(ticket.getKey(), combineJ);
                }
            }).compose(updated -> {
                // 「Record」Bind Updated, Update the ticket in WRecord
                recordRef.ticket(updated);
                return Ux.future(recordRef);
            });
    }

    /*
     * Remove all fields that will not be updated
     * */
    private void compressJ(final JsonObject dataJ) {
        // Uniform Fields
        dataJ.remove(KName.KEY);
        dataJ.remove(KName.SERIAL);
        dataJ.remove(KName.CODE);
        dataJ.remove(KName.CREATED_BY);
        dataJ.remove(KName.CREATED_AT);
        dataJ.remove(KName.SIGMA);
        dataJ.remove(KName.LANGUAGE);
        dataJ.remove(KName.METADATA);

        // Workflow
        dataJ.remove(KName.Flow.FLOW_DEFINITION_KEY);
        dataJ.remove(KName.Flow.FLOW_DEFINITION_ID);
        dataJ.remove(KName.Flow.FLOW_INSTANCE_ID);

        // Task Part
        dataJ.remove(KName.Flow.TASK_KEY);
        dataJ.remove(KName.Flow.TASK_ID);
    }
}