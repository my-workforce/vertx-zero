/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.daos;


import cn.vertxup.psi.domain.tables.PBuyItem;
import cn.vertxup.psi.domain.tables.records.PBuyItemRecord;

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
public class PBuyItemDao extends AbstractVertxDAO<PBuyItemRecord, cn.vertxup.psi.domain.tables.pojos.PBuyItem, String, Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>>, Future<cn.vertxup.psi.domain.tables.pojos.PBuyItem>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<PBuyItemRecord,cn.vertxup.psi.domain.tables.pojos.PBuyItem,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public PBuyItemDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(PBuyItem.P_BUY_ITEM, cn.vertxup.psi.domain.tables.pojos.PBuyItem.class, new JDBCClassicQueryExecutor<PBuyItemRecord,cn.vertxup.psi.domain.tables.pojos.PBuyItem,String>(configuration,cn.vertxup.psi.domain.tables.pojos.PBuyItem.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.psi.domain.tables.pojos.PBuyItem object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyBySerial(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.SERIAL.in(values));
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyBySerial(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.SERIAL.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByStatus(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.STATUS.in(values));
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByStatus(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>COMMODITY_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByCommodityId(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.COMMODITY_ID.in(values));
        }

        /**
     * Find records that have <code>COMMODITY_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByCommodityId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.COMMODITY_ID.in(values),limit);
        }

        /**
     * Find records that have <code>COMMODITY_CODE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByCommodityCode(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.COMMODITY_CODE.in(values));
        }

        /**
     * Find records that have <code>COMMODITY_CODE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByCommodityCode(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.COMMODITY_CODE.in(values),limit);
        }

        /**
     * Find records that have <code>COMMODITY_NAME IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByCommodityName(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.COMMODITY_NAME.in(values));
        }

        /**
     * Find records that have <code>COMMODITY_NAME IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByCommodityName(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.COMMODITY_NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByCustomerId(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.CUSTOMER_ID.in(values));
        }

        /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByCustomerId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.CUSTOMER_ID.in(values),limit);
        }

        /**
     * Find records that have <code>TICKET_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByTicketId(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.TICKET_ID.in(values));
        }

        /**
     * Find records that have <code>TICKET_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByTicketId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.TICKET_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ORDER_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByOrderId(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.ORDER_ID.in(values));
        }

        /**
     * Find records that have <code>ORDER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByOrderId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.ORDER_ID.in(values),limit);
        }

        /**
     * Find records that have <code>NUM_REQUEST IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByNumRequest(Collection<Integer> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.NUM_REQUEST.in(values));
        }

        /**
     * Find records that have <code>NUM_REQUEST IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByNumRequest(Collection<Integer> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.NUM_REQUEST.in(values),limit);
        }

        /**
     * Find records that have <code>NUM_APPROVED IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByNumApproved(Collection<Integer> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.NUM_APPROVED.in(values));
        }

        /**
     * Find records that have <code>NUM_APPROVED IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByNumApproved(Collection<Integer> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.NUM_APPROVED.in(values),limit);
        }

        /**
     * Find records that have <code>NUM IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByNum(Collection<Integer> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.NUM.in(values));
        }

        /**
     * Find records that have <code>NUM IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByNum(Collection<Integer> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.NUM.in(values),limit);
        }

        /**
     * Find records that have <code>TAX_RATE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByTaxRate(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.TAX_RATE.in(values));
        }

        /**
     * Find records that have <code>TAX_RATE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByTaxRate(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.TAX_RATE.in(values),limit);
        }

        /**
     * Find records that have <code>TAX_AMOUNT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByTaxAmount(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.TAX_AMOUNT.in(values));
        }

        /**
     * Find records that have <code>TAX_AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByTaxAmount(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.TAX_AMOUNT.in(values),limit);
        }

        /**
     * Find records that have <code>TAX_PRICE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByTaxPrice(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.TAX_PRICE.in(values));
        }

        /**
     * Find records that have <code>TAX_PRICE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByTaxPrice(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.TAX_PRICE.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT_TOTAL IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByAmountTotal(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.AMOUNT_TOTAL.in(values));
        }

        /**
     * Find records that have <code>AMOUNT_TOTAL IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByAmountTotal(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.AMOUNT_TOTAL.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT_SPLIT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByAmountSplit(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.AMOUNT_SPLIT.in(values));
        }

        /**
     * Find records that have <code>AMOUNT_SPLIT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByAmountSplit(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.AMOUNT_SPLIT.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByAmount(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.AMOUNT.in(values));
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByAmount(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.AMOUNT.in(values),limit);
        }

        /**
     * Find records that have <code>PRICE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByPrice(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.PRICE.in(values));
        }

        /**
     * Find records that have <code>PRICE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByPrice(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.PRICE.in(values),limit);
        }

        /**
     * Find records that have <code>DISCOUNT_AMOUNT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByDiscountAmount(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.DISCOUNT_AMOUNT.in(values));
        }

        /**
     * Find records that have <code>DISCOUNT_AMOUNT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByDiscountAmount(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.DISCOUNT_AMOUNT.in(values),limit);
        }

        /**
     * Find records that have <code>DISCOUNT_RATE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByDiscountRate(Collection<BigDecimal> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.DISCOUNT_RATE.in(values));
        }

        /**
     * Find records that have <code>DISCOUNT_RATE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByDiscountRate(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.DISCOUNT_RATE.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByComment(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.COMMENT.in(values));
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByComment(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.COMMENT.in(values),limit);
        }

        /**
     * Find records that have <code>ARRIVE_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByArriveAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.ARRIVE_AT.in(values));
        }

        /**
     * Find records that have <code>ARRIVE_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByArriveAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.ARRIVE_AT.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyItem>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(PBuyItem.P_BUY_ITEM.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<PBuyItemRecord,cn.vertxup.psi.domain.tables.pojos.PBuyItem,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<PBuyItemRecord,cn.vertxup.psi.domain.tables.pojos.PBuyItem,String>) super.queryExecutor();
        }
}