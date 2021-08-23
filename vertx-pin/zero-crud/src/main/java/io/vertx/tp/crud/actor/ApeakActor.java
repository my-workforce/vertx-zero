package io.vertx.tp.crud.actor;

import io.vertx.core.json.JsonObject;
import io.vertx.tp.ke.atom.KModule;
import io.vertx.tp.ke.atom.view.KParamView;
import io.vertx.up.eon.KName;

import java.util.Objects;

/*
 * {
 *      "identifier": "column identifier bind",
 *      "dynamic": "Whether use dynamic mode to get column",
 *      "view": "DEFAULT, the view name"
 * }
 */
class ApeakActor extends AbstractActor {
    @Override
    public JsonObject proc(final JsonObject data, final KModule module) {
        /* Column Definition */
        final KParamView column = module.getColumn();
        if (Objects.nonNull(column)) {
            /*
             * In static mode, identifier could found ui file
             * In dynamic mode, identifier & sigma could let system fetch columns
             * from database directly.
             * Here add new parameter `view` for future usage to support multi views
             */
            data.put(KName.IDENTIFIER, column.getIdentifier());
            data.put(KName.DYNAMIC, column.getDynamic());
            data.put(KName.VIEW, column.getView());
        }
        return data;
    }
}
