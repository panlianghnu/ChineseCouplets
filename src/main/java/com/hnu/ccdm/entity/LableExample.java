package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.List;

public class LableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LableExample() {
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

        public Criteria andLableContentIsNull() {
            addCriterion("lable_content is null");
            return (Criteria) this;
        }

        public Criteria andLableContentIsNotNull() {
            addCriterion("lable_content is not null");
            return (Criteria) this;
        }

        public Criteria andLableContentEqualTo(String value) {
            addCriterion("lable_content =", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentNotEqualTo(String value) {
            addCriterion("lable_content <>", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentGreaterThan(String value) {
            addCriterion("lable_content >", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentGreaterThanOrEqualTo(String value) {
            addCriterion("lable_content >=", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentLessThan(String value) {
            addCriterion("lable_content <", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentLessThanOrEqualTo(String value) {
            addCriterion("lable_content <=", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentLike(String value) {
            addCriterion("lable_content like", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentNotLike(String value) {
            addCriterion("lable_content not like", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentIn(List<String> values) {
            addCriterion("lable_content in", values, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentNotIn(List<String> values) {
            addCriterion("lable_content not in", values, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentBetween(String value1, String value2) {
            addCriterion("lable_content between", value1, value2, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentNotBetween(String value1, String value2) {
            addCriterion("lable_content not between", value1, value2, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableNameIsNull() {
            addCriterion("lable_Name is null");
            return (Criteria) this;
        }

        public Criteria andLableNameIsNotNull() {
            addCriterion("lable_Name is not null");
            return (Criteria) this;
        }

        public Criteria andLableNameEqualTo(String value) {
            addCriterion("lable_Name =", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameNotEqualTo(String value) {
            addCriterion("lable_Name <>", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameGreaterThan(String value) {
            addCriterion("lable_Name >", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameGreaterThanOrEqualTo(String value) {
            addCriterion("lable_Name >=", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameLessThan(String value) {
            addCriterion("lable_Name <", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameLessThanOrEqualTo(String value) {
            addCriterion("lable_Name <=", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameLike(String value) {
            addCriterion("lable_Name like", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameNotLike(String value) {
            addCriterion("lable_Name not like", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameIn(List<String> values) {
            addCriterion("lable_Name in", values, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameNotIn(List<String> values) {
            addCriterion("lable_Name not in", values, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameBetween(String value1, String value2) {
            addCriterion("lable_Name between", value1, value2, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameNotBetween(String value1, String value2) {
            addCriterion("lable_Name not between", value1, value2, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableRemarksIsNull() {
            addCriterion("lable_Remarks is null");
            return (Criteria) this;
        }

        public Criteria andLableRemarksIsNotNull() {
            addCriterion("lable_Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andLableRemarksEqualTo(String value) {
            addCriterion("lable_Remarks =", value, "lableRemarks");
            return (Criteria) this;
        }

        public Criteria andLableRemarksNotEqualTo(String value) {
            addCriterion("lable_Remarks <>", value, "lableRemarks");
            return (Criteria) this;
        }

        public Criteria andLableRemarksGreaterThan(String value) {
            addCriterion("lable_Remarks >", value, "lableRemarks");
            return (Criteria) this;
        }

        public Criteria andLableRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("lable_Remarks >=", value, "lableRemarks");
            return (Criteria) this;
        }

        public Criteria andLableRemarksLessThan(String value) {
            addCriterion("lable_Remarks <", value, "lableRemarks");
            return (Criteria) this;
        }

        public Criteria andLableRemarksLessThanOrEqualTo(String value) {
            addCriterion("lable_Remarks <=", value, "lableRemarks");
            return (Criteria) this;
        }

        public Criteria andLableRemarksLike(String value) {
            addCriterion("lable_Remarks like", value, "lableRemarks");
            return (Criteria) this;
        }

        public Criteria andLableRemarksNotLike(String value) {
            addCriterion("lable_Remarks not like", value, "lableRemarks");
            return (Criteria) this;
        }

        public Criteria andLableRemarksIn(List<String> values) {
            addCriterion("lable_Remarks in", values, "lableRemarks");
            return (Criteria) this;
        }

        public Criteria andLableRemarksNotIn(List<String> values) {
            addCriterion("lable_Remarks not in", values, "lableRemarks");
            return (Criteria) this;
        }

        public Criteria andLableRemarksBetween(String value1, String value2) {
            addCriterion("lable_Remarks between", value1, value2, "lableRemarks");
            return (Criteria) this;
        }

        public Criteria andLableRemarksNotBetween(String value1, String value2) {
            addCriterion("lable_Remarks not between", value1, value2, "lableRemarks");
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