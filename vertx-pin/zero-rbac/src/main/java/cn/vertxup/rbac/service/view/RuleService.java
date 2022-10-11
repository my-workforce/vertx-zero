package cn.vertxup.rbac.service.view;

import cn.vertxup.rbac.domain.tables.daos.SPacketDao;
import cn.vertxup.rbac.domain.tables.daos.SPathDao;
import cn.vertxup.rbac.domain.tables.daos.SViewDao;
import cn.vertxup.rbac.domain.tables.pojos.SPacket;
import cn.vertxup.rbac.domain.tables.pojos.SPath;
import cn.vertxup.rbac.domain.tables.pojos.SView;
import io.vertx.aeon.specification.secure.HValve;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.rbac.acl.rapier.Quest;
import io.vertx.tp.rbac.atom.ScOwner;
import io.vertx.tp.rbac.refine.Sc;
import io.vertx.tp.rbac.ruler.AdmitValve;
import io.vertx.up.atom.query.engine.Qr;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.KValue;
import io.vertx.up.eon.Strings;
import io.vertx.up.fn.Fn;
import io.vertx.up.uca.cache.Cc;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class RuleService implements RuleStub {
    private static final Cc<String, HValve> CC_VALVE = Cc.openThread();
    @Inject
    private transient VisitStub visitStub;

    @Override
    public Future<JsonArray> regionAsync(final List<SPath> paths) {
        /*
         * Major Path Configuration
         * 1. Not null and `runComponent` is not null
         * 2. `parentId` is null
         * 3. Sort By `uiSort`
         */
        final List<SPath> filtered = paths.stream()
            .filter(Objects::nonNull)
            .filter(item -> Ut.isNil(item.getParentId()))
            .sorted(Comparator.comparing(SPath::getUiSort))
            .collect(Collectors.toList());

        /*
         * Children Grouped
         */
        final ConcurrentMap<String, List<SPath>> grouped =
            Ut.elementGroup(paths.stream()
                .filter(Objects::nonNull)
                .filter(item -> Ut.notNil(item.getParentId()))
                .collect(Collectors.toList()), SPath::getParentId);
        return Fn.combineT(filtered, input -> Sc.cacheAdmit(input, path -> {
            /*
             * Extract `runComponent` to build `HValve` and then run it based on configured
             * Information here.
             */
            final Class<?> clazz = Ut.clazz(path.getRunComponent(), AdmitValve.class);
            if (Objects.isNull(clazz)) {
                return Ux.future();
            }
            final String cacheKey = path.getSigma() + Strings.SLASH + path.getCode();
            final HValve value = CC_VALVE.pick(() -> Ut.instance(clazz), cacheKey);
            final JsonObject pathJ = Ux.toJson(path);
            /*
             * JsonObject Configuration for SPath here
             */
            Fn.ifJObject(pathJ,
                // UI Configuration
                KName.UI_CONFIG,
                KName.UI_CONDITION,
                KName.UI_SURFACE,
                // DM Configuration
                KName.DM_CONDITION,
                KName.DM_CONFIG,
                // metadata / mapping
                KName.METADATA,
                KName.MAPPING
            );
            /*
             * Build map based on `code` for Area usage
             * `children` of pathJ
             */
            if (grouped.containsKey(path.getKey())) {
                final JsonArray children = Ux.toJson(grouped.getOrDefault(path.getKey(), new ArrayList<>()));
                pathJ.put(KName.CHILDREN, children);
            }
            return value.configure(pathJ);
        })).compose(Ux::futureA);
    }

    @Override
    public Future<JsonObject> regionAsync(final JsonObject pathData, final ScOwner owner) {
        /*
         * 查找合法的被影响资源，此处会有很多种变化
         * - 每个Region影响的资源可能是多个值，也可能是一个值
         * - 由于Region在前端读取的时候已经是执行过 type 维度的条件，所以此处不再考虑 type 参数
         *   type 直接从 region 的 runType 中提取
         * - 此处提取时直接按照 region codes + sigma 二者的值来提取 Pocket 定义
         */
        final SPath path = Ux.fromJson(pathData, SPath.class);
        return Ux.Jooq.on(SPathDao.class).<SPath>fetchAsync(KName.PARENT_ID, path.getKey())
            .compose(children -> {
                // CODE IN (?, ?, ?) AND SIGMA = ?
                final JsonObject condition = Ux.whereAnd()
                    .put(KName.SIGMA, path.getSigma());
                final JsonArray codes = new JsonArray().add(path.getCode());
                children.forEach(child -> codes.add(child.getCode()));
                // SPath -> SPacket
                return Ux.Jooq.on(SPacketDao.class).<SPacket>fetchAsync(condition);
            })
            .compose(packets -> Quest.syntax().fetchAsync(pathData, packets, owner));
    }

    @Override
    public Future<JsonArray> fetchViews(final String ownerType, final String ownerId,
                                        final JsonArray keys, final String view) {
        final JsonObject condition = new JsonObject();
        condition.put(KName.OWNER, ownerId);
        condition.put(KName.OWNER_TYPE, ownerType);
        condition.put("resourceId,i", keys);
        condition.put(KName.NAME, view);
        return Ux.Jooq.on(SViewDao.class).fetchAndAsync(condition).compose(Ux::futureA)
            .compose(Fn.ifJArray("rows", Qr.KEY_CRITERIA, Qr.KEY_PROJECTION));
    }

    @Override
    public Future<JsonArray> saveViews(final String ownerType, final String ownerId,
                                       final JsonArray views, final String view) {
        final Set<String> keySet = Ut.valueSetString(views, KName.RESOURCE_ID);
        /*
         * owner, ownerType, resourceId, name are unique
         * Because of here:
         *
         * 1. owner, ownerType are both the same
         * 2. view is default name: DEFAULT
         *
         * In this kind of situation, we could consider resourceId as unique key
         */
        final ConcurrentMap<String, JsonObject> newMap = Ut.elementMap(views, KName.RESOURCE_ID);
        return this.fetchViews(ownerType, ownerId, Ut.toJArray(keySet), view).compose(original -> {
            final ConcurrentMap<String, JsonObject> oldMap = Ut.elementMap(original, KName.RESOURCE_ID);
            /*
             * Calculate new data here for processing
             *
             * ADD, DELETE, UPDATE
             *
             * Here mustn't be `DELETE` because in front tier there is no user interface
             * to remove view on owner entity.
             */
            final List<SView> addQueue = new ArrayList<>();
            final List<SView> upQueue = new ArrayList<>();
            newMap.keySet().forEach(resourceId -> {
                if (oldMap.containsKey(resourceId)) {
                    /*
                     * Old and new both contains `resourceId`,
                     * It means UPDATE happen
                     */
                    final JsonObject previous = oldMap.get(resourceId);
                    previous.mergeIn(newMap.get(resourceId));
                    final SView normalized = Ut.deserialize(previous.copy(), SView.class);
                    upQueue.add(normalized);
                } else {
                    /*
                     * Old not, but new contains
                     * ADD happen
                     */
                    final JsonObject added = newMap.get(resourceId);
                    final SView normalized = Ut.deserialize(added.copy(), SView.class);
                    /*
                     * Spec fields that should added default
                     */
                    normalized.setActive(Boolean.TRUE);
                    normalized.setName(KValue.View.VIEW_DEFAULT);
                    addQueue.add(normalized);
                }
            });
            /*
             * Update first and then add new into our queue
             * and database for sync here
             */
            final UxJooq jooq = Ux.Jooq.on(SViewDao.class);
            final JsonArray response = new JsonArray();
            return jooq.updateAsync(upQueue)
                .compose(Ux::futureA)
                .compose(updated -> {
                    /*
                     * Stored data into updated queue
                     */
                    response.addAll(updated);
                    return Ux.future();
                })
                .compose(nil -> jooq.insertAsync(addQueue))
                .compose(Ux::futureA)
                .compose(Fn.ifJArray("rows", Qr.KEY_CRITERIA, Qr.KEY_PROJECTION))
                //                .compose(Ke.mounts("rows", "criteria"))
                //                .compose(result -> {
                //                    Ut.itJArray(result).forEach(json -> Ke.mountArray(json, "projection"));
                //                    return Ux.future(result);
                //                })
                .compose(inserted -> {
                    /*
                     * Stored data into inserted queue here
                     */
                    response.addAll(inserted);
                    return Ux.future(response);
                });
        }).compose(viewData -> {
            /*
             * viewData -> JsonArray to store all views
             * newMap -> ( resourceId = JsonObject )
             * Here JsonObject may contains visitantData when viewData contain ( visitant = true )
             */
            return this.saveVisitants(viewData, newMap);
        });
    }

    /*
     * Save `visitants` in batch
     */
    private Future<JsonArray> saveVisitants(final JsonArray views, final ConcurrentMap<String, JsonObject> resourceMap) {
        final List<Future<JsonObject>> futures = new ArrayList<>();
        Ut.itJArray(views).filter(view -> view.getBoolean("visitant", Boolean.FALSE)).forEach(view -> {
            /*
             * view is S_VIEW record
             * resourceMap is request data here
             */
            final String resourceId = view.getString(KName.RESOURCE_ID);
            if (Ut.notNil(resourceId) && resourceMap.containsKey(resourceId)) {
                final JsonObject requestData = resourceMap.get(resourceId);
                if (requestData.containsKey("visitantData")) {
                    final JsonObject visitantData = requestData.getJsonObject("visitantData");
                    if (Ut.notNil(visitantData)) {
                        futures.add(this.visitStub.saveAsync(visitantData.copy(), view)
                            /*
                             * Processed for views
                             */
                            .compose(processed -> Ux.future(view.put("visitantData", processed)))
                        );
                    }
                }
            }
        });
        return Fn.combineA(futures).compose(nil -> Ux.future(views));
    }
}
