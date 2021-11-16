/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.IEAsset;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EAsset implements VertxPojo, IEAsset {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        name;
    private String        code;
    private String        type;
    private String        status;
    private String        modelNumber;
    private String        unit;
    private Long          num;
    private Long          numDeprecating;
    private Long          numDeprecated;
    private Long          numUsing;
    private Long          numUsed;
    private String        wayChange;
    private String        wayDeprecate;
    private String        wayAccording;
    private LocalDateTime usedAt;
    private String        usedBy;
    private String        usedStatus;
    private BigDecimal    vOriginal;
    private BigDecimal    vTax;
    private BigDecimal    vDeReady;
    private BigDecimal    vNetJunk;
    private BigDecimal    vNet;
    private BigDecimal    vNetAmount;
    private BigDecimal    vDeprecatedM;
    private BigDecimal    vDeprecatedA;
    private String        kFixed;
    private String        kDeprecated;
    private String        kAssignment;
    private String        kTax;
    private String        kDevalue;
    private String        kChange;
    private String        customerId;
    private LocalDateTime expiredAt;
    private String        expiredComment;
    private String        userId;
    private String        storeId;
    private String        deptId;
    private String        companyId;
    private String        parentId;
    private String        comment;
    private String        sigma;
    private String        language;
    private Boolean       active;
    private String        metadata;
    private LocalDateTime enterAt;
    private String        enterBy;
    private LocalDateTime accountAt;
    private String        accountBy;
    private LocalDateTime scrapAt;
    private String        scrapBy;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public EAsset() {}

    public EAsset(IEAsset value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.type = value.getType();
        this.status = value.getStatus();
        this.modelNumber = value.getModelNumber();
        this.unit = value.getUnit();
        this.num = value.getNum();
        this.numDeprecating = value.getNumDeprecating();
        this.numDeprecated = value.getNumDeprecated();
        this.numUsing = value.getNumUsing();
        this.numUsed = value.getNumUsed();
        this.wayChange = value.getWayChange();
        this.wayDeprecate = value.getWayDeprecate();
        this.wayAccording = value.getWayAccording();
        this.usedAt = value.getUsedAt();
        this.usedBy = value.getUsedBy();
        this.usedStatus = value.getUsedStatus();
        this.vOriginal = value.getVOriginal();
        this.vTax = value.getVTax();
        this.vDeReady = value.getVDeReady();
        this.vNetJunk = value.getVNetJunk();
        this.vNet = value.getVNet();
        this.vNetAmount = value.getVNetAmount();
        this.vDeprecatedM = value.getVDeprecatedM();
        this.vDeprecatedA = value.getVDeprecatedA();
        this.kFixed = value.getKFixed();
        this.kDeprecated = value.getKDeprecated();
        this.kAssignment = value.getKAssignment();
        this.kTax = value.getKTax();
        this.kDevalue = value.getKDevalue();
        this.kChange = value.getKChange();
        this.customerId = value.getCustomerId();
        this.expiredAt = value.getExpiredAt();
        this.expiredComment = value.getExpiredComment();
        this.userId = value.getUserId();
        this.storeId = value.getStoreId();
        this.deptId = value.getDeptId();
        this.companyId = value.getCompanyId();
        this.parentId = value.getParentId();
        this.comment = value.getComment();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.enterAt = value.getEnterAt();
        this.enterBy = value.getEnterBy();
        this.accountAt = value.getAccountAt();
        this.accountBy = value.getAccountBy();
        this.scrapAt = value.getScrapAt();
        this.scrapBy = value.getScrapBy();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public EAsset(
        String        key,
        String        name,
        String        code,
        String        type,
        String        status,
        String        modelNumber,
        String        unit,
        Long          num,
        Long          numDeprecating,
        Long          numDeprecated,
        Long          numUsing,
        Long          numUsed,
        String        wayChange,
        String        wayDeprecate,
        String        wayAccording,
        LocalDateTime usedAt,
        String        usedBy,
        String        usedStatus,
        BigDecimal    vOriginal,
        BigDecimal    vTax,
        BigDecimal    vDeReady,
        BigDecimal    vNetJunk,
        BigDecimal    vNet,
        BigDecimal    vNetAmount,
        BigDecimal    vDeprecatedM,
        BigDecimal    vDeprecatedA,
        String        kFixed,
        String        kDeprecated,
        String        kAssignment,
        String        kTax,
        String        kDevalue,
        String        kChange,
        String        customerId,
        LocalDateTime expiredAt,
        String        expiredComment,
        String        userId,
        String        storeId,
        String        deptId,
        String        companyId,
        String        parentId,
        String        comment,
        String        sigma,
        String        language,
        Boolean       active,
        String        metadata,
        LocalDateTime enterAt,
        String        enterBy,
        LocalDateTime accountAt,
        String        accountBy,
        LocalDateTime scrapAt,
        String        scrapBy,
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
        this.modelNumber = modelNumber;
        this.unit = unit;
        this.num = num;
        this.numDeprecating = numDeprecating;
        this.numDeprecated = numDeprecated;
        this.numUsing = numUsing;
        this.numUsed = numUsed;
        this.wayChange = wayChange;
        this.wayDeprecate = wayDeprecate;
        this.wayAccording = wayAccording;
        this.usedAt = usedAt;
        this.usedBy = usedBy;
        this.usedStatus = usedStatus;
        this.vOriginal = vOriginal;
        this.vTax = vTax;
        this.vDeReady = vDeReady;
        this.vNetJunk = vNetJunk;
        this.vNet = vNet;
        this.vNetAmount = vNetAmount;
        this.vDeprecatedM = vDeprecatedM;
        this.vDeprecatedA = vDeprecatedA;
        this.kFixed = kFixed;
        this.kDeprecated = kDeprecated;
        this.kAssignment = kAssignment;
        this.kTax = kTax;
        this.kDevalue = kDevalue;
        this.kChange = kChange;
        this.customerId = customerId;
        this.expiredAt = expiredAt;
        this.expiredComment = expiredComment;
        this.userId = userId;
        this.storeId = storeId;
        this.deptId = deptId;
        this.companyId = companyId;
        this.parentId = parentId;
        this.comment = comment;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.enterAt = enterAt;
        this.enterBy = enterBy;
        this.accountAt = accountAt;
        this.accountBy = accountBy;
        this.scrapAt = scrapAt;
        this.scrapBy = scrapBy;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public EAsset(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.KEY</code>. 「key」- 资产主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.KEY</code>. 「key」- 资产主键
     */
    @Override
    public EAsset setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.NAME</code>. 「name」- 资产名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.NAME</code>. 「name」- 资产名称
     */
    @Override
    public EAsset setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.CODE</code>. 「code」- 资产编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.CODE</code>. 「code」- 资产编号
     */
    @Override
    public EAsset setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.TYPE</code>. 「type」- 资产类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.TYPE</code>. 「type」- 资产类型
     */
    @Override
    public EAsset setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.STATUS</code>. 「status」- 资产状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.STATUS</code>. 「status」- 资产状态
     */
    @Override
    public EAsset setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.MODEL_NUMBER</code>. 「modelNumber」-
     * 规格型号
     */
    @Override
    public String getModelNumber() {
        return this.modelNumber;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.MODEL_NUMBER</code>. 「modelNumber」-
     * 规格型号
     */
    @Override
    public EAsset setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.UNIT</code>. 「unit」- 计量单位
     */
    @Override
    public String getUnit() {
        return this.unit;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.UNIT</code>. 「unit」- 计量单位
     */
    @Override
    public EAsset setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.NUM</code>. 「num」- 资产数量
     */
    @Override
    public Long getNum() {
        return this.num;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.NUM</code>. 「num」- 资产数量
     */
    @Override
    public EAsset setNum(Long num) {
        this.num = num;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.NUM_DEPRECATING</code>.
     * 「numDeprecating」- 预计折旧数量
     */
    @Override
    public Long getNumDeprecating() {
        return this.numDeprecating;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.NUM_DEPRECATING</code>.
     * 「numDeprecating」- 预计折旧数量
     */
    @Override
    public EAsset setNumDeprecating(Long numDeprecating) {
        this.numDeprecating = numDeprecating;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.NUM_DEPRECATED</code>.
     * 「numDeprecated」- 已折旧数量
     */
    @Override
    public Long getNumDeprecated() {
        return this.numDeprecated;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.NUM_DEPRECATED</code>.
     * 「numDeprecated」- 已折旧数量
     */
    @Override
    public EAsset setNumDeprecated(Long numDeprecated) {
        this.numDeprecated = numDeprecated;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.NUM_USING</code>. 「numUsing」- 预计使用数量
     */
    @Override
    public Long getNumUsing() {
        return this.numUsing;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.NUM_USING</code>. 「numUsing」- 预计使用数量
     */
    @Override
    public EAsset setNumUsing(Long numUsing) {
        this.numUsing = numUsing;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.NUM_USED</code>. 「numUsed」- 已使用数量
     */
    @Override
    public Long getNumUsed() {
        return this.numUsed;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.NUM_USED</code>. 「numUsed」- 已使用数量
     */
    @Override
    public EAsset setNumUsed(Long numUsed) {
        this.numUsed = numUsed;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.WAY_CHANGE</code>. 「wayChange」- 变动方式
     */
    @Override
    public String getWayChange() {
        return this.wayChange;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.WAY_CHANGE</code>. 「wayChange」- 变动方式
     */
    @Override
    public EAsset setWayChange(String wayChange) {
        this.wayChange = wayChange;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.WAY_DEPRECATE</code>. 「wayDeprecate」-
     * 折旧方式
     */
    @Override
    public String getWayDeprecate() {
        return this.wayDeprecate;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.WAY_DEPRECATE</code>. 「wayDeprecate」-
     * 折旧方式
     */
    @Override
    public EAsset setWayDeprecate(String wayDeprecate) {
        this.wayDeprecate = wayDeprecate;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.WAY_ACCORDING</code>. 「wayAccording」-
     * 折旧依据
     */
    @Override
    public String getWayAccording() {
        return this.wayAccording;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.WAY_ACCORDING</code>. 「wayAccording」-
     * 折旧依据
     */
    @Override
    public EAsset setWayAccording(String wayAccording) {
        this.wayAccording = wayAccording;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.USED_AT</code>. 「usedAt」- 开始使用时间
     */
    @Override
    public LocalDateTime getUsedAt() {
        return this.usedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.USED_AT</code>. 「usedAt」- 开始使用时间
     */
    @Override
    public EAsset setUsedAt(LocalDateTime usedAt) {
        this.usedAt = usedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.USED_BY</code>. 「usedBy」- 使用者
     */
    @Override
    public String getUsedBy() {
        return this.usedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.USED_BY</code>. 「usedBy」- 使用者
     */
    @Override
    public EAsset setUsedBy(String usedBy) {
        this.usedBy = usedBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.USED_STATUS</code>. 「usedStatus」-
     * 使用状态
     */
    @Override
    public String getUsedStatus() {
        return this.usedStatus;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.USED_STATUS</code>. 「usedStatus」-
     * 使用状态
     */
    @Override
    public EAsset setUsedStatus(String usedStatus) {
        this.usedStatus = usedStatus;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.V_ORIGINAL</code>. 「vOriginal」- 原价值
     */
    @Override
    public BigDecimal getVOriginal() {
        return this.vOriginal;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.V_ORIGINAL</code>. 「vOriginal」- 原价值
     */
    @Override
    public EAsset setVOriginal(BigDecimal vOriginal) {
        this.vOriginal = vOriginal;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.V_TAX</code>. 「vTax」- 税额
     */
    @Override
    public BigDecimal getVTax() {
        return this.vTax;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.V_TAX</code>. 「vTax」- 税额
     */
    @Override
    public EAsset setVTax(BigDecimal vTax) {
        this.vTax = vTax;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.V_DE_READY</code>. 「vDeReady」- 减值准备
     */
    @Override
    public BigDecimal getVDeReady() {
        return this.vDeReady;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.V_DE_READY</code>. 「vDeReady」- 减值准备
     */
    @Override
    public EAsset setVDeReady(BigDecimal vDeReady) {
        this.vDeReady = vDeReady;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.V_NET_JUNK</code>. 「vNetJunk」- 净残值
     */
    @Override
    public BigDecimal getVNetJunk() {
        return this.vNetJunk;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.V_NET_JUNK</code>. 「vNetJunk」- 净残值
     */
    @Override
    public EAsset setVNetJunk(BigDecimal vNetJunk) {
        this.vNetJunk = vNetJunk;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.V_NET</code>. 「vNet」- 净值
     */
    @Override
    public BigDecimal getVNet() {
        return this.vNet;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.V_NET</code>. 「vNet」- 净值
     */
    @Override
    public EAsset setVNet(BigDecimal vNet) {
        this.vNet = vNet;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.V_NET_AMOUNT</code>. 「vNetAmount」- 净额
     */
    @Override
    public BigDecimal getVNetAmount() {
        return this.vNetAmount;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.V_NET_AMOUNT</code>. 「vNetAmount」- 净额
     */
    @Override
    public EAsset setVNetAmount(BigDecimal vNetAmount) {
        this.vNetAmount = vNetAmount;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.V_DEPRECATED_M</code>.
     * 「vDeprecatedM」- 月折旧
     */
    @Override
    public BigDecimal getVDeprecatedM() {
        return this.vDeprecatedM;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.V_DEPRECATED_M</code>.
     * 「vDeprecatedM」- 月折旧
     */
    @Override
    public EAsset setVDeprecatedM(BigDecimal vDeprecatedM) {
        this.vDeprecatedM = vDeprecatedM;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.V_DEPRECATED_A</code>.
     * 「vDeprecatedA」- 累积折旧
     */
    @Override
    public BigDecimal getVDeprecatedA() {
        return this.vDeprecatedA;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.V_DEPRECATED_A</code>.
     * 「vDeprecatedA」- 累积折旧
     */
    @Override
    public EAsset setVDeprecatedA(BigDecimal vDeprecatedA) {
        this.vDeprecatedA = vDeprecatedA;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.K_FIXED</code>. 「kFixed」- 固定资产科目
     */
    @Override
    public String getKFixed() {
        return this.kFixed;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.K_FIXED</code>. 「kFixed」- 固定资产科目
     */
    @Override
    public EAsset setKFixed(String kFixed) {
        this.kFixed = kFixed;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.K_DEPRECATED</code>. 「kDeprecated」-
     * 累积折旧科目
     */
    @Override
    public String getKDeprecated() {
        return this.kDeprecated;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.K_DEPRECATED</code>. 「kDeprecated」-
     * 累积折旧科目
     */
    @Override
    public EAsset setKDeprecated(String kDeprecated) {
        this.kDeprecated = kDeprecated;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.K_ASSIGNMENT</code>. 「kAssignment」-
     * 折旧费用分配科目
     */
    @Override
    public String getKAssignment() {
        return this.kAssignment;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.K_ASSIGNMENT</code>. 「kAssignment」-
     * 折旧费用分配科目
     */
    @Override
    public EAsset setKAssignment(String kAssignment) {
        this.kAssignment = kAssignment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.K_TAX</code>. 「kTax」- 税金科目
     */
    @Override
    public String getKTax() {
        return this.kTax;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.K_TAX</code>. 「kTax」- 税金科目
     */
    @Override
    public EAsset setKTax(String kTax) {
        this.kTax = kTax;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.K_DEVALUE</code>. 「kDevalue」- 减值准备科目
     */
    @Override
    public String getKDevalue() {
        return this.kDevalue;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.K_DEVALUE</code>. 「kDevalue」- 减值准备科目
     */
    @Override
    public EAsset setKDevalue(String kDevalue) {
        this.kDevalue = kDevalue;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.K_CHANGE</code>. 「kChange」- 资产变动对方科目
     */
    @Override
    public String getKChange() {
        return this.kChange;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.K_CHANGE</code>. 「kChange」- 资产变动对方科目
     */
    @Override
    public EAsset setKChange(String kChange) {
        this.kChange = kChange;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.CUSTOMER_ID</code>. 「customerId」-
     * 供应商ID
     */
    @Override
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.CUSTOMER_ID</code>. 「customerId」-
     * 供应商ID
     */
    @Override
    public EAsset setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.EXPIRED_AT</code>. 「expiredAt」- 到期时间
     */
    @Override
    public LocalDateTime getExpiredAt() {
        return this.expiredAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.EXPIRED_AT</code>. 「expiredAt」- 到期时间
     */
    @Override
    public EAsset setExpiredAt(LocalDateTime expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.EXPIRED_COMMENT</code>.
     * 「expiredComment」- 到期说明
     */
    @Override
    public String getExpiredComment() {
        return this.expiredComment;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.EXPIRED_COMMENT</code>.
     * 「expiredComment」- 到期说明
     */
    @Override
    public EAsset setExpiredComment(String expiredComment) {
        this.expiredComment = expiredComment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.USER_ID</code>. 「userId」- 资产管理者
     */
    @Override
    public String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.USER_ID</code>. 「userId」- 资产管理者
     */
    @Override
    public EAsset setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.STORE_ID</code>. 「storeId」- 所属仓库ID
     */
    @Override
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.STORE_ID</code>. 「storeId」- 所属仓库ID
     */
    @Override
    public EAsset setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.DEPT_ID</code>. 「deptId」- 所属部门
     */
    @Override
    public String getDeptId() {
        return this.deptId;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.DEPT_ID</code>. 「deptId」- 所属部门
     */
    @Override
    public EAsset setDeptId(String deptId) {
        this.deptId = deptId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    @Override
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    @Override
    public EAsset setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.PARENT_ID</code>. 「parentId」- 上级资产
     */
    @Override
    public String getParentId() {
        return this.parentId;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.PARENT_ID</code>. 「parentId」- 上级资产
     */
    @Override
    public EAsset setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.COMMENT</code>. 「comment」- 资产备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.COMMENT</code>. 「comment」- 资产备注
     */
    @Override
    public EAsset setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public EAsset setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EAsset setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EAsset setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public EAsset setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.ENTER_AT</code>. 「enterAt」- 入库时间
     */
    @Override
    public LocalDateTime getEnterAt() {
        return this.enterAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.ENTER_AT</code>. 「enterAt」- 入库时间
     */
    @Override
    public EAsset setEnterAt(LocalDateTime enterAt) {
        this.enterAt = enterAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.ENTER_BY</code>. 「enterBy」- 入库人
     */
    @Override
    public String getEnterBy() {
        return this.enterBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.ENTER_BY</code>. 「enterBy」- 入库人
     */
    @Override
    public EAsset setEnterBy(String enterBy) {
        this.enterBy = enterBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.ACCOUNT_AT</code>. 「accountAt」- 入账时间
     */
    @Override
    public LocalDateTime getAccountAt() {
        return this.accountAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.ACCOUNT_AT</code>. 「accountAt」- 入账时间
     */
    @Override
    public EAsset setAccountAt(LocalDateTime accountAt) {
        this.accountAt = accountAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.ACCOUNT_BY</code>. 「accountBy」- 入账人
     */
    @Override
    public String getAccountBy() {
        return this.accountBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.ACCOUNT_BY</code>. 「accountBy」- 入账人
     */
    @Override
    public EAsset setAccountBy(String accountBy) {
        this.accountBy = accountBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.SCRAP_AT</code>. 「scrapAt」- 报废时间
     */
    @Override
    public LocalDateTime getScrapAt() {
        return this.scrapAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.SCRAP_AT</code>. 「scrapAt」- 报废时间
     */
    @Override
    public EAsset setScrapAt(LocalDateTime scrapAt) {
        this.scrapAt = scrapAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.SCRAP_BY</code>. 「scrapBy」- 报废人
     */
    @Override
    public String getScrapBy() {
        return this.scrapBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.SCRAP_BY</code>. 「scrapBy」- 报废人
     */
    @Override
    public EAsset setScrapBy(String scrapBy) {
        this.scrapBy = scrapBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public EAsset setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public EAsset setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public EAsset setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_ASSET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.E_ASSET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public EAsset setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EAsset (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(modelNumber);
        sb.append(", ").append(unit);
        sb.append(", ").append(num);
        sb.append(", ").append(numDeprecating);
        sb.append(", ").append(numDeprecated);
        sb.append(", ").append(numUsing);
        sb.append(", ").append(numUsed);
        sb.append(", ").append(wayChange);
        sb.append(", ").append(wayDeprecate);
        sb.append(", ").append(wayAccording);
        sb.append(", ").append(usedAt);
        sb.append(", ").append(usedBy);
        sb.append(", ").append(usedStatus);
        sb.append(", ").append(vOriginal);
        sb.append(", ").append(vTax);
        sb.append(", ").append(vDeReady);
        sb.append(", ").append(vNetJunk);
        sb.append(", ").append(vNet);
        sb.append(", ").append(vNetAmount);
        sb.append(", ").append(vDeprecatedM);
        sb.append(", ").append(vDeprecatedA);
        sb.append(", ").append(kFixed);
        sb.append(", ").append(kDeprecated);
        sb.append(", ").append(kAssignment);
        sb.append(", ").append(kTax);
        sb.append(", ").append(kDevalue);
        sb.append(", ").append(kChange);
        sb.append(", ").append(customerId);
        sb.append(", ").append(expiredAt);
        sb.append(", ").append(expiredComment);
        sb.append(", ").append(userId);
        sb.append(", ").append(storeId);
        sb.append(", ").append(deptId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(parentId);
        sb.append(", ").append(comment);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
        sb.append(", ").append(enterAt);
        sb.append(", ").append(enterBy);
        sb.append(", ").append(accountAt);
        sb.append(", ").append(accountBy);
        sb.append(", ").append(scrapAt);
        sb.append(", ").append(scrapBy);
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
    public void from(IEAsset from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setModelNumber(from.getModelNumber());
        setUnit(from.getUnit());
        setNum(from.getNum());
        setNumDeprecating(from.getNumDeprecating());
        setNumDeprecated(from.getNumDeprecated());
        setNumUsing(from.getNumUsing());
        setNumUsed(from.getNumUsed());
        setWayChange(from.getWayChange());
        setWayDeprecate(from.getWayDeprecate());
        setWayAccording(from.getWayAccording());
        setUsedAt(from.getUsedAt());
        setUsedBy(from.getUsedBy());
        setUsedStatus(from.getUsedStatus());
        setVOriginal(from.getVOriginal());
        setVTax(from.getVTax());
        setVDeReady(from.getVDeReady());
        setVNetJunk(from.getVNetJunk());
        setVNet(from.getVNet());
        setVNetAmount(from.getVNetAmount());
        setVDeprecatedM(from.getVDeprecatedM());
        setVDeprecatedA(from.getVDeprecatedA());
        setKFixed(from.getKFixed());
        setKDeprecated(from.getKDeprecated());
        setKAssignment(from.getKAssignment());
        setKTax(from.getKTax());
        setKDevalue(from.getKDevalue());
        setKChange(from.getKChange());
        setCustomerId(from.getCustomerId());
        setExpiredAt(from.getExpiredAt());
        setExpiredComment(from.getExpiredComment());
        setUserId(from.getUserId());
        setStoreId(from.getStoreId());
        setDeptId(from.getDeptId());
        setCompanyId(from.getCompanyId());
        setParentId(from.getParentId());
        setComment(from.getComment());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setEnterAt(from.getEnterAt());
        setEnterBy(from.getEnterBy());
        setAccountAt(from.getAccountAt());
        setAccountBy(from.getAccountBy());
        setScrapAt(from.getScrapAt());
        setScrapBy(from.getScrapBy());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IEAsset> E into(E into) {
        into.from(this);
        return into;
    }
}