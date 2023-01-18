/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.tpl.domain.tables.records;


import cn.vertxup.tpl.domain.tables.MySetting;
import cn.vertxup.tpl.domain.tables.interfaces.IMySetting;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MySettingRecord extends UpdatableRecordImpl<MySettingRecord> implements VertxPojo, Record22<String, String, String, String, String, Boolean, Boolean, Boolean, Boolean, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IMySetting {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.KEY</code>. 「key」- 个人设置主键
     */
    @Override
    public MySettingRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.KEY</code>. 「key」- 个人设置主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_NAV_THEME</code>. 「pNavTheme」-
     * navTheme, 风格处理，对应 light / realdark
     */
    @Override
    public MySettingRecord setPNavTheme(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_NAV_THEME</code>. 「pNavTheme」-
     * navTheme, 风格处理，对应 light / realdark
     */
    @Override
    public String getPNavTheme() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_COLOR_PRIMARY</code>.
     * 「pColorPrimary」- colorPrimary，主色调
     */
    @Override
    public MySettingRecord setPColorPrimary(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_COLOR_PRIMARY</code>.
     * 「pColorPrimary」- colorPrimary，主色调
     */
    @Override
    public String getPColorPrimary() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_LAYOUT</code>. 「pLayout」-
     * 布局类型：top, menu, mix
     */
    @Override
    public MySettingRecord setPLayout(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_LAYOUT</code>. 「pLayout」-
     * 布局类型：top, menu, mix
     */
    @Override
    public String getPLayout() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_CONTENT_WIDTH</code>.
     * 「pContentWidth」- 两种
     */
    @Override
    public MySettingRecord setPContentWidth(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_CONTENT_WIDTH</code>.
     * 「pContentWidth」- 两种
     */
    @Override
    public String getPContentWidth() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_FIXED_HEADER</code>.
     * 「pFixedHeader」- 标题控制
     */
    @Override
    public MySettingRecord setPFixedHeader(Boolean value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_FIXED_HEADER</code>.
     * 「pFixedHeader」- 标题控制
     */
    @Override
    public Boolean getPFixedHeader() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_FIX_SIDER_BAR</code>.
     * 「pFixSiderBar」- 侧边栏控制
     */
    @Override
    public MySettingRecord setPFixSiderBar(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_FIX_SIDER_BAR</code>.
     * 「pFixSiderBar」- 侧边栏控制
     */
    @Override
    public Boolean getPFixSiderBar() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_COLOR_WEAK</code>. 「pColorWeak」-
     * 色彩控制
     */
    @Override
    public MySettingRecord setPColorWeak(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_COLOR_WEAK</code>. 「pColorWeak」-
     * 色彩控制
     */
    @Override
    public Boolean getPColorWeak() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_PWA</code>. 「pPwa」- pwa属性，暂时未知
     */
    @Override
    public MySettingRecord setPPwa(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_PWA</code>. 「pPwa」- pwa属性，暂时未知
     */
    @Override
    public Boolean getPPwa() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.P_TOKEN</code>. 「pToken」-
     * 保留（后续可能会使用）
     */
    @Override
    public MySettingRecord setPToken(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.P_TOKEN</code>. 「pToken」-
     * 保留（后续可能会使用）
     */
    @Override
    public String getPToken() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.MY_BAG</code>. 「myBag」- 对应 MY_BAG
     * 设置，每个BAG有对应设置信息
     */
    @Override
    public MySettingRecord setMyBag(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.MY_BAG</code>. 「myBag」- 对应 MY_BAG
     * 设置，每个BAG有对应设置信息
     */
    @Override
    public String getMyBag() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.OWNER</code>. 「owner」- 拥有者ID，我的 /
     * 角色级
     */
    @Override
    public MySettingRecord setOwner(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.OWNER</code>. 「owner」- 拥有者ID，我的 /
     * 角色级
     */
    @Override
    public String getOwner() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.OWNER_TYPE</code>. 「ownerType」-
     * ROLE 角色，USER 用户
     */
    @Override
    public MySettingRecord setOwnerType(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.OWNER_TYPE</code>. 「ownerType」-
     * ROLE 角色，USER 用户
     */
    @Override
    public String getOwnerType() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.TYPE</code>. 「type」- 类型（默认全站）
     */
    @Override
    public MySettingRecord setType(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.TYPE</code>. 「type」- 类型（默认全站）
     */
    @Override
    public String getType() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public MySettingRecord setActive(Boolean value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public MySettingRecord setSigma(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public MySettingRecord setMetadata(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public MySettingRecord setLanguage(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public MySettingRecord setCreatedAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public MySettingRecord setCreatedBy(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public MySettingRecord setUpdatedAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_SETTING.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public MySettingRecord setUpdatedBy(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_SETTING.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, String, String, String, String, Boolean, Boolean, Boolean, Boolean, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<String, String, String, String, String, Boolean, Boolean, Boolean, Boolean, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MySetting.MY_SETTING.KEY;
    }

    @Override
    public Field<String> field2() {
        return MySetting.MY_SETTING.P_NAV_THEME;
    }

    @Override
    public Field<String> field3() {
        return MySetting.MY_SETTING.P_COLOR_PRIMARY;
    }

    @Override
    public Field<String> field4() {
        return MySetting.MY_SETTING.P_LAYOUT;
    }

    @Override
    public Field<String> field5() {
        return MySetting.MY_SETTING.P_CONTENT_WIDTH;
    }

    @Override
    public Field<Boolean> field6() {
        return MySetting.MY_SETTING.P_FIXED_HEADER;
    }

    @Override
    public Field<Boolean> field7() {
        return MySetting.MY_SETTING.P_FIX_SIDER_BAR;
    }

    @Override
    public Field<Boolean> field8() {
        return MySetting.MY_SETTING.P_COLOR_WEAK;
    }

    @Override
    public Field<Boolean> field9() {
        return MySetting.MY_SETTING.P_PWA;
    }

    @Override
    public Field<String> field10() {
        return MySetting.MY_SETTING.P_TOKEN;
    }

    @Override
    public Field<String> field11() {
        return MySetting.MY_SETTING.MY_BAG;
    }

    @Override
    public Field<String> field12() {
        return MySetting.MY_SETTING.OWNER;
    }

    @Override
    public Field<String> field13() {
        return MySetting.MY_SETTING.OWNER_TYPE;
    }

    @Override
    public Field<String> field14() {
        return MySetting.MY_SETTING.TYPE;
    }

    @Override
    public Field<Boolean> field15() {
        return MySetting.MY_SETTING.ACTIVE;
    }

    @Override
    public Field<String> field16() {
        return MySetting.MY_SETTING.SIGMA;
    }

    @Override
    public Field<String> field17() {
        return MySetting.MY_SETTING.METADATA;
    }

    @Override
    public Field<String> field18() {
        return MySetting.MY_SETTING.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return MySetting.MY_SETTING.CREATED_AT;
    }

    @Override
    public Field<String> field20() {
        return MySetting.MY_SETTING.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field21() {
        return MySetting.MY_SETTING.UPDATED_AT;
    }

    @Override
    public Field<String> field22() {
        return MySetting.MY_SETTING.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getPNavTheme();
    }

    @Override
    public String component3() {
        return getPColorPrimary();
    }

    @Override
    public String component4() {
        return getPLayout();
    }

    @Override
    public String component5() {
        return getPContentWidth();
    }

    @Override
    public Boolean component6() {
        return getPFixedHeader();
    }

    @Override
    public Boolean component7() {
        return getPFixSiderBar();
    }

    @Override
    public Boolean component8() {
        return getPColorWeak();
    }

    @Override
    public Boolean component9() {
        return getPPwa();
    }

    @Override
    public String component10() {
        return getPToken();
    }

    @Override
    public String component11() {
        return getMyBag();
    }

    @Override
    public String component12() {
        return getOwner();
    }

    @Override
    public String component13() {
        return getOwnerType();
    }

    @Override
    public String component14() {
        return getType();
    }

    @Override
    public Boolean component15() {
        return getActive();
    }

    @Override
    public String component16() {
        return getSigma();
    }

    @Override
    public String component17() {
        return getMetadata();
    }

    @Override
    public String component18() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component19() {
        return getCreatedAt();
    }

    @Override
    public String component20() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component21() {
        return getUpdatedAt();
    }

    @Override
    public String component22() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getPNavTheme();
    }

    @Override
    public String value3() {
        return getPColorPrimary();
    }

    @Override
    public String value4() {
        return getPLayout();
    }

    @Override
    public String value5() {
        return getPContentWidth();
    }

    @Override
    public Boolean value6() {
        return getPFixedHeader();
    }

    @Override
    public Boolean value7() {
        return getPFixSiderBar();
    }

    @Override
    public Boolean value8() {
        return getPColorWeak();
    }

    @Override
    public Boolean value9() {
        return getPPwa();
    }

    @Override
    public String value10() {
        return getPToken();
    }

    @Override
    public String value11() {
        return getMyBag();
    }

    @Override
    public String value12() {
        return getOwner();
    }

    @Override
    public String value13() {
        return getOwnerType();
    }

    @Override
    public String value14() {
        return getType();
    }

    @Override
    public Boolean value15() {
        return getActive();
    }

    @Override
    public String value16() {
        return getSigma();
    }

    @Override
    public String value17() {
        return getMetadata();
    }

    @Override
    public String value18() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value19() {
        return getCreatedAt();
    }

    @Override
    public String value20() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value21() {
        return getUpdatedAt();
    }

    @Override
    public String value22() {
        return getUpdatedBy();
    }

    @Override
    public MySettingRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public MySettingRecord value2(String value) {
        setPNavTheme(value);
        return this;
    }

    @Override
    public MySettingRecord value3(String value) {
        setPColorPrimary(value);
        return this;
    }

    @Override
    public MySettingRecord value4(String value) {
        setPLayout(value);
        return this;
    }

    @Override
    public MySettingRecord value5(String value) {
        setPContentWidth(value);
        return this;
    }

    @Override
    public MySettingRecord value6(Boolean value) {
        setPFixedHeader(value);
        return this;
    }

    @Override
    public MySettingRecord value7(Boolean value) {
        setPFixSiderBar(value);
        return this;
    }

    @Override
    public MySettingRecord value8(Boolean value) {
        setPColorWeak(value);
        return this;
    }

    @Override
    public MySettingRecord value9(Boolean value) {
        setPPwa(value);
        return this;
    }

    @Override
    public MySettingRecord value10(String value) {
        setPToken(value);
        return this;
    }

    @Override
    public MySettingRecord value11(String value) {
        setMyBag(value);
        return this;
    }

    @Override
    public MySettingRecord value12(String value) {
        setOwner(value);
        return this;
    }

    @Override
    public MySettingRecord value13(String value) {
        setOwnerType(value);
        return this;
    }

    @Override
    public MySettingRecord value14(String value) {
        setType(value);
        return this;
    }

    @Override
    public MySettingRecord value15(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public MySettingRecord value16(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public MySettingRecord value17(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public MySettingRecord value18(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public MySettingRecord value19(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public MySettingRecord value20(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public MySettingRecord value21(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public MySettingRecord value22(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public MySettingRecord values(String value1, String value2, String value3, String value4, String value5, Boolean value6, Boolean value7, Boolean value8, Boolean value9, String value10, String value11, String value12, String value13, String value14, Boolean value15, String value16, String value17, String value18, LocalDateTime value19, String value20, LocalDateTime value21, String value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IMySetting from) {
        setKey(from.getKey());
        setPNavTheme(from.getPNavTheme());
        setPColorPrimary(from.getPColorPrimary());
        setPLayout(from.getPLayout());
        setPContentWidth(from.getPContentWidth());
        setPFixedHeader(from.getPFixedHeader());
        setPFixSiderBar(from.getPFixSiderBar());
        setPColorWeak(from.getPColorWeak());
        setPPwa(from.getPPwa());
        setPToken(from.getPToken());
        setMyBag(from.getMyBag());
        setOwner(from.getOwner());
        setOwnerType(from.getOwnerType());
        setType(from.getType());
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
    public <E extends IMySetting> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MySettingRecord
     */
    public MySettingRecord() {
        super(MySetting.MY_SETTING);
    }

    /**
     * Create a detached, initialised MySettingRecord
     */
    public MySettingRecord(String key, String pNavTheme, String pColorPrimary, String pLayout, String pContentWidth, Boolean pFixedHeader, Boolean pFixSiderBar, Boolean pColorWeak, Boolean pPwa, String pToken, String myBag, String owner, String ownerType, String type, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(MySetting.MY_SETTING);

        setKey(key);
        setPNavTheme(pNavTheme);
        setPColorPrimary(pColorPrimary);
        setPLayout(pLayout);
        setPContentWidth(pContentWidth);
        setPFixedHeader(pFixedHeader);
        setPFixSiderBar(pFixSiderBar);
        setPColorWeak(pColorWeak);
        setPPwa(pPwa);
        setPToken(pToken);
        setMyBag(myBag);
        setOwner(owner);
        setOwnerType(ownerType);
        setType(type);
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
     * Create a detached, initialised MySettingRecord
     */
    public MySettingRecord(cn.vertxup.tpl.domain.tables.pojos.MySetting value) {
        super(MySetting.MY_SETTING);

        if (value != null) {
            setKey(value.getKey());
            setPNavTheme(value.getPNavTheme());
            setPColorPrimary(value.getPColorPrimary());
            setPLayout(value.getPLayout());
            setPContentWidth(value.getPContentWidth());
            setPFixedHeader(value.getPFixedHeader());
            setPFixSiderBar(value.getPFixSiderBar());
            setPColorWeak(value.getPColorWeak());
            setPPwa(value.getPPwa());
            setPToken(value.getPToken());
            setMyBag(value.getMyBag());
            setOwner(value.getOwner());
            setOwnerType(value.getOwnerType());
            setType(value.getType());
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

        public MySettingRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}