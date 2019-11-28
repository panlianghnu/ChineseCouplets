package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.List;

public class CoupletsexistedCoupletsauthor22Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoupletsexistedCoupletsauthor22Example() {
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

        public Criteria andCoupletsauthorIdIsNull() {
            addCriterion("CoupletsAuthor_id is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdIsNotNull() {
            addCriterion("CoupletsAuthor_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdEqualTo(String value) {
            addCriterion("CoupletsAuthor_id =", value, "coupletsauthorId");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdNotEqualTo(String value) {
            addCriterion("CoupletsAuthor_id <>", value, "coupletsauthorId");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdGreaterThan(String value) {
            addCriterion("CoupletsAuthor_id >", value, "coupletsauthorId");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsAuthor_id >=", value, "coupletsauthorId");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdLessThan(String value) {
            addCriterion("CoupletsAuthor_id <", value, "coupletsauthorId");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdLessThanOrEqualTo(String value) {
            addCriterion("CoupletsAuthor_id <=", value, "coupletsauthorId");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdLike(String value) {
            addCriterion("CoupletsAuthor_id like", value, "coupletsauthorId");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdNotLike(String value) {
            addCriterion("CoupletsAuthor_id not like", value, "coupletsauthorId");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdIn(List<String> values) {
            addCriterion("CoupletsAuthor_id in", values, "coupletsauthorId");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdNotIn(List<String> values) {
            addCriterion("CoupletsAuthor_id not in", values, "coupletsauthorId");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdBetween(String value1, String value2) {
            addCriterion("CoupletsAuthor_id between", value1, value2, "coupletsauthorId");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorIdNotBetween(String value1, String value2) {
            addCriterion("CoupletsAuthor_id not between", value1, value2, "coupletsauthorId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdIsNull() {
            addCriterion("CoupletsExisted_id is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdIsNotNull() {
            addCriterion("CoupletsExisted_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdEqualTo(String value) {
            addCriterion("CoupletsExisted_id =", value, "coupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdNotEqualTo(String value) {
            addCriterion("CoupletsExisted_id <>", value, "coupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdGreaterThan(String value) {
            addCriterion("CoupletsExisted_id >", value, "coupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsExisted_id >=", value, "coupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdLessThan(String value) {
            addCriterion("CoupletsExisted_id <", value, "coupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdLessThanOrEqualTo(String value) {
            addCriterion("CoupletsExisted_id <=", value, "coupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdLike(String value) {
            addCriterion("CoupletsExisted_id like", value, "coupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdNotLike(String value) {
            addCriterion("CoupletsExisted_id not like", value, "coupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdIn(List<String> values) {
            addCriterion("CoupletsExisted_id in", values, "coupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdNotIn(List<String> values) {
            addCriterion("CoupletsExisted_id not in", values, "coupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdBetween(String value1, String value2) {
            addCriterion("CoupletsExisted_id between", value1, value2, "coupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedIdNotBetween(String value1, String value2) {
            addCriterion("CoupletsExisted_id not between", value1, value2, "coupletsexistedId");
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