package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedbackExample() {
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

        public Criteria andFeedbackidIsNull() {
            addCriterion("feedbackId is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackidIsNotNull() {
            addCriterion("feedbackId is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackidEqualTo(String value) {
            addCriterion("feedbackId =", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidNotEqualTo(String value) {
            addCriterion("feedbackId <>", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidGreaterThan(String value) {
            addCriterion("feedbackId >", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidGreaterThanOrEqualTo(String value) {
            addCriterion("feedbackId >=", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidLessThan(String value) {
            addCriterion("feedbackId <", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidLessThanOrEqualTo(String value) {
            addCriterion("feedbackId <=", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidLike(String value) {
            addCriterion("feedbackId like", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidNotLike(String value) {
            addCriterion("feedbackId not like", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidIn(List<String> values) {
            addCriterion("feedbackId in", values, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidNotIn(List<String> values) {
            addCriterion("feedbackId not in", values, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidBetween(String value1, String value2) {
            addCriterion("feedbackId between", value1, value2, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidNotBetween(String value1, String value2) {
            addCriterion("feedbackId not between", value1, value2, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountIsNull() {
            addCriterion("feedbackAccount is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountIsNotNull() {
            addCriterion("feedbackAccount is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountEqualTo(String value) {
            addCriterion("feedbackAccount =", value, "feedbackaccount");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountNotEqualTo(String value) {
            addCriterion("feedbackAccount <>", value, "feedbackaccount");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountGreaterThan(String value) {
            addCriterion("feedbackAccount >", value, "feedbackaccount");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountGreaterThanOrEqualTo(String value) {
            addCriterion("feedbackAccount >=", value, "feedbackaccount");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountLessThan(String value) {
            addCriterion("feedbackAccount <", value, "feedbackaccount");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountLessThanOrEqualTo(String value) {
            addCriterion("feedbackAccount <=", value, "feedbackaccount");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountLike(String value) {
            addCriterion("feedbackAccount like", value, "feedbackaccount");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountNotLike(String value) {
            addCriterion("feedbackAccount not like", value, "feedbackaccount");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountIn(List<String> values) {
            addCriterion("feedbackAccount in", values, "feedbackaccount");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountNotIn(List<String> values) {
            addCriterion("feedbackAccount not in", values, "feedbackaccount");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountBetween(String value1, String value2) {
            addCriterion("feedbackAccount between", value1, value2, "feedbackaccount");
            return (Criteria) this;
        }

        public Criteria andFeedbackaccountNotBetween(String value1, String value2) {
            addCriterion("feedbackAccount not between", value1, value2, "feedbackaccount");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeIsNull() {
            addCriterion("feedbackTime is null");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeIsNotNull() {
            addCriterion("feedbackTime is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeEqualTo(Date value) {
            addCriterion("feedbackTime =", value, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeNotEqualTo(Date value) {
            addCriterion("feedbackTime <>", value, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeGreaterThan(Date value) {
            addCriterion("feedbackTime >", value, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("feedbackTime >=", value, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeLessThan(Date value) {
            addCriterion("feedbackTime <", value, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeLessThanOrEqualTo(Date value) {
            addCriterion("feedbackTime <=", value, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeIn(List<Date> values) {
            addCriterion("feedbackTime in", values, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeNotIn(List<Date> values) {
            addCriterion("feedbackTime not in", values, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeBetween(Date value1, Date value2) {
            addCriterion("feedbackTime between", value1, value2, "feedbacktime");
            return (Criteria) this;
        }

        public Criteria andFeedbacktimeNotBetween(Date value1, Date value2) {
            addCriterion("feedbackTime not between", value1, value2, "feedbacktime");
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