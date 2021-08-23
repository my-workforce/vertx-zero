package cn.vertxup.crud.api;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.crud.actor.IxActor;
import io.vertx.tp.crud.connect.IxLinker;
import io.vertx.tp.crud.cv.Addr;
import io.vertx.tp.crud.refine.Ix;
import io.vertx.tp.ke.refine.Ke;
import io.vertx.tp.optic.ApeakMy;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.commune.Envelop;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.Strings;
import io.vertx.up.log.Annal;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

@Queue
public class GetActor {
    private static final Annal LOGGER = Annal.get(GetActor.class);

    /*
     * GET: /api/{actor}/{key}
     *     200: JqTool Data
     *     204: JqTool No Data
     */
    @Address(Addr.Get.BY_ID)
    public Future<Envelop> getById(final Envelop request) {
        return Ix.create(this.getClass()).input(request).envelop((dao, config) -> {
            /* Key */
            final String key = Ux.getString1(request);
            return dao.fetchByIdAsync(key)
                    .compose(queried -> null == queried ?
                            /* 204 */
                            IxHttp.success204(queried) :
                            /* 200 */
                            IxHttp.success200(queried, config))
                    .compose(response -> IxLinker.get().joinJAsync(request,
                            response.data(), config));
        });
    }

    /*
     * GET: /api/{actor}/by/sigma
     *      200: JqTool All
     */
    @Address(Addr.Get.BY_SIGMA)
    public Future<Envelop> getAll(final Envelop request) {
        return Ix.create(this.getClass()).input(request).envelop((dao, config) -> {
            /* Headers */
            final JsonObject headers = request.headersX();
            final String sigma = headers.getString(KName.SIGMA);
            Ix.infoFilters(GetActor.LOGGER, "All data by sigma: {0}", sigma);
            if (Ut.isNil(sigma)) {
                return Ux.future(Envelop.success(new JsonArray()));
            } else {
                final String pojo = config.getPojo();
                final JsonObject filters = new JsonObject();
                /*
                 * For `/api/{actor}/by/sigma`
                 * Only support extract the data that active = true
                 */
                filters.put(KName.SIGMA, sigma);
                filters.put(Strings.EMPTY, Boolean.TRUE);
                filters.put(KName.ACTIVE, Boolean.TRUE);
                /*
                 * Get List<T> from database that `active = true`
                 */
                return dao.fetchAsync(filters)
                        .compose(list -> Ux.futureA(list, pojo))
                        .compose(result -> Ix.serializeA(result, config))
                        .compose(IxHttp::success200);
            }
        });
    }

    /*
     * GET: /api/columns/{actor}/full
     */
    @Address(Addr.Get.COLUMN_FULL)
    public Future<Envelop> getFull(final Envelop request) {
        /* Search full column and it will be used in another method */
        return Ix.create(this.getClass()).input(request).envelop((dao, config) -> {
            /* Defined KModule */
            return Unity.fetchFull(dao, request, config)
                    .compose(response -> IxLinker.full().joinAAsync(request,
                            response, config));
        });
    }

    /*
     * GET: /api/columns/{actor}/my
     */
    @Address(Addr.Get.COLUMN_MY)
    @SuppressWarnings("all")
    public Future<Envelop> getMy(final Envelop request) {
        return Ix.create(this.getClass()).input(request).envelop((dao, config) ->
                /* Get Stub */
                Ke.channelAsync(ApeakMy.class, () -> Ux.future(new JsonArray()).compose(IxHttp::success200),
                        stub -> Unity.fetchView(dao, request, config)
                                /* View parameters filling */
                                .compose(input -> IxActor.view().procAsync(input, config))
                                /* Uri filling, replace inited information: uri , method */
                                .compose(input -> IxActor.uri().bind(request).procAsync(input, config))
                                /* User filling */
                                .compose(input -> IxActor.user().bind(request).procAsync(input, config))
                                /* Fetch My Columns */
                                .compose(stub.on(dao)::fetchMy)
                                /* Return Result */
                                .compose(IxHttp::success200)));
    }
}
