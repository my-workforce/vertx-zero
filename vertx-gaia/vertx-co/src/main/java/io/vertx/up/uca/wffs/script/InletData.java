package io.vertx.up.uca.wffs.script;

import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.em.ChangeFlag;
import io.vertx.up.util.Ut;
import org.apache.commons.jexl3.JexlContext;

import java.util.HashMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class InletData extends AbstractInlet {
    @Override
    public void compile(final JexlContext context, final JsonObject data, final JsonObject config) {
        /*
         * New Data / Old Data Checking
         * The latest data
         * {
         *
         * }
         * The old data
         * {
         *     "__data": {}
         * }
         */
        final ChangeFlag flag = Ut.aiFlag(data);
        this.logger().info("[ Script ] ( Flag ) Execution Operation: {0}", flag);
        if (ChangeFlag.ADD == flag) {
            context.set("$zo", new HashMap<>());
            this.logger().info("[ Script ] ( Data O-N ) The variable `$zo` has been empty");
        } else {
            final JsonObject valueO = Ut.aiDataO(data);
            context.set("$zo", valueO.getMap());
            this.logger().info("[ Script ] ( Data OLD ) The variable `$zo` has been bind: {0}", valueO.encode());
        }

        if (ChangeFlag.DELETE == flag) {
            context.set("$zn", new HashMap<>());
            this.logger().info("[ Script ] ( Data N-N ) The variable `$zn` has been empty");
        } else {
            final JsonObject valueN = Ut.aiDataN(data);
            context.set("$zn", valueN.getMap());
            this.logger().info("[ Script ] ( Data NEW ) The variable `$zn` has been bind: {0}", valueN.encode());
        }
    }
}
