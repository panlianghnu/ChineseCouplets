package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.List;

public class CoupletsbyuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoupletsbyuserExample() {
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

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdIsNull() {
            addCriterion("CoupletIntro_Id is null");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdIsNotNull() {
            addCriterion("CoupletIntro_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdEqualTo(String value) {
            addCriterion("CoupletIntro_Id =", value, "coupletintroId");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdNotEqualTo(String value) {
            addCriterion("CoupletIntro_Id <>", value, "coupletintroId");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdGreaterThan(String value) {
            addCriterion("CoupletIntro_Id >", value, "coupletintroId");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletIntro_Id >=", value, "coupletintroId");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdLessThan(String value) {
            addCriterion("CoupletIntro_Id <", value, "coupletintroId");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdLessThanOrEqualTo(String value) {
            addCriterion("CoupletIntro_Id <=", value, "coupletintroId");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdLike(String value) {
            addCriterion("CoupletIntro_Id like", value, "coupletintroId");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdNotLike(String value) {
            addCriterion("CoupletIntro_Id not like", value, "coupletintroId");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdIn(List<String> values) {
            addCriterion("CoupletIntro_Id in", values, "coupletintroId");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdNotIn(List<String> values) {
            addCriterion("CoupletIntro_Id not in", values, "coupletintroId");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdBetween(String value1, String value2) {
            addCriterion("CoupletIntro_Id between", value1, value2, "coupletintroId");
            return (Criteria) this;
        }

        public Criteria andCoupletintroIdNotBetween(String value1, String value2) {
            addCriterion("CoupletIntro_Id not between", value1, value2, "coupletintroId");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpIsNull() {
            addCriterion("CoupletsByUser_up is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpIsNotNull() {
            addCriterion("CoupletsByUser_up is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpEqualTo(String value) {
            addCriterion("CoupletsByUser_up =", value, "coupletsbyuserUp");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpNotEqualTo(String value) {
            addCriterion("CoupletsByUser_up <>", value, "coupletsbyuserUp");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpGreaterThan(String value) {
            addCriterion("CoupletsByUser_up >", value, "coupletsbyuserUp");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsByUser_up >=", value, "coupletsbyuserUp");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpLessThan(String value) {
            addCriterion("CoupletsByUser_up <", value, "coupletsbyuserUp");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpLessThanOrEqualTo(String value) {
            addCriterion("CoupletsByUser_up <=", value, "coupletsbyuserUp");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpLike(String value) {
            addCriterion("CoupletsByUser_up like", value, "coupletsbyuserUp");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpNotLike(String value) {
            addCriterion("CoupletsByUser_up not like", value, "coupletsbyuserUp");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpIn(List<String> values) {
            addCriterion("CoupletsByUser_up in", values, "coupletsbyuserUp");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpNotIn(List<String> values) {
            addCriterion("CoupletsByUser_up not in", values, "coupletsbyuserUp");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpBetween(String value1, String value2) {
            addCriterion("CoupletsByUser_up between", value1, value2, "coupletsbyuserUp");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserUpNotBetween(String value1, String value2) {
            addCriterion("CoupletsByUser_up not between", value1, value2, "coupletsbyuserUp");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownIsNull() {
            addCriterion("CoupletsByUser_down is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownIsNotNull() {
            addCriterion("CoupletsByUser_down is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownEqualTo(String value) {
            addCriterion("CoupletsByUser_down =", value, "coupletsbyuserDown");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownNotEqualTo(String value) {
            addCriterion("CoupletsByUser_down <>", value, "coupletsbyuserDown");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownGreaterThan(String value) {
            addCriterion("CoupletsByUser_down >", value, "coupletsbyuserDown");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsByUser_down >=", value, "coupletsbyuserDown");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownLessThan(String value) {
            addCriterion("CoupletsByUser_down <", value, "coupletsbyuserDown");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownLessThanOrEqualTo(String value) {
            addCriterion("CoupletsByUser_down <=", value, "coupletsbyuserDown");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownLike(String value) {
            addCriterion("CoupletsByUser_down like", value, "coupletsbyuserDown");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownNotLike(String value) {
            addCriterion("CoupletsByUser_down not like", value, "coupletsbyuserDown");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownIn(List<String> values) {
            addCriterion("CoupletsByUser_down in", values, "coupletsbyuserDown");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownNotIn(List<String> values) {
            addCriterion("CoupletsByUser_down not in", values, "coupletsbyuserDown");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownBetween(String value1, String value2) {
            addCriterion("CoupletsByUser_down between", value1, value2, "coupletsbyuserDown");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserDownNotBetween(String value1, String value2) {
            addCriterion("CoupletsByUser_down not between", value1, value2, "coupletsbyuserDown");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleIsNull() {
            addCriterion("CoupletsByUser_title is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleIsNotNull() {
            addCriterion("CoupletsByUser_title is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleEqualTo(String value) {
            addCriterion("CoupletsByUser_title =", value, "coupletsbyuserTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleNotEqualTo(String value) {
            addCriterion("CoupletsByUser_title <>", value, "coupletsbyuserTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleGreaterThan(String value) {
            addCriterion("CoupletsByUser_title >", value, "coupletsbyuserTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CoupletsByUser_title >=", value, "coupletsbyuserTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleLessThan(String value) {
            addCriterion("CoupletsByUser_title <", value, "coupletsbyuserTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleLessThanOrEqualTo(String value) {
            addCriterion("CoupletsByUser_title <=", value, "coupletsbyuserTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleLike(String value) {
            addCriterion("CoupletsByUser_title like", value, "coupletsbyuserTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleNotLike(String value) {
            addCriterion("CoupletsByUser_title not like", value, "coupletsbyuserTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleIn(List<String> values) {
            addCriterion("CoupletsByUser_title in", values, "coupletsbyuserTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleNotIn(List<String> values) {
            addCriterion("CoupletsByUser_title not in", values, "coupletsbyuserTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleBetween(String value1, String value2) {
            addCriterion("CoupletsByUser_title between", value1, value2, "coupletsbyuserTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserTitleNotBetween(String value1, String value2) {
            addCriterion("CoupletsByUser_title not between", value1, value2, "coupletsbyuserTitle");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserStatusIsNull() {
            addCriterion("CoupletsByUser_status is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserStatusIsNotNull() {
            addCriterion("CoupletsByUser_status is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserStatusEqualTo(Integer value) {
            addCriterion("CoupletsByUser_status =", value, "coupletsbyuserStatus");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserStatusNotEqualTo(Integer value) {
            addCriterion("CoupletsByUser_status <>", value, "coupletsbyuserStatus");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserStatusGreaterThan(Integer value) {
            addCriterion("CoupletsByUser_status >", value, "coupletsbyuserStatus");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CoupletsByUser_status >=", value, "coupletsbyuserStatus");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserStatusLessThan(Integer value) {
            addCriterion("CoupletsByUser_status <", value, "coupletsbyuserStatus");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("CoupletsByUser_status <=", value, "coupletsbyuserStatus");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserStatusIn(List<Integer> values) {
            addCriterion("CoupletsByUser_status in", values, "coupletsbyuserStatus");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserStatusNotIn(List<Integer> values) {
            addCriterion("CoupletsByUser_status not in", values, "coupletsbyuserStatus");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserStatusBetween(Integer value1, Integer value2) {
            addCriterion("CoupletsByUser_status between", value1, value2, "coupletsbyuserStatus");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CoupletsByUser_status not between", value1, value2, "coupletsbyuserStatus");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserViewcountIsNull() {
            addCriterion("CoupletsByUser_ViewCount is null");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserViewcountIsNotNull() {
            addCriterion("CoupletsByUser_ViewCount is not null");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserViewcountEqualTo(Integer value) {
            addCriterion("CoupletsByUser_ViewCount =", value, "coupletsbyuserViewcount");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserViewcountNotEqualTo(Integer value) {
            addCriterion("CoupletsByUser_ViewCount <>", value, "coupletsbyuserViewcount");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserViewcountGreaterThan(Integer value) {
            addCriterion("CoupletsByUser_ViewCount >", value, "coupletsbyuserViewcount");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserViewcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CoupletsByUser_ViewCount >=", value, "coupletsbyuserViewcount");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserViewcountLessThan(Integer value) {
            addCriterion("CoupletsByUser_ViewCount <", value, "coupletsbyuserViewcount");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserViewcountLessThanOrEqualTo(Integer value) {
            addCriterion("CoupletsByUser_ViewCount <=", value, "coupletsbyuserViewcount");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserViewcountIn(List<Integer> values) {
            addCriterion("CoupletsByUser_ViewCount in", values, "coupletsbyuserViewcount");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserViewcountNotIn(List<Integer> values) {
            addCriterion("CoupletsByUser_ViewCount not in", values, "coupletsbyuserViewcount");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserViewcountBetween(Integer value1, Integer value2) {
            addCriterion("CoupletsByUser_ViewCount between", value1, value2, "coupletsbyuserViewcount");
            return (Criteria) this;
        }

        public Criteria andCoupletsbyuserViewcountNotBetween(Integer value1, Integer value2) {
            addCriterion("CoupletsByUser_ViewCount not between", value1, value2, "coupletsbyuserViewcount");
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