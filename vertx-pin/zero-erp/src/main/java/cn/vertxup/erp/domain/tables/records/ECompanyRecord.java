/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.ECompany;
import cn.vertxup.erp.domain.tables.interfaces.IECompany;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ECompanyRecord extends UpdatableRecordImpl<ECompanyRecord> implements IECompany {

    private static final long serialVersionUID = -1657540699;

    /**
     * Create a detached ECompanyRecord
     */
    public ECompanyRecord() {
        super(ECompany.E_COMPANY);
    }

    /**
     * Create a detached, initialised ECompanyRecord
     */
    public ECompanyRecord(String key, String name, String alias, String title, String code, String comment, String taxCode, String taxTitle, String email, String fax, String homepage, String logo, String phone, String address, String locationId, String corporationName, String corporationPhone, String contactName, String contactPhone, String contactOnline, String companyId, String customerId, String type, String metadata, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(ECompany.E_COMPANY);

        set(0, key);
        set(1, name);
        set(2, alias);
        set(3, title);
        set(4, code);
        set(5, comment);
        set(6, taxCode);
        set(7, taxTitle);
        set(8, email);
        set(9, fax);
        set(10, homepage);
        set(11, logo);
        set(12, phone);
        set(13, address);
        set(14, locationId);
        set(15, corporationName);
        set(16, corporationPhone);
        set(17, contactName);
        set(18, contactPhone);
        set(19, contactOnline);
        set(20, companyId);
        set(21, customerId);
        set(22, type);
        set(23, metadata);
        set(24, active);
        set(25, sigma);
        set(26, language);
        set(27, createdAt);
        set(28, createdBy);
        set(29, updatedAt);
        set(30, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.KEY</code>. 「key」- 公司主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.KEY</code>. 「key」- 公司主键
     */
    @Override
    public ECompanyRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.NAME</code>. 「name」- 公司名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.NAME</code>. 「name」- 公司名称
     */
    @Override
    public ECompanyRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.ALIAS</code>. 「alias」- 公司别称
     */
    @Override
    public String getAlias() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.ALIAS</code>. 「alias」- 公司别称
     */
    @Override
    public ECompanyRecord setAlias(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.TITLE</code>. 「title」- 公司显示标题
     */
    @Override
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.TITLE</code>. 「title」- 公司显示标题
     */
    @Override
    public ECompanyRecord setTitle(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CODE</code>. 「code」- 公司编号
     */
    @Override
    public String getCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CODE</code>. 「code」- 公司编号
     */
    @Override
    public ECompanyRecord setCode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.COMMENT</code>. 「comment」- 公司简介
     */
    @Override
    public String getComment() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.COMMENT</code>. 「comment」- 公司简介
     */
    @Override
    public ECompanyRecord setComment(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.TAX_CODE</code>. 「taxCode」- 公司税号
     */
    @Override
    public String getTaxCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.TAX_CODE</code>. 「taxCode」- 公司税号
     */
    @Override
    public ECompanyRecord setTaxCode(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.TAX_TITLE</code>. 「taxTitle」- 开票抬头
     */
    @Override
    public String getTaxTitle() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.TAX_TITLE</code>. 「taxTitle」- 开票抬头
     */
    @Override
    public ECompanyRecord setTaxTitle(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.EMAIL</code>. 「email」- 企业邮箱
     */
    @Override
    public String getEmail() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.EMAIL</code>. 「email」- 企业邮箱
     */
    @Override
    public ECompanyRecord setEmail(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.FAX</code>. 「fax」- 传真号
     */
    @Override
    public String getFax() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.FAX</code>. 「fax」- 传真号
     */
    @Override
    public ECompanyRecord setFax(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.HOMEPAGE</code>. 「homepage」- 公司主页
     */
    @Override
    public String getHomepage() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.HOMEPAGE</code>. 「homepage」- 公司主页
     */
    @Override
    public ECompanyRecord setHomepage(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.LOGO</code>. 「logo」- 附件对应的 attachment Key
     */
    @Override
    public String getLogo() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.LOGO</code>. 「logo」- 附件对应的 attachment Key
     */
    @Override
    public ECompanyRecord setLogo(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.PHONE</code>. 「phone」- 公司座机
     */
    @Override
    public String getPhone() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.PHONE</code>. 「phone」- 公司座机
     */
    @Override
    public ECompanyRecord setPhone(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.ADDRESS</code>. 「address」- 公司地址
     */
    @Override
    public String getAddress() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.ADDRESS</code>. 「address」- 公司地址
     */
    @Override
    public ECompanyRecord setAddress(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.LOCATION_ID</code>. 「locationId」- 启用LBS时对应的Location主键
     */
    @Override
    public String getLocationId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.LOCATION_ID</code>. 「locationId」- 启用LBS时对应的Location主键
     */
    @Override
    public ECompanyRecord setLocationId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CORPORATION_NAME</code>. 「corporationName」- 企业法人
     */
    @Override
    public String getCorporationName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CORPORATION_NAME</code>. 「corporationName」- 企业法人
     */
    @Override
    public ECompanyRecord setCorporationName(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CORPORATION_PHONE</code>. 「corporationPhone」- 法人电话
     */
    @Override
    public String getCorporationPhone() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CORPORATION_PHONE</code>. 「corporationPhone」- 法人电话
     */
    @Override
    public ECompanyRecord setCorporationPhone(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CONTACT_NAME</code>. 「contactName」- 联系人电话
     */
    @Override
    public String getContactName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CONTACT_NAME</code>. 「contactName」- 联系人电话
     */
    @Override
    public ECompanyRecord setContactName(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CONTACT_PHONE</code>. 「contactPhone」- 联系人电话
     */
    @Override
    public String getContactPhone() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CONTACT_PHONE</code>. 「contactPhone」- 联系人电话
     */
    @Override
    public ECompanyRecord setContactPhone(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CONTACT_ONLINE</code>. 「contactOnline」- 在线联系方式
     */
    @Override
    public String getContactOnline() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CONTACT_ONLINE</code>. 「contactOnline」- 在线联系方式
     */
    @Override
    public ECompanyRecord setContactOnline(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.COMPANY_ID</code>. 「companyId」- 公司、子公司结构时需要
     */
    @Override
    public String getCompanyId() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.COMPANY_ID</code>. 「companyId」- 公司、子公司结构时需要
     */
    @Override
    public ECompanyRecord setCompanyId(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CUSTOMER_ID</code>. 「customerId」- 公司作为客户时的客户信息
     */
    @Override
    public String getCustomerId() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CUSTOMER_ID</code>. 「customerId」- 公司作为客户时的客户信息
     */
    @Override
    public ECompanyRecord setCustomerId(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.TYPE</code>. 「type」- 公司分类
     */
    @Override
    public String getType() {
        return (String) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.TYPE</code>. 「type」- 公司分类
     */
    @Override
    public ECompanyRecord setType(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public ECompanyRecord setMetadata(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public ECompanyRecord setActive(Boolean value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    @Override
    public String getSigma() {
        return (String) get(25);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    @Override
    public ECompanyRecord setSigma(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(26);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public ECompanyRecord setLanguage(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(27);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public ECompanyRecord setCreatedAt(LocalDateTime value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(28);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public ECompanyRecord setCreatedBy(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(29);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public ECompanyRecord setUpdatedAt(LocalDateTime value) {
        set(29, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(30);
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public ECompanyRecord setUpdatedBy(String value) {
        set(30, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IECompany from) {
        setKey(from.getKey());
        setName(from.getName());
        setAlias(from.getAlias());
        setTitle(from.getTitle());
        setCode(from.getCode());
        setComment(from.getComment());
        setTaxCode(from.getTaxCode());
        setTaxTitle(from.getTaxTitle());
        setEmail(from.getEmail());
        setFax(from.getFax());
        setHomepage(from.getHomepage());
        setLogo(from.getLogo());
        setPhone(from.getPhone());
        setAddress(from.getAddress());
        setLocationId(from.getLocationId());
        setCorporationName(from.getCorporationName());
        setCorporationPhone(from.getCorporationPhone());
        setContactName(from.getContactName());
        setContactPhone(from.getContactPhone());
        setContactOnline(from.getContactOnline());
        setCompanyId(from.getCompanyId());
        setCustomerId(from.getCustomerId());
        setType(from.getType());
        setMetadata(from.getMetadata());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IECompany> E into(E into) {
        into.from(this);
        return into;
    }
}
