/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.records;


import cn.vertxup.atom.domain.tables.MModel;
import cn.vertxup.atom.domain.tables.interfaces.IMModel;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
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
public class MModelRecord extends UpdatableRecordImpl<MModelRecord> implements Record21<String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IMModel {

    private static final long serialVersionUID = -2138789616;

    /**
     * Create a detached MModelRecord
     */
    public MModelRecord() {
        super(MModel.M_MODEL);
    }

    /**
     * Create a detached, initialised MModelRecord
     */
    public MModelRecord(String key, String identifier, String namespace, String name, String alias, String type, String comments, String categoryTree, String categoryId, String ruleUnique, Boolean isTrack, String spider, String spiderComponent, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(MModel.M_MODEL);

        set(0, key);
        set(1, identifier);
        set(2, namespace);
        set(3, name);
        set(4, alias);
        set(5, type);
        set(6, comments);
        set(7, categoryTree);
        set(8, categoryId);
        set(9, ruleUnique);
        set(10, isTrack);
        set(11, spider);
        set(12, spiderComponent);
        set(13, sigma);
        set(14, language);
        set(15, active);
        set(16, metadata);
        set(17, createdAt);
        set(18, createdBy);
        set(19, updatedAt);
        set(20, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.KEY</code>. 「key」- 模型ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.KEY</code>. 「key」- 模型ID
     */
    @Override
    public MModelRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.IDENTIFIER</code>. 「identifier」- 当前模型全局唯一ID
     */
    @Override
    public String getIdentifier() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.IDENTIFIER</code>. 「identifier」- 当前模型全局唯一ID
     */
    @Override
    public MModelRecord setIdentifier(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.NAMESPACE</code>. 「namespace」- 当前模型使用的名空间
     */
    @Override
    public String getNamespace() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.NAMESPACE</code>. 「namespace」- 当前模型使用的名空间
     */
    @Override
    public MModelRecord setNamespace(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.NAME</code>. 「name」- 当前模型的名称
     */
    @Override
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.NAME</code>. 「name」- 当前模型的名称
     */
    @Override
    public MModelRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.ALIAS</code>. 「alias」- 模型别名（业务名）
     */
    @Override
    public String getAlias() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.ALIAS</code>. 「alias」- 模型别名（业务名）
     */
    @Override
    public MModelRecord setAlias(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.TYPE</code>. 「type」- 当前模型的类型信息
     */
    @Override
    public String getType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.TYPE</code>. 「type」- 当前模型的类型信息
     */
    @Override
    public MModelRecord setType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.COMMENTS</code>. 「comments」- 当前模型的描述信息
     */
    @Override
    public String getComments() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.COMMENTS</code>. 「comments」- 当前模型的描述信息
     */
    @Override
    public MModelRecord setComments(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.CATEGORY_TREE</code>. 「categoryTree」- 当前模型所属的类型树
     */
    @Override
    public String getCategoryTree() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.CATEGORY_TREE</code>. 「categoryTree」- 当前模型所属的类型树
     */
    @Override
    public MModelRecord setCategoryTree(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.CATEGORY_ID</code>. 「categoryId」- 关联的类型的ID
     */
    @Override
    public String getCategoryId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.CATEGORY_ID</code>. 「categoryId」- 关联的类型的ID
     */
    @Override
    public MModelRecord setCategoryId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.RULE_UNIQUE</code>. 「ruleUnique」- 当前模型的标识规则
     */
    @Override
    public String getRuleUnique() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.RULE_UNIQUE</code>. 「ruleUnique」- 当前模型的标识规则
     */
    @Override
    public MModelRecord setRuleUnique(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.IS_TRACK</code>. 「isTrack」- 该组件为 track 表示执行 ACTIVITY 的变更监控功能（生成变更历史）
     */
    @Override
    public Boolean getIsTrack() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.IS_TRACK</code>. 「isTrack」- 该组件为 track 表示执行 ACTIVITY 的变更监控功能（生成变更历史）
     */
    @Override
    public MModelRecord setIsTrack(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.SPIDER</code>. 「spider」- 主图格式，存储当前模型为起点的图层Json数据，每个模型只有一张
     */
    @Override
    public String getSpider() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.SPIDER</code>. 「spider」- 主图格式，存储当前模型为起点的图层Json数据，每个模型只有一张
     */
    @Override
    public MModelRecord setSpider(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.SPIDER_COMPONENT</code>. 「spiderComponent」- 在主图格式上存在的插件信息，用于处理主图格式的内容
     */
    @Override
    public String getSpiderComponent() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.SPIDER_COMPONENT</code>. 「spiderComponent」- 在主图格式上存在的插件信息，用于处理主图格式的内容
     */
    @Override
    public MModelRecord setSpiderComponent(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public MModelRecord setSigma(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public MModelRecord setLanguage(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public MModelRecord setActive(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public MModelRecord setMetadata(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public MModelRecord setCreatedAt(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public MModelRecord setCreatedBy(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public MModelRecord setUpdatedAt(LocalDateTime value) {
        set(19, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.M_MODEL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(20);
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.M_MODEL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public MModelRecord setUpdatedBy(String value) {
        set(20, value);
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
    public Row21<String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MModel.M_MODEL.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MModel.M_MODEL.IDENTIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MModel.M_MODEL.NAMESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MModel.M_MODEL.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MModel.M_MODEL.ALIAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MModel.M_MODEL.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MModel.M_MODEL.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return MModel.M_MODEL.CATEGORY_TREE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MModel.M_MODEL.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return MModel.M_MODEL.RULE_UNIQUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return MModel.M_MODEL.IS_TRACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return MModel.M_MODEL.SPIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return MModel.M_MODEL.SPIDER_COMPONENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return MModel.M_MODEL.SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return MModel.M_MODEL.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return MModel.M_MODEL.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return MModel.M_MODEL.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field18() {
        return MModel.M_MODEL.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return MModel.M_MODEL.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field20() {
        return MModel.M_MODEL.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return MModel.M_MODEL.UPDATED_BY;
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
        return getIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getNamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAlias();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCategoryTree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getRuleUnique();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getIsTrack();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getSpider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getSpiderComponent();
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
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component16() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component18() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component20() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
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
        return getIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAlias();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCategoryTree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getRuleUnique();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getIsTrack();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getSpider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getSpiderComponent();
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
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value18() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value20() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value2(String value) {
        setIdentifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value3(String value) {
        setNamespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value5(String value) {
        setAlias(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value6(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value7(String value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value8(String value) {
        setCategoryTree(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value9(String value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value10(String value) {
        setRuleUnique(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value11(Boolean value) {
        setIsTrack(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value12(String value) {
        setSpider(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value13(String value) {
        setSpiderComponent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value14(String value) {
        setSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value15(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value16(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value17(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value18(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value19(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord value20(LocalDateTime value) {
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
    public MModelRecord value21(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModelRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, Boolean value11, String value12, String value13, String value14, String value15, Boolean value16, String value17, LocalDateTime value18, String value19, LocalDateTime value20, String value21) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IMModel from) {
        setKey(from.getKey());
        setIdentifier(from.getIdentifier());
        setNamespace(from.getNamespace());
        setName(from.getName());
        setAlias(from.getAlias());
        setType(from.getType());
        setComments(from.getComments());
        setCategoryTree(from.getCategoryTree());
        setCategoryId(from.getCategoryId());
        setRuleUnique(from.getRuleUnique());
        setIsTrack(from.getIsTrack());
        setSpider(from.getSpider());
        setSpiderComponent(from.getSpiderComponent());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IMModel> E into(E into) {
        into.from(this);
        return into;
    }
}
