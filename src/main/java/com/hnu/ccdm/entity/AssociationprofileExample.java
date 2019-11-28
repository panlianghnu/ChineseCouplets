package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssociationprofileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssociationprofileExample() {
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

        public Criteria andAssociationprofileIdIsNull() {
            addCriterion("AssociationProfile_id is null");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdIsNotNull() {
            addCriterion("AssociationProfile_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdEqualTo(String value) {
            addCriterion("AssociationProfile_id =", value, "associationprofileId");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdNotEqualTo(String value) {
            addCriterion("AssociationProfile_id <>", value, "associationprofileId");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdGreaterThan(String value) {
            addCriterion("AssociationProfile_id >", value, "associationprofileId");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdGreaterThanOrEqualTo(String value) {
            addCriterion("AssociationProfile_id >=", value, "associationprofileId");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdLessThan(String value) {
            addCriterion("AssociationProfile_id <", value, "associationprofileId");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdLessThanOrEqualTo(String value) {
            addCriterion("AssociationProfile_id <=", value, "associationprofileId");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdLike(String value) {
            addCriterion("AssociationProfile_id like", value, "associationprofileId");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdNotLike(String value) {
            addCriterion("AssociationProfile_id not like", value, "associationprofileId");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdIn(List<String> values) {
            addCriterion("AssociationProfile_id in", values, "associationprofileId");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdNotIn(List<String> values) {
            addCriterion("AssociationProfile_id not in", values, "associationprofileId");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdBetween(String value1, String value2) {
            addCriterion("AssociationProfile_id between", value1, value2, "associationprofileId");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileIdNotBetween(String value1, String value2) {
            addCriterion("AssociationProfile_id not between", value1, value2, "associationprofileId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(String value) {
            addCriterion("admin_ID =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(String value) {
            addCriterion("admin_ID <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(String value) {
            addCriterion("admin_ID >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_ID >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(String value) {
            addCriterion("admin_ID <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(String value) {
            addCriterion("admin_ID <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLike(String value) {
            addCriterion("admin_ID like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotLike(String value) {
            addCriterion("admin_ID not like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<String> values) {
            addCriterion("admin_ID in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<String> values) {
            addCriterion("admin_ID not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(String value1, String value2) {
            addCriterion("admin_ID between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(String value1, String value2) {
            addCriterion("admin_ID not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAssociationNoIsNull() {
            addCriterion("association_no is null");
            return (Criteria) this;
        }

        public Criteria andAssociationNoIsNotNull() {
            addCriterion("association_no is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationNoEqualTo(String value) {
            addCriterion("association_no =", value, "associationNo");
            return (Criteria) this;
        }

        public Criteria andAssociationNoNotEqualTo(String value) {
            addCriterion("association_no <>", value, "associationNo");
            return (Criteria) this;
        }

        public Criteria andAssociationNoGreaterThan(String value) {
            addCriterion("association_no >", value, "associationNo");
            return (Criteria) this;
        }

        public Criteria andAssociationNoGreaterThanOrEqualTo(String value) {
            addCriterion("association_no >=", value, "associationNo");
            return (Criteria) this;
        }

        public Criteria andAssociationNoLessThan(String value) {
            addCriterion("association_no <", value, "associationNo");
            return (Criteria) this;
        }

        public Criteria andAssociationNoLessThanOrEqualTo(String value) {
            addCriterion("association_no <=", value, "associationNo");
            return (Criteria) this;
        }

        public Criteria andAssociationNoLike(String value) {
            addCriterion("association_no like", value, "associationNo");
            return (Criteria) this;
        }

        public Criteria andAssociationNoNotLike(String value) {
            addCriterion("association_no not like", value, "associationNo");
            return (Criteria) this;
        }

        public Criteria andAssociationNoIn(List<String> values) {
            addCriterion("association_no in", values, "associationNo");
            return (Criteria) this;
        }

        public Criteria andAssociationNoNotIn(List<String> values) {
            addCriterion("association_no not in", values, "associationNo");
            return (Criteria) this;
        }

        public Criteria andAssociationNoBetween(String value1, String value2) {
            addCriterion("association_no between", value1, value2, "associationNo");
            return (Criteria) this;
        }

        public Criteria andAssociationNoNotBetween(String value1, String value2) {
            addCriterion("association_no not between", value1, value2, "associationNo");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileTimeIsNull() {
            addCriterion("AssociationProfile_time is null");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileTimeIsNotNull() {
            addCriterion("AssociationProfile_time is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileTimeEqualTo(Date value) {
            addCriterion("AssociationProfile_time =", value, "associationprofileTime");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileTimeNotEqualTo(Date value) {
            addCriterion("AssociationProfile_time <>", value, "associationprofileTime");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileTimeGreaterThan(Date value) {
            addCriterion("AssociationProfile_time >", value, "associationprofileTime");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AssociationProfile_time >=", value, "associationprofileTime");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileTimeLessThan(Date value) {
            addCriterion("AssociationProfile_time <", value, "associationprofileTime");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileTimeLessThanOrEqualTo(Date value) {
            addCriterion("AssociationProfile_time <=", value, "associationprofileTime");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileTimeIn(List<Date> values) {
            addCriterion("AssociationProfile_time in", values, "associationprofileTime");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileTimeNotIn(List<Date> values) {
            addCriterion("AssociationProfile_time not in", values, "associationprofileTime");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileTimeBetween(Date value1, Date value2) {
            addCriterion("AssociationProfile_time between", value1, value2, "associationprofileTime");
            return (Criteria) this;
        }

        public Criteria andAssociationprofileTimeNotBetween(Date value1, Date value2) {
            addCriterion("AssociationProfile_time not between", value1, value2, "associationprofileTime");
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