/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.IEJobLog;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EJobLog implements VertxPojo, IEJobLog {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        name;
    private String        serial;
    private String        type;
    private String        comment;
    private LocalDateTime logAt;
    private String        logBy;
    private String        logName;
    private String        todoId;
    private String        companyId;
    private String        status;
    private String        metadata;
    private Boolean       active;
    private String        sigma;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public EJobLog() {}

    public EJobLog(IEJobLog value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.serial = value.getSerial();
        this.type = value.getType();
        this.comment = value.getComment();
        this.logAt = value.getLogAt();
        this.logBy = value.getLogBy();
        this.logName = value.getLogName();
        this.todoId = value.getTodoId();
        this.companyId = value.getCompanyId();
        this.status = value.getStatus();
        this.metadata = value.getMetadata();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public EJobLog(
        String        key,
        String        name,
        String        serial,
        String        type,
        String        comment,
        LocalDateTime logAt,
        String        logBy,
        String        logName,
        String        todoId,
        String        companyId,
        String        status,
        String        metadata,
        Boolean       active,
        String        sigma,
        String        language,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.serial = serial;
        this.type = type;
        this.comment = comment;
        this.logAt = logAt;
        this.logBy = logBy;
        this.logName = logName;
        this.todoId = todoId;
        this.companyId = companyId;
        this.status = status;
        this.metadata = metadata;
        this.active = active;
        this.sigma = sigma;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public EJobLog(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.KEY</code>. 「key」- 记录主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.KEY</code>. 「key」- 记录主键
     */
    @Override
    public EJobLog setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.NAME</code>. 「name」- 记录名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.NAME</code>. 「name」- 记录名称
     */
    @Override
    public EJobLog setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.SERIAL</code>. 「serial」- 记录序号
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.SERIAL</code>. 「serial」- 记录序号
     */
    @Override
    public EJobLog setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.TYPE</code>. 「type」- 记录类型：考勤 / 培训 /
     * 休假 / 驻场等
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.TYPE</code>. 「type」- 记录类型：考勤 / 培训 /
     * 休假 / 驻场等
     */
    @Override
    public EJobLog setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.COMMENT</code>. 「comment」- 记录备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.COMMENT</code>. 「comment」- 记录备注
     */
    @Override
    public EJobLog setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.LOG_AT</code>. 「logAt」- 记录时间
     */
    @Override
    public LocalDateTime getLogAt() {
        return this.logAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.LOG_AT</code>. 「logAt」- 记录时间
     */
    @Override
    public EJobLog setLogAt(LocalDateTime logAt) {
        this.logAt = logAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.LOG_BY</code>. 「logBy」-
     * 记录人（只能自己记录，所以记录人就是所属人）
     */
    @Override
    public String getLogBy() {
        return this.logBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.LOG_BY</code>. 「logBy」-
     * 记录人（只能自己记录，所以记录人就是所属人）
     */
    @Override
    public EJobLog setLogBy(String logBy) {
        this.logBy = logBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.LOG_NAME</code>. 「logName」- 记录人姓名
     */
    @Override
    public String getLogName() {
        return this.logName;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.LOG_NAME</code>. 「logName」- 记录人姓名
     */
    @Override
    public EJobLog setLogName(String logName) {
        this.logName = logName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.TODO_ID</code>. 「todoId」-
     * 所属Todo主键，关联到主任务！
     */
    @Override
    public String getTodoId() {
        return this.todoId;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.TODO_ID</code>. 「todoId」-
     * 所属Todo主键，关联到主任务！
     */
    @Override
    public EJobLog setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.COMPANY_ID</code>. 「companyId」-
     * 所属公司
     */
    @Override
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.COMPANY_ID</code>. 「companyId」-
     * 所属公司
     */
    @Override
    public EJobLog setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.STATUS</code>. 「status」- 记录状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.STATUS</code>. 「status」- 记录状态
     */
    @Override
    public EJobLog setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EJobLog setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EJobLog setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public EJobLog setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EJobLog setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public EJobLog setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public EJobLog setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public EJobLog setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_JOB_LOG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_JOB_LOG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public EJobLog setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EJobLog (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(serial);
        sb.append(", ").append(type);
        sb.append(", ").append(comment);
        sb.append(", ").append(logAt);
        sb.append(", ").append(logBy);
        sb.append(", ").append(logName);
        sb.append(", ").append(todoId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(status);
        sb.append(", ").append(metadata);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
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
    public void from(IEJobLog from) {
        setKey(from.getKey());
        setName(from.getName());
        setSerial(from.getSerial());
        setType(from.getType());
        setComment(from.getComment());
        setLogAt(from.getLogAt());
        setLogBy(from.getLogBy());
        setLogName(from.getLogName());
        setTodoId(from.getTodoId());
        setCompanyId(from.getCompanyId());
        setStatus(from.getStatus());
        setMetadata(from.getMetadata());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IEJobLog> E into(E into) {
        into.from(this);
        return into;
    }
}