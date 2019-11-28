package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassificationExample() {
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

        public Criteria andClassificationClassificationidIsNull() {
            addCriterion("Classification_classificationId is null");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidIsNotNull() {
            addCriterion("Classification_classificationId is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidEqualTo(String value) {
            addCriterion("Classification_classificationId =", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidNotEqualTo(String value) {
            addCriterion("Classification_classificationId <>", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidGreaterThan(String value) {
            addCriterion("Classification_classificationId >", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidGreaterThanOrEqualTo(String value) {
            addCriterion("Classification_classificationId >=", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidLessThan(String value) {
            addCriterion("Classification_classificationId <", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidLessThanOrEqualTo(String value) {
            addCriterion("Classification_classificationId <=", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidLike(String value) {
            addCriterion("Classification_classificationId like", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidNotLike(String value) {
            addCriterion("Classification_classificationId not like", value, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidIn(List<String> values) {
            addCriterion("Classification_classificationId in", values, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidNotIn(List<String> values) {
            addCriterion("Classification_classificationId not in", values, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidBetween(String value1, String value2) {
            addCriterion("Classification_classificationId between", value1, value2, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationidNotBetween(String value1, String value2) {
            addCriterion("Classification_classificationId not between", value1, value2, "classificationClassificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameIsNull() {
            addCriterion("Classification_classificationName is null");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameIsNotNull() {
            addCriterion("Classification_classificationName is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameEqualTo(String value) {
            addCriterion("Classification_classificationName =", value, "classificationClassificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameNotEqualTo(String value) {
            addCriterion("Classification_classificationName <>", value, "classificationClassificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameGreaterThan(String value) {
            addCriterion("Classification_classificationName >", value, "classificationClassificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameGreaterThanOrEqualTo(String value) {
            addCriterion("Classification_classificationName >=", value, "classificationClassificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameLessThan(String value) {
            addCriterion("Classification_classificationName <", value, "classificationClassificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameLessThanOrEqualTo(String value) {
            addCriterion("Classification_classificationName <=", value, "classificationClassificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameLike(String value) {
            addCriterion("Classification_classificationName like", value, "classificationClassificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameNotLike(String value) {
            addCriterion("Classification_classificationName not like", value, "classificationClassificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameIn(List<String> values) {
            addCriterion("Classification_classificationName in", values, "classificationClassificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameNotIn(List<String> values) {
            addCriterion("Classification_classificationName not in", values, "classificationClassificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameBetween(String value1, String value2) {
            addCriterion("Classification_classificationName between", value1, value2, "classificationClassificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationnameNotBetween(String value1, String value2) {
            addCriterion("Classification_classificationName not between", value1, value2, "classificationClassificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionIsNull() {
            addCriterion("Classification_classificationIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionIsNotNull() {
            addCriterion("Classification_classificationIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionEqualTo(String value) {
            addCriterion("Classification_classificationIntroduction =", value, "classificationClassificationintroduction");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionNotEqualTo(String value) {
            addCriterion("Classification_classificationIntroduction <>", value, "classificationClassificationintroduction");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionGreaterThan(String value) {
            addCriterion("Classification_classificationIntroduction >", value, "classificationClassificationintroduction");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("Classification_classificationIntroduction >=", value, "classificationClassificationintroduction");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionLessThan(String value) {
            addCriterion("Classification_classificationIntroduction <", value, "classificationClassificationintroduction");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionLessThanOrEqualTo(String value) {
            addCriterion("Classification_classificationIntroduction <=", value, "classificationClassificationintroduction");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionLike(String value) {
            addCriterion("Classification_classificationIntroduction like", value, "classificationClassificationintroduction");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionNotLike(String value) {
            addCriterion("Classification_classificationIntroduction not like", value, "classificationClassificationintroduction");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionIn(List<String> values) {
            addCriterion("Classification_classificationIntroduction in", values, "classificationClassificationintroduction");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionNotIn(List<String> values) {
            addCriterion("Classification_classificationIntroduction not in", values, "classificationClassificationintroduction");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionBetween(String value1, String value2) {
            addCriterion("Classification_classificationIntroduction between", value1, value2, "classificationClassificationintroduction");
            return (Criteria) this;
        }

        public Criteria andClassificationClassificationintroductionNotBetween(String value1, String value2) {
            addCriterion("Classification_classificationIntroduction not between", value1, value2, "classificationClassificationintroduction");
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