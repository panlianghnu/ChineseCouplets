package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPortraitIsNull() {
            addCriterion("user_Portrait is null");
            return (Criteria) this;
        }

        public Criteria andUserPortraitIsNotNull() {
            addCriterion("user_Portrait is not null");
            return (Criteria) this;
        }

        public Criteria andUserPortraitEqualTo(String value) {
            addCriterion("user_Portrait =", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitNotEqualTo(String value) {
            addCriterion("user_Portrait <>", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitGreaterThan(String value) {
            addCriterion("user_Portrait >", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("user_Portrait >=", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitLessThan(String value) {
            addCriterion("user_Portrait <", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitLessThanOrEqualTo(String value) {
            addCriterion("user_Portrait <=", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitLike(String value) {
            addCriterion("user_Portrait like", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitNotLike(String value) {
            addCriterion("user_Portrait not like", value, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitIn(List<String> values) {
            addCriterion("user_Portrait in", values, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitNotIn(List<String> values) {
            addCriterion("user_Portrait not in", values, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitBetween(String value1, String value2) {
            addCriterion("user_Portrait between", value1, value2, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserPortraitNotBetween(String value1, String value2) {
            addCriterion("user_Portrait not between", value1, value2, "userPortrait");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("user_nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_Name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_Name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_Name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_Name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_Name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_Name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_Name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_Name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_Name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_Name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_Name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_Name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNull() {
            addCriterion("user_Age is null");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNotNull() {
            addCriterion("user_Age is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgeEqualTo(Integer value) {
            addCriterion("user_Age =", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotEqualTo(Integer value) {
            addCriterion("user_Age <>", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThan(Integer value) {
            addCriterion("user_Age >", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_Age >=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThan(Integer value) {
            addCriterion("user_Age <", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThanOrEqualTo(Integer value) {
            addCriterion("user_Age <=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeIn(List<Integer> values) {
            addCriterion("user_Age in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotIn(List<Integer> values) {
            addCriterion("user_Age not in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeBetween(Integer value1, Integer value2) {
            addCriterion("user_Age between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_Age not between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserLocationIsNull() {
            addCriterion("user_location is null");
            return (Criteria) this;
        }

        public Criteria andUserLocationIsNotNull() {
            addCriterion("user_location is not null");
            return (Criteria) this;
        }

        public Criteria andUserLocationEqualTo(String value) {
            addCriterion("user_location =", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationNotEqualTo(String value) {
            addCriterion("user_location <>", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationGreaterThan(String value) {
            addCriterion("user_location >", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationGreaterThanOrEqualTo(String value) {
            addCriterion("user_location >=", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationLessThan(String value) {
            addCriterion("user_location <", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationLessThanOrEqualTo(String value) {
            addCriterion("user_location <=", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationLike(String value) {
            addCriterion("user_location like", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationNotLike(String value) {
            addCriterion("user_location not like", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationIn(List<String> values) {
            addCriterion("user_location in", values, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationNotIn(List<String> values) {
            addCriterion("user_location not in", values, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationBetween(String value1, String value2) {
            addCriterion("user_location between", value1, value2, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationNotBetween(String value1, String value2) {
            addCriterion("user_location not between", value1, value2, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserPlaceIsNull() {
            addCriterion("user_Place is null");
            return (Criteria) this;
        }

        public Criteria andUserPlaceIsNotNull() {
            addCriterion("user_Place is not null");
            return (Criteria) this;
        }

        public Criteria andUserPlaceEqualTo(String value) {
            addCriterion("user_Place =", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceNotEqualTo(String value) {
            addCriterion("user_Place <>", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceGreaterThan(String value) {
            addCriterion("user_Place >", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("user_Place >=", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceLessThan(String value) {
            addCriterion("user_Place <", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceLessThanOrEqualTo(String value) {
            addCriterion("user_Place <=", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceLike(String value) {
            addCriterion("user_Place like", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceNotLike(String value) {
            addCriterion("user_Place not like", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceIn(List<String> values) {
            addCriterion("user_Place in", values, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceNotIn(List<String> values) {
            addCriterion("user_Place not in", values, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceBetween(String value1, String value2) {
            addCriterion("user_Place between", value1, value2, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceNotBetween(String value1, String value2) {
            addCriterion("user_Place not between", value1, value2, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserLabelIsNull() {
            addCriterion("user_Label is null");
            return (Criteria) this;
        }

        public Criteria andUserLabelIsNotNull() {
            addCriterion("user_Label is not null");
            return (Criteria) this;
        }

        public Criteria andUserLabelEqualTo(String value) {
            addCriterion("user_Label =", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelNotEqualTo(String value) {
            addCriterion("user_Label <>", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelGreaterThan(String value) {
            addCriterion("user_Label >", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelGreaterThanOrEqualTo(String value) {
            addCriterion("user_Label >=", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelLessThan(String value) {
            addCriterion("user_Label <", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelLessThanOrEqualTo(String value) {
            addCriterion("user_Label <=", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelLike(String value) {
            addCriterion("user_Label like", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelNotLike(String value) {
            addCriterion("user_Label not like", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelIn(List<String> values) {
            addCriterion("user_Label in", values, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelNotIn(List<String> values) {
            addCriterion("user_Label not in", values, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelBetween(String value1, String value2) {
            addCriterion("user_Label between", value1, value2, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelNotBetween(String value1, String value2) {
            addCriterion("user_Label not between", value1, value2, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNull() {
            addCriterion("user_Number is null");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNotNull() {
            addCriterion("user_Number is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumberEqualTo(String value) {
            addCriterion("user_Number =", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotEqualTo(String value) {
            addCriterion("user_Number <>", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThan(String value) {
            addCriterion("user_Number >", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_Number >=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThan(String value) {
            addCriterion("user_Number <", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThanOrEqualTo(String value) {
            addCriterion("user_Number <=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLike(String value) {
            addCriterion("user_Number like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotLike(String value) {
            addCriterion("user_Number not like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberIn(List<String> values) {
            addCriterion("user_Number in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotIn(List<String> values) {
            addCriterion("user_Number not in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberBetween(String value1, String value2) {
            addCriterion("user_Number between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotBetween(String value1, String value2) {
            addCriterion("user_Number not between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserTimeIsNull() {
            addCriterion("user_Time is null");
            return (Criteria) this;
        }

        public Criteria andUserTimeIsNotNull() {
            addCriterion("user_Time is not null");
            return (Criteria) this;
        }

        public Criteria andUserTimeEqualTo(Date value) {
            addCriterion("user_Time =", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeNotEqualTo(Date value) {
            addCriterion("user_Time <>", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeGreaterThan(Date value) {
            addCriterion("user_Time >", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_Time >=", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeLessThan(Date value) {
            addCriterion("user_Time <", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_Time <=", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeIn(List<Date> values) {
            addCriterion("user_Time in", values, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeNotIn(List<Date> values) {
            addCriterion("user_Time not in", values, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeBetween(Date value1, Date value2) {
            addCriterion("user_Time between", value1, value2, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_Time not between", value1, value2, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserVipIsNull() {
            addCriterion("user_vip is null");
            return (Criteria) this;
        }

        public Criteria andUserVipIsNotNull() {
            addCriterion("user_vip is not null");
            return (Criteria) this;
        }

        public Criteria andUserVipEqualTo(String value) {
            addCriterion("user_vip =", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipNotEqualTo(String value) {
            addCriterion("user_vip <>", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipGreaterThan(String value) {
            addCriterion("user_vip >", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipGreaterThanOrEqualTo(String value) {
            addCriterion("user_vip >=", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipLessThan(String value) {
            addCriterion("user_vip <", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipLessThanOrEqualTo(String value) {
            addCriterion("user_vip <=", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipLike(String value) {
            addCriterion("user_vip like", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipNotLike(String value) {
            addCriterion("user_vip not like", value, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipIn(List<String> values) {
            addCriterion("user_vip in", values, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipNotIn(List<String> values) {
            addCriterion("user_vip not in", values, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipBetween(String value1, String value2) {
            addCriterion("user_vip between", value1, value2, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserVipNotBetween(String value1, String value2) {
            addCriterion("user_vip not between", value1, value2, "userVip");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationIsNull() {
            addCriterion("user_ofAssociation is null");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationIsNotNull() {
            addCriterion("user_ofAssociation is not null");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationEqualTo(String value) {
            addCriterion("user_ofAssociation =", value, "userOfassociation");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationNotEqualTo(String value) {
            addCriterion("user_ofAssociation <>", value, "userOfassociation");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationGreaterThan(String value) {
            addCriterion("user_ofAssociation >", value, "userOfassociation");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationGreaterThanOrEqualTo(String value) {
            addCriterion("user_ofAssociation >=", value, "userOfassociation");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationLessThan(String value) {
            addCriterion("user_ofAssociation <", value, "userOfassociation");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationLessThanOrEqualTo(String value) {
            addCriterion("user_ofAssociation <=", value, "userOfassociation");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationLike(String value) {
            addCriterion("user_ofAssociation like", value, "userOfassociation");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationNotLike(String value) {
            addCriterion("user_ofAssociation not like", value, "userOfassociation");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationIn(List<String> values) {
            addCriterion("user_ofAssociation in", values, "userOfassociation");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationNotIn(List<String> values) {
            addCriterion("user_ofAssociation not in", values, "userOfassociation");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationBetween(String value1, String value2) {
            addCriterion("user_ofAssociation between", value1, value2, "userOfassociation");
            return (Criteria) this;
        }

        public Criteria andUserOfassociationNotBetween(String value1, String value2) {
            addCriterion("user_ofAssociation not between", value1, value2, "userOfassociation");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNull() {
            addCriterion("user_Date is null");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNotNull() {
            addCriterion("user_Date is not null");
            return (Criteria) this;
        }

        public Criteria andUserDateEqualTo(Date value) {
            addCriterionForJDBCDate("user_Date =", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_Date <>", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_Date >", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_Date >=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThan(Date value) {
            addCriterionForJDBCDate("user_Date <", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_Date <=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateIn(List<Date> values) {
            addCriterionForJDBCDate("user_Date in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_Date not in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_Date between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_Date not between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserScoreIsNull() {
            addCriterion("user_score is null");
            return (Criteria) this;
        }

        public Criteria andUserScoreIsNotNull() {
            addCriterion("user_score is not null");
            return (Criteria) this;
        }

        public Criteria andUserScoreEqualTo(Integer value) {
            addCriterion("user_score =", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotEqualTo(Integer value) {
            addCriterion("user_score <>", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreGreaterThan(Integer value) {
            addCriterion("user_score >", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_score >=", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreLessThan(Integer value) {
            addCriterion("user_score <", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreLessThanOrEqualTo(Integer value) {
            addCriterion("user_score <=", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreIn(List<Integer> values) {
            addCriterion("user_score in", values, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotIn(List<Integer> values) {
            addCriterion("user_score not in", values, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreBetween(Integer value1, Integer value2) {
            addCriterion("user_score between", value1, value2, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("user_score not between", value1, value2, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberIsNull() {
            addCriterion("user_honoraryOfMember is null");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberIsNotNull() {
            addCriterion("user_honoraryOfMember is not null");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberEqualTo(String value) {
            addCriterion("user_honoraryOfMember =", value, "userHonoraryofmember");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberNotEqualTo(String value) {
            addCriterion("user_honoraryOfMember <>", value, "userHonoraryofmember");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberGreaterThan(String value) {
            addCriterion("user_honoraryOfMember >", value, "userHonoraryofmember");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberGreaterThanOrEqualTo(String value) {
            addCriterion("user_honoraryOfMember >=", value, "userHonoraryofmember");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberLessThan(String value) {
            addCriterion("user_honoraryOfMember <", value, "userHonoraryofmember");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberLessThanOrEqualTo(String value) {
            addCriterion("user_honoraryOfMember <=", value, "userHonoraryofmember");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberLike(String value) {
            addCriterion("user_honoraryOfMember like", value, "userHonoraryofmember");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberNotLike(String value) {
            addCriterion("user_honoraryOfMember not like", value, "userHonoraryofmember");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberIn(List<String> values) {
            addCriterion("user_honoraryOfMember in", values, "userHonoraryofmember");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberNotIn(List<String> values) {
            addCriterion("user_honoraryOfMember not in", values, "userHonoraryofmember");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberBetween(String value1, String value2) {
            addCriterion("user_honoraryOfMember between", value1, value2, "userHonoraryofmember");
            return (Criteria) this;
        }

        public Criteria andUserHonoraryofmemberNotBetween(String value1, String value2) {
            addCriterion("user_honoraryOfMember not between", value1, value2, "userHonoraryofmember");
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