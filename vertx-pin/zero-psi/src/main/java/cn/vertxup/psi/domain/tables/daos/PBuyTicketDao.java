/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.daos;


import cn.vertxup.psi.domain.tables.PBuyTicket;
import cn.vertxup.psi.domain.tables.records.PBuyTicketRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

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
public class PBuyTicketDao extends AbstractVertxDAO<PBuyTicketRecord, cn.vertxup.psi.domain.tables.pojos.PBuyTicket, String, Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>>, Future<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<PBuyTicketRecord,cn.vertxup.psi.domain.tables.pojos.PBuyTicket,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public PBuyTicketDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(PBuyTicket.P_BUY_TICKET, cn.vertxup.psi.domain.tables.pojos.PBuyTicket.class, new JDBCClassicQueryExecutor<PBuyTicketRecord,cn.vertxup.psi.domain.tables.pojos.PBuyTicket,String>(configuration,cn.vertxup.psi.domain.tables.pojos.PBuyTicket.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.psi.domain.tables.pojos.PBuyTicket object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyBySerial(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.SERIAL.in(values));
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyBySerial(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.SERIAL.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByType(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByStatus(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.STATUS.in(values));
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByStatus(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>OP_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByOpAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.OP_AT.in(values));
        }

        /**
     * Find records that have <code>OP_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByOpAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.OP_AT.in(values),limit);
        }

        /**
     * Find records that have <code>OP_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByOpBy(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.OP_BY.in(values));
        }

        /**
     * Find records that have <code>OP_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByOpBy(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.OP_BY.in(values),limit);
        }

        /**
     * Find records that have <code>OP_DEPT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByOpDept(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.OP_DEPT.in(values));
        }

        /**
     * Find records that have <code>OP_DEPT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByOpDept(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.OP_DEPT.in(values),limit);
        }

        /**
     * Find records that have <code>SOURCE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyBySource(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.SOURCE.in(values));
        }

        /**
     * Find records that have <code>SOURCE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyBySource(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.SOURCE.in(values),limit);
        }

        /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByCustomerId(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.CUSTOMER_ID.in(values));
        }

        /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByCustomerId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.CUSTOMER_ID.in(values),limit);
        }

        /**
     * Find records that have <code>CURRENCY_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByCurrencyId(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.CURRENCY_ID.in(values));
        }

        /**
     * Find records that have <code>CURRENCY_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByCurrencyId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.CURRENCY_ID.in(values),limit);
        }

        /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByCompanyId(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.COMPANY_ID.in(values));
        }

        /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByCompanyId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.COMPANY_ID.in(values),limit);
        }

        /**
     * Find records that have <code>APPROVED_BY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByApprovedBy(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.APPROVED_BY.in(values));
        }

        /**
     * Find records that have <code>APPROVED_BY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByApprovedBy(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.APPROVED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>APPROVED_AT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByApprovedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.APPROVED_AT.in(values));
        }

        /**
     * Find records that have <code>APPROVED_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByApprovedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.APPROVED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>TO_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByToId(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.TO_ID.in(values));
        }

        /**
     * Find records that have <code>TO_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByToId(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.TO_ID.in(values),limit);
        }

        /**
     * Find records that have <code>TO_ADDRESS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByToAddress(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.TO_ADDRESS.in(values));
        }

        /**
     * Find records that have <code>TO_ADDRESS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByToAddress(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.TO_ADDRESS.in(values),limit);
        }

        /**
     * Find records that have <code>TAGS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByTags(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.TAGS.in(values));
        }

        /**
     * Find records that have <code>TAGS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByTags(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.TAGS.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByComment(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.COMMENT.in(values));
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByComment(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.COMMENT.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PBuyTicket>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(PBuyTicket.P_BUY_TICKET.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<PBuyTicketRecord,cn.vertxup.psi.domain.tables.pojos.PBuyTicket,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<PBuyTicketRecord,cn.vertxup.psi.domain.tables.pojos.PBuyTicket,String>) super.queryExecutor();
        }
}
