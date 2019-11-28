package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SqslExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SqslExample() {
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

        public Criteria andSqslSqbhIsNull() {
            addCriterion("SQSL_SQBH is null");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhIsNotNull() {
            addCriterion("SQSL_SQBH is not null");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhEqualTo(String value) {
            addCriterion("SQSL_SQBH =", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhNotEqualTo(String value) {
            addCriterion("SQSL_SQBH <>", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhGreaterThan(String value) {
            addCriterion("SQSL_SQBH >", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhGreaterThanOrEqualTo(String value) {
            addCriterion("SQSL_SQBH >=", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhLessThan(String value) {
            addCriterion("SQSL_SQBH <", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhLessThanOrEqualTo(String value) {
            addCriterion("SQSL_SQBH <=", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhLike(String value) {
            addCriterion("SQSL_SQBH like", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhNotLike(String value) {
            addCriterion("SQSL_SQBH not like", value, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhIn(List<String> values) {
            addCriterion("SQSL_SQBH in", values, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhNotIn(List<String> values) {
            addCriterion("SQSL_SQBH not in", values, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhBetween(String value1, String value2) {
            addCriterion("SQSL_SQBH between", value1, value2, "sqslSqbh");
            return (Criteria) this;
        }

        public Criteria andSqslSqbhNotBetween(String value1, String value2) {
            addCriterion("SQSL_SQBH not between", value1, value2, "sqslSqbh");
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

        public Criteria andRhsqSqidIsNull() {
            addCriterion("RHSQ_SQid is null");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidIsNotNull() {
            addCriterion("RHSQ_SQid is not null");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidEqualTo(String value) {
            addCriterion("RHSQ_SQid =", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidNotEqualTo(String value) {
            addCriterion("RHSQ_SQid <>", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidGreaterThan(String value) {
            addCriterion("RHSQ_SQid >", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidGreaterThanOrEqualTo(String value) {
            addCriterion("RHSQ_SQid >=", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidLessThan(String value) {
            addCriterion("RHSQ_SQid <", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidLessThanOrEqualTo(String value) {
            addCriterion("RHSQ_SQid <=", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidLike(String value) {
            addCriterion("RHSQ_SQid like", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidNotLike(String value) {
            addCriterion("RHSQ_SQid not like", value, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidIn(List<String> values) {
            addCriterion("RHSQ_SQid in", values, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidNotIn(List<String> values) {
            addCriterion("RHSQ_SQid not in", values, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidBetween(String value1, String value2) {
            addCriterion("RHSQ_SQid between", value1, value2, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andRhsqSqidNotBetween(String value1, String value2) {
            addCriterion("RHSQ_SQid not between", value1, value2, "rhsqSqid");
            return (Criteria) this;
        }

        public Criteria andSqslShztIsNull() {
            addCriterion("SQSL_SHZT is null");
            return (Criteria) this;
        }

        public Criteria andSqslShztIsNotNull() {
            addCriterion("SQSL_SHZT is not null");
            return (Criteria) this;
        }

        public Criteria andSqslShztEqualTo(Boolean value) {
            addCriterion("SQSL_SHZT =", value, "sqslShzt");
            return (Criteria) this;
        }

        public Criteria andSqslShztNotEqualTo(Boolean value) {
            addCriterion("SQSL_SHZT <>", value, "sqslShzt");
            return (Criteria) this;
        }

        public Criteria andSqslShztGreaterThan(Boolean value) {
            addCriterion("SQSL_SHZT >", value, "sqslShzt");
            return (Criteria) this;
        }

        public Criteria andSqslShztGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SQSL_SHZT >=", value, "sqslShzt");
            return (Criteria) this;
        }

        public Criteria andSqslShztLessThan(Boolean value) {
            addCriterion("SQSL_SHZT <", value, "sqslShzt");
            return (Criteria) this;
        }

        public Criteria andSqslShztLessThanOrEqualTo(Boolean value) {
            addCriterion("SQSL_SHZT <=", value, "sqslShzt");
            return (Criteria) this;
        }

        public Criteria andSqslShztIn(List<Boolean> values) {
            addCriterion("SQSL_SHZT in", values, "sqslShzt");
            return (Criteria) this;
        }

        public Criteria andSqslShztNotIn(List<Boolean> values) {
            addCriterion("SQSL_SHZT not in", values, "sqslShzt");
            return (Criteria) this;
        }

        public Criteria andSqslShztBetween(Boolean value1, Boolean value2) {
            addCriterion("SQSL_SHZT between", value1, value2, "sqslShzt");
            return (Criteria) this;
        }

        public Criteria andSqslShztNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SQSL_SHZT not between", value1, value2, "sqslShzt");
            return (Criteria) this;
        }

        public Criteria andSqslShjgIsNull() {
            addCriterion("SQSL_SHJG is null");
            return (Criteria) this;
        }

        public Criteria andSqslShjgIsNotNull() {
            addCriterion("SQSL_SHJG is not null");
            return (Criteria) this;
        }

        public Criteria andSqslShjgEqualTo(Boolean value) {
            addCriterion("SQSL_SHJG =", value, "sqslShjg");
            return (Criteria) this;
        }

        public Criteria andSqslShjgNotEqualTo(Boolean value) {
            addCriterion("SQSL_SHJG <>", value, "sqslShjg");
            return (Criteria) this;
        }

        public Criteria andSqslShjgGreaterThan(Boolean value) {
            addCriterion("SQSL_SHJG >", value, "sqslShjg");
            return (Criteria) this;
        }

        public Criteria andSqslShjgGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SQSL_SHJG >=", value, "sqslShjg");
            return (Criteria) this;
        }

        public Criteria andSqslShjgLessThan(Boolean value) {
            addCriterion("SQSL_SHJG <", value, "sqslShjg");
            return (Criteria) this;
        }

        public Criteria andSqslShjgLessThanOrEqualTo(Boolean value) {
            addCriterion("SQSL_SHJG <=", value, "sqslShjg");
            return (Criteria) this;
        }

        public Criteria andSqslShjgIn(List<Boolean> values) {
            addCriterion("SQSL_SHJG in", values, "sqslShjg");
            return (Criteria) this;
        }

        public Criteria andSqslShjgNotIn(List<Boolean> values) {
            addCriterion("SQSL_SHJG not in", values, "sqslShjg");
            return (Criteria) this;
        }

        public Criteria andSqslShjgBetween(Boolean value1, Boolean value2) {
            addCriterion("SQSL_SHJG between", value1, value2, "sqslShjg");
            return (Criteria) this;
        }

        public Criteria andSqslShjgNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SQSL_SHJG not between", value1, value2, "sqslShjg");
            return (Criteria) this;
        }

        public Criteria andSqslShridIsNull() {
            addCriterion("SQSL_SHRid is null");
            return (Criteria) this;
        }

        public Criteria andSqslShridIsNotNull() {
            addCriterion("SQSL_SHRid is not null");
            return (Criteria) this;
        }

        public Criteria andSqslShridEqualTo(String value) {
            addCriterion("SQSL_SHRid =", value, "sqslShrid");
            return (Criteria) this;
        }

        public Criteria andSqslShridNotEqualTo(String value) {
            addCriterion("SQSL_SHRid <>", value, "sqslShrid");
            return (Criteria) this;
        }

        public Criteria andSqslShridGreaterThan(String value) {
            addCriterion("SQSL_SHRid >", value, "sqslShrid");
            return (Criteria) this;
        }

        public Criteria andSqslShridGreaterThanOrEqualTo(String value) {
            addCriterion("SQSL_SHRid >=", value, "sqslShrid");
            return (Criteria) this;
        }

        public Criteria andSqslShridLessThan(String value) {
            addCriterion("SQSL_SHRid <", value, "sqslShrid");
            return (Criteria) this;
        }

        public Criteria andSqslShridLessThanOrEqualTo(String value) {
            addCriterion("SQSL_SHRid <=", value, "sqslShrid");
            return (Criteria) this;
        }

        public Criteria andSqslShridLike(String value) {
            addCriterion("SQSL_SHRid like", value, "sqslShrid");
            return (Criteria) this;
        }

        public Criteria andSqslShridNotLike(String value) {
            addCriterion("SQSL_SHRid not like", value, "sqslShrid");
            return (Criteria) this;
        }

        public Criteria andSqslShridIn(List<String> values) {
            addCriterion("SQSL_SHRid in", values, "sqslShrid");
            return (Criteria) this;
        }

        public Criteria andSqslShridNotIn(List<String> values) {
            addCriterion("SQSL_SHRid not in", values, "sqslShrid");
            return (Criteria) this;
        }

        public Criteria andSqslShridBetween(String value1, String value2) {
            addCriterion("SQSL_SHRid between", value1, value2, "sqslShrid");
            return (Criteria) this;
        }

        public Criteria andSqslShridNotBetween(String value1, String value2) {
            addCriterion("SQSL_SHRid not between", value1, value2, "sqslShrid");
            return (Criteria) this;
        }

        public Criteria andSqslShsjIsNull() {
            addCriterion("SQSL_SHSJ is null");
            return (Criteria) this;
        }

        public Criteria andSqslShsjIsNotNull() {
            addCriterion("SQSL_SHSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSqslShsjEqualTo(Date value) {
            addCriterion("SQSL_SHSJ =", value, "sqslShsj");
            return (Criteria) this;
        }

        public Criteria andSqslShsjNotEqualTo(Date value) {
            addCriterion("SQSL_SHSJ <>", value, "sqslShsj");
            return (Criteria) this;
        }

        public Criteria andSqslShsjGreaterThan(Date value) {
            addCriterion("SQSL_SHSJ >", value, "sqslShsj");
            return (Criteria) this;
        }

        public Criteria andSqslShsjGreaterThanOrEqualTo(Date value) {
            addCriterion("SQSL_SHSJ >=", value, "sqslShsj");
            return (Criteria) this;
        }

        public Criteria andSqslShsjLessThan(Date value) {
            addCriterion("SQSL_SHSJ <", value, "sqslShsj");
            return (Criteria) this;
        }

        public Criteria andSqslShsjLessThanOrEqualTo(Date value) {
            addCriterion("SQSL_SHSJ <=", value, "sqslShsj");
            return (Criteria) this;
        }

        public Criteria andSqslShsjIn(List<Date> values) {
            addCriterion("SQSL_SHSJ in", values, "sqslShsj");
            return (Criteria) this;
        }

        public Criteria andSqslShsjNotIn(List<Date> values) {
            addCriterion("SQSL_SHSJ not in", values, "sqslShsj");
            return (Criteria) this;
        }

        public Criteria andSqslShsjBetween(Date value1, Date value2) {
            addCriterion("SQSL_SHSJ between", value1, value2, "sqslShsj");
            return (Criteria) this;
        }

        public Criteria andSqslShsjNotBetween(Date value1, Date value2) {
            addCriterion("SQSL_SHSJ not between", value1, value2, "sqslShsj");
            return (Criteria) this;
        }

        public Criteria andSqslZxztIsNull() {
            addCriterion("SQSL_ZXZT is null");
            return (Criteria) this;
        }

        public Criteria andSqslZxztIsNotNull() {
            addCriterion("SQSL_ZXZT is not null");
            return (Criteria) this;
        }

        public Criteria andSqslZxztEqualTo(Boolean value) {
            addCriterion("SQSL_ZXZT =", value, "sqslZxzt");
            return (Criteria) this;
        }

        public Criteria andSqslZxztNotEqualTo(Boolean value) {
            addCriterion("SQSL_ZXZT <>", value, "sqslZxzt");
            return (Criteria) this;
        }

        public Criteria andSqslZxztGreaterThan(Boolean value) {
            addCriterion("SQSL_ZXZT >", value, "sqslZxzt");
            return (Criteria) this;
        }

        public Criteria andSqslZxztGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SQSL_ZXZT >=", value, "sqslZxzt");
            return (Criteria) this;
        }

        public Criteria andSqslZxztLessThan(Boolean value) {
            addCriterion("SQSL_ZXZT <", value, "sqslZxzt");
            return (Criteria) this;
        }

        public Criteria andSqslZxztLessThanOrEqualTo(Boolean value) {
            addCriterion("SQSL_ZXZT <=", value, "sqslZxzt");
            return (Criteria) this;
        }

        public Criteria andSqslZxztIn(List<Boolean> values) {
            addCriterion("SQSL_ZXZT in", values, "sqslZxzt");
            return (Criteria) this;
        }

        public Criteria andSqslZxztNotIn(List<Boolean> values) {
            addCriterion("SQSL_ZXZT not in", values, "sqslZxzt");
            return (Criteria) this;
        }

        public Criteria andSqslZxztBetween(Boolean value1, Boolean value2) {
            addCriterion("SQSL_ZXZT between", value1, value2, "sqslZxzt");
            return (Criteria) this;
        }

        public Criteria andSqslZxztNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SQSL_ZXZT not between", value1, value2, "sqslZxzt");
            return (Criteria) this;
        }

        public Criteria andSqslZxsjIsNull() {
            addCriterion("SQSL_ZXSJ is null");
            return (Criteria) this;
        }

        public Criteria andSqslZxsjIsNotNull() {
            addCriterion("SQSL_ZXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSqslZxsjEqualTo(Date value) {
            addCriterion("SQSL_ZXSJ =", value, "sqslZxsj");
            return (Criteria) this;
        }

        public Criteria andSqslZxsjNotEqualTo(Date value) {
            addCriterion("SQSL_ZXSJ <>", value, "sqslZxsj");
            return (Criteria) this;
        }

        public Criteria andSqslZxsjGreaterThan(Date value) {
            addCriterion("SQSL_ZXSJ >", value, "sqslZxsj");
            return (Criteria) this;
        }

        public Criteria andSqslZxsjGreaterThanOrEqualTo(Date value) {
            addCriterion("SQSL_ZXSJ >=", value, "sqslZxsj");
            return (Criteria) this;
        }

        public Criteria andSqslZxsjLessThan(Date value) {
            addCriterion("SQSL_ZXSJ <", value, "sqslZxsj");
            return (Criteria) this;
        }

        public Criteria andSqslZxsjLessThanOrEqualTo(Date value) {
            addCriterion("SQSL_ZXSJ <=", value, "sqslZxsj");
            return (Criteria) this;
        }

        public Criteria andSqslZxsjIn(List<Date> values) {
            addCriterion("SQSL_ZXSJ in", values, "sqslZxsj");
            return (Criteria) this;
        }

        public Criteria andSqslZxsjNotIn(List<Date> values) {
            addCriterion("SQSL_ZXSJ not in", values, "sqslZxsj");
            return (Criteria) this;
        }

        public Criteria andSqslZxsjBetween(Date value1, Date value2) {
            addCriterion("SQSL_ZXSJ between", value1, value2, "sqslZxsj");
            return (Criteria) this;
        }

        public Criteria andSqslZxsjNotBetween(Date value1, Date value2) {
            addCriterion("SQSL_ZXSJ not between", value1, value2, "sqslZxsj");
            return (Criteria) this;
        }

        public Criteria andSqslZxridIsNull() {
            addCriterion("SQSL_ZXRid is null");
            return (Criteria) this;
        }

        public Criteria andSqslZxridIsNotNull() {
            addCriterion("SQSL_ZXRid is not null");
            return (Criteria) this;
        }

        public Criteria andSqslZxridEqualTo(String value) {
            addCriterion("SQSL_ZXRid =", value, "sqslZxrid");
            return (Criteria) this;
        }

        public Criteria andSqslZxridNotEqualTo(String value) {
            addCriterion("SQSL_ZXRid <>", value, "sqslZxrid");
            return (Criteria) this;
        }

        public Criteria andSqslZxridGreaterThan(String value) {
            addCriterion("SQSL_ZXRid >", value, "sqslZxrid");
            return (Criteria) this;
        }

        public Criteria andSqslZxridGreaterThanOrEqualTo(String value) {
            addCriterion("SQSL_ZXRid >=", value, "sqslZxrid");
            return (Criteria) this;
        }

        public Criteria andSqslZxridLessThan(String value) {
            addCriterion("SQSL_ZXRid <", value, "sqslZxrid");
            return (Criteria) this;
        }

        public Criteria andSqslZxridLessThanOrEqualTo(String value) {
            addCriterion("SQSL_ZXRid <=", value, "sqslZxrid");
            return (Criteria) this;
        }

        public Criteria andSqslZxridLike(String value) {
            addCriterion("SQSL_ZXRid like", value, "sqslZxrid");
            return (Criteria) this;
        }

        public Criteria andSqslZxridNotLike(String value) {
            addCriterion("SQSL_ZXRid not like", value, "sqslZxrid");
            return (Criteria) this;
        }

        public Criteria andSqslZxridIn(List<String> values) {
            addCriterion("SQSL_ZXRid in", values, "sqslZxrid");
            return (Criteria) this;
        }

        public Criteria andSqslZxridNotIn(List<String> values) {
            addCriterion("SQSL_ZXRid not in", values, "sqslZxrid");
            return (Criteria) this;
        }

        public Criteria andSqslZxridBetween(String value1, String value2) {
            addCriterion("SQSL_ZXRid between", value1, value2, "sqslZxrid");
            return (Criteria) this;
        }

        public Criteria andSqslZxridNotBetween(String value1, String value2) {
            addCriterion("SQSL_ZXRid not between", value1, value2, "sqslZxrid");
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