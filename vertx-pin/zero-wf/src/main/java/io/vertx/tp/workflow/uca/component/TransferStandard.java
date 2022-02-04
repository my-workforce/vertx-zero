package io.vertx.tp.workflow.uca.component;

import cn.zeroup.macrocosm.cv.em.TodoStatus;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.workflow.atom.*;
import io.vertx.tp.workflow.uca.runner.IsOn;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import org.camunda.bpm.engine.task.Task;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class TransferStandard extends AbstractTodo implements Transfer {
    @Override
    public Future<WRecord> moveAsync(final JsonObject params, final WInstance wInstance) {
        // Update current todo information
        final JsonObject updatedData = KitTodo.closeJ(params, wInstance);
        return this.updateAsync(updatedData)
            // Record Updating or Not
            .compose(record -> this.updateRecord(record, params, wInstance))
            .compose(record -> wInstance.next().compose(taskNext -> {
                /*
                 * Todo Generation Condition
                 * 1. Instance is not ended
                 * 2. Next task is UserEvent
                 */
                final IsOn is = IsOn.get();
                if (wInstance.isContinue() && is.isUserEvent(taskNext)) {
                    /*
                     * Create new WInstance based on process / task and move
                     *
                     * Here instance contains previous data such as:
                     * 1. Task
                     * 2. Configuration is runConfig
                     * 3. ProcessInstance
                     *
                     * The WMove should be generated by
                     * 1. Previous task definition key
                     * 2. Data with
                     */
                    final WInstance instanceNext = WInstance.create();
                    {
                        final Task task = wInstance.task();
                        final WMove move = this.moveGet(task.getTaskDefinitionKey());
                        move.stored(params);
                        instanceNext.bind(taskNext).bind(move).bind(wInstance.instance());
                    }
                    return this.generateAsync(record, instanceNext);
                } else {
                    return Ux.future(record);
                }
            }));
    }

    private Future<WRecord> updateRecord(final WRecord wRecord, final JsonObject params, final WInstance instance) {
        final TodoStatus status = Ut.toEnum(TodoStatus.class, params.getString(KName.STATUS));
        final JsonObject request = params.copy();
        if (TodoStatus.DRAFT == status) {
            /*
             * Draft -> Pending, no decision field processing
             */
            final ConfigTodo configTodo = new ConfigTodo(wRecord);
            return this.recordUpdate(request, configTodo).compose(nil -> Ux.future(wRecord));
        } else if (TodoStatus.PENDING == status) {
            final WMoveRule moveRule = instance.rule();
            if (Objects.nonNull(moveRule) && Ut.notNil(moveRule.getRecord())) {
                /*
                 * Here will fetch record auto
                 */
                final JsonObject record = Ut.sureJObject(request.getJsonObject(KName.RECORD));
                record.mergeIn(moveRule.getRecord());
                request.put(KName.RECORD, record);
                /*
                 * Contains record modification, do updating on record.
                 */
                final ConfigTodo configTodo = new ConfigTodo(record);
                return this.recordUpdate(request, configTodo).compose(nil -> Ux.future(wRecord));
            }
        }
        return Ux.future(wRecord);
    }
}
