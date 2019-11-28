package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.List;

public class CoupletsauthorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoupletsauthorExample() {
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

        public Criteria andCoupletsauthorNameIsNull() {
            addCriterion("CoupletsAuthor_Name is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameIsNotNull() {
            addCriterion("CoupletsAuthor_Name is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameEqualTo(String value) {
            addCriterion("CoupletsAuthor_Name =", value, "coupletsauthorName");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameNotEqualTo(String value) {
            addCriterion("CoupletsAuthor_Name <>", value, "coupletsauthorName");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameGreaterThan(String value) {
            addCriterion("CoupletsAuthor_Name >", value, "coupletsauthorName");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsAuthor_Name >=", value, "coupletsauthorName");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameLessThan(String value) {
            addCriterion("CoupletsAuthor_Name <", value, "coupletsauthorName");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameLessThanOrEqualTo(String value) {
            addCriterion("CoupletsAuthor_Name <=", value, "coupletsauthorName");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameLike(String value) {
            addCriterion("CoupletsAuthor_Name like", value, "coupletsauthorName");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameNotLike(String value) {
            addCriterion("CoupletsAuthor_Name not like", value, "coupletsauthorName");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameIn(List<String> values) {
            addCriterion("CoupletsAuthor_Name in", values, "coupletsauthorName");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameNotIn(List<String> values) {
            addCriterion("CoupletsAuthor_Name not in", values, "coupletsauthorName");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameBetween(String value1, String value2) {
            addCriterion("CoupletsAuthor_Name between", value1, value2, "coupletsauthorName");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorNameNotBetween(String value1, String value2) {
            addCriterion("CoupletsAuthor_Name not between", value1, value2, "coupletsauthorName");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexIsNull() {
            addCriterion("CoupletsAuthor_Sex is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexIsNotNull() {
            addCriterion("CoupletsAuthor_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexEqualTo(String value) {
            addCriterion("CoupletsAuthor_Sex =", value, "coupletsauthorSex");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexNotEqualTo(String value) {
            addCriterion("CoupletsAuthor_Sex <>", value, "coupletsauthorSex");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexGreaterThan(String value) {
            addCriterion("CoupletsAuthor_Sex >", value, "coupletsauthorSex");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsAuthor_Sex >=", value, "coupletsauthorSex");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexLessThan(String value) {
            addCriterion("CoupletsAuthor_Sex <", value, "coupletsauthorSex");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexLessThanOrEqualTo(String value) {
            addCriterion("CoupletsAuthor_Sex <=", value, "coupletsauthorSex");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexLike(String value) {
            addCriterion("CoupletsAuthor_Sex like", value, "coupletsauthorSex");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexNotLike(String value) {
            addCriterion("CoupletsAuthor_Sex not like", value, "coupletsauthorSex");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexIn(List<String> values) {
            addCriterion("CoupletsAuthor_Sex in", values, "coupletsauthorSex");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexNotIn(List<String> values) {
            addCriterion("CoupletsAuthor_Sex not in", values, "coupletsauthorSex");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexBetween(String value1, String value2) {
            addCriterion("CoupletsAuthor_Sex between", value1, value2, "coupletsauthorSex");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorSexNotBetween(String value1, String value2) {
            addCriterion("CoupletsAuthor_Sex not between", value1, value2, "coupletsauthorSex");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyIsNull() {
            addCriterion("CoupletsAuthor_Dynasty is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyIsNotNull() {
            addCriterion("CoupletsAuthor_Dynasty is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyEqualTo(String value) {
            addCriterion("CoupletsAuthor_Dynasty =", value, "coupletsauthorDynasty");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyNotEqualTo(String value) {
            addCriterion("CoupletsAuthor_Dynasty <>", value, "coupletsauthorDynasty");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyGreaterThan(String value) {
            addCriterion("CoupletsAuthor_Dynasty >", value, "coupletsauthorDynasty");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsAuthor_Dynasty >=", value, "coupletsauthorDynasty");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyLessThan(String value) {
            addCriterion("CoupletsAuthor_Dynasty <", value, "coupletsauthorDynasty");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyLessThanOrEqualTo(String value) {
            addCriterion("CoupletsAuthor_Dynasty <=", value, "coupletsauthorDynasty");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyLike(String value) {
            addCriterion("CoupletsAuthor_Dynasty like", value, "coupletsauthorDynasty");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyNotLike(String value) {
            addCriterion("CoupletsAuthor_Dynasty not like", value, "coupletsauthorDynasty");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyIn(List<String> values) {
            addCriterion("CoupletsAuthor_Dynasty in", values, "coupletsauthorDynasty");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyNotIn(List<String> values) {
            addCriterion("CoupletsAuthor_Dynasty not in", values, "coupletsauthorDynasty");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyBetween(String value1, String value2) {
            addCriterion("CoupletsAuthor_Dynasty between", value1, value2, "coupletsauthorDynasty");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorDynastyNotBetween(String value1, String value2) {
            addCriterion("CoupletsAuthor_Dynasty not between", value1, value2, "coupletsauthorDynasty");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleIsNull() {
            addCriterion("CoupletsAuthor_Style is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleIsNotNull() {
            addCriterion("CoupletsAuthor_Style is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleEqualTo(String value) {
            addCriterion("CoupletsAuthor_Style =", value, "coupletsauthorStyle");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleNotEqualTo(String value) {
            addCriterion("CoupletsAuthor_Style <>", value, "coupletsauthorStyle");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleGreaterThan(String value) {
            addCriterion("CoupletsAuthor_Style >", value, "coupletsauthorStyle");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsAuthor_Style >=", value, "coupletsauthorStyle");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleLessThan(String value) {
            addCriterion("CoupletsAuthor_Style <", value, "coupletsauthorStyle");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleLessThanOrEqualTo(String value) {
            addCriterion("CoupletsAuthor_Style <=", value, "coupletsauthorStyle");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleLike(String value) {
            addCriterion("CoupletsAuthor_Style like", value, "coupletsauthorStyle");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleNotLike(String value) {
            addCriterion("CoupletsAuthor_Style not like", value, "coupletsauthorStyle");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleIn(List<String> values) {
            addCriterion("CoupletsAuthor_Style in", values, "coupletsauthorStyle");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleNotIn(List<String> values) {
            addCriterion("CoupletsAuthor_Style not in", values, "coupletsauthorStyle");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleBetween(String value1, String value2) {
            addCriterion("CoupletsAuthor_Style between", value1, value2, "coupletsauthorStyle");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorStyleNotBetween(String value1, String value2) {
            addCriterion("CoupletsAuthor_Style not between", value1, value2, "coupletsauthorStyle");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksIsNull() {
            addCriterion("CoupletsAuthor_Remarks is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksIsNotNull() {
            addCriterion("CoupletsAuthor_Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksEqualTo(String value) {
            addCriterion("CoupletsAuthor_Remarks =", value, "coupletsauthorRemarks");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksNotEqualTo(String value) {
            addCriterion("CoupletsAuthor_Remarks <>", value, "coupletsauthorRemarks");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksGreaterThan(String value) {
            addCriterion("CoupletsAuthor_Remarks >", value, "coupletsauthorRemarks");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsAuthor_Remarks >=", value, "coupletsauthorRemarks");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksLessThan(String value) {
            addCriterion("CoupletsAuthor_Remarks <", value, "coupletsauthorRemarks");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksLessThanOrEqualTo(String value) {
            addCriterion("CoupletsAuthor_Remarks <=", value, "coupletsauthorRemarks");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksLike(String value) {
            addCriterion("CoupletsAuthor_Remarks like", value, "coupletsauthorRemarks");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksNotLike(String value) {
            addCriterion("CoupletsAuthor_Remarks not like", value, "coupletsauthorRemarks");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksIn(List<String> values) {
            addCriterion("CoupletsAuthor_Remarks in", values, "coupletsauthorRemarks");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksNotIn(List<String> values) {
            addCriterion("CoupletsAuthor_Remarks not in", values, "coupletsauthorRemarks");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksBetween(String value1, String value2) {
            addCriterion("CoupletsAuthor_Remarks between", value1, value2, "coupletsauthorRemarks");
            return (Criteria) this;
        }

        public Criteria andCoupletsauthorRemarksNotBetween(String value1, String value2) {
            addCriterion("CoupletsAuthor_Remarks not between", value1, value2, "coupletsauthorRemarks");
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