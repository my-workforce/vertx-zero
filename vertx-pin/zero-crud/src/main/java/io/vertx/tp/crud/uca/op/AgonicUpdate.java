package io.vertx.tp.crud.uca.op;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.crud.init.IxPin;
import io.vertx.tp.crud.refine.Ix;
import io.vertx.tp.crud.uca.desk.IxIn;
import io.vertx.tp.crud.uca.input.Pre;
import io.vertx.tp.crud.uca.output.Post;
import io.vertx.tp.ke.atom.KModule;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class AgonicUpdate implements Agonic {
    @Override
    public Future<JsonObject> runJAsync(final JsonObject input, final IxIn in) {
        final KModule module = in.module();
        final UxJooq jooq = IxPin.jooq(in);
        return this.runJUnique(input, in)
            .compose(queryJ -> Ux.future(queryJ.copy().mergeIn(input)))
            .compose(json -> Ix.passion(json, in,
                        Pre.auditor(false)::inJAsync         // updatedAt, updatedBy
                    )
                    .compose(processed -> Ix.deserializeT(processed, module))
                    .compose(jooq::updateAsync)
                    .compose(updated -> Post.successJ(updated, module))
            );
    }

    private Future<JsonObject> runJUnique(final JsonObject input, final IxIn in) {
        final UxJooq jooq = IxPin.jooq(in);
        // Query by `key` first
        return Pre.qPk().inJAsync(input, in)
            .compose(jooq::fetchJOneAsync)
            .compose(queryJ -> Ut.isNil(queryJ) ?
                // Query by `unique key` first
                Pre.qUk().inJAsync(input, in)
                    .compose(jooq::fetchJOneAsync)
                    .compose(querySubJ -> Ut.isNil(querySubJ) ?
                        Post.success404Pre()
                        : Ux.future(querySubJ)
                    )
                : Ux.future(queryJ)
            );
    }

    @Override
    public Future<JsonArray> runAAsync(final JsonArray input, final IxIn in) {
        final KModule module = in.module();
        final UxJooq jooq = IxPin.jooq(in);
        return Ix.passion(input, in,
                Pre.auditor(false)::inAAsync         // updatedAt, updatedBy
            )
            .compose(processed -> Ix.deserializeT(processed, module))
            .compose(jooq::updateAsync)
            .compose(updated -> Post.successA(updated, module));
    }
}
