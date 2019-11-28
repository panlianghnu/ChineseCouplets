package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.List;

public class IntegralSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegralSourceExample() {
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

        public Criteria andIntegralSourceSourceIsNull() {
            addCriterion("integral_source_source is null");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceIsNotNull() {
            addCriterion("integral_source_source is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceEqualTo(String value) {
            addCriterion("integral_source_source =", value, "integralSourceSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceNotEqualTo(String value) {
            addCriterion("integral_source_source <>", value, "integralSourceSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceGreaterThan(String value) {
            addCriterion("integral_source_source >", value, "integralSourceSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceGreaterThanOrEqualTo(String value) {
            addCriterion("integral_source_source >=", value, "integralSourceSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceLessThan(String value) {
            addCriterion("integral_source_source <", value, "integralSourceSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceLessThanOrEqualTo(String value) {
            addCriterion("integral_source_source <=", value, "integralSourceSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceLike(String value) {
            addCriterion("integral_source_source like", value, "integralSourceSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceNotLike(String value) {
            addCriterion("integral_source_source not like", value, "integralSourceSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceIn(List<String> values) {
            addCriterion("integral_source_source in", values, "integralSourceSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceNotIn(List<String> values) {
            addCriterion("integral_source_source not in", values, "integralSourceSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceBetween(String value1, String value2) {
            addCriterion("integral_source_source between", value1, value2, "integralSourceSource");
            return (Criteria) this;
        }

        public Criteria andIntegralSourceSourceNotBetween(String value1, String value2) {
            addCriterion("integral_source_source not between", value1, value2, "integralSourceSource");
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