/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain;


import cn.vertxup.ambient.domain.tables.XActivity;
import cn.vertxup.ambient.domain.tables.XActivityChange;
import cn.vertxup.ambient.domain.tables.XApp;
import cn.vertxup.ambient.domain.tables.XCategory;
import cn.vertxup.ambient.domain.tables.XLinkage;
import cn.vertxup.ambient.domain.tables.XLog;
import cn.vertxup.ambient.domain.tables.XMenu;
import cn.vertxup.ambient.domain.tables.XTabular;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in DB_ETERNAL.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index X_ACTIVITY_CHANGE_IDX_X_ACTIVITY_CHANGE_ACTIVITY_ID = Internal.createIndex(DSL.name("IDX_X_ACTIVITY_CHANGE_ACTIVITY_ID"), XActivityChange.X_ACTIVITY_CHANGE, new OrderField[] { XActivityChange.X_ACTIVITY_CHANGE.ACTIVITY_ID }, false);
    public static final Index X_ACTIVITY_CHANGE_IDX_X_ACTIVITY_CHANGE_CREATED_AT = Internal.createIndex(DSL.name("IDX_X_ACTIVITY_CHANGE_CREATED_AT"), XActivityChange.X_ACTIVITY_CHANGE, new OrderField[] { XActivityChange.X_ACTIVITY_CHANGE.CREATED_AT }, false);
    public static final Index X_ACTIVITY_IDX_X_ACTIVITY_CREATED_AT = Internal.createIndex(DSL.name("IDX_X_ACTIVITY_CREATED_AT"), XActivity.X_ACTIVITY, new OrderField[] { XActivity.X_ACTIVITY.CREATED_AT }, false);
    public static final Index X_APP_IDX_X_APP_NAME = Internal.createIndex(DSL.name("IDX_X_APP_NAME"), XApp.X_APP, new OrderField[] { XApp.X_APP.NAME }, false);
    public static final Index X_LINKAGE_IDX_X_LINKAGE_R_SOURCE_KEY = Internal.createIndex(DSL.name("IDX_X_LINKAGE_R_SOURCE_KEY"), XLinkage.X_LINKAGE, new OrderField[] { XLinkage.X_LINKAGE.SOURCE_KEY }, false);
    public static final Index X_LINKAGE_IDX_X_LINKAGE_R_SOURCE_TYPE = Internal.createIndex(DSL.name("IDX_X_LINKAGE_R_SOURCE_TYPE"), XLinkage.X_LINKAGE, new OrderField[] { XLinkage.X_LINKAGE.SOURCE_TYPE }, false);
    public static final Index X_LINKAGE_IDX_X_LINKAGE_R_TARGET_KEY = Internal.createIndex(DSL.name("IDX_X_LINKAGE_R_TARGET_KEY"), XLinkage.X_LINKAGE, new OrderField[] { XLinkage.X_LINKAGE.TARGET_KEY }, false);
    public static final Index X_LINKAGE_IDX_X_LINKAGE_R_TARGET_TYPE = Internal.createIndex(DSL.name("IDX_X_LINKAGE_R_TARGET_TYPE"), XLinkage.X_LINKAGE, new OrderField[] { XLinkage.X_LINKAGE.TARGET_TYPE }, false);
    public static final Index X_LINKAGE_IDX_X_LINKAGE_REGION = Internal.createIndex(DSL.name("IDX_X_LINKAGE_REGION"), XLinkage.X_LINKAGE, new OrderField[] { XLinkage.X_LINKAGE.REGION }, false);
    public static final Index X_LINKAGE_IDX_X_LINKAGE_SIGMA = Internal.createIndex(DSL.name("IDX_X_LINKAGE_SIGMA"), XLinkage.X_LINKAGE, new OrderField[] { XLinkage.X_LINKAGE.SIGMA, XLinkage.X_LINKAGE.TYPE }, false);
    public static final Index X_MENU_IDX_X_MENU_APP_ID = Internal.createIndex(DSL.name("IDX_X_MENU_APP_ID"), XMenu.X_MENU, new OrderField[] { XMenu.X_MENU.APP_ID }, false);
    public static final Index X_ACTIVITY_IDXM_X_ACTIVITY_MODEL_ID_MODEL_KEY = Internal.createIndex(DSL.name("IDXM_X_ACTIVITY_MODEL_ID_MODEL_KEY"), XActivity.X_ACTIVITY, new OrderField[] { XActivity.X_ACTIVITY.MODEL_ID, XActivity.X_ACTIVITY.MODEL_KEY, XActivity.X_ACTIVITY.ACTIVE }, false);
    public static final Index X_ACTIVITY_IDXM_X_ACTIVITY_SIGMA_ACTIVE = Internal.createIndex(DSL.name("IDXM_X_ACTIVITY_SIGMA_ACTIVE"), XActivity.X_ACTIVITY, new OrderField[] { XActivity.X_ACTIVITY.SIGMA, XActivity.X_ACTIVITY.ACTIVE }, false);
    public static final Index X_CATEGORY_IDXM_X_CATEGORY_APP_ID_TYPE_ACTIVE = Internal.createIndex(DSL.name("IDXM_X_CATEGORY_APP_ID_TYPE_ACTIVE"), XCategory.X_CATEGORY, new OrderField[] { XCategory.X_CATEGORY.APP_ID, XCategory.X_CATEGORY.TYPE, XCategory.X_CATEGORY.ACTIVE }, false);
    public static final Index X_CATEGORY_IDXM_X_CATEGORY_SIGMA_TYPE_ACTIVE = Internal.createIndex(DSL.name("IDXM_X_CATEGORY_SIGMA_TYPE_ACTIVE"), XCategory.X_CATEGORY, new OrderField[] { XCategory.X_CATEGORY.SIGMA, XCategory.X_CATEGORY.TYPE, XCategory.X_CATEGORY.ACTIVE }, false);
    public static final Index X_LOG_IDXM_X_LOG_SIGMA_TYPE = Internal.createIndex(DSL.name("IDXM_X_LOG_SIGMA_TYPE"), XLog.X_LOG, new OrderField[] { XLog.X_LOG.SIGMA, XLog.X_LOG.TYPE }, false);
    public static final Index X_TABULAR_IDXM_X_TABULAR_APP_ID_TYPE_ACTIVE = Internal.createIndex(DSL.name("IDXM_X_TABULAR_APP_ID_TYPE_ACTIVE"), XTabular.X_TABULAR, new OrderField[] { XTabular.X_TABULAR.APP_ID, XTabular.X_TABULAR.TYPE, XTabular.X_TABULAR.ACTIVE }, false);
    public static final Index X_TABULAR_IDXM_X_TABULAR_SIGMA_TYPE_ACTIVE = Internal.createIndex(DSL.name("IDXM_X_TABULAR_SIGMA_TYPE_ACTIVE"), XTabular.X_TABULAR, new OrderField[] { XTabular.X_TABULAR.SIGMA, XTabular.X_TABULAR.TYPE, XTabular.X_TABULAR.ACTIVE }, false);
}
