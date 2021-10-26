/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain;


import cn.vertxup.fm.domain.tables.FBill;
import cn.vertxup.fm.domain.tables.FBillItem;
import cn.vertxup.fm.domain.tables.FBook;
import cn.vertxup.fm.domain.tables.FInvoice;
import cn.vertxup.fm.domain.tables.FPayTerm;
import cn.vertxup.fm.domain.tables.FPreAuthorize;
import cn.vertxup.fm.domain.tables.FReceivable;
import cn.vertxup.fm.domain.tables.FSettlement;
import cn.vertxup.fm.domain.tables.FSettlementItem;
import cn.vertxup.fm.domain.tables.FSubject;
import cn.vertxup.fm.domain.tables.records.FBillItemRecord;
import cn.vertxup.fm.domain.tables.records.FBillRecord;
import cn.vertxup.fm.domain.tables.records.FBookRecord;
import cn.vertxup.fm.domain.tables.records.FInvoiceRecord;
import cn.vertxup.fm.domain.tables.records.FPayTermRecord;
import cn.vertxup.fm.domain.tables.records.FPreAuthorizeRecord;
import cn.vertxup.fm.domain.tables.records.FReceivableRecord;
import cn.vertxup.fm.domain.tables.records.FSettlementItemRecord;
import cn.vertxup.fm.domain.tables.records.FSettlementRecord;
import cn.vertxup.fm.domain.tables.records.FSubjectRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * DB_ETERNAL.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FBillRecord> KEY_F_BILL_CODE = Internal.createUniqueKey(FBill.F_BILL, DSL.name("KEY_F_BILL_CODE"), new TableField[] { FBill.F_BILL.CODE, FBill.F_BILL.ORDER_ID, FBill.F_BILL.SIGMA }, true);
    public static final UniqueKey<FBillRecord> KEY_F_BILL_PRIMARY = Internal.createUniqueKey(FBill.F_BILL, DSL.name("KEY_F_BILL_PRIMARY"), new TableField[] { FBill.F_BILL.KEY }, true);
    public static final UniqueKey<FBillRecord> KEY_F_BILL_SERIAL = Internal.createUniqueKey(FBill.F_BILL, DSL.name("KEY_F_BILL_SERIAL"), new TableField[] { FBill.F_BILL.SERIAL, FBill.F_BILL.ORDER_ID, FBill.F_BILL.SIGMA }, true);
    public static final UniqueKey<FBillItemRecord> KEY_F_BILL_ITEM_CODE = Internal.createUniqueKey(FBillItem.F_BILL_ITEM, DSL.name("KEY_F_BILL_ITEM_CODE"), new TableField[] { FBillItem.F_BILL_ITEM.CODE, FBillItem.F_BILL_ITEM.BILL_ID, FBillItem.F_BILL_ITEM.SIGMA }, true);
    public static final UniqueKey<FBillItemRecord> KEY_F_BILL_ITEM_PRIMARY = Internal.createUniqueKey(FBillItem.F_BILL_ITEM, DSL.name("KEY_F_BILL_ITEM_PRIMARY"), new TableField[] { FBillItem.F_BILL_ITEM.KEY }, true);
    public static final UniqueKey<FBillItemRecord> KEY_F_BILL_ITEM_SERIAL = Internal.createUniqueKey(FBillItem.F_BILL_ITEM, DSL.name("KEY_F_BILL_ITEM_SERIAL"), new TableField[] { FBillItem.F_BILL_ITEM.SERIAL, FBillItem.F_BILL_ITEM.BILL_ID, FBillItem.F_BILL_ITEM.SIGMA }, true);
    public static final UniqueKey<FBookRecord> KEY_F_BOOK_CODE = Internal.createUniqueKey(FBook.F_BOOK, DSL.name("KEY_F_BOOK_CODE"), new TableField[] { FBook.F_BOOK.CODE, FBook.F_BOOK.ORDER_ID, FBook.F_BOOK.SIGMA }, true);
    public static final UniqueKey<FBookRecord> KEY_F_BOOK_PRIMARY = Internal.createUniqueKey(FBook.F_BOOK, DSL.name("KEY_F_BOOK_PRIMARY"), new TableField[] { FBook.F_BOOK.KEY }, true);
    public static final UniqueKey<FBookRecord> KEY_F_BOOK_SERIAL = Internal.createUniqueKey(FBook.F_BOOK, DSL.name("KEY_F_BOOK_SERIAL"), new TableField[] { FBook.F_BOOK.SERIAL, FBook.F_BOOK.ORDER_ID, FBook.F_BOOK.SIGMA }, true);
    public static final UniqueKey<FInvoiceRecord> KEY_F_INVOICE_CODE = Internal.createUniqueKey(FInvoice.F_INVOICE, DSL.name("KEY_F_INVOICE_CODE"), new TableField[] { FInvoice.F_INVOICE.CODE, FInvoice.F_INVOICE.SIGMA }, true);
    public static final UniqueKey<FInvoiceRecord> KEY_F_INVOICE_INVOICE_NUMBER = Internal.createUniqueKey(FInvoice.F_INVOICE, DSL.name("KEY_F_INVOICE_INVOICE_NUMBER"), new TableField[] { FInvoice.F_INVOICE.INVOICE_NUMBER, FInvoice.F_INVOICE.SIGMA }, true);
    public static final UniqueKey<FInvoiceRecord> KEY_F_INVOICE_INVOICE_SERIAL = Internal.createUniqueKey(FInvoice.F_INVOICE, DSL.name("KEY_F_INVOICE_INVOICE_SERIAL"), new TableField[] { FInvoice.F_INVOICE.INVOICE_SERIAL, FInvoice.F_INVOICE.SIGMA }, true);
    public static final UniqueKey<FInvoiceRecord> KEY_F_INVOICE_PRIMARY = Internal.createUniqueKey(FInvoice.F_INVOICE, DSL.name("KEY_F_INVOICE_PRIMARY"), new TableField[] { FInvoice.F_INVOICE.KEY }, true);
    public static final UniqueKey<FPayTermRecord> KEY_F_PAY_TERM_CODE = Internal.createUniqueKey(FPayTerm.F_PAY_TERM, DSL.name("KEY_F_PAY_TERM_CODE"), new TableField[] { FPayTerm.F_PAY_TERM.CODE, FPayTerm.F_PAY_TERM.SIGMA }, true);
    public static final UniqueKey<FPayTermRecord> KEY_F_PAY_TERM_NAME = Internal.createUniqueKey(FPayTerm.F_PAY_TERM, DSL.name("KEY_F_PAY_TERM_NAME"), new TableField[] { FPayTerm.F_PAY_TERM.NAME, FPayTerm.F_PAY_TERM.SIGMA }, true);
    public static final UniqueKey<FPayTermRecord> KEY_F_PAY_TERM_PRIMARY = Internal.createUniqueKey(FPayTerm.F_PAY_TERM, DSL.name("KEY_F_PAY_TERM_PRIMARY"), new TableField[] { FPayTerm.F_PAY_TERM.KEY }, true);
    public static final UniqueKey<FPreAuthorizeRecord> KEY_F_PRE_AUTHORIZE_CODE = Internal.createUniqueKey(FPreAuthorize.F_PRE_AUTHORIZE, DSL.name("KEY_F_PRE_AUTHORIZE_CODE"), new TableField[] { FPreAuthorize.F_PRE_AUTHORIZE.CODE, FPreAuthorize.F_PRE_AUTHORIZE.BILL_ID, FPreAuthorize.F_PRE_AUTHORIZE.SIGMA }, true);
    public static final UniqueKey<FPreAuthorizeRecord> KEY_F_PRE_AUTHORIZE_PRIMARY = Internal.createUniqueKey(FPreAuthorize.F_PRE_AUTHORIZE, DSL.name("KEY_F_PRE_AUTHORIZE_PRIMARY"), new TableField[] { FPreAuthorize.F_PRE_AUTHORIZE.KEY }, true);
    public static final UniqueKey<FPreAuthorizeRecord> KEY_F_PRE_AUTHORIZE_SERIAL = Internal.createUniqueKey(FPreAuthorize.F_PRE_AUTHORIZE, DSL.name("KEY_F_PRE_AUTHORIZE_SERIAL"), new TableField[] { FPreAuthorize.F_PRE_AUTHORIZE.SERIAL, FPreAuthorize.F_PRE_AUTHORIZE.BILL_ID, FPreAuthorize.F_PRE_AUTHORIZE.SIGMA }, true);
    public static final UniqueKey<FReceivableRecord> KEY_F_RECEIVABLE_CODE = Internal.createUniqueKey(FReceivable.F_RECEIVABLE, DSL.name("KEY_F_RECEIVABLE_CODE"), new TableField[] { FReceivable.F_RECEIVABLE.CODE, FReceivable.F_RECEIVABLE.SIGMA }, true);
    public static final UniqueKey<FReceivableRecord> KEY_F_RECEIVABLE_PRIMARY = Internal.createUniqueKey(FReceivable.F_RECEIVABLE, DSL.name("KEY_F_RECEIVABLE_PRIMARY"), new TableField[] { FReceivable.F_RECEIVABLE.KEY }, true);
    public static final UniqueKey<FReceivableRecord> KEY_F_RECEIVABLE_SERIAL = Internal.createUniqueKey(FReceivable.F_RECEIVABLE, DSL.name("KEY_F_RECEIVABLE_SERIAL"), new TableField[] { FReceivable.F_RECEIVABLE.SERIAL, FReceivable.F_RECEIVABLE.SIGMA }, true);
    public static final UniqueKey<FSettlementRecord> KEY_F_SETTLEMENT_CODE = Internal.createUniqueKey(FSettlement.F_SETTLEMENT, DSL.name("KEY_F_SETTLEMENT_CODE"), new TableField[] { FSettlement.F_SETTLEMENT.CODE, FSettlement.F_SETTLEMENT.ORDER_ID, FSettlement.F_SETTLEMENT.SIGMA }, true);
    public static final UniqueKey<FSettlementRecord> KEY_F_SETTLEMENT_PRIMARY = Internal.createUniqueKey(FSettlement.F_SETTLEMENT, DSL.name("KEY_F_SETTLEMENT_PRIMARY"), new TableField[] { FSettlement.F_SETTLEMENT.KEY }, true);
    public static final UniqueKey<FSettlementRecord> KEY_F_SETTLEMENT_SERIAL = Internal.createUniqueKey(FSettlement.F_SETTLEMENT, DSL.name("KEY_F_SETTLEMENT_SERIAL"), new TableField[] { FSettlement.F_SETTLEMENT.SERIAL, FSettlement.F_SETTLEMENT.ORDER_ID, FSettlement.F_SETTLEMENT.SIGMA }, true);
    public static final UniqueKey<FSettlementItemRecord> KEY_F_SETTLEMENT_ITEM_CODE = Internal.createUniqueKey(FSettlementItem.F_SETTLEMENT_ITEM, DSL.name("KEY_F_SETTLEMENT_ITEM_CODE"), new TableField[] { FSettlementItem.F_SETTLEMENT_ITEM.CODE, FSettlementItem.F_SETTLEMENT_ITEM.SETTLEMENT_ID, FSettlementItem.F_SETTLEMENT_ITEM.SIGMA }, true);
    public static final UniqueKey<FSettlementItemRecord> KEY_F_SETTLEMENT_ITEM_PRIMARY = Internal.createUniqueKey(FSettlementItem.F_SETTLEMENT_ITEM, DSL.name("KEY_F_SETTLEMENT_ITEM_PRIMARY"), new TableField[] { FSettlementItem.F_SETTLEMENT_ITEM.KEY }, true);
    public static final UniqueKey<FSettlementItemRecord> KEY_F_SETTLEMENT_ITEM_SERIAL = Internal.createUniqueKey(FSettlementItem.F_SETTLEMENT_ITEM, DSL.name("KEY_F_SETTLEMENT_ITEM_SERIAL"), new TableField[] { FSettlementItem.F_SETTLEMENT_ITEM.SERIAL, FSettlementItem.F_SETTLEMENT_ITEM.SETTLEMENT_ID, FSettlementItem.F_SETTLEMENT_ITEM.SIGMA }, true);
    public static final UniqueKey<FSubjectRecord> KEY_F_SUBJECT_CODE = Internal.createUniqueKey(FSubject.F_SUBJECT, DSL.name("KEY_F_SUBJECT_CODE"), new TableField[] { FSubject.F_SUBJECT.CODE, FSubject.F_SUBJECT.SIGMA }, true);
    public static final UniqueKey<FSubjectRecord> KEY_F_SUBJECT_PRIMARY = Internal.createUniqueKey(FSubject.F_SUBJECT, DSL.name("KEY_F_SUBJECT_PRIMARY"), new TableField[] { FSubject.F_SUBJECT.KEY }, true);
}
