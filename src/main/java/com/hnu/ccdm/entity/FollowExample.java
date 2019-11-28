package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowExample() {
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

        public Criteria andFollowFollowedaccountIsNull() {
            addCriterion("follow_followedaccount is null");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountIsNotNull() {
            addCriterion("follow_followedaccount is not null");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountEqualTo(String value) {
            addCriterion("follow_followedaccount =", value, "followFollowedaccount");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountNotEqualTo(String value) {
            addCriterion("follow_followedaccount <>", value, "followFollowedaccount");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountGreaterThan(String value) {
            addCriterion("follow_followedaccount >", value, "followFollowedaccount");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountGreaterThanOrEqualTo(String value) {
            addCriterion("follow_followedaccount >=", value, "followFollowedaccount");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountLessThan(String value) {
            addCriterion("follow_followedaccount <", value, "followFollowedaccount");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountLessThanOrEqualTo(String value) {
            addCriterion("follow_followedaccount <=", value, "followFollowedaccount");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountLike(String value) {
            addCriterion("follow_followedaccount like", value, "followFollowedaccount");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountNotLike(String value) {
            addCriterion("follow_followedaccount not like", value, "followFollowedaccount");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountIn(List<String> values) {
            addCriterion("follow_followedaccount in", values, "followFollowedaccount");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountNotIn(List<String> values) {
            addCriterion("follow_followedaccount not in", values, "followFollowedaccount");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountBetween(String value1, String value2) {
            addCriterion("follow_followedaccount between", value1, value2, "followFollowedaccount");
            return (Criteria) this;
        }

        public Criteria andFollowFollowedaccountNotBetween(String value1, String value2) {
            addCriterion("follow_followedaccount not between", value1, value2, "followFollowedaccount");
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

        public Criteria andFollowFollowtimeIsNull() {
            addCriterion("follow_followtime is null");
            return (Criteria) this;
        }

        public Criteria andFollowFollowtimeIsNotNull() {
            addCriterion("follow_followtime is not null");
            return (Criteria) this;
        }

        public Criteria andFollowFollowtimeEqualTo(Date value) {
            addCriterion("follow_followtime =", value, "followFollowtime");
            return (Criteria) this;
        }

        public Criteria andFollowFollowtimeNotEqualTo(Date value) {
            addCriterion("follow_followtime <>", value, "followFollowtime");
            return (Criteria) this;
        }

        public Criteria andFollowFollowtimeGreaterThan(Date value) {
            addCriterion("follow_followtime >", value, "followFollowtime");
            return (Criteria) this;
        }

        public Criteria andFollowFollowtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("follow_followtime >=", value, "followFollowtime");
            return (Criteria) this;
        }

        public Criteria andFollowFollowtimeLessThan(Date value) {
            addCriterion("follow_followtime <", value, "followFollowtime");
            return (Criteria) this;
        }

        public Criteria andFollowFollowtimeLessThanOrEqualTo(Date value) {
            addCriterion("follow_followtime <=", value, "followFollowtime");
            return (Criteria) this;
        }

        public Criteria andFollowFollowtimeIn(List<Date> values) {
            addCriterion("follow_followtime in", values, "followFollowtime");
            return (Criteria) this;
        }

        public Criteria andFollowFollowtimeNotIn(List<Date> values) {
            addCriterion("follow_followtime not in", values, "followFollowtime");
            return (Criteria) this;
        }

        public Criteria andFollowFollowtimeBetween(Date value1, Date value2) {
            addCriterion("follow_followtime between", value1, value2, "followFollowtime");
            return (Criteria) this;
        }

        public Criteria andFollowFollowtimeNotBetween(Date value1, Date value2) {
            addCriterion("follow_followtime not between", value1, value2, "followFollowtime");
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