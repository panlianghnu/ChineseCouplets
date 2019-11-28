package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Collection1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Collection1Example() {
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

        public Criteria andCollectionIdIsNull() {
            addCriterion("collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNotNull() {
            addCriterion("collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdEqualTo(String value) {
            addCriterion("collection_id =", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotEqualTo(String value) {
            addCriterion("collection_id <>", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThan(String value) {
            addCriterion("collection_id >", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThanOrEqualTo(String value) {
            addCriterion("collection_id >=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThan(String value) {
            addCriterion("collection_id <", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThanOrEqualTo(String value) {
            addCriterion("collection_id <=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLike(String value) {
            addCriterion("collection_id like", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotLike(String value) {
            addCriterion("collection_id not like", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIn(List<String> values) {
            addCriterion("collection_id in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotIn(List<String> values) {
            addCriterion("collection_id not in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdBetween(String value1, String value2) {
            addCriterion("collection_id between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotBetween(String value1, String value2) {
            addCriterion("collection_id not between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountIsNull() {
            addCriterion("collection_postaccount is null");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountIsNotNull() {
            addCriterion("collection_postaccount is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountEqualTo(String value) {
            addCriterion("collection_postaccount =", value, "collectionPostaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountNotEqualTo(String value) {
            addCriterion("collection_postaccount <>", value, "collectionPostaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountGreaterThan(String value) {
            addCriterion("collection_postaccount >", value, "collectionPostaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountGreaterThanOrEqualTo(String value) {
            addCriterion("collection_postaccount >=", value, "collectionPostaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountLessThan(String value) {
            addCriterion("collection_postaccount <", value, "collectionPostaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountLessThanOrEqualTo(String value) {
            addCriterion("collection_postaccount <=", value, "collectionPostaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountLike(String value) {
            addCriterion("collection_postaccount like", value, "collectionPostaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountNotLike(String value) {
            addCriterion("collection_postaccount not like", value, "collectionPostaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountIn(List<String> values) {
            addCriterion("collection_postaccount in", values, "collectionPostaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountNotIn(List<String> values) {
            addCriterion("collection_postaccount not in", values, "collectionPostaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountBetween(String value1, String value2) {
            addCriterion("collection_postaccount between", value1, value2, "collectionPostaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionPostaccountNotBetween(String value1, String value2) {
            addCriterion("collection_postaccount not between", value1, value2, "collectionPostaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionPostsidIsNull() {
            addCriterion("collection_postsid is null");
            return (Criteria) this;
        }

        public Criteria andCollectionPostsidIsNotNull() {
            addCriterion("collection_postsid is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionPostsidEqualTo(Integer value) {
            addCriterion("collection_postsid =", value, "collectionPostsid");
            return (Criteria) this;
        }

        public Criteria andCollectionPostsidNotEqualTo(Integer value) {
            addCriterion("collection_postsid <>", value, "collectionPostsid");
            return (Criteria) this;
        }

        public Criteria andCollectionPostsidGreaterThan(Integer value) {
            addCriterion("collection_postsid >", value, "collectionPostsid");
            return (Criteria) this;
        }

        public Criteria andCollectionPostsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_postsid >=", value, "collectionPostsid");
            return (Criteria) this;
        }

        public Criteria andCollectionPostsidLessThan(Integer value) {
            addCriterion("collection_postsid <", value, "collectionPostsid");
            return (Criteria) this;
        }

        public Criteria andCollectionPostsidLessThanOrEqualTo(Integer value) {
            addCriterion("collection_postsid <=", value, "collectionPostsid");
            return (Criteria) this;
        }

        public Criteria andCollectionPostsidIn(List<Integer> values) {
            addCriterion("collection_postsid in", values, "collectionPostsid");
            return (Criteria) this;
        }

        public Criteria andCollectionPostsidNotIn(List<Integer> values) {
            addCriterion("collection_postsid not in", values, "collectionPostsid");
            return (Criteria) this;
        }

        public Criteria andCollectionPostsidBetween(Integer value1, Integer value2) {
            addCriterion("collection_postsid between", value1, value2, "collectionPostsid");
            return (Criteria) this;
        }

        public Criteria andCollectionPostsidNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_postsid not between", value1, value2, "collectionPostsid");
            return (Criteria) this;
        }

        public Criteria andCollectionCollectdateIsNull() {
            addCriterion("collection_collectdate is null");
            return (Criteria) this;
        }

        public Criteria andCollectionCollectdateIsNotNull() {
            addCriterion("collection_collectdate is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionCollectdateEqualTo(Date value) {
            addCriterion("collection_collectdate =", value, "collectionCollectdate");
            return (Criteria) this;
        }

        public Criteria andCollectionCollectdateNotEqualTo(Date value) {
            addCriterion("collection_collectdate <>", value, "collectionCollectdate");
            return (Criteria) this;
        }

        public Criteria andCollectionCollectdateGreaterThan(Date value) {
            addCriterion("collection_collectdate >", value, "collectionCollectdate");
            return (Criteria) this;
        }

        public Criteria andCollectionCollectdateGreaterThanOrEqualTo(Date value) {
            addCriterion("collection_collectdate >=", value, "collectionCollectdate");
            return (Criteria) this;
        }

        public Criteria andCollectionCollectdateLessThan(Date value) {
            addCriterion("collection_collectdate <", value, "collectionCollectdate");
            return (Criteria) this;
        }

        public Criteria andCollectionCollectdateLessThanOrEqualTo(Date value) {
            addCriterion("collection_collectdate <=", value, "collectionCollectdate");
            return (Criteria) this;
        }

        public Criteria andCollectionCollectdateIn(List<Date> values) {
            addCriterion("collection_collectdate in", values, "collectionCollectdate");
            return (Criteria) this;
        }

        public Criteria andCollectionCollectdateNotIn(List<Date> values) {
            addCriterion("collection_collectdate not in", values, "collectionCollectdate");
            return (Criteria) this;
        }

        public Criteria andCollectionCollectdateBetween(Date value1, Date value2) {
            addCriterion("collection_collectdate between", value1, value2, "collectionCollectdate");
            return (Criteria) this;
        }

        public Criteria andCollectionCollectdateNotBetween(Date value1, Date value2) {
            addCriterion("collection_collectdate not between", value1, value2, "collectionCollectdate");
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