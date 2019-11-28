package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RhsqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RhsqExample() {
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

        public Criteria andRhsqSqidIsNull() {
            addCriterion("RHSQ_SQid is null");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidIsNotNull() {
            addCriterion("RHSQ_SQid is not null");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidEqualTo(String value) {
            addCriterion("RHSQ_SQid =", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidNotEqualTo(String value) {
            addCriterion("RHSQ_SQid <>", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidGreaterThan(String value) {
            addCriterion("RHSQ_SQid >", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidGreaterThanOrEqualTo(String value) {
            addCriterion("RHSQ_SQid >=", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidLessThan(String value) {
            addCriterion("RHSQ_SQid <", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidLessThanOrEqualTo(String value) {
            addCriterion("RHSQ_SQid <=", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidLike(String value) {
            addCriterion("RHSQ_SQid like", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidNotLike(String value) {
            addCriterion("RHSQ_SQid not like", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidIn(List<String> values) {
            addCriterion("RHSQ_SQid in", values, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidNotIn(List<String> values) {
            addCriterion("RHSQ_SQid not in", values, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidBetween(String value1, String value2) {
            addCriterion("RHSQ_SQid between", value1, value2, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidNotBetween(String value1, String value2) {
            addCriterion("RHSQ_SQid not between", value1, value2, "rhsqSqid");
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

        public Criteria andSqslSqbhIsNull() {
            addCriterion("SQSL_SQBH is null");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhIsNotNull() {
            addCriterion("SQSL_SQBH is not null");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhEqualTo(String value) {
            addCriterion("SQSL_SQBH =", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhNotEqualTo(String value) {
            addCriterion("SQSL_SQBH <>", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhGreaterThan(String value) {
            addCriterion("SQSL_SQBH >", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhGreaterThanOrEqualTo(String value) {
            addCriterion("SQSL_SQBH >=", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhLessThan(String value) {
            addCriterion("SQSL_SQBH <", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhLessThanOrEqualTo(String value) {
            addCriterion("SQSL_SQBH <=", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhLike(String value) {
            addCriterion("SQSL_SQBH like", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhNotLike(String value) {
            addCriterion("SQSL_SQBH not like", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhIn(List<String> values) {
            addCriterion("SQSL_SQBH in", values, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhNotIn(List<String> values) {
            addCriterion("SQSL_SQBH not in", values, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhBetween(String value1, String value2) {
            addCriterion("SQSL_SQBH between", value1, value2, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhNotBetween(String value1, String value2) {
            addCriterion("SQSL_SQBH not between", value1, value2, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridIsNull() {
            addCriterion("RHSQ_SQRid is null");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridIsNotNull() {
            addCriterion("RHSQ_SQRid is not null");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridEqualTo(String value) {
            addCriterion("RHSQ_SQRid =", value, "rhsqSqrid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridNotEqualTo(String value) {
            addCriterion("RHSQ_SQRid <>", value, "rhsqSqrid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridGreaterThan(String value) {
            addCriterion("RHSQ_SQRid >", value, "rhsqSqrid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridGreaterThanOrEqualTo(String value) {
            addCriterion("RHSQ_SQRid >=", value, "rhsqSqrid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridLessThan(String value) {
            addCriterion("RHSQ_SQRid <", value, "rhsqSqrid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridLessThanOrEqualTo(String value) {
            addCriterion("RHSQ_SQRid <=", value, "rhsqSqrid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridLike(String value) {
            addCriterion("RHSQ_SQRid like", value, "rhsqSqrid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridNotLike(String value) {
            addCriterion("RHSQ_SQRid not like", value, "rhsqSqrid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridIn(List<String> values) {
            addCriterion("RHSQ_SQRid in", values, "rhsqSqrid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridNotIn(List<String> values) {
            addCriterion("RHSQ_SQRid not in", values, "rhsqSqrid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridBetween(String value1, String value2) {
            addCriterion("RHSQ_SQRid between", value1, value2, "rhsqSqrid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqridNotBetween(String value1, String value2) {
            addCriterion("RHSQ_SQRid not between", value1, value2, "rhsqSqrid");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidIsNull() {
            addCriterion("RHSQ_ZRXHid is null");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidIsNotNull() {
            addCriterion("RHSQ_ZRXHid is not null");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidEqualTo(String value) {
            addCriterion("RHSQ_ZRXHid =", value, "rhsqZrxhid");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidNotEqualTo(String value) {
            addCriterion("RHSQ_ZRXHid <>", value, "rhsqZrxhid");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidGreaterThan(String value) {
            addCriterion("RHSQ_ZRXHid >", value, "rhsqZrxhid");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidGreaterThanOrEqualTo(String value) {
            addCriterion("RHSQ_ZRXHid >=", value, "rhsqZrxhid");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidLessThan(String value) {
            addCriterion("RHSQ_ZRXHid <", value, "rhsqZrxhid");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidLessThanOrEqualTo(String value) {
            addCriterion("RHSQ_ZRXHid <=", value, "rhsqZrxhid");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidLike(String value) {
            addCriterion("RHSQ_ZRXHid like", value, "rhsqZrxhid");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidNotLike(String value) {
            addCriterion("RHSQ_ZRXHid not like", value, "rhsqZrxhid");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidIn(List<String> values) {
            addCriterion("RHSQ_ZRXHid in", values, "rhsqZrxhid");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidNotIn(List<String> values) {
            addCriterion("RHSQ_ZRXHid not in", values, "rhsqZrxhid");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidBetween(String value1, String value2) {
            addCriterion("RHSQ_ZRXHid between", value1, value2, "rhsqZrxhid");
            return (Criteria) this;
        }

        public Criteria andRhsqZrxhidNotBetween(String value1, String value2) {
            addCriterion("RHSQ_ZRXHid not between", value1, value2, "rhsqZrxhid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqtjsjIsNull() {
            addCriterion("RHSQ_SQTJSJ is null");
            return (Criteria) this;
        }

        public Criteria andRhsqSqtjsjIsNotNull() {
            addCriterion("RHSQ_SQTJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andRhsqSqtjsjEqualTo(Date value) {
            addCriterion("RHSQ_SQTJSJ =", value, "rhsqSqtjsj");
            return (Criteria) this;
        }

        public Criteria andRhsqSqtjsjNotEqualTo(Date value) {
            addCriterion("RHSQ_SQTJSJ <>", value, "rhsqSqtjsj");
            return (Criteria) this;
        }

        public Criteria andRhsqSqtjsjGreaterThan(Date value) {
            addCriterion("RHSQ_SQTJSJ >", value, "rhsqSqtjsj");
            return (Criteria) this;
        }

        public Criteria andRhsqSqtjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("RHSQ_SQTJSJ >=", value, "rhsqSqtjsj");
            return (Criteria) this;
        }

        public Criteria andRhsqSqtjsjLessThan(Date value) {
            addCriterion("RHSQ_SQTJSJ <", value, "rhsqSqtjsj");
            return (Criteria) this;
        }

        public Criteria andRhsqSqtjsjLessThanOrEqualTo(Date value) {
            addCriterion("RHSQ_SQTJSJ <=", value, "rhsqSqtjsj");
            return (Criteria) this;
        }

        public Criteria andRhsqSqtjsjIn(List<Date> values) {
            addCriterion("RHSQ_SQTJSJ in", values, "rhsqSqtjsj");
            return (Criteria) this;
        }

        public Criteria andRhsqSqtjsjNotIn(List<Date> values) {
            addCriterion("RHSQ_SQTJSJ not in", values, "rhsqSqtjsj");
            return (Criteria) this;
        }

        public Criteria andRhsqSqtjsjBetween(Date value1, Date value2) {
            addCriterion("RHSQ_SQTJSJ between", value1, value2, "rhsqSqtjsj");
            return (Criteria) this;
        }

        public Criteria andRhsqSqtjsjNotBetween(Date value1, Date value2) {
            addCriterion("RHSQ_SQTJSJ not between", value1, value2, "rhsqSqtjsj");
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