package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.List;

public class StudyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudyExample() {
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

        public Criteria andStudyidIsNull() {
            addCriterion("studyId is null");
            return (Criteria) this;
        }

        public Criteria andStudyidIsNotNull() {
            addCriterion("studyId is not null");
            return (Criteria) this;
        }

        public Criteria andStudyidEqualTo(String value) {
            addCriterion("studyId =", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidNotEqualTo(String value) {
            addCriterion("studyId <>", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidGreaterThan(String value) {
            addCriterion("studyId >", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidGreaterThanOrEqualTo(String value) {
            addCriterion("studyId >=", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidLessThan(String value) {
            addCriterion("studyId <", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidLessThanOrEqualTo(String value) {
            addCriterion("studyId <=", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidLike(String value) {
            addCriterion("studyId like", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidNotLike(String value) {
            addCriterion("studyId not like", value, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidIn(List<String> values) {
            addCriterion("studyId in", values, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidNotIn(List<String> values) {
            addCriterion("studyId not in", values, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidBetween(String value1, String value2) {
            addCriterion("studyId between", value1, value2, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyidNotBetween(String value1, String value2) {
            addCriterion("studyId not between", value1, value2, "studyid");
            return (Criteria) this;
        }

        public Criteria andStudyauthorIsNull() {
            addCriterion("studyAuthor is null");
            return (Criteria) this;
        }

        public Criteria andStudyauthorIsNotNull() {
            addCriterion("studyAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andStudyauthorEqualTo(String value) {
            addCriterion("studyAuthor =", value, "studyauthor");
            return (Criteria) this;
        }

        public Criteria andStudyauthorNotEqualTo(String value) {
            addCriterion("studyAuthor <>", value, "studyauthor");
            return (Criteria) this;
        }

        public Criteria andStudyauthorGreaterThan(String value) {
            addCriterion("studyAuthor >", value, "studyauthor");
            return (Criteria) this;
        }

        public Criteria andStudyauthorGreaterThanOrEqualTo(String value) {
            addCriterion("studyAuthor >=", value, "studyauthor");
            return (Criteria) this;
        }

        public Criteria andStudyauthorLessThan(String value) {
            addCriterion("studyAuthor <", value, "studyauthor");
            return (Criteria) this;
        }

        public Criteria andStudyauthorLessThanOrEqualTo(String value) {
            addCriterion("studyAuthor <=", value, "studyauthor");
            return (Criteria) this;
        }

        public Criteria andStudyauthorLike(String value) {
            addCriterion("studyAuthor like", value, "studyauthor");
            return (Criteria) this;
        }

        public Criteria andStudyauthorNotLike(String value) {
            addCriterion("studyAuthor not like", value, "studyauthor");
            return (Criteria) this;
        }

        public Criteria andStudyauthorIn(List<String> values) {
            addCriterion("studyAuthor in", values, "studyauthor");
            return (Criteria) this;
        }

        public Criteria andStudyauthorNotIn(List<String> values) {
            addCriterion("studyAuthor not in", values, "studyauthor");
            return (Criteria) this;
        }

        public Criteria andStudyauthorBetween(String value1, String value2) {
            addCriterion("studyAuthor between", value1, value2, "studyauthor");
            return (Criteria) this;
        }

        public Criteria andStudyauthorNotBetween(String value1, String value2) {
            addCriterion("studyAuthor not between", value1, value2, "studyauthor");
            return (Criteria) this;
        }

        public Criteria andStudynameIsNull() {
            addCriterion("studyName is null");
            return (Criteria) this;
        }

        public Criteria andStudynameIsNotNull() {
            addCriterion("studyName is not null");
            return (Criteria) this;
        }

        public Criteria andStudynameEqualTo(String value) {
            addCriterion("studyName =", value, "studyname");
            return (Criteria) this;
        }

        public Criteria andStudynameNotEqualTo(String value) {
            addCriterion("studyName <>", value, "studyname");
            return (Criteria) this;
        }

        public Criteria andStudynameGreaterThan(String value) {
            addCriterion("studyName >", value, "studyname");
            return (Criteria) this;
        }

        public Criteria andStudynameGreaterThanOrEqualTo(String value) {
            addCriterion("studyName >=", value, "studyname");
            return (Criteria) this;
        }

        public Criteria andStudynameLessThan(String value) {
            addCriterion("studyName <", value, "studyname");
            return (Criteria) this;
        }

        public Criteria andStudynameLessThanOrEqualTo(String value) {
            addCriterion("studyName <=", value, "studyname");
            return (Criteria) this;
        }

        public Criteria andStudynameLike(String value) {
            addCriterion("studyName like", value, "studyname");
            return (Criteria) this;
        }

        public Criteria andStudynameNotLike(String value) {
            addCriterion("studyName not like", value, "studyname");
            return (Criteria) this;
        }

        public Criteria andStudynameIn(List<String> values) {
            addCriterion("studyName in", values, "studyname");
            return (Criteria) this;
        }

        public Criteria andStudynameNotIn(List<String> values) {
            addCriterion("studyName not in", values, "studyname");
            return (Criteria) this;
        }

        public Criteria andStudynameBetween(String value1, String value2) {
            addCriterion("studyName between", value1, value2, "studyname");
            return (Criteria) this;
        }

        public Criteria andStudynameNotBetween(String value1, String value2) {
            addCriterion("studyName not between", value1, value2, "studyname");
            return (Criteria) this;
        }

        public Criteria andStudyphotoIsNull() {
            addCriterion("studyPhoto is null");
            return (Criteria) this;
        }

        public Criteria andStudyphotoIsNotNull() {
            addCriterion("studyPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andStudyphotoEqualTo(String value) {
            addCriterion("studyPhoto =", value, "studyphoto");
            return (Criteria) this;
        }

        public Criteria andStudyphotoNotEqualTo(String value) {
            addCriterion("studyPhoto <>", value, "studyphoto");
            return (Criteria) this;
        }

        public Criteria andStudyphotoGreaterThan(String value) {
            addCriterion("studyPhoto >", value, "studyphoto");
            return (Criteria) this;
        }

        public Criteria andStudyphotoGreaterThanOrEqualTo(String value) {
            addCriterion("studyPhoto >=", value, "studyphoto");
            return (Criteria) this;
        }

        public Criteria andStudyphotoLessThan(String value) {
            addCriterion("studyPhoto <", value, "studyphoto");
            return (Criteria) this;
        }

        public Criteria andStudyphotoLessThanOrEqualTo(String value) {
            addCriterion("studyPhoto <=", value, "studyphoto");
            return (Criteria) this;
        }

        public Criteria andStudyphotoLike(String value) {
            addCriterion("studyPhoto like", value, "studyphoto");
            return (Criteria) this;
        }

        public Criteria andStudyphotoNotLike(String value) {
            addCriterion("studyPhoto not like", value, "studyphoto");
            return (Criteria) this;
        }

        public Criteria andStudyphotoIn(List<String> values) {
            addCriterion("studyPhoto in", values, "studyphoto");
            return (Criteria) this;
        }

        public Criteria andStudyphotoNotIn(List<String> values) {
            addCriterion("studyPhoto not in", values, "studyphoto");
            return (Criteria) this;
        }

        public Criteria andStudyphotoBetween(String value1, String value2) {
            addCriterion("studyPhoto between", value1, value2, "studyphoto");
            return (Criteria) this;
        }

        public Criteria andStudyphotoNotBetween(String value1, String value2) {
            addCriterion("studyPhoto not between", value1, value2, "studyphoto");
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