package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassificationCoupletsbyuser24Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassificationCoupletsbyuser24Example() {
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

        public Criteria andCoupletsbyuserIdIsNull() {
            addCriterion("CoupletsByUser_id is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdIsNotNull() {
            addCriterion("CoupletsByUser_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdEqualTo(String value) {
            addCriterion("CoupletsByUser_id =", value, "coupletsbyuserId");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdNotEqualTo(String value) {
            addCriterion("CoupletsByUser_id <>", value, "coupletsbyuserId");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdGreaterThan(String value) {
            addCriterion("CoupletsByUser_id >", value, "coupletsbyuserId");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsByUser_id >=", value, "coupletsbyuserId");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdLessThan(String value) {
            addCriterion("CoupletsByUser_id <", value, "coupletsbyuserId");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdLessThanOrEqualTo(String value) {
            addCriterion("CoupletsByUser_id <=", value, "coupletsbyuserId");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdLike(String value) {
            addCriterion("CoupletsByUser_id like", value, "coupletsbyuserId");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdNotLike(String value) {
            addCriterion("CoupletsByUser_id not like", value, "coupletsbyuserId");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdIn(List<String> values) {
            addCriterion("CoupletsByUser_id in", values, "coupletsbyuserId");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdNotIn(List<String> values) {
            addCriterion("CoupletsByUser_id not in", values, "coupletsbyuserId");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdBetween(String value1, String value2) {
            addCriterion("CoupletsByUser_id between", value1, value2, "coupletsbyuserId");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserIdNotBetween(String value1, String value2) {
            addCriterion("CoupletsByUser_id not between", value1, value2, "coupletsbyuserId");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidIsNull() {
            addCriterion("Classification_classificationId is null");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidIsNotNull() {
            addCriterion("Classification_classificationId is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidEqualTo(String value) {
            addCriterion("Classification_classificationId =", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidNotEqualTo(String value) {
            addCriterion("Classification_classificationId <>", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidGreaterThan(String value) {
            addCriterion("Classification_classificationId >", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidGreaterThanOrEqualTo(String value) {
            addCriterion("Classification_classificationId >=", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidLessThan(String value) {
            addCriterion("Classification_classificationId <", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidLessThanOrEqualTo(String value) {
            addCriterion("Classification_classificationId <=", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidLike(String value) {
            addCriterion("Classification_classificationId like", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidNotLike(String value) {
            addCriterion("Classification_classificationId not like", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidIn(List<String> values) {
            addCriterion("Classification_classificationId in", values, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidNotIn(List<String> values) {
            addCriterion("Classification_classificationId not in", values, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidBetween(String value1, String value2) {
            addCriterion("Classification_classificationId between", value1, value2, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidNotBetween(String value1, String value2) {
            addCriterion("Classification_classificationId not between", value1, value2, "classificationClassificationid");
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