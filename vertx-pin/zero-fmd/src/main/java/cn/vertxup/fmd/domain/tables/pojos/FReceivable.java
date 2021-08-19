/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.fmd.domain.tables.pojos;


import cn.vertxup.fmd.domain.tables.interfaces.IFReceivable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.annotation.Generated;


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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FReceivable implements IFReceivable {

    private static final long serialVersionUID = -1203816238;

    private String        key;
    private String        name;
    private String        code;
    private String        serial;
    private BigDecimal    amount;
    private String        comment;
    private String        signName;
    private String        signMobile;
    private Boolean       finished;
    private LocalDateTime finishedAt;
    private String        customerId;
    private String        sigma;
    private String        language;
    private Boolean       active;
    private String        metadata;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public FReceivable() {}

    public FReceivable(FReceivable value) {
        this.key = value.key;
        this.name = value.name;
        this.code = value.code;
        this.serial = value.serial;
        this.amount = value.amount;
        this.comment = value.comment;
        this.signName = value.signName;
        this.signMobile = value.signMobile;
        this.finished = value.finished;
        this.finishedAt = value.finishedAt;
        this.customerId = value.customerId;
        this.sigma = value.sigma;
        this.language = value.language;
        this.active = value.active;
        this.metadata = value.metadata;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public FReceivable(
        String        key,
        String        name,
        String        code,
        String        serial,
        BigDecimal    amount,
        String        comment,
        String        signName,
        String        signMobile,
        Boolean       finished,
        LocalDateTime finishedAt,
        String        customerId,
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
        this.serial = serial;
        this.amount = amount;
        this.comment = comment;
        this.signName = signName;
        this.signMobile = signMobile;
        this.finished = finished;
        this.finishedAt = finishedAt;
        this.customerId = customerId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public FReceivable setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public FReceivable setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public FReceivable setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String getSerial() {
        return this.serial;
    }

    @Override
    public FReceivable setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    @Override
    public FReceivable setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String getComment() {
        return this.comment;
    }

    @Override
    public FReceivable setComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String getSignName() {
        return this.signName;
    }

    @Override
    public FReceivable setSignName(String signName) {
        this.signName = signName;
        return this;
    }

    @Override
    public String getSignMobile() {
        return this.signMobile;
    }

    @Override
    public FReceivable setSignMobile(String signMobile) {
        this.signMobile = signMobile;
        return this;
    }

    @Override
    public Boolean getFinished() {
        return this.finished;
    }

    @Override
    public FReceivable setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }

    @Override
    public LocalDateTime getFinishedAt() {
        return this.finishedAt;
    }

    @Override
    public FReceivable setFinishedAt(LocalDateTime finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    @Override
    public String getCustomerId() {
        return this.customerId;
    }

    @Override
    public FReceivable setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public FReceivable setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public FReceivable setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public FReceivable setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public FReceivable setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public FReceivable setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public FReceivable setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public FReceivable setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public FReceivable setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FReceivable (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(serial);
        sb.append(", ").append(amount);
        sb.append(", ").append(comment);
        sb.append(", ").append(signName);
        sb.append(", ").append(signMobile);
        sb.append(", ").append(finished);
        sb.append(", ").append(finishedAt);
        sb.append(", ").append(customerId);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IFReceivable from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setAmount(from.getAmount());
        setComment(from.getComment());
        setSignName(from.getSignName());
        setSignMobile(from.getSignMobile());
        setFinished(from.getFinished());
        setFinishedAt(from.getFinishedAt());
        setCustomerId(from.getCustomerId());
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
    public <E extends IFReceivable> E into(E into) {
        into.from(this);
        return into;
    }

    public FReceivable(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
