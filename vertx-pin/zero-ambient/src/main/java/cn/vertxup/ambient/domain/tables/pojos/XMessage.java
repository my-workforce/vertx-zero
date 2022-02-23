/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.pojos;


import cn.vertxup.ambient.domain.tables.interfaces.IXMessage;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XMessage implements VertxPojo, IXMessage {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        name;
    private String        code;
    private String        type;
    private String        status;
    private String        subject;
    private String        content;
    private String        from;
    private String        to;
    private String        sendBy;
    private String        sendAt;
    private String        appId;
    private Boolean       active;
    private String        sigma;
    private String        metadata;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public XMessage() {}

    public XMessage(IXMessage value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.type = value.getType();
        this.status = value.getStatus();
        this.subject = value.getSubject();
        this.content = value.getContent();
        this.from = value.getFrom();
        this.to = value.getTo();
        this.sendBy = value.getSendBy();
        this.sendAt = value.getSendAt();
        this.appId = value.getAppId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public XMessage(
        String        key,
        String        name,
        String        code,
        String        type,
        String        status,
        String        subject,
        String        content,
        String        from,
        String        to,
        String        sendBy,
        String        sendAt,
        String        appId,
        Boolean       active,
        String        sigma,
        String        metadata,
        String        language,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.type = type;
        this.status = status;
        this.subject = subject;
        this.content = content;
        this.from = from;
        this.to = to;
        this.sendBy = sendBy;
        this.sendAt = sendAt;
        this.appId = appId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public XMessage(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.KEY</code>. 「key」- 消息主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.KEY</code>. 「key」- 消息主键
     */
    @Override
    public XMessage setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.NAME</code>. 「name」- 消息名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.NAME</code>. 「name」- 消息名称
     */
    @Override
    public XMessage setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.CODE</code>. 「code」- 消息编码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.CODE</code>. 「code」- 消息编码
     */
    @Override
    public XMessage setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.TYPE</code>. 「type」- 消息类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.TYPE</code>. 「type」- 消息类型
     */
    @Override
    public XMessage setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.STATUS</code>. 「status」- 消息状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.STATUS</code>. 「status」- 消息状态
     */
    @Override
    public XMessage setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.SUBJECT</code>. 「subject」- 消息标题
     */
    @Override
    public String getSubject() {
        return this.subject;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.SUBJECT</code>. 「subject」- 消息标题
     */
    @Override
    public XMessage setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.CONTENT</code>. 「content」- 消息内容
     */
    @Override
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.CONTENT</code>. 「content」- 消息内容
     */
    @Override
    public XMessage setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.FROM</code>. 「from」- 消息发送方
     */
    @Override
    public String getFrom() {
        return this.from;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.FROM</code>. 「from」- 消息发送方
     */
    @Override
    public XMessage setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.TO</code>. 「to」- 消息接收方
     */
    @Override
    public String getTo() {
        return this.to;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.TO</code>. 「to」- 消息接收方
     */
    @Override
    public XMessage setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.SEND_BY</code>. 「sendBy」- 发送者
     */
    @Override
    public String getSendBy() {
        return this.sendBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.SEND_BY</code>. 「sendBy」- 发送者
     */
    @Override
    public XMessage setSendBy(String sendBy) {
        this.sendBy = sendBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.SEND_AT</code>. 「sendAt」- 发送时间
     */
    @Override
    public String getSendAt() {
        return this.sendAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.SEND_AT</code>. 「sendAt」- 发送时间
     */
    @Override
    public XMessage setSendAt(String sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public String getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public XMessage setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XMessage setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XMessage setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public XMessage setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XMessage setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public XMessage setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XMessage setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public XMessage setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_MESSAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_MESSAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XMessage setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("XMessage (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(subject);
        sb.append(", ").append(content);
        sb.append(", ").append(from);
        sb.append(", ").append(to);
        sb.append(", ").append(sendBy);
        sb.append(", ").append(sendAt);
        sb.append(", ").append(appId);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(metadata);
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
    public void from(IXMessage from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setSubject(from.getSubject());
        setContent(from.getContent());
        setFrom(from.getFrom());
        setTo(from.getTo());
        setSendBy(from.getSendBy());
        setSendAt(from.getSendAt());
        setAppId(from.getAppId());
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
    public <E extends IXMessage> E into(E into) {
        into.from(this);
        return into;
    }
}