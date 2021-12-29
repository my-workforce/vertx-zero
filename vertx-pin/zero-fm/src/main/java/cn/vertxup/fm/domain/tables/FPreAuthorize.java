/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables;


import cn.vertxup.fm.domain.DbEternal;
import cn.vertxup.fm.domain.Indexes;
import cn.vertxup.fm.domain.Keys;
import cn.vertxup.fm.domain.tables.records.FPreAuthorizeRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row20;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FPreAuthorize extends TableImpl<FPreAuthorizeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DB_ETERNAL.F_PRE_AUTHORIZE</code>
     */
    public static final FPreAuthorize F_PRE_AUTHORIZE = new FPreAuthorize();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FPreAuthorizeRecord> getRecordType() {
        return FPreAuthorizeRecord.class;
    }

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.KEY</code>. 「key」- 预授权ID
     */
    public final TableField<FPreAuthorizeRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 预授权ID");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.CODE</code>. 「code」 - 预授权系统编号
     */
    public final TableField<FPreAuthorizeRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255).nullable(false), this, "「code」 - 预授权系统编号");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.SERIAL</code>. 「serial」 -
     * 预授权单据号
     */
    public final TableField<FPreAuthorizeRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(36).nullable(false), this, "「serial」 - 预授权单据号");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.STATUS</code>. 「status」 -
     * 预授权状态，Lock/Unlock
     */
    public final TableField<FPreAuthorizeRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(36).nullable(false), this, "「status」 - 预授权状态，Lock/Unlock");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.AMOUNT</code>. 「amount」-
     * 当前预授权刷单金额
     */
    public final TableField<FPreAuthorizeRecord, BigDecimal> AMOUNT = createField(DSL.name("AMOUNT"), SQLDataType.DECIMAL(18, 2).nullable(false), this, "「amount」- 当前预授权刷单金额");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.COMMENT</code>. 「comment」 -
     * 预授权备注
     */
    public final TableField<FPreAuthorizeRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」 - 预授权备注");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.EXPIRED_AT</code>.
     * 「expiredAt」——预授权有效期
     */
    public final TableField<FPreAuthorizeRecord, LocalDateTime> EXPIRED_AT = createField(DSL.name("EXPIRED_AT"), SQLDataType.LOCALDATETIME(0), this, "「expiredAt」——预授权有效期");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.BANK_NAME</code>. 「bankName」-
     * 预授权银行名称
     */
    public final TableField<FPreAuthorizeRecord, String> BANK_NAME = createField(DSL.name("BANK_NAME"), SQLDataType.VARCHAR(255).nullable(false), this, "「bankName」- 预授权银行名称");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.BANK_CARD</code>. 「bankCard」-
     * 刷预授权的银行卡号
     */
    public final TableField<FPreAuthorizeRecord, String> BANK_CARD = createField(DSL.name("BANK_CARD"), SQLDataType.VARCHAR(255).nullable(false), this, "「bankCard」- 刷预授权的银行卡号");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.ORDER_ID</code>. 「orderId」-
     * 预授权所属订单ID
     */
    public final TableField<FPreAuthorizeRecord, String> ORDER_ID = createField(DSL.name("ORDER_ID"), SQLDataType.VARCHAR(36), this, "「orderId」- 预授权所属订单ID");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.BILL_ID</code>. 「billId」-
     * 预授权所属账单ID
     */
    public final TableField<FPreAuthorizeRecord, String> BILL_ID = createField(DSL.name("BILL_ID"), SQLDataType.VARCHAR(36), this, "「billId」- 预授权所属账单ID");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.BOOK_ID</code>. 「bookId」-
     * 所属账本ID
     */
    public final TableField<FPreAuthorizeRecord, String> BOOK_ID = createField(DSL.name("BOOK_ID"), SQLDataType.VARCHAR(36), this, "「bookId」- 所属账本ID");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FPreAuthorizeRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public final TableField<FPreAuthorizeRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FPreAuthorizeRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public final TableField<FPreAuthorizeRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    public final TableField<FPreAuthorizeRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    public final TableField<FPreAuthorizeRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    public final TableField<FPreAuthorizeRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>DB_ETERNAL.F_PRE_AUTHORIZE.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    public final TableField<FPreAuthorizeRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private FPreAuthorize(Name alias, Table<FPreAuthorizeRecord> aliased) {
        this(alias, aliased, null);
    }

    private FPreAuthorize(Name alias, Table<FPreAuthorizeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_PRE_AUTHORIZE</code> table reference
     */
    public FPreAuthorize(String alias) {
        this(DSL.name(alias), F_PRE_AUTHORIZE);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_PRE_AUTHORIZE</code> table reference
     */
    public FPreAuthorize(Name alias) {
        this(alias, F_PRE_AUTHORIZE);
    }

    /**
     * Create a <code>DB_ETERNAL.F_PRE_AUTHORIZE</code> table reference
     */
    public FPreAuthorize() {
        this(DSL.name("F_PRE_AUTHORIZE"), null);
    }

    public <O extends Record> FPreAuthorize(Table<O> child, ForeignKey<O, FPreAuthorizeRecord> key) {
        super(child, key, F_PRE_AUTHORIZE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DbEternal.DB_ETERNAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.F_PRE_AUTHORIZE_IDX_F_PRE_AUTHORIZE_BOOK_ID, Indexes.F_PRE_AUTHORIZE_IDX_F_PRE_AUTHORIZE_ORDER_ID);
    }

    @Override
    public UniqueKey<FPreAuthorizeRecord> getPrimaryKey() {
        return Keys.KEY_F_PRE_AUTHORIZE_PRIMARY;
    }

    @Override
    public List<UniqueKey<FPreAuthorizeRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_F_PRE_AUTHORIZE_CODE, Keys.KEY_F_PRE_AUTHORIZE_SERIAL);
    }

    @Override
    public FPreAuthorize as(String alias) {
        return new FPreAuthorize(DSL.name(alias), this);
    }

    @Override
    public FPreAuthorize as(Name alias) {
        return new FPreAuthorize(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FPreAuthorize rename(String name) {
        return new FPreAuthorize(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FPreAuthorize rename(Name name) {
        return new FPreAuthorize(name, null);
    }

    // -------------------------------------------------------------------------
    // Row20 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row20<String, String, String, String, BigDecimal, String, LocalDateTime, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }
}
