package io.vertx.tp.modular.ray;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.atom.modeling.data.DataAtom;
import io.vertx.tp.atom.modeling.reference.DataQRule;
import io.vertx.tp.atom.modeling.reference.DataQuote;
import io.vertx.tp.atom.refine.Ao;
import io.vertx.tp.ke.refine.Ke;
import io.vertx.tp.modular.dao.AoDao;
import io.vertx.tp.optic.DS;
import io.vertx.tp.plugin.database.DataPool;
import io.vertx.up.commune.Record;
import io.vertx.up.commune.config.Database;
import io.vertx.up.commune.element.AmbJson;
import io.vertx.up.eon.Values;
import io.vertx.up.util.Ut;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
class RaySource {
    private transient final DataQuote quote;
    private transient final DataAtom atom;

    private RaySource(final DataQuote quote, final DataAtom atom) {
        this.quote = quote;
        this.atom = atom;
    }

    static RaySource create(final DataQuote quote, final DataAtom atom) {
        return new RaySource(quote, atom);
    }

    /*
     * RaySource
     * field1 -> DataQRule
     * field2 -> DataQRule
     */
    public ConcurrentMap<String, AmbJson> fetchSingle(final Record record) {
        return this.fetchData(rule -> rule.condition(record));
    }

    /*
     * 批量运算
     */
    public ConcurrentMap<String, AmbJson> fetchBatch(final Record[] records) {
        return this.fetchData(rule -> rule.condition(records));
    }

    public ConcurrentMap<String, DataQRule> rules() {
        return this.quote.rules();
    }

    private ConcurrentMap<String, AmbJson> fetchData(final Function<DataQRule, JsonObject> supplier) {
        final ConcurrentMap<String, AmbJson> data = new ConcurrentHashMap<>();
        this.quote.rules().forEach((field, rule) -> {
            /*
             * 条件处理
             */
            final Class<?> clazz = this.quote.type(field);
            final JsonObject condition = supplier.apply(rule);
            final AmbJson recordReference = this.fetchData(condition, clazz);
            if (Objects.nonNull(recordReference)) {
                data.put(field, recordReference);
            }
        });
        return data;
    }

    private AmbJson fetchData(final JsonObject condition, final Class<?> returnType) {
        final AoDao dao = this.dao();
        final Record[] data = dao.fetch(condition);
        if (JsonObject.class == returnType) {
            if (1 == data.length) {
                final Record record = data[Values.IDX];
                if (Objects.isNull(record)) {
                    return null;
                } else {
                    final JsonObject recordData = record.toJson();
                    return new AmbJson().data(recordData);
                }
            } else {
                /*
                 * 数据规范不合法
                 */
                return null;
            }
        } else {
            /*
             * 多数据结果集
             */
            final JsonArray dataResult = Ut.toJArray(data);
            return new AmbJson().data(dataResult);
        }
    }

    private AoDao dao() {
        return Ke.channelSync(DS.class, () -> null, ds -> {
            /* 连接池绑定数据库 */
            final DataPool pool = ds.switchDs(this.atom.sigma());
            if (Objects.nonNull(pool)) {
                /* 返回AoDao */
                final Database database = pool.getDatabase();
                return Ao.toDao(database, this.atom);
            } else return null;
        });
    }
}
