/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables;


import cn.vertxup.ambient.domain.Db;
import cn.vertxup.ambient.domain.Keys;
import cn.vertxup.ambient.domain.tables.records.XMenuMyRecord;
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
public class XMenuMy extends TableImpl<XMenuMyRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.X_MENU_MY</code>
     */
    public static final XMenuMy X_MENU_MY = new XMenuMy();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.KEY</code>. 「key」- 菜单主键
     */
    public final TableField<XMenuMyRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 菜单主键");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.ICON</code>. 「icon」- 菜单使用的icon
     */
    public final TableField<XMenuMyRecord, String> ICON = createField(DSL.name("ICON"), SQLDataType.VARCHAR(255), this, "「icon」- 菜单使用的icon");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.TEXT</code>. 「text」- 菜单显示文字
     */
    public final TableField<XMenuMyRecord, String> TEXT = createField(DSL.name("TEXT"), SQLDataType.VARCHAR(255), this, "「text」- 菜单显示文字");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.URI</code>. 「uri」- 菜单地址（不包含应用的path）
     */
    public final TableField<XMenuMyRecord, String> URI = createField(DSL.name("URI"), SQLDataType.VARCHAR(255), this, "「uri」- 菜单地址（不包含应用的path）");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.UI_SORT</code>. 「uiSort」- 菜单排序
     */
    public final TableField<XMenuMyRecord, Long> UI_SORT = createField(DSL.name("UI_SORT"), SQLDataType.BIGINT, this, "「uiSort」- 菜单排序");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.UI_MENU</code>. 「uiMenu」-
     * 关联菜单ID，数据来自于该值
     */
    public final TableField<XMenuMyRecord, String> UI_MENU = createField(DSL.name("UI_MENU"), SQLDataType.VARCHAR(36), this, "「uiMenu」- 关联菜单ID，数据来自于该值");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.UI_PARENT</code>. 「uiParent」- 菜单父ID
     */
    public final TableField<XMenuMyRecord, String> UI_PARENT = createField(DSL.name("UI_PARENT"), SQLDataType.VARCHAR(36), this, "「uiParent」- 菜单父ID");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.UI_COLOR_FG</code>. 「uiColorFg」-
     * 前景色
     */
    public final TableField<XMenuMyRecord, String> UI_COLOR_FG = createField(DSL.name("UI_COLOR_FG"), SQLDataType.VARCHAR(16), this, "「uiColorFg」- 前景色");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.UI_COLOR_BG</code>. 「uiColorBg」-
     * 背景色
     */
    public final TableField<XMenuMyRecord, String> UI_COLOR_BG = createField(DSL.name("UI_COLOR_BG"), SQLDataType.VARCHAR(16), this, "「uiColorBg」- 背景色");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.TYPE</code>. 「type」- 菜单类型
     */
    public final TableField<XMenuMyRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(32), this, "「type」- 菜单类型");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.PAGE</code>. 「page」- 菜单所在页面
     */
    public final TableField<XMenuMyRecord, String> PAGE = createField(DSL.name("PAGE"), SQLDataType.VARCHAR(64), this, "「page」- 菜单所在页面");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.POSITION</code>. 「position」- 菜单位置
     */
    public final TableField<XMenuMyRecord, String> POSITION = createField(DSL.name("POSITION"), SQLDataType.VARCHAR(16), this, "「position」- 菜单位置");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.OWNER</code>. 「owner」- 拥有者ID
     */
    public final TableField<XMenuMyRecord, String> OWNER = createField(DSL.name("OWNER"), SQLDataType.VARCHAR(36), this, "「owner」- 拥有者ID");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XMenuMyRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<XMenuMyRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<XMenuMyRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XMenuMyRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public final TableField<XMenuMyRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<XMenuMyRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public final TableField<XMenuMyRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.X_MENU_MY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<XMenuMyRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private XMenuMy(Name alias, Table<XMenuMyRecord> aliased) {
        this(alias, aliased, null);
    }

    private XMenuMy(Name alias, Table<XMenuMyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_MENU_MY</code> table reference
     */
    public XMenuMy(String alias) {
        this(DSL.name(alias), X_MENU_MY);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_MENU_MY</code> table reference
     */
    public XMenuMy(Name alias) {
        this(alias, X_MENU_MY);
    }

    /**
     * Create a <code>DB_ETERNAL.X_MENU_MY</code> table reference
     */
    public XMenuMy() {
        this(DSL.name("X_MENU_MY"), null);
    }

    public <O extends Record> XMenuMy(Table<O> child, ForeignKey<O, XMenuMyRecord> key) {
        super(child, key, X_MENU_MY);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XMenuMyRecord> getRecordType() {
        return XMenuMyRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public UniqueKey<XMenuMyRecord> getPrimaryKey() {
        return Keys.KEY_X_MENU_MY_PRIMARY;
    }

    @Override
    public List<UniqueKey<XMenuMyRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_X_MENU_MY_OWNER);
    }

    @Override
    public XMenuMy as(String alias) {
        return new XMenuMy(DSL.name(alias), this);
    }

    @Override
    public XMenuMy as(Name alias) {
        return new XMenuMy(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XMenuMy rename(String name) {
        return new XMenuMy(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XMenuMy rename(Name name) {
        return new XMenuMy(name, null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, String, Long, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }
}
