package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotsearchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotsearchExample() {
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

        public Criteria andHotsearchidIsNull() {
            addCriterion("hotSearchId is null");
            return (Criteria) this;
        }

        public Criteria andHotsearchidIsNotNull() {
            addCriterion("hotSearchId is not null");
            return (Criteria) this;
        }

        public Criteria andHotsearchidEqualTo(String value) {
            addCriterion("hotSearchId =", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidNotEqualTo(String value) {
            addCriterion("hotSearchId <>", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidGreaterThan(String value) {
            addCriterion("hotSearchId >", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidGreaterThanOrEqualTo(String value) {
            addCriterion("hotSearchId >=", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidLessThan(String value) {
            addCriterion("hotSearchId <", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidLessThanOrEqualTo(String value) {
            addCriterion("hotSearchId <=", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidLike(String value) {
            addCriterion("hotSearchId like", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidNotLike(String value) {
            addCriterion("hotSearchId not like", value, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidIn(List<String> values) {
            addCriterion("hotSearchId in", values, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidNotIn(List<String> values) {
            addCriterion("hotSearchId not in", values, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidBetween(String value1, String value2) {
            addCriterion("hotSearchId between", value1, value2, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchidNotBetween(String value1, String value2) {
            addCriterion("hotSearchId not between", value1, value2, "hotsearchid");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsIsNull() {
            addCriterion("hotSearchKeyWords is null");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsIsNotNull() {
            addCriterion("hotSearchKeyWords is not null");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsEqualTo(String value) {
            addCriterion("hotSearchKeyWords =", value, "hotsearchkeywords");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsNotEqualTo(String value) {
            addCriterion("hotSearchKeyWords <>", value, "hotsearchkeywords");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsGreaterThan(String value) {
            addCriterion("hotSearchKeyWords >", value, "hotsearchkeywords");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("hotSearchKeyWords >=", value, "hotsearchkeywords");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsLessThan(String value) {
            addCriterion("hotSearchKeyWords <", value, "hotsearchkeywords");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsLessThanOrEqualTo(String value) {
            addCriterion("hotSearchKeyWords <=", value, "hotsearchkeywords");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsLike(String value) {
            addCriterion("hotSearchKeyWords like", value, "hotsearchkeywords");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsNotLike(String value) {
            addCriterion("hotSearchKeyWords not like", value, "hotsearchkeywords");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsIn(List<String> values) {
            addCriterion("hotSearchKeyWords in", values, "hotsearchkeywords");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsNotIn(List<String> values) {
            addCriterion("hotSearchKeyWords not in", values, "hotsearchkeywords");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsBetween(String value1, String value2) {
            addCriterion("hotSearchKeyWords between", value1, value2, "hotsearchkeywords");
            return (Criteria) this;
        }

        public Criteria andHotsearchkeywordsNotBetween(String value1, String value2) {
            addCriterion("hotSearchKeyWords not between", value1, value2, "hotsearchkeywords");
            return (Criteria) this;
        }

        public Criteria andHotsearchtimeIsNull() {
            addCriterion("hotSearchTime is null");
            return (Criteria) this;
        }

        public Criteria andHotsearchtimeIsNotNull() {
            addCriterion("hotSearchTime is not null");
            return (Criteria) this;
        }

        public Criteria andHotsearchtimeEqualTo(Date value) {
            addCriterion("hotSearchTime =", value, "hotsearchtime");
            return (Criteria) this;
        }

        public Criteria andHotsearchtimeNotEqualTo(Date value) {
            addCriterion("hotSearchTime <>", value, "hotsearchtime");
            return (Criteria) this;
        }

        public Criteria andHotsearchtimeGreaterThan(Date value) {
            addCriterion("hotSearchTime >", value, "hotsearchtime");
            return (Criteria) this;
        }

        public Criteria andHotsearchtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hotSearchTime >=", value, "hotsearchtime");
            return (Criteria) this;
        }

        public Criteria andHotsearchtimeLessThan(Date value) {
            addCriterion("hotSearchTime <", value, "hotsearchtime");
            return (Criteria) this;
        }

        public Criteria andHotsearchtimeLessThanOrEqualTo(Date value) {
            addCriterion("hotSearchTime <=", value, "hotsearchtime");
            return (Criteria) this;
        }

        public Criteria andHotsearchtimeIn(List<Date> values) {
            addCriterion("hotSearchTime in", values, "hotsearchtime");
            return (Criteria) this;
        }

        public Criteria andHotsearchtimeNotIn(List<Date> values) {
            addCriterion("hotSearchTime not in", values, "hotsearchtime");
            return (Criteria) this;
        }

        public Criteria andHotsearchtimeBetween(Date value1, Date value2) {
            addCriterion("hotSearchTime between", value1, value2, "hotsearchtime");
            return (Criteria) this;
        }

        public Criteria andHotsearchtimeNotBetween(Date value1, Date value2) {
            addCriterion("hotSearchTime not between", value1, value2, "hotsearchtime");
            return (Criteria) this;
        }

        public Criteria andHotsearchnumberIsNull() {
            addCriterion("hotSearchNumber is null");
            return (Criteria) this;
        }

        public Criteria andHotsearchnumberIsNotNull() {
            addCriterion("hotSearchNumber is not null");
            return (Criteria) this;
        }

        public Criteria andHotsearchnumberEqualTo(Integer value) {
            addCriterion("hotSearchNumber =", value, "hotsearchnumber");
            return (Criteria) this;
        }

        public Criteria andHotsearchnumberNotEqualTo(Integer value) {
            addCriterion("hotSearchNumber <>", value, "hotsearchnumber");
            return (Criteria) this;
        }

        public Criteria andHotsearchnumberGreaterThan(Integer value) {
            addCriterion("hotSearchNumber >", value, "hotsearchnumber");
            return (Criteria) this;
        }

        public Criteria andHotsearchnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotSearchNumber >=", value, "hotsearchnumber");
            return (Criteria) this;
        }

        public Criteria andHotsearchnumberLessThan(Integer value) {
            addCriterion("hotSearchNumber <", value, "hotsearchnumber");
            return (Criteria) this;
        }

        public Criteria andHotsearchnumberLessThanOrEqualTo(Integer value) {
            addCriterion("hotSearchNumber <=", value, "hotsearchnumber");
            return (Criteria) this;
        }

        public Criteria andHotsearchnumberIn(List<Integer> values) {
            addCriterion("hotSearchNumber in", values, "hotsearchnumber");
            return (Criteria) this;
        }

        public Criteria andHotsearchnumberNotIn(List<Integer> values) {
            addCriterion("hotSearchNumber not in", values, "hotsearchnumber");
            return (Criteria) this;
        }

        public Criteria andHotsearchnumberBetween(Integer value1, Integer value2) {
            addCriterion("hotSearchNumber between", value1, value2, "hotsearchnumber");
            return (Criteria) this;
        }

        public Criteria andHotsearchnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("hotSearchNumber not between", value1, value2, "hotsearchnumber");
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