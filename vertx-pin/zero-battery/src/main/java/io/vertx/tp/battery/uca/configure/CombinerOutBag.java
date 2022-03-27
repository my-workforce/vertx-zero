package io.vertx.tp.battery.uca.configure;

import cn.vertxup.battery.domain.tables.pojos.BBag;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class CombinerOutBag implements Combiner<JsonObject, BBag> {
    @Override
    public Future<JsonObject> configure(final JsonObject response, final BBag bag) {
        /*
         * Extract required fields
         * - name, nameAbbr, nameFull
         * - uiIcon, uiStyle, uiSort
         * - key
         *
         * {
         *      "bag": {
         *      }
         * }
         */
        JsonObject bagRef = response.getJsonObject(KName.App.BAG);
        if (Objects.isNull(bagRef)) {
            bagRef = new JsonObject();
            response.put(KName.App.BAG, bagRef);
        }
        final JsonObject bagJ = CombinerKit.normalize(bag);
        bagRef.mergeIn(bagJ, true);
        // Double Check for Ensure
        {
            response.put(KName.App.BAG, bagRef);
        }
        return Ux.future(response);
    }
}