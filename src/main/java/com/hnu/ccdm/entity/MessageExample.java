package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMessageMessageidIsNull() {
            addCriterion("message_messageid is null");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidIsNotNull() {
            addCriterion("message_messageid is not null");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidEqualTo(String value) {
            addCriterion("message_messageid =", value, "messageMessageid");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidNotEqualTo(String value) {
            addCriterion("message_messageid <>", value, "messageMessageid");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidGreaterThan(String value) {
            addCriterion("message_messageid >", value, "messageMessageid");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidGreaterThanOrEqualTo(String value) {
            addCriterion("message_messageid >=", value, "messageMessageid");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidLessThan(String value) {
            addCriterion("message_messageid <", value, "messageMessageid");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidLessThanOrEqualTo(String value) {
            addCriterion("message_messageid <=", value, "messageMessageid");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidLike(String value) {
            addCriterion("message_messageid like", value, "messageMessageid");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidNotLike(String value) {
            addCriterion("message_messageid not like", value, "messageMessageid");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidIn(List<String> values) {
            addCriterion("message_messageid in", values, "messageMessageid");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidNotIn(List<String> values) {
            addCriterion("message_messageid not in", values, "messageMessageid");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidBetween(String value1, String value2) {
            addCriterion("message_messageid between", value1, value2, "messageMessageid");
            return (Criteria) this;
        }

        public Criteria andMessageMessageidNotBetween(String value1, String value2) {
            addCriterion("message_messageid not between", value1, value2, "messageMessageid");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNull() {
            addCriterion("message_title is null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNotNull() {
            addCriterion("message_title is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleEqualTo(String value) {
            addCriterion("message_title =", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotEqualTo(String value) {
            addCriterion("message_title <>", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThan(String value) {
            addCriterion("message_title >", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("message_title >=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThan(String value) {
            addCriterion("message_title <", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThanOrEqualTo(String value) {
            addCriterion("message_title <=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLike(String value) {
            addCriterion("message_title like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotLike(String value) {
            addCriterion("message_title not like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIn(List<String> values) {
            addCriterion("message_title in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotIn(List<String> values) {
            addCriterion("message_title not in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleBetween(String value1, String value2) {
            addCriterion("message_title between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotBetween(String value1, String value2) {
            addCriterion("message_title not between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridIsNull() {
            addCriterion("message_receiverid is null");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridIsNotNull() {
            addCriterion("message_receiverid is not null");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridEqualTo(String value) {
            addCriterion("message_receiverid =", value, "messageReceiverid");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridNotEqualTo(String value) {
            addCriterion("message_receiverid <>", value, "messageReceiverid");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridGreaterThan(String value) {
            addCriterion("message_receiverid >", value, "messageReceiverid");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridGreaterThanOrEqualTo(String value) {
            addCriterion("message_receiverid >=", value, "messageReceiverid");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridLessThan(String value) {
            addCriterion("message_receiverid <", value, "messageReceiverid");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridLessThanOrEqualTo(String value) {
            addCriterion("message_receiverid <=", value, "messageReceiverid");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridLike(String value) {
            addCriterion("message_receiverid like", value, "messageReceiverid");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridNotLike(String value) {
            addCriterion("message_receiverid not like", value, "messageReceiverid");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridIn(List<String> values) {
            addCriterion("message_receiverid in", values, "messageReceiverid");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridNotIn(List<String> values) {
            addCriterion("message_receiverid not in", values, "messageReceiverid");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridBetween(String value1, String value2) {
            addCriterion("message_receiverid between", value1, value2, "messageReceiverid");
            return (Criteria) this;
        }

        public Criteria andMessageReceiveridNotBetween(String value1, String value2) {
            addCriterion("message_receiverid not between", value1, value2, "messageReceiverid");
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

        public Criteria andMessageSenderidIsNull() {
            addCriterion("message_senderid is null");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidIsNotNull() {
            addCriterion("message_senderid is not null");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidEqualTo(String value) {
            addCriterion("message_senderid =", value, "messageSenderid");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidNotEqualTo(String value) {
            addCriterion("message_senderid <>", value, "messageSenderid");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidGreaterThan(String value) {
            addCriterion("message_senderid >", value, "messageSenderid");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidGreaterThanOrEqualTo(String value) {
            addCriterion("message_senderid >=", value, "messageSenderid");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidLessThan(String value) {
            addCriterion("message_senderid <", value, "messageSenderid");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidLessThanOrEqualTo(String value) {
            addCriterion("message_senderid <=", value, "messageSenderid");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidLike(String value) {
            addCriterion("message_senderid like", value, "messageSenderid");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidNotLike(String value) {
            addCriterion("message_senderid not like", value, "messageSenderid");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidIn(List<String> values) {
            addCriterion("message_senderid in", values, "messageSenderid");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidNotIn(List<String> values) {
            addCriterion("message_senderid not in", values, "messageSenderid");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidBetween(String value1, String value2) {
            addCriterion("message_senderid between", value1, value2, "messageSenderid");
            return (Criteria) this;
        }

        public Criteria andMessageSenderidNotBetween(String value1, String value2) {
            addCriterion("message_senderid not between", value1, value2, "messageSenderid");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNull() {
            addCriterion("message_time is null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNotNull() {
            addCriterion("message_time is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeEqualTo(Date value) {
            addCriterion("message_time =", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotEqualTo(Date value) {
            addCriterion("message_time <>", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThan(Date value) {
            addCriterion("message_time >", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("message_time >=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThan(Date value) {
            addCriterion("message_time <", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThanOrEqualTo(Date value) {
            addCriterion("message_time <=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIn(List<Date> values) {
            addCriterion("message_time in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotIn(List<Date> values) {
            addCriterion("message_time not in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeBetween(Date value1, Date value2) {
            addCriterion("message_time between", value1, value2, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotBetween(Date value1, Date value2) {
            addCriterion("message_time not between", value1, value2, "messageTime");
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