package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegralExample() {
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

        public Criteria andIntegralIdIsNull() {
            addCriterion("integral_id is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIdIsNotNull() {
            addCriterion("integral_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralIdEqualTo(String value) {
            addCriterion("integral_id =", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdNotEqualTo(String value) {
            addCriterion("integral_id <>", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdGreaterThan(String value) {
            addCriterion("integral_id >", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdGreaterThanOrEqualTo(String value) {
            addCriterion("integral_id >=", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdLessThan(String value) {
            addCriterion("integral_id <", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdLessThanOrEqualTo(String value) {
            addCriterion("integral_id <=", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdLike(String value) {
            addCriterion("integral_id like", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdNotLike(String value) {
            addCriterion("integral_id not like", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdIn(List<String> values) {
            addCriterion("integral_id in", values, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdNotIn(List<String> values) {
            addCriterion("integral_id not in", values, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdBetween(String value1, String value2) {
            addCriterion("integral_id between", value1, value2, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdNotBetween(String value1, String value2) {
            addCriterion("integral_id not between", value1, value2, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralSumIsNull() {
            addCriterion("integral_sum is null");
            return (Criteria) this;
        }

        public Criteria andIntegralSumIsNotNull() {
            addCriterion("integral_sum is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralSumEqualTo(Integer value) {
            addCriterion("integral_sum =", value, "integralSum");
            return (Criteria) this;
        }

        public Criteria andIntegralSumNotEqualTo(Integer value) {
            addCriterion("integral_sum <>", value, "integralSum");
            return (Criteria) this;
        }

        public Criteria andIntegralSumGreaterThan(Integer value) {
            addCriterion("integral_sum >", value, "integralSum");
            return (Criteria) this;
        }

        public Criteria andIntegralSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral_sum >=", value, "integralSum");
            return (Criteria) this;
        }

        public Criteria andIntegralSumLessThan(Integer value) {
            addCriterion("integral_sum <", value, "integralSum");
            return (Criteria) this;
        }

        public Criteria andIntegralSumLessThanOrEqualTo(Integer value) {
            addCriterion("integral_sum <=", value, "integralSum");
            return (Criteria) this;
        }

        public Criteria andIntegralSumIn(List<Integer> values) {
            addCriterion("integral_sum in", values, "integralSum");
            return (Criteria) this;
        }

        public Criteria andIntegralSumNotIn(List<Integer> values) {
            addCriterion("integral_sum not in", values, "integralSum");
            return (Criteria) this;
        }

        public Criteria andIntegralSumBetween(Integer value1, Integer value2) {
            addCriterion("integral_sum between", value1, value2, "integralSum");
            return (Criteria) this;
        }

        public Criteria andIntegralSumNotBetween(Integer value1, Integer value2) {
            addCriterion("integral_sum not between", value1, value2, "integralSum");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIsNull() {
            addCriterion("integral_source is null");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIsNotNull() {
            addCriterion("integral_source is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceEqualTo(String value) {
            addCriterion("integral_source =", value, "integralSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceNotEqualTo(String value) {
            addCriterion("integral_source <>", value, "integralSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceGreaterThan(String value) {
            addCriterion("integral_source >", value, "integralSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceGreaterThanOrEqualTo(String value) {
            addCriterion("integral_source >=", value, "integralSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceLessThan(String value) {
            addCriterion("integral_source <", value, "integralSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceLessThanOrEqualTo(String value) {
            addCriterion("integral_source <=", value, "integralSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceLike(String value) {
            addCriterion("integral_source like", value, "integralSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceNotLike(String value) {
            addCriterion("integral_source not like", value, "integralSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIn(List<String> values) {
            addCriterion("integral_source in", values, "integralSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceNotIn(List<String> values) {
            addCriterion("integral_source not in", values, "integralSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceBetween(String value1, String value2) {
            addCriterion("integral_source between", value1, value2, "integralSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceNotBetween(String value1, String value2) {
            addCriterion("integral_source not between", value1, value2, "integralSource");
            return (Criteria) this;
        }

        public Criteria andIntegralTimeIsNull() {
            addCriterion("integral_time is null");
            return (Criteria) this;
        }

        public Criteria andIntegralTimeIsNotNull() {
            addCriterion("integral_time is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralTimeEqualTo(Date value) {
            addCriterion("integral_time =", value, "integralTime");
            return (Criteria) this;
        }

        public Criteria andIntegralTimeNotEqualTo(Date value) {
            addCriterion("integral_time <>", value, "integralTime");
            return (Criteria) this;
        }

        public Criteria andIntegralTimeGreaterThan(Date value) {
            addCriterion("integral_time >", value, "integralTime");
            return (Criteria) this;
        }

        public Criteria andIntegralTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("integral_time >=", value, "integralTime");
            return (Criteria) this;
        }

        public Criteria andIntegralTimeLessThan(Date value) {
            addCriterion("integral_time <", value, "integralTime");
            return (Criteria) this;
        }

        public Criteria andIntegralTimeLessThanOrEqualTo(Date value) {
            addCriterion("integral_time <=", value, "integralTime");
            return (Criteria) this;
        }

        public Criteria andIntegralTimeIn(List<Date> values) {
            addCriterion("integral_time in", values, "integralTime");
            return (Criteria) this;
        }

        public Criteria andIntegralTimeNotIn(List<Date> values) {
            addCriterion("integral_time not in", values, "integralTime");
            return (Criteria) this;
        }

        public Criteria andIntegralTimeBetween(Date value1, Date value2) {
            addCriterion("integral_time between", value1, value2, "integralTime");
            return (Criteria) this;
        }

        public Criteria andIntegralTimeNotBetween(Date value1, Date value2) {
            addCriterion("integral_time not between", value1, value2, "integralTime");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdIsNull() {
            addCriterion("integral_source_id is null");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdIsNotNull() {
            addCriterion("integral_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdEqualTo(String value) {
            addCriterion("integral_source_id =", value, "integralSourceId");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdNotEqualTo(String value) {
            addCriterion("integral_source_id <>", value, "integralSourceId");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdGreaterThan(String value) {
            addCriterion("integral_source_id >", value, "integralSourceId");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("integral_source_id >=", value, "integralSourceId");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdLessThan(String value) {
            addCriterion("integral_source_id <", value, "integralSourceId");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdLessThanOrEqualTo(String value) {
            addCriterion("integral_source_id <=", value, "integralSourceId");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdLike(String value) {
            addCriterion("integral_source_id like", value, "integralSourceId");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdNotLike(String value) {
            addCriterion("integral_source_id not like", value, "integralSourceId");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdIn(List<String> values) {
            addCriterion("integral_source_id in", values, "integralSourceId");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdNotIn(List<String> values) {
            addCriterion("integral_source_id not in", values, "integralSourceId");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdBetween(String value1, String value2) {
            addCriterion("integral_source_id between", value1, value2, "integralSourceId");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceIdNotBetween(String value1, String value2) {
            addCriterion("integral_source_id not between", value1, value2, "integralSourceId");
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