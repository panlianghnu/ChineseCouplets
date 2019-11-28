package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AssociationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssociationExample() {
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

        public Criteria andAssociationNameIsNull() {
            addCriterion("association_name is null");
            return (Criteria) this;
        }

        public Criteria andAssociationNameIsNotNull() {
            addCriterion("association_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationNameEqualTo(String value) {
            addCriterion("association_name =", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameNotEqualTo(String value) {
            addCriterion("association_name <>", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameGreaterThan(String value) {
            addCriterion("association_name >", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameGreaterThanOrEqualTo(String value) {
            addCriterion("association_name >=", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameLessThan(String value) {
            addCriterion("association_name <", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameLessThanOrEqualTo(String value) {
            addCriterion("association_name <=", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameLike(String value) {
            addCriterion("association_name like", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameNotLike(String value) {
            addCriterion("association_name not like", value, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameIn(List<String> values) {
            addCriterion("association_name in", values, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameNotIn(List<String> values) {
            addCriterion("association_name not in", values, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameBetween(String value1, String value2) {
            addCriterion("association_name between", value1, value2, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationNameNotBetween(String value1, String value2) {
            addCriterion("association_name not between", value1, value2, "associationName");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationIsNull() {
            addCriterion("association_location is null");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationIsNotNull() {
            addCriterion("association_location is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationEqualTo(String value) {
            addCriterion("association_location =", value, "associationLocation");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationNotEqualTo(String value) {
            addCriterion("association_location <>", value, "associationLocation");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationGreaterThan(String value) {
            addCriterion("association_location >", value, "associationLocation");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationGreaterThanOrEqualTo(String value) {
            addCriterion("association_location >=", value, "associationLocation");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationLessThan(String value) {
            addCriterion("association_location <", value, "associationLocation");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationLessThanOrEqualTo(String value) {
            addCriterion("association_location <=", value, "associationLocation");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationLike(String value) {
            addCriterion("association_location like", value, "associationLocation");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationNotLike(String value) {
            addCriterion("association_location not like", value, "associationLocation");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationIn(List<String> values) {
            addCriterion("association_location in", values, "associationLocation");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationNotIn(List<String> values) {
            addCriterion("association_location not in", values, "associationLocation");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationBetween(String value1, String value2) {
            addCriterion("association_location between", value1, value2, "associationLocation");
            return (Criteria) this;
        }

        public Criteria andAssociationLocationNotBetween(String value1, String value2) {
            addCriterion("association_location not between", value1, value2, "associationLocation");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerIsNull() {
            addCriterion("association_manager is null");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerIsNotNull() {
            addCriterion("association_manager is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerEqualTo(String value) {
            addCriterion("association_manager =", value, "associationManager");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerNotEqualTo(String value) {
            addCriterion("association_manager <>", value, "associationManager");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerGreaterThan(String value) {
            addCriterion("association_manager >", value, "associationManager");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerGreaterThanOrEqualTo(String value) {
            addCriterion("association_manager >=", value, "associationManager");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerLessThan(String value) {
            addCriterion("association_manager <", value, "associationManager");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerLessThanOrEqualTo(String value) {
            addCriterion("association_manager <=", value, "associationManager");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerLike(String value) {
            addCriterion("association_manager like", value, "associationManager");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerNotLike(String value) {
            addCriterion("association_manager not like", value, "associationManager");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerIn(List<String> values) {
            addCriterion("association_manager in", values, "associationManager");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerNotIn(List<String> values) {
            addCriterion("association_manager not in", values, "associationManager");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerBetween(String value1, String value2) {
            addCriterion("association_manager between", value1, value2, "associationManager");
            return (Criteria) this;
        }

        public Criteria andAssociationManagerNotBetween(String value1, String value2) {
            addCriterion("association_manager not between", value1, value2, "associationManager");
            return (Criteria) this;
        }

        public Criteria andAssociationCreatedateIsNull() {
            addCriterion("association_createdate is null");
            return (Criteria) this;
        }

        public Criteria andAssociationCreatedateIsNotNull() {
            addCriterion("association_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("association_createdate =", value, "associationCreatedate");
            return (Criteria) this;
        }

        public Criteria andAssociationCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("association_createdate <>", value, "associationCreatedate");
            return (Criteria) this;
        }

        public Criteria andAssociationCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("association_createdate >", value, "associationCreatedate");
            return (Criteria) this;
        }

        public Criteria andAssociationCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("association_createdate >=", value, "associationCreatedate");
            return (Criteria) this;
        }

        public Criteria andAssociationCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("association_createdate <", value, "associationCreatedate");
            return (Criteria) this;
        }

        public Criteria andAssociationCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("association_createdate <=", value, "associationCreatedate");
            return (Criteria) this;
        }

        public Criteria andAssociationCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("association_createdate in", values, "associationCreatedate");
            return (Criteria) this;
        }

        public Criteria andAssociationCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("association_createdate not in", values, "associationCreatedate");
            return (Criteria) this;
        }

        public Criteria andAssociationCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("association_createdate between", value1, value2, "associationCreatedate");
            return (Criteria) this;
        }

        public Criteria andAssociationCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("association_createdate not between", value1, value2, "associationCreatedate");
            return (Criteria) this;
        }

        public Criteria andAssociationDeletedateIsNull() {
            addCriterion("association_deletedate is null");
            return (Criteria) this;
        }

        public Criteria andAssociationDeletedateIsNotNull() {
            addCriterion("association_deletedate is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationDeletedateEqualTo(Date value) {
            addCriterionForJDBCDate("association_deletedate =", value, "associationDeletedate");
            return (Criteria) this;
        }

        public Criteria andAssociationDeletedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("association_deletedate <>", value, "associationDeletedate");
            return (Criteria) this;
        }

        public Criteria andAssociationDeletedateGreaterThan(Date value) {
            addCriterionForJDBCDate("association_deletedate >", value, "associationDeletedate");
            return (Criteria) this;
        }

        public Criteria andAssociationDeletedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("association_deletedate >=", value, "associationDeletedate");
            return (Criteria) this;
        }

        public Criteria andAssociationDeletedateLessThan(Date value) {
            addCriterionForJDBCDate("association_deletedate <", value, "associationDeletedate");
            return (Criteria) this;
        }

        public Criteria andAssociationDeletedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("association_deletedate <=", value, "associationDeletedate");
            return (Criteria) this;
        }

        public Criteria andAssociationDeletedateIn(List<Date> values) {
            addCriterionForJDBCDate("association_deletedate in", values, "associationDeletedate");
            return (Criteria) this;
        }

        public Criteria andAssociationDeletedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("association_deletedate not in", values, "associationDeletedate");
            return (Criteria) this;
        }

        public Criteria andAssociationDeletedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("association_deletedate between", value1, value2, "associationDeletedate");
            return (Criteria) this;
        }

        public Criteria andAssociationDeletedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("association_deletedate not between", value1, value2, "associationDeletedate");
            return (Criteria) this;
        }

        public Criteria andAssociationVipnumberIsNull() {
            addCriterion("association_vipnumber is null");
            return (Criteria) this;
        }

        public Criteria andAssociationVipnumberIsNotNull() {
            addCriterion("association_vipnumber is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationVipnumberEqualTo(Integer value) {
            addCriterion("association_vipnumber =", value, "associationVipnumber");
            return (Criteria) this;
        }

        public Criteria andAssociationVipnumberNotEqualTo(Integer value) {
            addCriterion("association_vipnumber <>", value, "associationVipnumber");
            return (Criteria) this;
        }

        public Criteria andAssociationVipnumberGreaterThan(Integer value) {
            addCriterion("association_vipnumber >", value, "associationVipnumber");
            return (Criteria) this;
        }

        public Criteria andAssociationVipnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("association_vipnumber >=", value, "associationVipnumber");
            return (Criteria) this;
        }

        public Criteria andAssociationVipnumberLessThan(Integer value) {
            addCriterion("association_vipnumber <", value, "associationVipnumber");
            return (Criteria) this;
        }

        public Criteria andAssociationVipnumberLessThanOrEqualTo(Integer value) {
            addCriterion("association_vipnumber <=", value, "associationVipnumber");
            return (Criteria) this;
        }

        public Criteria andAssociationVipnumberIn(List<Integer> values) {
            addCriterion("association_vipnumber in", values, "associationVipnumber");
            return (Criteria) this;
        }

        public Criteria andAssociationVipnumberNotIn(List<Integer> values) {
            addCriterion("association_vipnumber not in", values, "associationVipnumber");
            return (Criteria) this;
        }

        public Criteria andAssociationVipnumberBetween(Integer value1, Integer value2) {
            addCriterion("association_vipnumber between", value1, value2, "associationVipnumber");
            return (Criteria) this;
        }

        public Criteria andAssociationVipnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("association_vipnumber not between", value1, value2, "associationVipnumber");
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