/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IFPaymentItem extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.KEY</code>. 「key」- 收款明细账单主键ID
     */
    public IFPaymentItem setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.KEY</code>. 「key」- 收款明细账单主键ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.NAME</code>. 「name」 - 收款明细单标题
     */
    public IFPaymentItem setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.NAME</code>. 「name」 - 收款明细单标题
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.CODE</code>. 「code」 - 收款明细单编号
     */
    public IFPaymentItem setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.CODE</code>. 「code」 - 收款明细单编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.SERIAL</code>. 「serial」 -
     * 收款明细单据号
     */
    public IFPaymentItem setSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.SERIAL</code>. 「serial」 -
     * 收款明细单据号
     */
    public String getSerial();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    public IFPaymentItem setAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.AMOUNT_PRE</code>.
     * 「amountPre」预付金额
     */
    public IFPaymentItem setAmountPre(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.AMOUNT_PRE</code>.
     * 「amountPre」预付金额
     */
    public BigDecimal getAmountPre();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.SETTLEMENT_ID</code>.
     * 「settlementId」结算单ID
     */
    public IFPaymentItem setSettlementId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.SETTLEMENT_ID</code>.
     * 「settlementId」结算单ID
     */
    public String getSettlementId();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAYMENT_ID</code>.
     * 「paymentId」收款单ID
     */
    public IFPaymentItem setPaymentId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAYMENT_ID</code>.
     * 「paymentId」收款单ID
     */
    public String getPaymentId();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_NAME</code>.
     * 「payName」打款人姓名
     */
    public IFPaymentItem setPayName(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_NAME</code>.
     * 「payName」打款人姓名
     */
    public String getPayName();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_MOBILE</code>.
     * 「payMobile」打款人电话
     */
    public IFPaymentItem setPayMobile(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_MOBILE</code>.
     * 「payMobile」打款人电话
     */
    public String getPayMobile();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_METHOD</code>.
     * 「payMethod」付款方式
     */
    public IFPaymentItem setPayMethod(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_METHOD</code>.
     * 「payMethod」付款方式
     */
    public String getPayMethod();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_ID</code>. 「payId」付款账号
     */
    public IFPaymentItem setPayId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.PAY_ID</code>. 「payId」付款账号
     */
    public String getPayId();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public IFPaymentItem setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public IFPaymentItem setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    public IFPaymentItem setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public IFPaymentItem setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    public IFPaymentItem setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    public IFPaymentItem setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    public IFPaymentItem setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_PAYMENT_ITEM.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    public IFPaymentItem setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAYMENT_ITEM.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IFPaymentItem
     */
    public void from(IFPaymentItem from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IFPaymentItem
     */
    public <E extends IFPaymentItem> E into(E into);

        @Override
        public default IFPaymentItem fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setSerial,json::getString,"SERIAL","java.lang.String");
                // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
                // Omitting unrecognized type java.math.BigDecimal for column AMOUNT_PRE!
                setOrThrow(this::setSettlementId,json::getString,"SETTLEMENT_ID","java.lang.String");
                setOrThrow(this::setPaymentId,json::getString,"PAYMENT_ID","java.lang.String");
                setOrThrow(this::setPayName,json::getString,"PAY_NAME","java.lang.String");
                setOrThrow(this::setPayMobile,json::getString,"PAY_MOBILE","java.lang.String");
                setOrThrow(this::setPayMethod,json::getString,"PAY_METHOD","java.lang.String");
                setOrThrow(this::setPayId,json::getString,"PAY_ID","java.lang.String");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setCreatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"CREATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setCreatedBy,json::getString,"CREATED_BY","java.lang.String");
                setOrThrow(this::setUpdatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"UPDATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setUpdatedBy,json::getString,"UPDATED_BY","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("NAME",getName());
                json.put("CODE",getCode());
                json.put("SERIAL",getSerial());
                // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
                // Omitting unrecognized type java.math.BigDecimal for column AMOUNT_PRE!
                json.put("SETTLEMENT_ID",getSettlementId());
                json.put("PAYMENT_ID",getPaymentId());
                json.put("PAY_NAME",getPayName());
                json.put("PAY_MOBILE",getPayMobile());
                json.put("PAY_METHOD",getPayMethod());
                json.put("PAY_ID",getPayId());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("ACTIVE",getActive());
                json.put("METADATA",getMetadata());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}