/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.daos;


import cn.vertxup.psi.domain.tables.PBuyOrder;
import cn.vertxup.psi.domain.tables.records.PBuyOrderRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PBuyOrderDao extends AbstractVertxDAO<PBuyOrderRecord, cn.vertxup.psi.domain.tables.pojos.PBuyOrder, String, Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>>, Future<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<PBuyOrderRecord,cn.vertxup.psi.domain.tables.pojos.PBuyOrder,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public PBuyOrderDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(PBuyOrder.P_BUY_ORDER, cn.vertxup.psi.domain.tables.pojos.PBuyOrder.class, new JDBCClassicQueryExecutor<PBuyOrderRecord,cn.vertxup.psi.domain.tables.pojos.PBuyOrder,String>(configuration,cn.vertxup.psi.domain.tables.pojos.PBuyOrder.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.psi.domain.tables.pojos.PBuyOrder object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyBySerial(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.SERIAL.in(values));
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyBySerial(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.SERIAL.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByType(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByStatus(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.STATUS.in(values));
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByStatus(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>WH_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByWhId(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.WH_ID.in(values));
        }

        /**
     * Find records that have <code>WH_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByWhId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.WH_ID.in(values),limit);
        }

        /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByCustomerId(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.CUSTOMER_ID.in(values));
        }

        /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByCustomerId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.CUSTOMER_ID.in(values),limit);
        }

        /**
     * Find records that have <code>PAYED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByPayedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.PAYED_AT.in(values));
        }

        /**
     * Find records that have <code>PAYED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByPayedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.PAYED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>PAYED_DAY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByPayedDay(Collection<Integer> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.PAYED_DAY.in(values));
        }

        /**
     * Find records that have <code>PAYED_DAY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByPayedDay(Collection<Integer> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.PAYED_DAY.in(values),limit);
        }

        /**
     * Find records that have <code>OP_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByOpAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.OP_AT.in(values));
        }

        /**
     * Find records that have <code>OP_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByOpAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.OP_AT.in(values),limit);
        }

        /**
     * Find records that have <code>OP_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByOpBy(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.OP_BY.in(values));
        }

        /**
     * Find records that have <code>OP_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByOpBy(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.OP_BY.in(values),limit);
        }

        /**
     * Find records that have <code>OP_DEPT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByOpDept(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.OP_DEPT.in(values));
        }

        /**
     * Find records that have <code>OP_DEPT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByOpDept(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.OP_DEPT.in(values),limit);
        }

        /**
     * Find records that have <code>TAGS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByTags(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.TAGS.in(values));
        }

        /**
     * Find records that have <code>TAGS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByTags(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.TAGS.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByComment(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.COMMENT.in(values));
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByComment(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.COMMENT.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS_SEND IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByStatusSend(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.STATUS_SEND.in(values));
        }

        /**
     * Find records that have <code>STATUS_SEND IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByStatusSend(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.STATUS_SEND.in(values),limit);
        }

        /**
     * Find records that have <code>REASON IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByReason(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.REASON.in(values));
        }

        /**
     * Find records that have <code>REASON IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByReason(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.REASON.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByAmount(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.AMOUNT.in(values));
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByAmount(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.AMOUNT.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT_WAIT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByAmountWait(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.AMOUNT_WAIT.in(values));
        }

        /**
     * Find records that have <code>AMOUNT_WAIT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByAmountWait(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.AMOUNT_WAIT.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT_DEBT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByAmountDebt(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.AMOUNT_DEBT.in(values));
        }

        /**
     * Find records that have <code>AMOUNT_DEBT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByAmountDebt(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.AMOUNT_DEBT.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT_PLAN IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByAmountPlan(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.AMOUNT_PLAN.in(values));
        }

        /**
     * Find records that have <code>AMOUNT_PLAN IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByAmountPlan(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.AMOUNT_PLAN.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT_YES IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByAmountYes(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.AMOUNT_YES.in(values));
        }

        /**
     * Find records that have <code>AMOUNT_YES IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByAmountYes(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.AMOUNT_YES.in(values),limit);
        }

        /**
     * Find records that have <code>DISCOUNT_AMOUNT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByDiscountAmount(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.DISCOUNT_AMOUNT.in(values));
        }

        /**
     * Find records that have <code>DISCOUNT_AMOUNT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByDiscountAmount(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.DISCOUNT_AMOUNT.in(values),limit);
        }

        /**
     * Find records that have <code>DISCOUNT_RATE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByDiscountRate(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.DISCOUNT_RATE.in(values));
        }

        /**
     * Find records that have <code>DISCOUNT_RATE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByDiscountRate(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.DISCOUNT_RATE.in(values),limit);
        }

        /**
     * Find records that have <code>DISCOUNT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByDiscount(Collection<Boolean> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.DISCOUNT.in(values));
        }

        /**
     * Find records that have <code>DISCOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByDiscount(Collection<Boolean> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.DISCOUNT.in(values),limit);
        }

        /**
     * Find records that have <code>APPROVED_BY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByApprovedBy(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.APPROVED_BY.in(values));
        }

        /**
     * Find records that have <code>APPROVED_BY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByApprovedBy(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.APPROVED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>APPROVED_AT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByApprovedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.APPROVED_AT.in(values));
        }

        /**
     * Find records that have <code>APPROVED_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByApprovedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.APPROVED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>TO_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByToId(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.TO_ID.in(values));
        }

        /**
     * Find records that have <code>TO_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByToId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.TO_ID.in(values),limit);
        }

        /**
     * Find records that have <code>TO_ADDRESS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByToAddress(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.TO_ADDRESS.in(values));
        }

        /**
     * Find records that have <code>TO_ADDRESS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByToAddress(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.TO_ADDRESS.in(values),limit);
        }

        /**
     * Find records that have <code>FROM_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByFromId(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.FROM_ID.in(values));
        }

        /**
     * Find records that have <code>FROM_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByFromId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.FROM_ID.in(values),limit);
        }

        /**
     * Find records that have <code>FROM_ADDRESS IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByFromAddress(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.FROM_ADDRESS.in(values));
        }

        /**
     * Find records that have <code>FROM_ADDRESS IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByFromAddress(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.FROM_ADDRESS.in(values),limit);
        }

        /**
     * Find records that have <code>CURRENCY_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByCurrencyId(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.CURRENCY_ID.in(values));
        }

        /**
     * Find records that have <code>CURRENCY_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByCurrencyId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.CURRENCY_ID.in(values),limit);
        }

        /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByCompanyId(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.COMPANY_ID.in(values));
        }

        /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByCompanyId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.COMPANY_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyOrder>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(PBuyOrder.P_BUY_ORDER.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<PBuyOrderRecord,cn.vertxup.psi.domain.tables.pojos.PBuyOrder,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<PBuyOrderRecord,cn.vertxup.psi.domain.tables.pojos.PBuyOrder,String>) super.queryExecutor();
        }
}