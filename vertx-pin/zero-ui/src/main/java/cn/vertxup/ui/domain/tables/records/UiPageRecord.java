/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.records;


import cn.vertxup.ui.domain.tables.UiPage;
import cn.vertxup.ui.domain.tables.interfaces.IUiPage;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class UiPageRecord extends UpdatableRecordImpl<UiPageRecord> implements Record20<String, String, String, String, String, Boolean, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IUiPage {

    private static final long serialVersionUID = 1447733899;

    /**
     * Create a detached UiPageRecord
     */
    public UiPageRecord() {
        super(UiPage.UI_PAGE);
    }

    /**
     * Create a detached, initialised UiPageRecord
     */
    public UiPageRecord(String key, String app, String module, String page, String layoutId, Boolean secure, String paramMap, String containerName, String containerConfig, String state, String grid, String assist, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(UiPage.UI_PAGE);

        set(0, key);
        set(1, app);
        set(2, module);
        set(3, page);
        set(4, layoutId);
        set(5, secure);
        set(6, paramMap);
        set(7, containerName);
        set(8, containerConfig);
        set(9, state);
        set(10, grid);
        set(11, assist);
        set(12, active);
        set(13, sigma);
        set(14, metadata);
        set(15, language);
        set(16, createdAt);
        set(17, createdBy);
        set(18, updatedAt);
        set(19, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.KEY</code>. 「key」- 页面唯一主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.KEY</code>. 「key」- 页面唯一主键
     */
    @Override
    public UiPageRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.APP</code>. 「app」- 入口APP名称，APP中的path
     */
    @Override
    public String getApp() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.APP</code>. 「app」- 入口APP名称，APP中的path
     */
    @Override
    public UiPageRecord setApp(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.MODULE</code>. 「module」- 模块相关信息
     */
    @Override
    public String getModule() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.MODULE</code>. 「module」- 模块相关信息
     */
    @Override
    public UiPageRecord setModule(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.PAGE</code>. 「page」- 页面路径信息
     */
    @Override
    public String getPage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.PAGE</code>. 「page」- 页面路径信息
     */
    @Override
    public UiPageRecord setPage(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.LAYOUT_ID</code>. 「layoutId」- 使用的模板ID，最终生成 layout 顶层节点数据
     */
    @Override
    public String getLayoutId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.LAYOUT_ID</code>. 「layoutId」- 使用的模板ID，最终生成 layout 顶层节点数据
     */
    @Override
    public UiPageRecord setLayoutId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.SECURE</code>. 「secure」- 是否执行安全检查（安全检查才会被权限系统捕捉）
     */
    @Override
    public Boolean getSecure() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.SECURE</code>. 「secure」- 是否执行安全检查（安全检查才会被权限系统捕捉）
     */
    @Override
    public UiPageRecord setSecure(Boolean value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.PARAM_MAP</code>. 「paramMap」- URL地址中的配置key=value
     */
    @Override
    public String getParamMap() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.PARAM_MAP</code>. 「paramMap」- URL地址中的配置key=value
     */
    @Override
    public UiPageRecord setParamMap(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.CONTAINER_NAME</code>. 「containerName」- 当前页面是否存在容器，如果有容器，那么设置容器名称
     */
    @Override
    public String getContainerName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.CONTAINER_NAME</code>. 「containerName」- 当前页面是否存在容器，如果有容器，那么设置容器名称
     */
    @Override
    public UiPageRecord setContainerName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.CONTAINER_CONFIG</code>. 「containerConfig」- 当前页面容器相关配置
     */
    @Override
    public String getContainerConfig() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.CONTAINER_CONFIG</code>. 「containerConfig」- 当前页面容器相关配置
     */
    @Override
    public UiPageRecord setContainerConfig(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.STATE</code>. 「state」- 当前页面的初始化状态信息
     */
    @Override
    public String getState() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.STATE</code>. 「state」- 当前页面的初始化状态信息
     */
    @Override
    public UiPageRecord setState(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.GRID</code>. 「grid」- 当前页面的布局信息，Grid布局格式
     */
    @Override
    public String getGrid() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.GRID</code>. 「grid」- 当前页面的布局信息，Grid布局格式
     */
    @Override
    public UiPageRecord setGrid(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.ASSIST</code>. 「assist」- 当前页面的辅助数据Ajax配置
     */
    @Override
    public String getAssist() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.ASSIST</code>. 「assist」- 当前页面的辅助数据Ajax配置
     */
    @Override
    public UiPageRecord setAssist(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public UiPageRecord setActive(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public UiPageRecord setSigma(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public UiPageRecord setMetadata(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public UiPageRecord setLanguage(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public UiPageRecord setCreatedAt(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public UiPageRecord setCreatedBy(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public UiPageRecord setUpdatedAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(19);
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public UiPageRecord setUpdatedBy(String value) {
        set(19, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<String, String, String, String, String, Boolean, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<String, String, String, String, String, Boolean, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return UiPage.UI_PAGE.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UiPage.UI_PAGE.APP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UiPage.UI_PAGE.MODULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UiPage.UI_PAGE.PAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UiPage.UI_PAGE.LAYOUT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return UiPage.UI_PAGE.SECURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UiPage.UI_PAGE.PARAM_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UiPage.UI_PAGE.CONTAINER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return UiPage.UI_PAGE.CONTAINER_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return UiPage.UI_PAGE.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return UiPage.UI_PAGE.GRID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return UiPage.UI_PAGE.ASSIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return UiPage.UI_PAGE.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return UiPage.UI_PAGE.SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return UiPage.UI_PAGE.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return UiPage.UI_PAGE.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field17() {
        return UiPage.UI_PAGE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return UiPage.UI_PAGE.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field19() {
        return UiPage.UI_PAGE.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return UiPage.UI_PAGE.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getApp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getModule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLayoutId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getSecure();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getParamMap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getContainerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getContainerConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getGrid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getAssist();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component17() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component19() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getApp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getModule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLayoutId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getSecure();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getParamMap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getContainerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getContainerConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getGrid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAssist();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value17() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value19() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value2(String value) {
        setApp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value3(String value) {
        setModule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value4(String value) {
        setPage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value5(String value) {
        setLayoutId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value6(Boolean value) {
        setSecure(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value7(String value) {
        setParamMap(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value8(String value) {
        setContainerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value9(String value) {
        setContainerConfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value10(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value11(String value) {
        setGrid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value12(String value) {
        setAssist(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value13(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value14(String value) {
        setSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value15(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value16(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value17(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value18(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value19(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord value20(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiPageRecord values(String value1, String value2, String value3, String value4, String value5, Boolean value6, String value7, String value8, String value9, String value10, String value11, String value12, Boolean value13, String value14, String value15, String value16, LocalDateTime value17, String value18, LocalDateTime value19, String value20) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IUiPage from) {
        setKey(from.getKey());
        setApp(from.getApp());
        setModule(from.getModule());
        setPage(from.getPage());
        setLayoutId(from.getLayoutId());
        setSecure(from.getSecure());
        setParamMap(from.getParamMap());
        setContainerName(from.getContainerName());
        setContainerConfig(from.getContainerConfig());
        setState(from.getState());
        setGrid(from.getGrid());
        setAssist(from.getAssist());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
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
    public <E extends IUiPage> E into(E into) {
        into.from(this);
        return into;
    }
}
