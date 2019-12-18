package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.List;

public class CharpterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CharpterExample() {
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

        public Criteria andCharpteridIsNull() {
            addCriterion("charpterId is null");
            return (Criteria) this;
        }

        public Criteria andCharpteridIsNotNull() {
            addCriterion("charpterId is not null");
            return (Criteria) this;
        }

        public Criteria andCharpteridEqualTo(String value) {
            addCriterion("charpterId =", value, "charpterid");
            return (Criteria) this;
        }

        public Criteria andCharpteridNotEqualTo(String value) {
            addCriterion("charpterId <>", value, "charpterid");
            return (Criteria) this;
        }

        public Criteria andCharpteridGreaterThan(String value) {
            addCriterion("charpterId >", value, "charpterid");
            return (Criteria) this;
        }

        public Criteria andCharpteridGreaterThanOrEqualTo(String value) {
            addCriterion("charpterId >=", value, "charpterid");
            return (Criteria) this;
        }

        public Criteria andCharpteridLessThan(String value) {
            addCriterion("charpterId <", value, "charpterid");
            return (Criteria) this;
        }

        public Criteria andCharpteridLessThanOrEqualTo(String value) {
            addCriterion("charpterId <=", value, "charpterid");
            return (Criteria) this;
        }

        public Criteria andCharpteridLike(String value) {
            addCriterion("charpterId like", value, "charpterid");
            return (Criteria) this;
        }

        public Criteria andCharpteridNotLike(String value) {
            addCriterion("charpterId not like", value, "charpterid");
            return (Criteria) this;
        }

        public Criteria andCharpteridIn(List<String> values) {
            addCriterion("charpterId in", values, "charpterid");
            return (Criteria) this;
        }

        public Criteria andCharpteridNotIn(List<String> values) {
            addCriterion("charpterId not in", values, "charpterid");
            return (Criteria) this;
        }

        public Criteria andCharpteridBetween(String value1, String value2) {
            addCriterion("charpterId between", value1, value2, "charpterid");
            return (Criteria) this;
        }

        public Criteria andCharpteridNotBetween(String value1, String value2) {
            addCriterion("charpterId not between", value1, value2, "charpterid");
            return (Criteria) this;
        }

        public Criteria andCharpternameIsNull() {
            addCriterion("charpterName is null");
            return (Criteria) this;
        }

        public Criteria andCharpternameIsNotNull() {
            addCriterion("charpterName is not null");
            return (Criteria) this;
        }

        public Criteria andCharpternameEqualTo(String value) {
            addCriterion("charpterName =", value, "charptername");
            return (Criteria) this;
        }

        public Criteria andCharpternameNotEqualTo(String value) {
            addCriterion("charpterName <>", value, "charptername");
            return (Criteria) this;
        }

        public Criteria andCharpternameGreaterThan(String value) {
            addCriterion("charpterName >", value, "charptername");
            return (Criteria) this;
        }

        public Criteria andCharpternameGreaterThanOrEqualTo(String value) {
            addCriterion("charpterName >=", value, "charptername");
            return (Criteria) this;
        }

        public Criteria andCharpternameLessThan(String value) {
            addCriterion("charpterName <", value, "charptername");
            return (Criteria) this;
        }

        public Criteria andCharpternameLessThanOrEqualTo(String value) {
            addCriterion("charpterName <=", value, "charptername");
            return (Criteria) this;
        }

        public Criteria andCharpternameLike(String value) {
            addCriterion("charpterName like", value, "charptername");
            return (Criteria) this;
        }

        public Criteria andCharpternameNotLike(String value) {
            addCriterion("charpterName not like", value, "charptername");
            return (Criteria) this;
        }

        public Criteria andCharpternameIn(List<String> values) {
            addCriterion("charpterName in", values, "charptername");
            return (Criteria) this;
        }

        public Criteria andCharpternameNotIn(List<String> values) {
            addCriterion("charpterName not in", values, "charptername");
            return (Criteria) this;
        }

        public Criteria andCharpternameBetween(String value1, String value2) {
            addCriterion("charpterName between", value1, value2, "charptername");
            return (Criteria) this;
        }

        public Criteria andCharpternameNotBetween(String value1, String value2) {
            addCriterion("charpterName not between", value1, value2, "charptername");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidIsNull() {
            addCriterion("charpterStudyId is null");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidIsNotNull() {
            addCriterion("charpterStudyId is not null");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidEqualTo(String value) {
            addCriterion("charpterStudyId =", value, "charpterstudyid");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidNotEqualTo(String value) {
            addCriterion("charpterStudyId <>", value, "charpterstudyid");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidGreaterThan(String value) {
            addCriterion("charpterStudyId >", value, "charpterstudyid");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidGreaterThanOrEqualTo(String value) {
            addCriterion("charpterStudyId >=", value, "charpterstudyid");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidLessThan(String value) {
            addCriterion("charpterStudyId <", value, "charpterstudyid");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidLessThanOrEqualTo(String value) {
            addCriterion("charpterStudyId <=", value, "charpterstudyid");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidLike(String value) {
            addCriterion("charpterStudyId like", value, "charpterstudyid");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidNotLike(String value) {
            addCriterion("charpterStudyId not like", value, "charpterstudyid");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidIn(List<String> values) {
            addCriterion("charpterStudyId in", values, "charpterstudyid");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidNotIn(List<String> values) {
            addCriterion("charpterStudyId not in", values, "charpterstudyid");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidBetween(String value1, String value2) {
            addCriterion("charpterStudyId between", value1, value2, "charpterstudyid");
            return (Criteria) this;
        }

        public Criteria andCharpterstudyidNotBetween(String value1, String value2) {
            addCriterion("charpterStudyId not between", value1, value2, "charpterstudyid");
            return (Criteria) this;
        }

        public Criteria andCharpternumberIsNull() {
            addCriterion("charpterNumber is null");
            return (Criteria) this;
        }

        public Criteria andCharpternumberIsNotNull() {
            addCriterion("charpterNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCharpternumberEqualTo(String value) {
            addCriterion("charpterNumber =", value, "charpternumber");
            return (Criteria) this;
        }

        public Criteria andCharpternumberNotEqualTo(String value) {
            addCriterion("charpterNumber <>", value, "charpternumber");
            return (Criteria) this;
        }

        public Criteria andCharpternumberGreaterThan(String value) {
            addCriterion("charpterNumber >", value, "charpternumber");
            return (Criteria) this;
        }

        public Criteria andCharpternumberGreaterThanOrEqualTo(String value) {
            addCriterion("charpterNumber >=", value, "charpternumber");
            return (Criteria) this;
        }

        public Criteria andCharpternumberLessThan(String value) {
            addCriterion("charpterNumber <", value, "charpternumber");
            return (Criteria) this;
        }

        public Criteria andCharpternumberLessThanOrEqualTo(String value) {
            addCriterion("charpterNumber <=", value, "charpternumber");
            return (Criteria) this;
        }

        public Criteria andCharpternumberLike(String value) {
            addCriterion("charpterNumber like", value, "charpternumber");
            return (Criteria) this;
        }

        public Criteria andCharpternumberNotLike(String value) {
            addCriterion("charpterNumber not like", value, "charpternumber");
            return (Criteria) this;
        }

        public Criteria andCharpternumberIn(List<String> values) {
            addCriterion("charpterNumber in", values, "charpternumber");
            return (Criteria) this;
        }

        public Criteria andCharpternumberNotIn(List<String> values) {
            addCriterion("charpterNumber not in", values, "charpternumber");
            return (Criteria) this;
        }

        public Criteria andCharpternumberBetween(String value1, String value2) {
            addCriterion("charpterNumber between", value1, value2, "charpternumber");
            return (Criteria) this;
        }

        public Criteria andCharpternumberNotBetween(String value1, String value2) {
            addCriterion("charpterNumber not between", value1, value2, "charpternumber");
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