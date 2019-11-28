package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsXwbhIsNull() {
            addCriterion("news_XWBH is null");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhIsNotNull() {
            addCriterion("news_XWBH is not null");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhEqualTo(String value) {
            addCriterion("news_XWBH =", value, "newsXwbh");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhNotEqualTo(String value) {
            addCriterion("news_XWBH <>", value, "newsXwbh");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhGreaterThan(String value) {
            addCriterion("news_XWBH >", value, "newsXwbh");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhGreaterThanOrEqualTo(String value) {
            addCriterion("news_XWBH >=", value, "newsXwbh");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhLessThan(String value) {
            addCriterion("news_XWBH <", value, "newsXwbh");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhLessThanOrEqualTo(String value) {
            addCriterion("news_XWBH <=", value, "newsXwbh");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhLike(String value) {
            addCriterion("news_XWBH like", value, "newsXwbh");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhNotLike(String value) {
            addCriterion("news_XWBH not like", value, "newsXwbh");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhIn(List<String> values) {
            addCriterion("news_XWBH in", values, "newsXwbh");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhNotIn(List<String> values) {
            addCriterion("news_XWBH not in", values, "newsXwbh");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhBetween(String value1, String value2) {
            addCriterion("news_XWBH between", value1, value2, "newsXwbh");
            return (Criteria) this;
        }

        public Criteria andNewsXwbhNotBetween(String value1, String value2) {
            addCriterion("news_XWBH not between", value1, value2, "newsXwbh");
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

        public Criteria andNewsXwbtIsNull() {
            addCriterion("news_XWBT is null");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtIsNotNull() {
            addCriterion("news_XWBT is not null");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtEqualTo(String value) {
            addCriterion("news_XWBT =", value, "newsXwbt");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtNotEqualTo(String value) {
            addCriterion("news_XWBT <>", value, "newsXwbt");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtGreaterThan(String value) {
            addCriterion("news_XWBT >", value, "newsXwbt");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtGreaterThanOrEqualTo(String value) {
            addCriterion("news_XWBT >=", value, "newsXwbt");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtLessThan(String value) {
            addCriterion("news_XWBT <", value, "newsXwbt");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtLessThanOrEqualTo(String value) {
            addCriterion("news_XWBT <=", value, "newsXwbt");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtLike(String value) {
            addCriterion("news_XWBT like", value, "newsXwbt");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtNotLike(String value) {
            addCriterion("news_XWBT not like", value, "newsXwbt");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtIn(List<String> values) {
            addCriterion("news_XWBT in", values, "newsXwbt");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtNotIn(List<String> values) {
            addCriterion("news_XWBT not in", values, "newsXwbt");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtBetween(String value1, String value2) {
            addCriterion("news_XWBT between", value1, value2, "newsXwbt");
            return (Criteria) this;
        }

        public Criteria andNewsXwbtNotBetween(String value1, String value2) {
            addCriterion("news_XWBT not between", value1, value2, "newsXwbt");
            return (Criteria) this;
        }

        public Criteria andNewsYczzIsNull() {
            addCriterion("news_YCZZ is null");
            return (Criteria) this;
        }

        public Criteria andNewsYczzIsNotNull() {
            addCriterion("news_YCZZ is not null");
            return (Criteria) this;
        }

        public Criteria andNewsYczzEqualTo(String value) {
            addCriterion("news_YCZZ =", value, "newsYczz");
            return (Criteria) this;
        }

        public Criteria andNewsYczzNotEqualTo(String value) {
            addCriterion("news_YCZZ <>", value, "newsYczz");
            return (Criteria) this;
        }

        public Criteria andNewsYczzGreaterThan(String value) {
            addCriterion("news_YCZZ >", value, "newsYczz");
            return (Criteria) this;
        }

        public Criteria andNewsYczzGreaterThanOrEqualTo(String value) {
            addCriterion("news_YCZZ >=", value, "newsYczz");
            return (Criteria) this;
        }

        public Criteria andNewsYczzLessThan(String value) {
            addCriterion("news_YCZZ <", value, "newsYczz");
            return (Criteria) this;
        }

        public Criteria andNewsYczzLessThanOrEqualTo(String value) {
            addCriterion("news_YCZZ <=", value, "newsYczz");
            return (Criteria) this;
        }

        public Criteria andNewsYczzLike(String value) {
            addCriterion("news_YCZZ like", value, "newsYczz");
            return (Criteria) this;
        }

        public Criteria andNewsYczzNotLike(String value) {
            addCriterion("news_YCZZ not like", value, "newsYczz");
            return (Criteria) this;
        }

        public Criteria andNewsYczzIn(List<String> values) {
            addCriterion("news_YCZZ in", values, "newsYczz");
            return (Criteria) this;
        }

        public Criteria andNewsYczzNotIn(List<String> values) {
            addCriterion("news_YCZZ not in", values, "newsYczz");
            return (Criteria) this;
        }

        public Criteria andNewsYczzBetween(String value1, String value2) {
            addCriterion("news_YCZZ between", value1, value2, "newsYczz");
            return (Criteria) this;
        }

        public Criteria andNewsYczzNotBetween(String value1, String value2) {
            addCriterion("news_YCZZ not between", value1, value2, "newsYczz");
            return (Criteria) this;
        }

        public Criteria andNewsBjrIsNull() {
            addCriterion("news_BJR is null");
            return (Criteria) this;
        }

        public Criteria andNewsBjrIsNotNull() {
            addCriterion("news_BJR is not null");
            return (Criteria) this;
        }

        public Criteria andNewsBjrEqualTo(String value) {
            addCriterion("news_BJR =", value, "newsBjr");
            return (Criteria) this;
        }

        public Criteria andNewsBjrNotEqualTo(String value) {
            addCriterion("news_BJR <>", value, "newsBjr");
            return (Criteria) this;
        }

        public Criteria andNewsBjrGreaterThan(String value) {
            addCriterion("news_BJR >", value, "newsBjr");
            return (Criteria) this;
        }

        public Criteria andNewsBjrGreaterThanOrEqualTo(String value) {
            addCriterion("news_BJR >=", value, "newsBjr");
            return (Criteria) this;
        }

        public Criteria andNewsBjrLessThan(String value) {
            addCriterion("news_BJR <", value, "newsBjr");
            return (Criteria) this;
        }

        public Criteria andNewsBjrLessThanOrEqualTo(String value) {
            addCriterion("news_BJR <=", value, "newsBjr");
            return (Criteria) this;
        }

        public Criteria andNewsBjrLike(String value) {
            addCriterion("news_BJR like", value, "newsBjr");
            return (Criteria) this;
        }

        public Criteria andNewsBjrNotLike(String value) {
            addCriterion("news_BJR not like", value, "newsBjr");
            return (Criteria) this;
        }

        public Criteria andNewsBjrIn(List<String> values) {
            addCriterion("news_BJR in", values, "newsBjr");
            return (Criteria) this;
        }

        public Criteria andNewsBjrNotIn(List<String> values) {
            addCriterion("news_BJR not in", values, "newsBjr");
            return (Criteria) this;
        }

        public Criteria andNewsBjrBetween(String value1, String value2) {
            addCriterion("news_BJR between", value1, value2, "newsBjr");
            return (Criteria) this;
        }

        public Criteria andNewsBjrNotBetween(String value1, String value2) {
            addCriterion("news_BJR not between", value1, value2, "newsBjr");
            return (Criteria) this;
        }

        public Criteria andNewsShrIsNull() {
            addCriterion("news_SHR is null");
            return (Criteria) this;
        }

        public Criteria andNewsShrIsNotNull() {
            addCriterion("news_SHR is not null");
            return (Criteria) this;
        }

        public Criteria andNewsShrEqualTo(String value) {
            addCriterion("news_SHR =", value, "newsShr");
            return (Criteria) this;
        }

        public Criteria andNewsShrNotEqualTo(String value) {
            addCriterion("news_SHR <>", value, "newsShr");
            return (Criteria) this;
        }

        public Criteria andNewsShrGreaterThan(String value) {
            addCriterion("news_SHR >", value, "newsShr");
            return (Criteria) this;
        }

        public Criteria andNewsShrGreaterThanOrEqualTo(String value) {
            addCriterion("news_SHR >=", value, "newsShr");
            return (Criteria) this;
        }

        public Criteria andNewsShrLessThan(String value) {
            addCriterion("news_SHR <", value, "newsShr");
            return (Criteria) this;
        }

        public Criteria andNewsShrLessThanOrEqualTo(String value) {
            addCriterion("news_SHR <=", value, "newsShr");
            return (Criteria) this;
        }

        public Criteria andNewsShrLike(String value) {
            addCriterion("news_SHR like", value, "newsShr");
            return (Criteria) this;
        }

        public Criteria andNewsShrNotLike(String value) {
            addCriterion("news_SHR not like", value, "newsShr");
            return (Criteria) this;
        }

        public Criteria andNewsShrIn(List<String> values) {
            addCriterion("news_SHR in", values, "newsShr");
            return (Criteria) this;
        }

        public Criteria andNewsShrNotIn(List<String> values) {
            addCriterion("news_SHR not in", values, "newsShr");
            return (Criteria) this;
        }

        public Criteria andNewsShrBetween(String value1, String value2) {
            addCriterion("news_SHR between", value1, value2, "newsShr");
            return (Criteria) this;
        }

        public Criteria andNewsShrNotBetween(String value1, String value2) {
            addCriterion("news_SHR not between", value1, value2, "newsShr");
            return (Criteria) this;
        }

        public Criteria andNewsBcsjIsNull() {
            addCriterion("news_BCSJ is null");
            return (Criteria) this;
        }

        public Criteria andNewsBcsjIsNotNull() {
            addCriterion("news_BCSJ is not null");
            return (Criteria) this;
        }

        public Criteria andNewsBcsjEqualTo(Date value) {
            addCriterion("news_BCSJ =", value, "newsBcsj");
            return (Criteria) this;
        }

        public Criteria andNewsBcsjNotEqualTo(Date value) {
            addCriterion("news_BCSJ <>", value, "newsBcsj");
            return (Criteria) this;
        }

        public Criteria andNewsBcsjGreaterThan(Date value) {
            addCriterion("news_BCSJ >", value, "newsBcsj");
            return (Criteria) this;
        }

        public Criteria andNewsBcsjGreaterThanOrEqualTo(Date value) {
            addCriterion("news_BCSJ >=", value, "newsBcsj");
            return (Criteria) this;
        }

        public Criteria andNewsBcsjLessThan(Date value) {
            addCriterion("news_BCSJ <", value, "newsBcsj");
            return (Criteria) this;
        }

        public Criteria andNewsBcsjLessThanOrEqualTo(Date value) {
            addCriterion("news_BCSJ <=", value, "newsBcsj");
            return (Criteria) this;
        }

        public Criteria andNewsBcsjIn(List<Date> values) {
            addCriterion("news_BCSJ in", values, "newsBcsj");
            return (Criteria) this;
        }

        public Criteria andNewsBcsjNotIn(List<Date> values) {
            addCriterion("news_BCSJ not in", values, "newsBcsj");
            return (Criteria) this;
        }

        public Criteria andNewsBcsjBetween(Date value1, Date value2) {
            addCriterion("news_BCSJ between", value1, value2, "newsBcsj");
            return (Criteria) this;
        }

        public Criteria andNewsBcsjNotBetween(Date value1, Date value2) {
            addCriterion("news_BCSJ not between", value1, value2, "newsBcsj");
            return (Criteria) this;
        }

        public Criteria andNewsXgsjIsNull() {
            addCriterion("news_XGSJ is null");
            return (Criteria) this;
        }

        public Criteria andNewsXgsjIsNotNull() {
            addCriterion("news_XGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andNewsXgsjEqualTo(Date value) {
            addCriterion("news_XGSJ =", value, "newsXgsj");
            return (Criteria) this;
        }

        public Criteria andNewsXgsjNotEqualTo(Date value) {
            addCriterion("news_XGSJ <>", value, "newsXgsj");
            return (Criteria) this;
        }

        public Criteria andNewsXgsjGreaterThan(Date value) {
            addCriterion("news_XGSJ >", value, "newsXgsj");
            return (Criteria) this;
        }

        public Criteria andNewsXgsjGreaterThanOrEqualTo(Date value) {
            addCriterion("news_XGSJ >=", value, "newsXgsj");
            return (Criteria) this;
        }

        public Criteria andNewsXgsjLessThan(Date value) {
            addCriterion("news_XGSJ <", value, "newsXgsj");
            return (Criteria) this;
        }

        public Criteria andNewsXgsjLessThanOrEqualTo(Date value) {
            addCriterion("news_XGSJ <=", value, "newsXgsj");
            return (Criteria) this;
        }

        public Criteria andNewsXgsjIn(List<Date> values) {
            addCriterion("news_XGSJ in", values, "newsXgsj");
            return (Criteria) this;
        }

        public Criteria andNewsXgsjNotIn(List<Date> values) {
            addCriterion("news_XGSJ not in", values, "newsXgsj");
            return (Criteria) this;
        }

        public Criteria andNewsXgsjBetween(Date value1, Date value2) {
            addCriterion("news_XGSJ between", value1, value2, "newsXgsj");
            return (Criteria) this;
        }

        public Criteria andNewsXgsjNotBetween(Date value1, Date value2) {
            addCriterion("news_XGSJ not between", value1, value2, "newsXgsj");
            return (Criteria) this;
        }

        public Criteria andNewsFbsjIsNull() {
            addCriterion("news_FBSJ is null");
            return (Criteria) this;
        }

        public Criteria andNewsFbsjIsNotNull() {
            addCriterion("news_FBSJ is not null");
            return (Criteria) this;
        }

        public Criteria andNewsFbsjEqualTo(Date value) {
            addCriterion("news_FBSJ =", value, "newsFbsj");
            return (Criteria) this;
        }

        public Criteria andNewsFbsjNotEqualTo(Date value) {
            addCriterion("news_FBSJ <>", value, "newsFbsj");
            return (Criteria) this;
        }

        public Criteria andNewsFbsjGreaterThan(Date value) {
            addCriterion("news_FBSJ >", value, "newsFbsj");
            return (Criteria) this;
        }

        public Criteria andNewsFbsjGreaterThanOrEqualTo(Date value) {
            addCriterion("news_FBSJ >=", value, "newsFbsj");
            return (Criteria) this;
        }

        public Criteria andNewsFbsjLessThan(Date value) {
            addCriterion("news_FBSJ <", value, "newsFbsj");
            return (Criteria) this;
        }

        public Criteria andNewsFbsjLessThanOrEqualTo(Date value) {
            addCriterion("news_FBSJ <=", value, "newsFbsj");
            return (Criteria) this;
        }

        public Criteria andNewsFbsjIn(List<Date> values) {
            addCriterion("news_FBSJ in", values, "newsFbsj");
            return (Criteria) this;
        }

        public Criteria andNewsFbsjNotIn(List<Date> values) {
            addCriterion("news_FBSJ not in", values, "newsFbsj");
            return (Criteria) this;
        }

        public Criteria andNewsFbsjBetween(Date value1, Date value2) {
            addCriterion("news_FBSJ between", value1, value2, "newsFbsj");
            return (Criteria) this;
        }

        public Criteria andNewsFbsjNotBetween(Date value1, Date value2) {
            addCriterion("news_FBSJ not between", value1, value2, "newsFbsj");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxIsNull() {
            addCriterion("news_TSDX is null");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxIsNotNull() {
            addCriterion("news_TSDX is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxEqualTo(String value) {
            addCriterion("news_TSDX =", value, "newsTsdx");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxNotEqualTo(String value) {
            addCriterion("news_TSDX <>", value, "newsTsdx");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxGreaterThan(String value) {
            addCriterion("news_TSDX >", value, "newsTsdx");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxGreaterThanOrEqualTo(String value) {
            addCriterion("news_TSDX >=", value, "newsTsdx");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxLessThan(String value) {
            addCriterion("news_TSDX <", value, "newsTsdx");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxLessThanOrEqualTo(String value) {
            addCriterion("news_TSDX <=", value, "newsTsdx");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxLike(String value) {
            addCriterion("news_TSDX like", value, "newsTsdx");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxNotLike(String value) {
            addCriterion("news_TSDX not like", value, "newsTsdx");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxIn(List<String> values) {
            addCriterion("news_TSDX in", values, "newsTsdx");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxNotIn(List<String> values) {
            addCriterion("news_TSDX not in", values, "newsTsdx");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxBetween(String value1, String value2) {
            addCriterion("news_TSDX between", value1, value2, "newsTsdx");
            return (Criteria) this;
        }

        public Criteria andNewsTsdxNotBetween(String value1, String value2) {
            addCriterion("news_TSDX not between", value1, value2, "newsTsdx");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbIsNull() {
            addCriterion("news_XWLB is null");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbIsNotNull() {
            addCriterion("news_XWLB is not null");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbEqualTo(String value) {
            addCriterion("news_XWLB =", value, "newsXwlb");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbNotEqualTo(String value) {
            addCriterion("news_XWLB <>", value, "newsXwlb");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbGreaterThan(String value) {
            addCriterion("news_XWLB >", value, "newsXwlb");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbGreaterThanOrEqualTo(String value) {
            addCriterion("news_XWLB >=", value, "newsXwlb");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbLessThan(String value) {
            addCriterion("news_XWLB <", value, "newsXwlb");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbLessThanOrEqualTo(String value) {
            addCriterion("news_XWLB <=", value, "newsXwlb");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbLike(String value) {
            addCriterion("news_XWLB like", value, "newsXwlb");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbNotLike(String value) {
            addCriterion("news_XWLB not like", value, "newsXwlb");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbIn(List<String> values) {
            addCriterion("news_XWLB in", values, "newsXwlb");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbNotIn(List<String> values) {
            addCriterion("news_XWLB not in", values, "newsXwlb");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbBetween(String value1, String value2) {
            addCriterion("news_XWLB between", value1, value2, "newsXwlb");
            return (Criteria) this;
        }

        public Criteria andNewsXwlbNotBetween(String value1, String value2) {
            addCriterion("news_XWLB not between", value1, value2, "newsXwlb");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhIsNull() {
            addCriterion("news_SSXH is null");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhIsNotNull() {
            addCriterion("news_SSXH is not null");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhEqualTo(String value) {
            addCriterion("news_SSXH =", value, "newsSsxh");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhNotEqualTo(String value) {
            addCriterion("news_SSXH <>", value, "newsSsxh");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhGreaterThan(String value) {
            addCriterion("news_SSXH >", value, "newsSsxh");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhGreaterThanOrEqualTo(String value) {
            addCriterion("news_SSXH >=", value, "newsSsxh");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhLessThan(String value) {
            addCriterion("news_SSXH <", value, "newsSsxh");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhLessThanOrEqualTo(String value) {
            addCriterion("news_SSXH <=", value, "newsSsxh");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhLike(String value) {
            addCriterion("news_SSXH like", value, "newsSsxh");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhNotLike(String value) {
            addCriterion("news_SSXH not like", value, "newsSsxh");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhIn(List<String> values) {
            addCriterion("news_SSXH in", values, "newsSsxh");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhNotIn(List<String> values) {
            addCriterion("news_SSXH not in", values, "newsSsxh");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhBetween(String value1, String value2) {
            addCriterion("news_SSXH between", value1, value2, "newsSsxh");
            return (Criteria) this;
        }

        public Criteria andNewsSsxhNotBetween(String value1, String value2) {
            addCriterion("news_SSXH not between", value1, value2, "newsSsxh");
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