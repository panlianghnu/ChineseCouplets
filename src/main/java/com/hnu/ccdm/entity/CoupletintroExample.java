package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.List;

public class CoupletintroExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoupletintroExample() {
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

        public Criteria andCoupletintroOriginIsNull() {
            addCriterion("CoupletIntro_origin is null");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginIsNotNull() {
            addCriterion("CoupletIntro_origin is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginEqualTo(String value) {
            addCriterion("CoupletIntro_origin =", value, "coupletintroOrigin");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginNotEqualTo(String value) {
            addCriterion("CoupletIntro_origin <>", value, "coupletintroOrigin");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginGreaterThan(String value) {
            addCriterion("CoupletIntro_origin >", value, "coupletintroOrigin");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletIntro_origin >=", value, "coupletintroOrigin");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginLessThan(String value) {
            addCriterion("CoupletIntro_origin <", value, "coupletintroOrigin");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginLessThanOrEqualTo(String value) {
            addCriterion("CoupletIntro_origin <=", value, "coupletintroOrigin");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginLike(String value) {
            addCriterion("CoupletIntro_origin like", value, "coupletintroOrigin");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginNotLike(String value) {
            addCriterion("CoupletIntro_origin not like", value, "coupletintroOrigin");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginIn(List<String> values) {
            addCriterion("CoupletIntro_origin in", values, "coupletintroOrigin");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginNotIn(List<String> values) {
            addCriterion("CoupletIntro_origin not in", values, "coupletintroOrigin");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginBetween(String value1, String value2) {
            addCriterion("CoupletIntro_origin between", value1, value2, "coupletintroOrigin");
            return (Criteria) this;
        }

        public Criteria andCoupletintroOriginNotBetween(String value1, String value2) {
            addCriterion("CoupletIntro_origin not between", value1, value2, "coupletintroOrigin");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageIsNull() {
            addCriterion("CoupletIntro_Image is null");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageIsNotNull() {
            addCriterion("CoupletIntro_Image is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageEqualTo(String value) {
            addCriterion("CoupletIntro_Image =", value, "coupletintroImage");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageNotEqualTo(String value) {
            addCriterion("CoupletIntro_Image <>", value, "coupletintroImage");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageGreaterThan(String value) {
            addCriterion("CoupletIntro_Image >", value, "coupletintroImage");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletIntro_Image >=", value, "coupletintroImage");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageLessThan(String value) {
            addCriterion("CoupletIntro_Image <", value, "coupletintroImage");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageLessThanOrEqualTo(String value) {
            addCriterion("CoupletIntro_Image <=", value, "coupletintroImage");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageLike(String value) {
            addCriterion("CoupletIntro_Image like", value, "coupletintroImage");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageNotLike(String value) {
            addCriterion("CoupletIntro_Image not like", value, "coupletintroImage");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageIn(List<String> values) {
            addCriterion("CoupletIntro_Image in", values, "coupletintroImage");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageNotIn(List<String> values) {
            addCriterion("CoupletIntro_Image not in", values, "coupletintroImage");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageBetween(String value1, String value2) {
            addCriterion("CoupletIntro_Image between", value1, value2, "coupletintroImage");
            return (Criteria) this;
        }

        public Criteria andCoupletintroImageNotBetween(String value1, String value2) {
            addCriterion("CoupletIntro_Image not between", value1, value2, "coupletintroImage");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameIsNull() {
            addCriterion("CoupletIntro_name is null");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameIsNotNull() {
            addCriterion("CoupletIntro_name is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameEqualTo(String value) {
            addCriterion("CoupletIntro_name =", value, "coupletintroName");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameNotEqualTo(String value) {
            addCriterion("CoupletIntro_name <>", value, "coupletintroName");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameGreaterThan(String value) {
            addCriterion("CoupletIntro_name >", value, "coupletintroName");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletIntro_name >=", value, "coupletintroName");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameLessThan(String value) {
            addCriterion("CoupletIntro_name <", value, "coupletintroName");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameLessThanOrEqualTo(String value) {
            addCriterion("CoupletIntro_name <=", value, "coupletintroName");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameLike(String value) {
            addCriterion("CoupletIntro_name like", value, "coupletintroName");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameNotLike(String value) {
            addCriterion("CoupletIntro_name not like", value, "coupletintroName");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameIn(List<String> values) {
            addCriterion("CoupletIntro_name in", values, "coupletintroName");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameNotIn(List<String> values) {
            addCriterion("CoupletIntro_name not in", values, "coupletintroName");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameBetween(String value1, String value2) {
            addCriterion("CoupletIntro_name between", value1, value2, "coupletintroName");
            return (Criteria) this;
        }

        public Criteria andCoupletintroNameNotBetween(String value1, String value2) {
            addCriterion("CoupletIntro_name not between", value1, value2, "coupletintroName");
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