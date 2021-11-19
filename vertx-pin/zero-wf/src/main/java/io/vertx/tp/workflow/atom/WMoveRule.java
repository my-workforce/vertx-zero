package io.vertx.tp.workflow.atom;

import com.fasterxml.jackson.databind.JsonObjectDeserializer;
import com.fasterxml.jackson.databind.JsonObjectSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.Strings;

import java.io.Serializable;
import java.util.Objects;

/**
 * <pre><code>
 *     {
 *         "field": "xxx",
 *         "value": xxx,
 *         "record": {
 *             "field1": "value1",
 *             "field2": "value2"
 *         },
 *         "todo": {
 *             "field1": "value1",
 *             "field2": "value2
 *         }
 *     }
 * </code></pre>
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class WMoveRule implements Serializable {
    // The condition field name, it should be in root data part
    private transient String field;
    // The condition result value, it should be detected by the workflow engine
    private transient String value;

    // The data part that applied to W_TODO
    @JsonSerialize(using = JsonObjectSerializer.class)
    @JsonDeserialize(using = JsonObjectDeserializer.class)
    private transient JsonObject todo = new JsonObject();
    // The data part that applied to related record
    @JsonSerialize(using = JsonObjectSerializer.class)
    @JsonDeserialize(using = JsonObjectDeserializer.class)
    private transient JsonObject record = new JsonObject();

    public String getField() {
        return this.field;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public JsonObject getTodo() {
        return this.todo;
    }

    public void setTodo(final JsonObject todo) {
        this.todo = todo;
    }

    public JsonObject getRecord() {
        return this.record;
    }

    public void setRecord(final JsonObject record) {
        this.record = record;
    }

    public boolean valid() {
        return Objects.nonNull(this.field) && Objects.nonNull(this.value);
    }

    public String key() {
        return this.field + Strings.EQUAL + this.value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final WMoveRule wMoveRule = (WMoveRule) o;
        return this.field.equals(wMoveRule.field) && this.value.equals(wMoveRule.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.field, this.value);
    }

    @Override
    public String toString() {
        return "WMoveRule{" +
            "field='" + this.field + '\'' +
            ", value='" + this.value + '\'' +
            ", todo=" + this.todo +
            ", record=" + this.record +
            '}';
    }
}
