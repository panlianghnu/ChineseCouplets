package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DraftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DraftExample() {
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

        public Criteria andDraftNoIsNull() {
            addCriterion("draft_No is null");
            return (Criteria) this;
        }

        public Criteria andDraftNoIsNotNull() {
            addCriterion("draft_No is not null");
            return (Criteria) this;
        }

        public Criteria andDraftNoEqualTo(String value) {
            addCriterion("draft_No =", value, "draftNo");
            return (Criteria) this;
        }

        public Criteria andDraftNoNotEqualTo(String value) {
            addCriterion("draft_No <>", value, "draftNo");
            return (Criteria) this;
        }

        public Criteria andDraftNoGreaterThan(String value) {
            addCriterion("draft_No >", value, "draftNo");
            return (Criteria) this;
        }

        public Criteria andDraftNoGreaterThanOrEqualTo(String value) {
            addCriterion("draft_No >=", value, "draftNo");
            return (Criteria) this;
        }

        public Criteria andDraftNoLessThan(String value) {
            addCriterion("draft_No <", value, "draftNo");
            return (Criteria) this;
        }

        public Criteria andDraftNoLessThanOrEqualTo(String value) {
            addCriterion("draft_No <=", value, "draftNo");
            return (Criteria) this;
        }

        public Criteria andDraftNoLike(String value) {
            addCriterion("draft_No like", value, "draftNo");
            return (Criteria) this;
        }

        public Criteria andDraftNoNotLike(String value) {
            addCriterion("draft_No not like", value, "draftNo");
            return (Criteria) this;
        }

        public Criteria andDraftNoIn(List<String> values) {
            addCriterion("draft_No in", values, "draftNo");
            return (Criteria) this;
        }

        public Criteria andDraftNoNotIn(List<String> values) {
            addCriterion("draft_No not in", values, "draftNo");
            return (Criteria) this;
        }

        public Criteria andDraftNoBetween(String value1, String value2) {
            addCriterion("draft_No between", value1, value2, "draftNo");
            return (Criteria) this;
        }

        public Criteria andDraftNoNotBetween(String value1, String value2) {
            addCriterion("draft_No not between", value1, value2, "draftNo");
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

        public Criteria andDraftAuthorIsNull() {
            addCriterion("draft_Author is null");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorIsNotNull() {
            addCriterion("draft_Author is not null");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorEqualTo(String value) {
            addCriterion("draft_Author =", value, "draftAuthor");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorNotEqualTo(String value) {
            addCriterion("draft_Author <>", value, "draftAuthor");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorGreaterThan(String value) {
            addCriterion("draft_Author >", value, "draftAuthor");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("draft_Author >=", value, "draftAuthor");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorLessThan(String value) {
            addCriterion("draft_Author <", value, "draftAuthor");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorLessThanOrEqualTo(String value) {
            addCriterion("draft_Author <=", value, "draftAuthor");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorLike(String value) {
            addCriterion("draft_Author like", value, "draftAuthor");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorNotLike(String value) {
            addCriterion("draft_Author not like", value, "draftAuthor");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorIn(List<String> values) {
            addCriterion("draft_Author in", values, "draftAuthor");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorNotIn(List<String> values) {
            addCriterion("draft_Author not in", values, "draftAuthor");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorBetween(String value1, String value2) {
            addCriterion("draft_Author between", value1, value2, "draftAuthor");
            return (Criteria) this;
        }

        public Criteria andDraftAuthorNotBetween(String value1, String value2) {
            addCriterion("draft_Author not between", value1, value2, "draftAuthor");
            return (Criteria) this;
        }

        public Criteria andDraftTimeIsNull() {
            addCriterion("draft_Time is null");
            return (Criteria) this;
        }

        public Criteria andDraftTimeIsNotNull() {
            addCriterion("draft_Time is not null");
            return (Criteria) this;
        }

        public Criteria andDraftTimeEqualTo(Date value) {
            addCriterion("draft_Time =", value, "draftTime");
            return (Criteria) this;
        }

        public Criteria andDraftTimeNotEqualTo(Date value) {
            addCriterion("draft_Time <>", value, "draftTime");
            return (Criteria) this;
        }

        public Criteria andDraftTimeGreaterThan(Date value) {
            addCriterion("draft_Time >", value, "draftTime");
            return (Criteria) this;
        }

        public Criteria andDraftTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("draft_Time >=", value, "draftTime");
            return (Criteria) this;
        }

        public Criteria andDraftTimeLessThan(Date value) {
            addCriterion("draft_Time <", value, "draftTime");
            return (Criteria) this;
        }

        public Criteria andDraftTimeLessThanOrEqualTo(Date value) {
            addCriterion("draft_Time <=", value, "draftTime");
            return (Criteria) this;
        }

        public Criteria andDraftTimeIn(List<Date> values) {
            addCriterion("draft_Time in", values, "draftTime");
            return (Criteria) this;
        }

        public Criteria andDraftTimeNotIn(List<Date> values) {
            addCriterion("draft_Time not in", values, "draftTime");
            return (Criteria) this;
        }

        public Criteria andDraftTimeBetween(Date value1, Date value2) {
            addCriterion("draft_Time between", value1, value2, "draftTime");
            return (Criteria) this;
        }

        public Criteria andDraftTimeNotBetween(Date value1, Date value2) {
            addCriterion("draft_Time not between", value1, value2, "draftTime");
            return (Criteria) this;
        }

        public Criteria andDraftTypeIsNull() {
            addCriterion("draft_Type is null");
            return (Criteria) this;
        }

        public Criteria andDraftTypeIsNotNull() {
            addCriterion("draft_Type is not null");
            return (Criteria) this;
        }

        public Criteria andDraftTypeEqualTo(String value) {
            addCriterion("draft_Type =", value, "draftType");
            return (Criteria) this;
        }

        public Criteria andDraftTypeNotEqualTo(String value) {
            addCriterion("draft_Type <>", value, "draftType");
            return (Criteria) this;
        }

        public Criteria andDraftTypeGreaterThan(String value) {
            addCriterion("draft_Type >", value, "draftType");
            return (Criteria) this;
        }

        public Criteria andDraftTypeGreaterThanOrEqualTo(String value) {
            addCriterion("draft_Type >=", value, "draftType");
            return (Criteria) this;
        }

        public Criteria andDraftTypeLessThan(String value) {
            addCriterion("draft_Type <", value, "draftType");
            return (Criteria) this;
        }

        public Criteria andDraftTypeLessThanOrEqualTo(String value) {
            addCriterion("draft_Type <=", value, "draftType");
            return (Criteria) this;
        }

        public Criteria andDraftTypeLike(String value) {
            addCriterion("draft_Type like", value, "draftType");
            return (Criteria) this;
        }

        public Criteria andDraftTypeNotLike(String value) {
            addCriterion("draft_Type not like", value, "draftType");
            return (Criteria) this;
        }

        public Criteria andDraftTypeIn(List<String> values) {
            addCriterion("draft_Type in", values, "draftType");
            return (Criteria) this;
        }

        public Criteria andDraftTypeNotIn(List<String> values) {
            addCriterion("draft_Type not in", values, "draftType");
            return (Criteria) this;
        }

        public Criteria andDraftTypeBetween(String value1, String value2) {
            addCriterion("draft_Type between", value1, value2, "draftType");
            return (Criteria) this;
        }

        public Criteria andDraftTypeNotBetween(String value1, String value2) {
            addCriterion("draft_Type not between", value1, value2, "draftType");
            return (Criteria) this;
        }

        public Criteria andDraftTitleIsNull() {
            addCriterion("draft_Title is null");
            return (Criteria) this;
        }

        public Criteria andDraftTitleIsNotNull() {
            addCriterion("draft_Title is not null");
            return (Criteria) this;
        }

        public Criteria andDraftTitleEqualTo(String value) {
            addCriterion("draft_Title =", value, "draftTitle");
            return (Criteria) this;
        }

        public Criteria andDraftTitleNotEqualTo(String value) {
            addCriterion("draft_Title <>", value, "draftTitle");
            return (Criteria) this;
        }

        public Criteria andDraftTitleGreaterThan(String value) {
            addCriterion("draft_Title >", value, "draftTitle");
            return (Criteria) this;
        }

        public Criteria andDraftTitleGreaterThanOrEqualTo(String value) {
            addCriterion("draft_Title >=", value, "draftTitle");
            return (Criteria) this;
        }

        public Criteria andDraftTitleLessThan(String value) {
            addCriterion("draft_Title <", value, "draftTitle");
            return (Criteria) this;
        }

        public Criteria andDraftTitleLessThanOrEqualTo(String value) {
            addCriterion("draft_Title <=", value, "draftTitle");
            return (Criteria) this;
        }

        public Criteria andDraftTitleLike(String value) {
            addCriterion("draft_Title like", value, "draftTitle");
            return (Criteria) this;
        }

        public Criteria andDraftTitleNotLike(String value) {
            addCriterion("draft_Title not like", value, "draftTitle");
            return (Criteria) this;
        }

        public Criteria andDraftTitleIn(List<String> values) {
            addCriterion("draft_Title in", values, "draftTitle");
            return (Criteria) this;
        }

        public Criteria andDraftTitleNotIn(List<String> values) {
            addCriterion("draft_Title not in", values, "draftTitle");
            return (Criteria) this;
        }

        public Criteria andDraftTitleBetween(String value1, String value2) {
            addCriterion("draft_Title between", value1, value2, "draftTitle");
            return (Criteria) this;
        }

        public Criteria andDraftTitleNotBetween(String value1, String value2) {
            addCriterion("draft_Title not between", value1, value2, "draftTitle");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureIsNull() {
            addCriterion("draft_Enclosure is null");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureIsNotNull() {
            addCriterion("draft_Enclosure is not null");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureEqualTo(String value) {
            addCriterion("draft_Enclosure =", value, "draftEnclosure");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureNotEqualTo(String value) {
            addCriterion("draft_Enclosure <>", value, "draftEnclosure");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureGreaterThan(String value) {
            addCriterion("draft_Enclosure >", value, "draftEnclosure");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureGreaterThanOrEqualTo(String value) {
            addCriterion("draft_Enclosure >=", value, "draftEnclosure");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureLessThan(String value) {
            addCriterion("draft_Enclosure <", value, "draftEnclosure");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureLessThanOrEqualTo(String value) {
            addCriterion("draft_Enclosure <=", value, "draftEnclosure");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureLike(String value) {
            addCriterion("draft_Enclosure like", value, "draftEnclosure");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureNotLike(String value) {
            addCriterion("draft_Enclosure not like", value, "draftEnclosure");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureIn(List<String> values) {
            addCriterion("draft_Enclosure in", values, "draftEnclosure");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureNotIn(List<String> values) {
            addCriterion("draft_Enclosure not in", values, "draftEnclosure");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureBetween(String value1, String value2) {
            addCriterion("draft_Enclosure between", value1, value2, "draftEnclosure");
            return (Criteria) this;
        }

        public Criteria andDraftEnclosureNotBetween(String value1, String value2) {
            addCriterion("draft_Enclosure not between", value1, value2, "draftEnclosure");
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