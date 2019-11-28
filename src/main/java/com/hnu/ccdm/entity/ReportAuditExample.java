package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportAuditExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andReportAuditReportnoIsNull() {
            addCriterion("report_audit_ReportNO is null");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoIsNotNull() {
            addCriterion("report_audit_ReportNO is not null");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoEqualTo(String value) {
            addCriterion("report_audit_ReportNO =", value, "reportAuditReportno");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoNotEqualTo(String value) {
            addCriterion("report_audit_ReportNO <>", value, "reportAuditReportno");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoGreaterThan(String value) {
            addCriterion("report_audit_ReportNO >", value, "reportAuditReportno");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoGreaterThanOrEqualTo(String value) {
            addCriterion("report_audit_ReportNO >=", value, "reportAuditReportno");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoLessThan(String value) {
            addCriterion("report_audit_ReportNO <", value, "reportAuditReportno");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoLessThanOrEqualTo(String value) {
            addCriterion("report_audit_ReportNO <=", value, "reportAuditReportno");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoLike(String value) {
            addCriterion("report_audit_ReportNO like", value, "reportAuditReportno");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoNotLike(String value) {
            addCriterion("report_audit_ReportNO not like", value, "reportAuditReportno");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoIn(List<String> values) {
            addCriterion("report_audit_ReportNO in", values, "reportAuditReportno");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoNotIn(List<String> values) {
            addCriterion("report_audit_ReportNO not in", values, "reportAuditReportno");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoBetween(String value1, String value2) {
            addCriterion("report_audit_ReportNO between", value1, value2, "reportAuditReportno");
            return (Criteria) this;
        }

        public Criteria andReportAuditReportnoNotBetween(String value1, String value2) {
            addCriterion("report_audit_ReportNO not between", value1, value2, "reportAuditReportno");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridIsNull() {
            addCriterion("report_audit_InformerID is null");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridIsNotNull() {
            addCriterion("report_audit_InformerID is not null");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridEqualTo(String value) {
            addCriterion("report_audit_InformerID =", value, "reportAuditInformerid");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridNotEqualTo(String value) {
            addCriterion("report_audit_InformerID <>", value, "reportAuditInformerid");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridGreaterThan(String value) {
            addCriterion("report_audit_InformerID >", value, "reportAuditInformerid");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridGreaterThanOrEqualTo(String value) {
            addCriterion("report_audit_InformerID >=", value, "reportAuditInformerid");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridLessThan(String value) {
            addCriterion("report_audit_InformerID <", value, "reportAuditInformerid");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridLessThanOrEqualTo(String value) {
            addCriterion("report_audit_InformerID <=", value, "reportAuditInformerid");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridLike(String value) {
            addCriterion("report_audit_InformerID like", value, "reportAuditInformerid");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridNotLike(String value) {
            addCriterion("report_audit_InformerID not like", value, "reportAuditInformerid");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridIn(List<String> values) {
            addCriterion("report_audit_InformerID in", values, "reportAuditInformerid");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridNotIn(List<String> values) {
            addCriterion("report_audit_InformerID not in", values, "reportAuditInformerid");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridBetween(String value1, String value2) {
            addCriterion("report_audit_InformerID between", value1, value2, "reportAuditInformerid");
            return (Criteria) this;
        }

        public Criteria andReportAuditInformeridNotBetween(String value1, String value2) {
            addCriterion("report_audit_InformerID not between", value1, value2, "reportAuditInformerid");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidIsNull() {
            addCriterion("report_audit_PostID is null");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidIsNotNull() {
            addCriterion("report_audit_PostID is not null");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidEqualTo(String value) {
            addCriterion("report_audit_PostID =", value, "reportAuditPostid");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidNotEqualTo(String value) {
            addCriterion("report_audit_PostID <>", value, "reportAuditPostid");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidGreaterThan(String value) {
            addCriterion("report_audit_PostID >", value, "reportAuditPostid");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidGreaterThanOrEqualTo(String value) {
            addCriterion("report_audit_PostID >=", value, "reportAuditPostid");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidLessThan(String value) {
            addCriterion("report_audit_PostID <", value, "reportAuditPostid");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidLessThanOrEqualTo(String value) {
            addCriterion("report_audit_PostID <=", value, "reportAuditPostid");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidLike(String value) {
            addCriterion("report_audit_PostID like", value, "reportAuditPostid");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidNotLike(String value) {
            addCriterion("report_audit_PostID not like", value, "reportAuditPostid");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidIn(List<String> values) {
            addCriterion("report_audit_PostID in", values, "reportAuditPostid");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidNotIn(List<String> values) {
            addCriterion("report_audit_PostID not in", values, "reportAuditPostid");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidBetween(String value1, String value2) {
            addCriterion("report_audit_PostID between", value1, value2, "reportAuditPostid");
            return (Criteria) this;
        }

        public Criteria andReportAuditPostidNotBetween(String value1, String value2) {
            addCriterion("report_audit_PostID not between", value1, value2, "reportAuditPostid");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidIsNull() {
            addCriterion("report_audit_BReportID is null");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidIsNotNull() {
            addCriterion("report_audit_BReportID is not null");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidEqualTo(String value) {
            addCriterion("report_audit_BReportID =", value, "reportAuditBreportid");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidNotEqualTo(String value) {
            addCriterion("report_audit_BReportID <>", value, "reportAuditBreportid");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidGreaterThan(String value) {
            addCriterion("report_audit_BReportID >", value, "reportAuditBreportid");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidGreaterThanOrEqualTo(String value) {
            addCriterion("report_audit_BReportID >=", value, "reportAuditBreportid");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidLessThan(String value) {
            addCriterion("report_audit_BReportID <", value, "reportAuditBreportid");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidLessThanOrEqualTo(String value) {
            addCriterion("report_audit_BReportID <=", value, "reportAuditBreportid");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidLike(String value) {
            addCriterion("report_audit_BReportID like", value, "reportAuditBreportid");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidNotLike(String value) {
            addCriterion("report_audit_BReportID not like", value, "reportAuditBreportid");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidIn(List<String> values) {
            addCriterion("report_audit_BReportID in", values, "reportAuditBreportid");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidNotIn(List<String> values) {
            addCriterion("report_audit_BReportID not in", values, "reportAuditBreportid");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidBetween(String value1, String value2) {
            addCriterion("report_audit_BReportID between", value1, value2, "reportAuditBreportid");
            return (Criteria) this;
        }

        public Criteria andReportAuditBreportidNotBetween(String value1, String value2) {
            addCriterion("report_audit_BReportID not between", value1, value2, "reportAuditBreportid");
            return (Criteria) this;
        }

        public Criteria andReportAuditReporttimeIsNull() {
            addCriterion("report_audit_ReportTime is null");
            return (Criteria) this;
        }

        public Criteria andReportAuditReporttimeIsNotNull() {
            addCriterion("report_audit_ReportTime is not null");
            return (Criteria) this;
        }

        public Criteria andReportAuditReporttimeEqualTo(Date value) {
            addCriterion("report_audit_ReportTime =", value, "reportAuditReporttime");
            return (Criteria) this;
        }

        public Criteria andReportAuditReporttimeNotEqualTo(Date value) {
            addCriterion("report_audit_ReportTime <>", value, "reportAuditReporttime");
            return (Criteria) this;
        }

        public Criteria andReportAuditReporttimeGreaterThan(Date value) {
            addCriterion("report_audit_ReportTime >", value, "reportAuditReporttime");
            return (Criteria) this;
        }

        public Criteria andReportAuditReporttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_audit_ReportTime >=", value, "reportAuditReporttime");
            return (Criteria) this;
        }

        public Criteria andReportAuditReporttimeLessThan(Date value) {
            addCriterion("report_audit_ReportTime <", value, "reportAuditReporttime");
            return (Criteria) this;
        }

        public Criteria andReportAuditReporttimeLessThanOrEqualTo(Date value) {
            addCriterion("report_audit_ReportTime <=", value, "reportAuditReporttime");
            return (Criteria) this;
        }

        public Criteria andReportAuditReporttimeIn(List<Date> values) {
            addCriterion("report_audit_ReportTime in", values, "reportAuditReporttime");
            return (Criteria) this;
        }

        public Criteria andReportAuditReporttimeNotIn(List<Date> values) {
            addCriterion("report_audit_ReportTime not in", values, "reportAuditReporttime");
            return (Criteria) this;
        }

        public Criteria andReportAuditReporttimeBetween(Date value1, Date value2) {
            addCriterion("report_audit_ReportTime between", value1, value2, "reportAuditReporttime");
            return (Criteria) this;
        }

        public Criteria andReportAuditReporttimeNotBetween(Date value1, Date value2) {
            addCriterion("report_audit_ReportTime not between", value1, value2, "reportAuditReporttime");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidIsNull() {
            addCriterion("report_audit_AdminID is null");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidIsNotNull() {
            addCriterion("report_audit_AdminID is not null");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidEqualTo(String value) {
            addCriterion("report_audit_AdminID =", value, "reportAuditAdminid");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidNotEqualTo(String value) {
            addCriterion("report_audit_AdminID <>", value, "reportAuditAdminid");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidGreaterThan(String value) {
            addCriterion("report_audit_AdminID >", value, "reportAuditAdminid");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidGreaterThanOrEqualTo(String value) {
            addCriterion("report_audit_AdminID >=", value, "reportAuditAdminid");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidLessThan(String value) {
            addCriterion("report_audit_AdminID <", value, "reportAuditAdminid");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidLessThanOrEqualTo(String value) {
            addCriterion("report_audit_AdminID <=", value, "reportAuditAdminid");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidLike(String value) {
            addCriterion("report_audit_AdminID like", value, "reportAuditAdminid");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidNotLike(String value) {
            addCriterion("report_audit_AdminID not like", value, "reportAuditAdminid");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidIn(List<String> values) {
            addCriterion("report_audit_AdminID in", values, "reportAuditAdminid");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidNotIn(List<String> values) {
            addCriterion("report_audit_AdminID not in", values, "reportAuditAdminid");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidBetween(String value1, String value2) {
            addCriterion("report_audit_AdminID between", value1, value2, "reportAuditAdminid");
            return (Criteria) this;
        }

        public Criteria andReportAuditAdminidNotBetween(String value1, String value2) {
            addCriterion("report_audit_AdminID not between", value1, value2, "reportAuditAdminid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}