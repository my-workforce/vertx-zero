/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.battery.domain.tables.records;


import cn.vertxup.battery.domain.tables.BBlock;
import cn.vertxup.battery.domain.tables.interfaces.IBBlock;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BBlockRecord extends UpdatableRecordImpl<BBlockRecord> implements VertxPojo, IBBlock {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.KEY</code>. 「key」- 模块主键
     */
    @Override
    public BBlockRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.KEY</code>. 「key」- 模块主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.CODE</code>. 「code」- 子模块编码
     */
    @Override
    public BBlockRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.CODE</code>. 「code」- 子模块编码
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.NAME</code>. 「name」- 子模块名称
     */
    @Override
    public BBlockRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.NAME</code>. 「name」- 子模块名称
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_ICON</code>. 「uiIcon」- 子模块图标
     */
    @Override
    public BBlockRecord setUiIcon(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_ICON</code>. 「uiIcon」- 子模块图标
     */
    @Override
    public String getUiIcon() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_STYLE</code>. 「uiStyle」- 子模块风格
     */
    @Override
    public BBlockRecord setUiStyle(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_STYLE</code>. 「uiStyle」- 子模块风格
     */
    @Override
    public String getUiStyle() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_SORT</code>. 「uiSort」- 子模块排序
     */
    @Override
    public BBlockRecord setUiSort(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_SORT</code>. 「uiSort」- 子模块排序
     */
    @Override
    public Long getUiSort() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_CONFIG</code>. 「uiConfig」- 子模块核心配置
     */
    @Override
    public BBlockRecord setUiConfig(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_CONFIG</code>. 「uiConfig」- 子模块核心配置
     */
    @Override
    public String getUiConfig() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_LIC</code>. 「signLic」- License信息
     */
    @Override
    public BBlockRecord setSignLic(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_LIC</code>. 「signLic」- License信息
     */
    @Override
    public String getSignLic() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_ISSUER</code>. 「signIssuer」-
     * License发证机构
     */
    @Override
    public BBlockRecord setSignIssuer(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_ISSUER</code>. 「signIssuer」-
     * License发证机构
     */
    @Override
    public String getSignIssuer() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_NAME</code>. 「signName」- 证书名称
     */
    @Override
    public BBlockRecord setSignName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_NAME</code>. 「signName」- 证书名称
     */
    @Override
    public String getSignName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_KEY</code>. 「signKey」- 签名专用标识
     */
    @Override
    public BBlockRecord setSignKey(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_KEY</code>. 「signKey」- 签名专用标识
     */
    @Override
    public String getSignKey() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.LIC_IDENTIFIER</code>.
     * 「licIdentifier」- 允许的模型标识
     */
    @Override
    public BBlockRecord setLicIdentifier(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.LIC_IDENTIFIER</code>.
     * 「licIdentifier」- 允许的模型标识
     */
    @Override
    public String getLicIdentifier() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.LIC_MENU</code>. 「licMenu」-
     * 该Block包含的菜单
     */
    @Override
    public BBlockRecord setLicMenu(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.LIC_MENU</code>. 「licMenu」-
     * 该Block包含的菜单
     */
    @Override
    public String getLicMenu() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public BBlockRecord setAppId(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public String getAppId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.BAG_ID</code>. 「bagId」- 所属包ID
     */
    @Override
    public BBlockRecord setBagId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.BAG_ID</code>. 「bagId」- 所属包ID
     */
    @Override
    public String getBagId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public BBlockRecord setActive(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public BBlockRecord setSigma(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public BBlockRecord setMetadata(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public BBlockRecord setLanguage(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public BBlockRecord setCreatedAt(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public BBlockRecord setCreatedBy(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public BBlockRecord setUpdatedAt(LocalDateTime value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public BBlockRecord setUpdatedBy(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(22);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IBBlock from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setUiIcon(from.getUiIcon());
        setUiStyle(from.getUiStyle());
        setUiSort(from.getUiSort());
        setUiConfig(from.getUiConfig());
        setSignLic(from.getSignLic());
        setSignIssuer(from.getSignIssuer());
        setSignName(from.getSignName());
        setSignKey(from.getSignKey());
        setLicIdentifier(from.getLicIdentifier());
        setLicMenu(from.getLicMenu());
        setAppId(from.getAppId());
        setBagId(from.getBagId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IBBlock> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BBlockRecord
     */
    public BBlockRecord() {
        super(BBlock.B_BLOCK);
    }

    /**
     * Create a detached, initialised BBlockRecord
     */
    public BBlockRecord(String key, String code, String name, String uiIcon, String uiStyle, Long uiSort, String uiConfig, String signLic, String signIssuer, String signName, String signKey, String licIdentifier, String licMenu, String appId, String bagId, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(BBlock.B_BLOCK);

        setKey(key);
        setCode(code);
        setName(name);
        setUiIcon(uiIcon);
        setUiStyle(uiStyle);
        setUiSort(uiSort);
        setUiConfig(uiConfig);
        setSignLic(signLic);
        setSignIssuer(signIssuer);
        setSignName(signName);
        setSignKey(signKey);
        setLicIdentifier(licIdentifier);
        setLicMenu(licMenu);
        setAppId(appId);
        setBagId(bagId);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised BBlockRecord
     */
    public BBlockRecord(cn.vertxup.battery.domain.tables.pojos.BBlock value) {
        super(BBlock.B_BLOCK);

        if (value != null) {
            setKey(value.getKey());
            setCode(value.getCode());
            setName(value.getName());
            setUiIcon(value.getUiIcon());
            setUiStyle(value.getUiStyle());
            setUiSort(value.getUiSort());
            setUiConfig(value.getUiConfig());
            setSignLic(value.getSignLic());
            setSignIssuer(value.getSignIssuer());
            setSignName(value.getSignName());
            setSignKey(value.getSignKey());
            setLicIdentifier(value.getLicIdentifier());
            setLicMenu(value.getLicMenu());
            setAppId(value.getAppId());
            setBagId(value.getBagId());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public BBlockRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
