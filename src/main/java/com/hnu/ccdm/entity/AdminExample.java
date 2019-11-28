package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminUsernameIsNull() {
            addCriterion("admin_UserName is null");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameIsNotNull() {
            addCriterion("admin_UserName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameEqualTo(String value) {
            addCriterion("admin_UserName =", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameNotEqualTo(String value) {
            addCriterion("admin_UserName <>", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameGreaterThan(String value) {
            addCriterion("admin_UserName >", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_UserName >=", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameLessThan(String value) {
            addCriterion("admin_UserName <", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameLessThanOrEqualTo(String value) {
            addCriterion("admin_UserName <=", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameLike(String value) {
            addCriterion("admin_UserName like", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameNotLike(String value) {
            addCriterion("admin_UserName not like", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameIn(List<String> values) {
            addCriterion("admin_UserName in", values, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameNotIn(List<String> values) {
            addCriterion("admin_UserName not in", values, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameBetween(String value1, String value2) {
            addCriterion("admin_UserName between", value1, value2, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameNotBetween(String value1, String value2) {
            addCriterion("admin_UserName not between", value1, value2, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelIsNull() {
            addCriterion("admin_AccessLevel is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelIsNotNull() {
            addCriterion("admin_AccessLevel is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelEqualTo(String value) {
            addCriterion("admin_AccessLevel =", value, "adminAccesslevel");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelNotEqualTo(String value) {
            addCriterion("admin_AccessLevel <>", value, "adminAccesslevel");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelGreaterThan(String value) {
            addCriterion("admin_AccessLevel >", value, "adminAccesslevel");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelGreaterThanOrEqualTo(String value) {
            addCriterion("admin_AccessLevel >=", value, "adminAccesslevel");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelLessThan(String value) {
            addCriterion("admin_AccessLevel <", value, "adminAccesslevel");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelLessThanOrEqualTo(String value) {
            addCriterion("admin_AccessLevel <=", value, "adminAccesslevel");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelLike(String value) {
            addCriterion("admin_AccessLevel like", value, "adminAccesslevel");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelNotLike(String value) {
            addCriterion("admin_AccessLevel not like", value, "adminAccesslevel");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelIn(List<String> values) {
            addCriterion("admin_AccessLevel in", values, "adminAccesslevel");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelNotIn(List<String> values) {
            addCriterion("admin_AccessLevel not in", values, "adminAccesslevel");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelBetween(String value1, String value2) {
            addCriterion("admin_AccessLevel between", value1, value2, "adminAccesslevel");
            return (Criteria) this;
        }

        public Criteria andAdminAccesslevelNotBetween(String value1, String value2) {
            addCriterion("admin_AccessLevel not between", value1, value2, "adminAccesslevel");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoIsNull() {
            addCriterion("admin_AssociationNO is null");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoIsNotNull() {
            addCriterion("admin_AssociationNO is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoEqualTo(String value) {
            addCriterion("admin_AssociationNO =", value, "adminAssociationno");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoNotEqualTo(String value) {
            addCriterion("admin_AssociationNO <>", value, "adminAssociationno");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoGreaterThan(String value) {
            addCriterion("admin_AssociationNO >", value, "adminAssociationno");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoGreaterThanOrEqualTo(String value) {
            addCriterion("admin_AssociationNO >=", value, "adminAssociationno");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoLessThan(String value) {
            addCriterion("admin_AssociationNO <", value, "adminAssociationno");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoLessThanOrEqualTo(String value) {
            addCriterion("admin_AssociationNO <=", value, "adminAssociationno");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoLike(String value) {
            addCriterion("admin_AssociationNO like", value, "adminAssociationno");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoNotLike(String value) {
            addCriterion("admin_AssociationNO not like", value, "adminAssociationno");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoIn(List<String> values) {
            addCriterion("admin_AssociationNO in", values, "adminAssociationno");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoNotIn(List<String> values) {
            addCriterion("admin_AssociationNO not in", values, "adminAssociationno");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoBetween(String value1, String value2) {
            addCriterion("admin_AssociationNO between", value1, value2, "adminAssociationno");
            return (Criteria) this;
        }

        public Criteria andAdminAssociationnoNotBetween(String value1, String value2) {
            addCriterion("admin_AssociationNO not between", value1, value2, "adminAssociationno");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_Name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_Name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_Name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_Name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_Name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_Name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_Name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_Name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_Name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_Name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_Name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_Name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNull() {
            addCriterion("admin_Sex is null");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNotNull() {
            addCriterion("admin_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andAdminSexEqualTo(String value) {
            addCriterion("admin_Sex =", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotEqualTo(String value) {
            addCriterion("admin_Sex <>", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThan(String value) {
            addCriterion("admin_Sex >", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Sex >=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThan(String value) {
            addCriterion("admin_Sex <", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThanOrEqualTo(String value) {
            addCriterion("admin_Sex <=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLike(String value) {
            addCriterion("admin_Sex like", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotLike(String value) {
            addCriterion("admin_Sex not like", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexIn(List<String> values) {
            addCriterion("admin_Sex in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotIn(List<String> values) {
            addCriterion("admin_Sex not in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexBetween(String value1, String value2) {
            addCriterion("admin_Sex between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotBetween(String value1, String value2) {
            addCriterion("admin_Sex not between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminRegionIsNull() {
            addCriterion("admin_Region is null");
            return (Criteria) this;
        }

        public Criteria andAdminRegionIsNotNull() {
            addCriterion("admin_Region is not null");
            return (Criteria) this;
        }

        public Criteria andAdminRegionEqualTo(String value) {
            addCriterion("admin_Region =", value, "adminRegion");
            return (Criteria) this;
        }

        public Criteria andAdminRegionNotEqualTo(String value) {
            addCriterion("admin_Region <>", value, "adminRegion");
            return (Criteria) this;
        }

        public Criteria andAdminRegionGreaterThan(String value) {
            addCriterion("admin_Region >", value, "adminRegion");
            return (Criteria) this;
        }

        public Criteria andAdminRegionGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Region >=", value, "adminRegion");
            return (Criteria) this;
        }

        public Criteria andAdminRegionLessThan(String value) {
            addCriterion("admin_Region <", value, "adminRegion");
            return (Criteria) this;
        }

        public Criteria andAdminRegionLessThanOrEqualTo(String value) {
            addCriterion("admin_Region <=", value, "adminRegion");
            return (Criteria) this;
        }

        public Criteria andAdminRegionLike(String value) {
            addCriterion("admin_Region like", value, "adminRegion");
            return (Criteria) this;
        }

        public Criteria andAdminRegionNotLike(String value) {
            addCriterion("admin_Region not like", value, "adminRegion");
            return (Criteria) this;
        }

        public Criteria andAdminRegionIn(List<String> values) {
            addCriterion("admin_Region in", values, "adminRegion");
            return (Criteria) this;
        }

        public Criteria andAdminRegionNotIn(List<String> values) {
            addCriterion("admin_Region not in", values, "adminRegion");
            return (Criteria) this;
        }

        public Criteria andAdminRegionBetween(String value1, String value2) {
            addCriterion("admin_Region between", value1, value2, "adminRegion");
            return (Criteria) this;
        }

        public Criteria andAdminRegionNotBetween(String value1, String value2) {
            addCriterion("admin_Region not between", value1, value2, "adminRegion");
            return (Criteria) this;
        }

        public Criteria andAdminBirthday2IsNull() {
            addCriterion("admin_Birthday2 is null");
            return (Criteria) this;
        }

        public Criteria andAdminBirthday2IsNotNull() {
            addCriterion("admin_Birthday2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdminBirthday2EqualTo(Date value) {
            addCriterionForJDBCDate("admin_Birthday2 =", value, "adminBirthday2");
            return (Criteria) this;
        }

        public Criteria andAdminBirthday2NotEqualTo(Date value) {
            addCriterionForJDBCDate("admin_Birthday2 <>", value, "adminBirthday2");
            return (Criteria) this;
        }

        public Criteria andAdminBirthday2GreaterThan(Date value) {
            addCriterionForJDBCDate("admin_Birthday2 >", value, "adminBirthday2");
            return (Criteria) this;
        }

        public Criteria andAdminBirthday2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("admin_Birthday2 >=", value, "adminBirthday2");
            return (Criteria) this;
        }

        public Criteria andAdminBirthday2LessThan(Date value) {
            addCriterionForJDBCDate("admin_Birthday2 <", value, "adminBirthday2");
            return (Criteria) this;
        }

        public Criteria andAdminBirthday2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("admin_Birthday2 <=", value, "adminBirthday2");
            return (Criteria) this;
        }

        public Criteria andAdminBirthday2In(List<Date> values) {
            addCriterionForJDBCDate("admin_Birthday2 in", values, "adminBirthday2");
            return (Criteria) this;
        }

        public Criteria andAdminBirthday2NotIn(List<Date> values) {
            addCriterionForJDBCDate("admin_Birthday2 not in", values, "adminBirthday2");
            return (Criteria) this;
        }

        public Criteria andAdminBirthday2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("admin_Birthday2 between", value1, value2, "adminBirthday2");
            return (Criteria) this;
        }

        public Criteria andAdminBirthday2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("admin_Birthday2 not between", value1, value2, "adminBirthday2");
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