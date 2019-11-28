package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CoupletsexistedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoupletsexistedExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCouCoupletsexistedIdIsNull() {
            addCriterion("Cou_CoupletsExisted_id is null");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdIsNotNull() {
            addCriterion("Cou_CoupletsExisted_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdEqualTo(String value) {
            addCriterion("Cou_CoupletsExisted_id =", value, "couCoupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdNotEqualTo(String value) {
            addCriterion("Cou_CoupletsExisted_id <>", value, "couCoupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdGreaterThan(String value) {
            addCriterion("Cou_CoupletsExisted_id >", value, "couCoupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdGreaterThanOrEqualTo(String value) {
            addCriterion("Cou_CoupletsExisted_id >=", value, "couCoupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdLessThan(String value) {
            addCriterion("Cou_CoupletsExisted_id <", value, "couCoupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdLessThanOrEqualTo(String value) {
            addCriterion("Cou_CoupletsExisted_id <=", value, "couCoupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdLike(String value) {
            addCriterion("Cou_CoupletsExisted_id like", value, "couCoupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdNotLike(String value) {
            addCriterion("Cou_CoupletsExisted_id not like", value, "couCoupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdIn(List<String> values) {
            addCriterion("Cou_CoupletsExisted_id in", values, "couCoupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdNotIn(List<String> values) {
            addCriterion("Cou_CoupletsExisted_id not in", values, "couCoupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdBetween(String value1, String value2) {
            addCriterion("Cou_CoupletsExisted_id between", value1, value2, "couCoupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCouCoupletsexistedIdNotBetween(String value1, String value2) {
            addCriterion("Cou_CoupletsExisted_id not between", value1, value2, "couCoupletsexistedId");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleIsNull() {
            addCriterion("CoupletsExisted_title is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleIsNotNull() {
            addCriterion("CoupletsExisted_title is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleEqualTo(String value) {
            addCriterion("CoupletsExisted_title =", value, "coupletsexistedTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleNotEqualTo(String value) {
            addCriterion("CoupletsExisted_title <>", value, "coupletsexistedTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleGreaterThan(String value) {
            addCriterion("CoupletsExisted_title >", value, "coupletsexistedTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsExisted_title >=", value, "coupletsexistedTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleLessThan(String value) {
            addCriterion("CoupletsExisted_title <", value, "coupletsexistedTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleLessThanOrEqualTo(String value) {
            addCriterion("CoupletsExisted_title <=", value, "coupletsexistedTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleLike(String value) {
            addCriterion("CoupletsExisted_title like", value, "coupletsexistedTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleNotLike(String value) {
            addCriterion("CoupletsExisted_title not like", value, "coupletsexistedTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleIn(List<String> values) {
            addCriterion("CoupletsExisted_title in", values, "coupletsexistedTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleNotIn(List<String> values) {
            addCriterion("CoupletsExisted_title not in", values, "coupletsexistedTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleBetween(String value1, String value2) {
            addCriterion("CoupletsExisted_title between", value1, value2, "coupletsexistedTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedTitleNotBetween(String value1, String value2) {
            addCriterion("CoupletsExisted_title not between", value1, value2, "coupletsexistedTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsIsNull() {
            addCriterion("CoupletsExisted_upCouplets is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsIsNotNull() {
            addCriterion("CoupletsExisted_upCouplets is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsEqualTo(String value) {
            addCriterion("CoupletsExisted_upCouplets =", value, "coupletsexistedUpcouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsNotEqualTo(String value) {
            addCriterion("CoupletsExisted_upCouplets <>", value, "coupletsexistedUpcouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsGreaterThan(String value) {
            addCriterion("CoupletsExisted_upCouplets >", value, "coupletsexistedUpcouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsExisted_upCouplets >=", value, "coupletsexistedUpcouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsLessThan(String value) {
            addCriterion("CoupletsExisted_upCouplets <", value, "coupletsexistedUpcouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsLessThanOrEqualTo(String value) {
            addCriterion("CoupletsExisted_upCouplets <=", value, "coupletsexistedUpcouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsLike(String value) {
            addCriterion("CoupletsExisted_upCouplets like", value, "coupletsexistedUpcouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsNotLike(String value) {
            addCriterion("CoupletsExisted_upCouplets not like", value, "coupletsexistedUpcouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsIn(List<String> values) {
            addCriterion("CoupletsExisted_upCouplets in", values, "coupletsexistedUpcouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsNotIn(List<String> values) {
            addCriterion("CoupletsExisted_upCouplets not in", values, "coupletsexistedUpcouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsBetween(String value1, String value2) {
            addCriterion("CoupletsExisted_upCouplets between", value1, value2, "coupletsexistedUpcouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedUpcoupletsNotBetween(String value1, String value2) {
            addCriterion("CoupletsExisted_upCouplets not between", value1, value2, "coupletsexistedUpcouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsIsNull() {
            addCriterion("CoupletsExisted_downCouplets is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsIsNotNull() {
            addCriterion("CoupletsExisted_downCouplets is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsEqualTo(String value) {
            addCriterion("CoupletsExisted_downCouplets =", value, "coupletsexistedDowncouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsNotEqualTo(String value) {
            addCriterion("CoupletsExisted_downCouplets <>", value, "coupletsexistedDowncouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsGreaterThan(String value) {
            addCriterion("CoupletsExisted_downCouplets >", value, "coupletsexistedDowncouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsExisted_downCouplets >=", value, "coupletsexistedDowncouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsLessThan(String value) {
            addCriterion("CoupletsExisted_downCouplets <", value, "coupletsexistedDowncouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsLessThanOrEqualTo(String value) {
            addCriterion("CoupletsExisted_downCouplets <=", value, "coupletsexistedDowncouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsLike(String value) {
            addCriterion("CoupletsExisted_downCouplets like", value, "coupletsexistedDowncouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsNotLike(String value) {
            addCriterion("CoupletsExisted_downCouplets not like", value, "coupletsexistedDowncouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsIn(List<String> values) {
            addCriterion("CoupletsExisted_downCouplets in", values, "coupletsexistedDowncouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsNotIn(List<String> values) {
            addCriterion("CoupletsExisted_downCouplets not in", values, "coupletsexistedDowncouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsBetween(String value1, String value2) {
            addCriterion("CoupletsExisted_downCouplets between", value1, value2, "coupletsexistedDowncouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedDowncoupletsNotBetween(String value1, String value2) {
            addCriterion("CoupletsExisted_downCouplets not between", value1, value2, "coupletsexistedDowncouplets");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedBrosecountIsNull() {
            addCriterion("CoupletsExisted_broseCount is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedBrosecountIsNotNull() {
            addCriterion("CoupletsExisted_broseCount is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedBrosecountEqualTo(Integer value) {
            addCriterion("CoupletsExisted_broseCount =", value, "coupletsexistedBrosecount");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedBrosecountNotEqualTo(Integer value) {
            addCriterion("CoupletsExisted_broseCount <>", value, "coupletsexistedBrosecount");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedBrosecountGreaterThan(Integer value) {
            addCriterion("CoupletsExisted_broseCount >", value, "coupletsexistedBrosecount");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedBrosecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CoupletsExisted_broseCount >=", value, "coupletsexistedBrosecount");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedBrosecountLessThan(Integer value) {
            addCriterion("CoupletsExisted_broseCount <", value, "coupletsexistedBrosecount");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedBrosecountLessThanOrEqualTo(Integer value) {
            addCriterion("CoupletsExisted_broseCount <=", value, "coupletsexistedBrosecount");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedBrosecountIn(List<Integer> values) {
            addCriterion("CoupletsExisted_broseCount in", values, "coupletsexistedBrosecount");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedBrosecountNotIn(List<Integer> values) {
            addCriterion("CoupletsExisted_broseCount not in", values, "coupletsexistedBrosecount");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedBrosecountBetween(Integer value1, Integer value2) {
            addCriterion("CoupletsExisted_broseCount between", value1, value2, "coupletsexistedBrosecount");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedBrosecountNotBetween(Integer value1, Integer value2) {
            addCriterion("CoupletsExisted_broseCount not between", value1, value2, "coupletsexistedBrosecount");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedInputdateIsNull() {
            addCriterion("CoupletsExisted_InputDate is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedInputdateIsNotNull() {
            addCriterion("CoupletsExisted_InputDate is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedInputdateEqualTo(Date value) {
            addCriterionForJDBCDate("CoupletsExisted_InputDate =", value, "coupletsexistedInputdate");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedInputdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CoupletsExisted_InputDate <>", value, "coupletsexistedInputdate");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedInputdateGreaterThan(Date value) {
            addCriterionForJDBCDate("CoupletsExisted_InputDate >", value, "coupletsexistedInputdate");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedInputdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CoupletsExisted_InputDate >=", value, "coupletsexistedInputdate");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedInputdateLessThan(Date value) {
            addCriterionForJDBCDate("CoupletsExisted_InputDate <", value, "coupletsexistedInputdate");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedInputdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CoupletsExisted_InputDate <=", value, "coupletsexistedInputdate");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedInputdateIn(List<Date> values) {
            addCriterionForJDBCDate("CoupletsExisted_InputDate in", values, "coupletsexistedInputdate");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedInputdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CoupletsExisted_InputDate not in", values, "coupletsexistedInputdate");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedInputdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CoupletsExisted_InputDate between", value1, value2, "coupletsexistedInputdate");
            return (Criteria) this;
        }

        public Criteria andCoupletsexistedInputdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CoupletsExisted_InputDate not between", value1, value2, "coupletsexistedInputdate");
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