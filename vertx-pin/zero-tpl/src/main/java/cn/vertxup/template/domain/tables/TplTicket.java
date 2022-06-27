/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.template.domain.tables;


import cn.vertxup.template.domain.Db;
import cn.vertxup.template.domain.Keys;
import cn.vertxup.template.domain.tables.records.TplTicketRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TplTicket extends TableImpl<TplTicketRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.TPL_TICKET</code>
     */
    public static final TplTicket TPL_TICKET = new TplTicket();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.KEY</code>. 「key」- 增量记录ID
     */
    public final TableField<TplTicketRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 增量记录ID");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.CODE</code>. 「code」- 编码
     */
    public final TableField<TplTicketRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(50).nullable(false), this, "「code」- 编码");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.NAME</code>. 「name」- 名称
     */
    public final TableField<TplTicketRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(50), this, "「name」- 名称");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.DESCRIPTION</code>. 「description」-
     * 描述
     */
    public final TableField<TplTicketRecord, String> DESCRIPTION = createField(DSL.name("DESCRIPTION"), SQLDataType.VARCHAR(255), this, "「description」- 描述");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.TYPE</code>. 「type」- 分类
     */
    public final TableField<TplTicketRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36), this, "「type」- 分类");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.STATUS</code>. 「status」- 状态
     */
    public final TableField<TplTicketRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(36), this, "「status」- 状态");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.SYSTEM</code>. 「system」- 是否属于系统模板
     */
    public final TableField<TplTicketRecord, Boolean> SYSTEM = createField(DSL.name("SYSTEM"), SQLDataType.BIT, this, "「system」- 是否属于系统模板");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public final TableField<TplTicketRecord, String> MODEL_ID = createField(DSL.name("MODEL_ID"), SQLDataType.VARCHAR(255), this, "「modelId」- 关联的模型identifier，用于描述");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<TplTicketRecord, String> MODEL_KEY = createField(DSL.name("MODEL_KEY"), SQLDataType.VARCHAR(36), this, "「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.MODEL_CATEGORY</code>.
     * 「modelCategory」- 模型分类
     */
    public final TableField<TplTicketRecord, String> MODEL_CATEGORY = createField(DSL.name("MODEL_CATEGORY"), SQLDataType.VARCHAR(36), this, "「modelCategory」- 模型分类");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.RECORD_JSON</code>. 「recordJson」-
     * 上一次的记录内容（Json格式）
     */
    public final TableField<TplTicketRecord, String> RECORD_JSON = createField(DSL.name("RECORD_JSON"), SQLDataType.CLOB, this, "「recordJson」- 上一次的记录内容（Json格式）");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.RECORD_COMPONENT</code>.
     * 「recordComponent」- 处理记录的组件
     */
    public final TableField<TplTicketRecord, String> RECORD_COMPONENT = createField(DSL.name("RECORD_COMPONENT"), SQLDataType.VARCHAR(255), this, "「recordComponent」- 处理记录的组件");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.UI_CONFIG</code>. 「uiConfig」-
     * UI的配置（Json格式）
     */
    public final TableField<TplTicketRecord, String> UI_CONFIG = createField(DSL.name("UI_CONFIG"), SQLDataType.CLOB, this, "「uiConfig」- UI的配置（Json格式）");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.UI_COMPONENT</code>.
     * 「uiComponent」- 处理UI的组件
     */
    public final TableField<TplTicketRecord, String> UI_COMPONENT = createField(DSL.name("UI_COMPONENT"), SQLDataType.VARCHAR(255), this, "「uiComponent」- 处理UI的组件");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<TplTicketRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<TplTicketRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<TplTicketRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public final TableField<TplTicketRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public final TableField<TplTicketRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public final TableField<TplTicketRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public final TableField<TplTicketRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.TPL_TICKET.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public final TableField<TplTicketRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private TplTicket(Name alias, Table<TplTicketRecord> aliased) {
        this(alias, aliased, null);
    }

    private TplTicket(Name alias, Table<TplTicketRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.TPL_TICKET</code> table reference
     */
    public TplTicket(String alias) {
        this(DSL.name(alias), TPL_TICKET);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.TPL_TICKET</code> table reference
     */
    public TplTicket(Name alias) {
        this(alias, TPL_TICKET);
    }

    /**
     * Create a <code>DB_ETERNAL.TPL_TICKET</code> table reference
     */
    public TplTicket() {
        this(DSL.name("TPL_TICKET"), null);
    }

    public <O extends Record> TplTicket(Table<O> child, ForeignKey<O, TplTicketRecord> key) {
        super(child, key, TPL_TICKET);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TplTicketRecord> getRecordType() {
        return TplTicketRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public UniqueKey<TplTicketRecord> getPrimaryKey() {
        return Keys.KEY_TPL_TICKET_PRIMARY;
    }

    @Override
    public List<UniqueKey<TplTicketRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_TPL_TICKET_CODE);
    }

    @Override
    public TplTicket as(String alias) {
        return new TplTicket(DSL.name(alias), this);
    }

    @Override
    public TplTicket as(Name alias) {
        return new TplTicket(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TplTicket rename(String name) {
        return new TplTicket(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TplTicket rename(Name name) {
        return new TplTicket(name, null);
    }

    // -------------------------------------------------------------------------
    // Row22 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, String, String, String, String, String, Boolean, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }
}
