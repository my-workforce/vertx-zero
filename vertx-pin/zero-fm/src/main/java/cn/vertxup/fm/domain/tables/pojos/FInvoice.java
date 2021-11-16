/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.pojos;


import cn.vertxup.fm.domain.tables.interfaces.IFInvoice;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FInvoice implements VertxPojo, IFInvoice {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        name;
    private String        code;
    private String        type;
    private BigDecimal    amount;
    private String        comment;
    private String        invoiceTitle;
    private String        invoiceNumber;
    private String        invoiceSerial;
    private String        tin;
    private String        tinName;
    private Boolean       personal;
    private String        descBank;
    private String        descCompany;
    private String        descLocation;
    private String        descUser;
    private String        nameReceipt;
    private String        nameRecheck;
    private String        nameBilling;
    private String        nameSelling;
    private String        orderId;
    private String        sigma;
    private String        language;
    private Boolean       active;
    private String        metadata;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public FInvoice() {}

    public FInvoice(IFInvoice value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.type = value.getType();
        this.amount = value.getAmount();
        this.comment = value.getComment();
        this.invoiceTitle = value.getInvoiceTitle();
        this.invoiceNumber = value.getInvoiceNumber();
        this.invoiceSerial = value.getInvoiceSerial();
        this.tin = value.getTin();
        this.tinName = value.getTinName();
        this.personal = value.getPersonal();
        this.descBank = value.getDescBank();
        this.descCompany = value.getDescCompany();
        this.descLocation = value.getDescLocation();
        this.descUser = value.getDescUser();
        this.nameReceipt = value.getNameReceipt();
        this.nameRecheck = value.getNameRecheck();
        this.nameBilling = value.getNameBilling();
        this.nameSelling = value.getNameSelling();
        this.orderId = value.getOrderId();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public FInvoice(
        String        key,
        String        name,
        String        code,
        String        type,
        BigDecimal    amount,
        String        comment,
        String        invoiceTitle,
        String        invoiceNumber,
        String        invoiceSerial,
        String        tin,
        String        tinName,
        Boolean       personal,
        String        descBank,
        String        descCompany,
        String        descLocation,
        String        descUser,
        String        nameReceipt,
        String        nameRecheck,
        String        nameBilling,
        String        nameSelling,
        String        orderId,
        String        sigma,
        String        language,
        Boolean       active,
        String        metadata,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.type = type;
        this.amount = amount;
        this.comment = comment;
        this.invoiceTitle = invoiceTitle;
        this.invoiceNumber = invoiceNumber;
        this.invoiceSerial = invoiceSerial;
        this.tin = tin;
        this.tinName = tinName;
        this.personal = personal;
        this.descBank = descBank;
        this.descCompany = descCompany;
        this.descLocation = descLocation;
        this.descUser = descUser;
        this.nameReceipt = nameReceipt;
        this.nameRecheck = nameRecheck;
        this.nameBilling = nameBilling;
        this.nameSelling = nameSelling;
        this.orderId = orderId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public FInvoice(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.KEY</code>. 「key」- 发票主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.KEY</code>. 「key」- 发票主键
     */
    @Override
    public FInvoice setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.NAME</code>. 「name」- 发票名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.NAME</code>. 「name」- 发票名称
     */
    @Override
    public FInvoice setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.CODE</code>. 「code」- 发票机器码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.CODE</code>. 「code」- 发票机器码
     */
    @Override
    public FInvoice setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.TYPE</code>. 「type」- 发票类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.TYPE</code>. 「type」- 发票类型
     */
    @Override
    public FInvoice setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.AMOUNT</code>. 「amount」- 发票金额
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.AMOUNT</code>. 「amount」- 发票金额
     */
    @Override
    public FInvoice setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.COMMENT</code>. 「comment」 - 发票备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.COMMENT</code>. 「comment」 - 发票备注
     */
    @Override
    public FInvoice setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.INVOICE_TITLE</code>.
     * 「invoiceTitle」- 发票抬头
     */
    @Override
    public String getInvoiceTitle() {
        return this.invoiceTitle;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.INVOICE_TITLE</code>.
     * 「invoiceTitle」- 发票抬头
     */
    @Override
    public FInvoice setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.INVOICE_NUMBER</code>.
     * 「invoiceNumber」- 发票代码
     */
    @Override
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.INVOICE_NUMBER</code>.
     * 「invoiceNumber」- 发票代码
     */
    @Override
    public FInvoice setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.INVOICE_SERIAL</code>.
     * 「invoiceSerial」- 发票号码
     */
    @Override
    public String getInvoiceSerial() {
        return this.invoiceSerial;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.INVOICE_SERIAL</code>.
     * 「invoiceSerial」- 发票号码
     */
    @Override
    public FInvoice setInvoiceSerial(String invoiceSerial) {
        this.invoiceSerial = invoiceSerial;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.TIN</code>. 「tin」- 税号：纳税人识别号
     */
    @Override
    public String getTin() {
        return this.tin;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.TIN</code>. 「tin」- 税号：纳税人识别号
     */
    @Override
    public FInvoice setTin(String tin) {
        this.tin = tin;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.TIN_NAME</code>. 「tinName」- 纳税人姓名
     */
    @Override
    public String getTinName() {
        return this.tinName;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.TIN_NAME</code>. 「tinName」- 纳税人姓名
     */
    @Override
    public FInvoice setTinName(String tinName) {
        this.tinName = tinName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.PERSONAL</code>. 「personal」- 是否个人发票
     */
    @Override
    public Boolean getPersonal() {
        return this.personal;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.PERSONAL</code>. 「personal」- 是否个人发票
     */
    @Override
    public FInvoice setPersonal(Boolean personal) {
        this.personal = personal;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.DESC_BANK</code>. 「descBank」- 开户行信息
     */
    @Override
    public String getDescBank() {
        return this.descBank;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.DESC_BANK</code>. 「descBank」- 开户行信息
     */
    @Override
    public FInvoice setDescBank(String descBank) {
        this.descBank = descBank;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.DESC_COMPANY</code>. 「descCompany」-
     * 公司信息
     */
    @Override
    public String getDescCompany() {
        return this.descCompany;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.DESC_COMPANY</code>. 「descCompany」-
     * 公司信息
     */
    @Override
    public FInvoice setDescCompany(String descCompany) {
        this.descCompany = descCompany;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.DESC_LOCATION</code>.
     * 「descLocation」- 地址电话
     */
    @Override
    public String getDescLocation() {
        return this.descLocation;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.DESC_LOCATION</code>.
     * 「descLocation」- 地址电话
     */
    @Override
    public FInvoice setDescLocation(String descLocation) {
        this.descLocation = descLocation;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.DESC_USER</code>. 「descUser」-
     * 个人发票用户信息
     */
    @Override
    public String getDescUser() {
        return this.descUser;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.DESC_USER</code>. 「descUser」-
     * 个人发票用户信息
     */
    @Override
    public FInvoice setDescUser(String descUser) {
        this.descUser = descUser;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.NAME_RECEIPT</code>.
     * 「nameReceipt」收款人
     */
    @Override
    public String getNameReceipt() {
        return this.nameReceipt;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.NAME_RECEIPT</code>.
     * 「nameReceipt」收款人
     */
    @Override
    public FInvoice setNameReceipt(String nameReceipt) {
        this.nameReceipt = nameReceipt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.NAME_RECHECK</code>.
     * 「nameRecheck」复核人
     */
    @Override
    public String getNameRecheck() {
        return this.nameRecheck;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.NAME_RECHECK</code>.
     * 「nameRecheck」复核人
     */
    @Override
    public FInvoice setNameRecheck(String nameRecheck) {
        this.nameRecheck = nameRecheck;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.NAME_BILLING</code>.
     * 「nameBilling」开票人
     */
    @Override
    public String getNameBilling() {
        return this.nameBilling;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.NAME_BILLING</code>.
     * 「nameBilling」开票人
     */
    @Override
    public FInvoice setNameBilling(String nameBilling) {
        this.nameBilling = nameBilling;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.NAME_SELLING</code>.
     * 「nameSelling」销售人
     */
    @Override
    public String getNameSelling() {
        return this.nameSelling;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.NAME_SELLING</code>.
     * 「nameSelling」销售人
     */
    @Override
    public FInvoice setNameSelling(String nameSelling) {
        this.nameSelling = nameSelling;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.ORDER_ID</code>. 「orderId」-
     * 订单对应的订单ID
     */
    @Override
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.ORDER_ID</code>. 「orderId」-
     * 订单对应的订单ID
     */
    @Override
    public FInvoice setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FInvoice setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FInvoice setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FInvoice setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FInvoice setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public FInvoice setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FInvoice setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public FInvoice setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_INVOICE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.F_INVOICE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FInvoice setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FInvoice (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(amount);
        sb.append(", ").append(comment);
        sb.append(", ").append(invoiceTitle);
        sb.append(", ").append(invoiceNumber);
        sb.append(", ").append(invoiceSerial);
        sb.append(", ").append(tin);
        sb.append(", ").append(tinName);
        sb.append(", ").append(personal);
        sb.append(", ").append(descBank);
        sb.append(", ").append(descCompany);
        sb.append(", ").append(descLocation);
        sb.append(", ").append(descUser);
        sb.append(", ").append(nameReceipt);
        sb.append(", ").append(nameRecheck);
        sb.append(", ").append(nameBilling);
        sb.append(", ").append(nameSelling);
        sb.append(", ").append(orderId);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFInvoice from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setAmount(from.getAmount());
        setComment(from.getComment());
        setInvoiceTitle(from.getInvoiceTitle());
        setInvoiceNumber(from.getInvoiceNumber());
        setInvoiceSerial(from.getInvoiceSerial());
        setTin(from.getTin());
        setTinName(from.getTinName());
        setPersonal(from.getPersonal());
        setDescBank(from.getDescBank());
        setDescCompany(from.getDescCompany());
        setDescLocation(from.getDescLocation());
        setDescUser(from.getDescUser());
        setNameReceipt(from.getNameReceipt());
        setNameRecheck(from.getNameRecheck());
        setNameBilling(from.getNameBilling());
        setNameSelling(from.getNameSelling());
        setOrderId(from.getOrderId());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IFInvoice> E into(E into) {
        into.from(this);
        return into;
    }
}