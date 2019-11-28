package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotificationExample() {
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

        public Criteria andNotificationIdIsNull() {
            addCriterion("notification_id is null");
            return (Criteria) this;
        }

        public Criteria andNotificationIdIsNotNull() {
            addCriterion("notification_id is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationIdEqualTo(String value) {
            addCriterion("notification_id =", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotEqualTo(String value) {
            addCriterion("notification_id <>", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdGreaterThan(String value) {
            addCriterion("notification_id >", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdGreaterThanOrEqualTo(String value) {
            addCriterion("notification_id >=", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdLessThan(String value) {
            addCriterion("notification_id <", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdLessThanOrEqualTo(String value) {
            addCriterion("notification_id <=", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdLike(String value) {
            addCriterion("notification_id like", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotLike(String value) {
            addCriterion("notification_id not like", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdIn(List<String> values) {
            addCriterion("notification_id in", values, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotIn(List<String> values) {
            addCriterion("notification_id not in", values, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdBetween(String value1, String value2) {
            addCriterion("notification_id between", value1, value2, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotBetween(String value1, String value2) {
            addCriterion("notification_id not between", value1, value2, "notificationId");
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

        public Criteria andNotificationTitleIsNull() {
            addCriterion("notification_title is null");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleIsNotNull() {
            addCriterion("notification_title is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleEqualTo(String value) {
            addCriterion("notification_title =", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleNotEqualTo(String value) {
            addCriterion("notification_title <>", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleGreaterThan(String value) {
            addCriterion("notification_title >", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleGreaterThanOrEqualTo(String value) {
            addCriterion("notification_title >=", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleLessThan(String value) {
            addCriterion("notification_title <", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleLessThanOrEqualTo(String value) {
            addCriterion("notification_title <=", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleLike(String value) {
            addCriterion("notification_title like", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleNotLike(String value) {
            addCriterion("notification_title not like", value, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleIn(List<String> values) {
            addCriterion("notification_title in", values, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleNotIn(List<String> values) {
            addCriterion("notification_title not in", values, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleBetween(String value1, String value2) {
            addCriterion("notification_title between", value1, value2, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTitleNotBetween(String value1, String value2) {
            addCriterion("notification_title not between", value1, value2, "notificationTitle");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeIsNull() {
            addCriterion("notification_time is null");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeIsNotNull() {
            addCriterion("notification_time is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeEqualTo(Date value) {
            addCriterion("notification_time =", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeNotEqualTo(Date value) {
            addCriterion("notification_time <>", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeGreaterThan(Date value) {
            addCriterion("notification_time >", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notification_time >=", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeLessThan(Date value) {
            addCriterion("notification_time <", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeLessThanOrEqualTo(Date value) {
            addCriterion("notification_time <=", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeIn(List<Date> values) {
            addCriterion("notification_time in", values, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeNotIn(List<Date> values) {
            addCriterion("notification_time not in", values, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeBetween(Date value1, Date value2) {
            addCriterion("notification_time between", value1, value2, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeNotBetween(Date value1, Date value2) {
            addCriterion("notification_time not between", value1, value2, "notificationTime");
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