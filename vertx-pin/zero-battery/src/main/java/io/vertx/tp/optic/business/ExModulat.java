package io.vertx.tp.optic.business;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.battery.uca.dock.Ark;
import io.vertx.tp.optic.feature.Modulat;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class ExModulat implements Modulat {
    @Override
    public Future<JsonObject> extension(final JsonObject appJson) {
        final String key = appJson.getString(KName.KEY);
        return this.extension(key).compose(moduleJ -> {
            /*
             * appJ + moduleJ to build response ( Final )
             */
            final JsonObject original = moduleJ.copy();
            original.mergeIn(appJson, true);
            return Ux.future(original);
        });
    }

    @Override
    public Future<JsonObject> extension(final String appId) {
        Objects.requireNonNull(appId);
        final JsonObject appJ = new JsonObject();
        return this.moduleAdmin(appId).compose(moduleJ -> {
            appJ.mergeIn(moduleJ, true);
            return Ux.future(appJ);
        });
    }

    /*
     * This is for administration in development center
     * {
     *     "store": "mXXX"
     * }
     * "mXXX" = configuration json that stored into B_BLOCK ( Multi tables )
     */
    private Future<JsonObject> moduleAdmin(final String appId) {
        final Ark ark = Ark.configure();
        return ark.modularize(appId)
            .compose(data -> Ux.future((JsonObject) data));
    }
}
