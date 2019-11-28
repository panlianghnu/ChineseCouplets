package com.hnu.ccdm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(String value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(String value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(String value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(String value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(String value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLike(String value) {
            addCriterion("post_id like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotLike(String value) {
            addCriterion("post_id not like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<String> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<String> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(String value1, String value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(String value1, String value2) {
            addCriterion("post_id not between", value1, value2, "postId");
            return (Criteria) this;
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

        public Criteria andLableContentIsNull() {
            addCriterion("lable_content is null");
            return (Criteria) this;
        }

        public Criteria andLableContentIsNotNull() {
            addCriterion("lable_content is not null");
            return (Criteria) this;
        }

        public Criteria andLableContentEqualTo(String value) {
            addCriterion("lable_content =", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentNotEqualTo(String value) {
            addCriterion("lable_content <>", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentGreaterThan(String value) {
            addCriterion("lable_content >", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentGreaterThanOrEqualTo(String value) {
            addCriterion("lable_content >=", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentLessThan(String value) {
            addCriterion("lable_content <", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentLessThanOrEqualTo(String value) {
            addCriterion("lable_content <=", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentLike(String value) {
            addCriterion("lable_content like", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentNotLike(String value) {
            addCriterion("lable_content not like", value, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentIn(List<String> values) {
            addCriterion("lable_content in", values, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentNotIn(List<String> values) {
            addCriterion("lable_content not in", values, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentBetween(String value1, String value2) {
            addCriterion("lable_content between", value1, value2, "lableContent");
            return (Criteria) this;
        }

        public Criteria andLableContentNotBetween(String value1, String value2) {
            addCriterion("lable_content not between", value1, value2, "lableContent");
            return (Criteria) this;
        }

        public Criteria andPostTimeIsNull() {
            addCriterion("post_time is null");
            return (Criteria) this;
        }

        public Criteria andPostTimeIsNotNull() {
            addCriterion("post_time is not null");
            return (Criteria) this;
        }

        public Criteria andPostTimeEqualTo(Date value) {
            addCriterion("post_time =", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotEqualTo(Date value) {
            addCriterion("post_time <>", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeGreaterThan(Date value) {
            addCriterion("post_time >", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_time >=", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeLessThan(Date value) {
            addCriterion("post_time <", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeLessThanOrEqualTo(Date value) {
            addCriterion("post_time <=", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeIn(List<Date> values) {
            addCriterion("post_time in", values, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotIn(List<Date> values) {
            addCriterion("post_time not in", values, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeBetween(Date value1, Date value2) {
            addCriterion("post_time between", value1, value2, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotBetween(Date value1, Date value2) {
            addCriterion("post_time not between", value1, value2, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostPsumIsNull() {
            addCriterion("post_psum is null");
            return (Criteria) this;
        }

        public Criteria andPostPsumIsNotNull() {
            addCriterion("post_psum is not null");
            return (Criteria) this;
        }

        public Criteria andPostPsumEqualTo(Integer value) {
            addCriterion("post_psum =", value, "postPsum");
            return (Criteria) this;
        }

        public Criteria andPostPsumNotEqualTo(Integer value) {
            addCriterion("post_psum <>", value, "postPsum");
            return (Criteria) this;
        }

        public Criteria andPostPsumGreaterThan(Integer value) {
            addCriterion("post_psum >", value, "postPsum");
            return (Criteria) this;
        }

        public Criteria andPostPsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_psum >=", value, "postPsum");
            return (Criteria) this;
        }

        public Criteria andPostPsumLessThan(Integer value) {
            addCriterion("post_psum <", value, "postPsum");
            return (Criteria) this;
        }

        public Criteria andPostPsumLessThanOrEqualTo(Integer value) {
            addCriterion("post_psum <=", value, "postPsum");
            return (Criteria) this;
        }

        public Criteria andPostPsumIn(List<Integer> values) {
            addCriterion("post_psum in", values, "postPsum");
            return (Criteria) this;
        }

        public Criteria andPostPsumNotIn(List<Integer> values) {
            addCriterion("post_psum not in", values, "postPsum");
            return (Criteria) this;
        }

        public Criteria andPostPsumBetween(Integer value1, Integer value2) {
            addCriterion("post_psum between", value1, value2, "postPsum");
            return (Criteria) this;
        }

        public Criteria andPostPsumNotBetween(Integer value1, Integer value2) {
            addCriterion("post_psum not between", value1, value2, "postPsum");
            return (Criteria) this;
        }

        public Criteria andPostRsumIsNull() {
            addCriterion("post_rsum is null");
            return (Criteria) this;
        }

        public Criteria andPostRsumIsNotNull() {
            addCriterion("post_rsum is not null");
            return (Criteria) this;
        }

        public Criteria andPostRsumEqualTo(Integer value) {
            addCriterion("post_rsum =", value, "postRsum");
            return (Criteria) this;
        }

        public Criteria andPostRsumNotEqualTo(Integer value) {
            addCriterion("post_rsum <>", value, "postRsum");
            return (Criteria) this;
        }

        public Criteria andPostRsumGreaterThan(Integer value) {
            addCriterion("post_rsum >", value, "postRsum");
            return (Criteria) this;
        }

        public Criteria andPostRsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_rsum >=", value, "postRsum");
            return (Criteria) this;
        }

        public Criteria andPostRsumLessThan(Integer value) {
            addCriterion("post_rsum <", value, "postRsum");
            return (Criteria) this;
        }

        public Criteria andPostRsumLessThanOrEqualTo(Integer value) {
            addCriterion("post_rsum <=", value, "postRsum");
            return (Criteria) this;
        }

        public Criteria andPostRsumIn(List<Integer> values) {
            addCriterion("post_rsum in", values, "postRsum");
            return (Criteria) this;
        }

        public Criteria andPostRsumNotIn(List<Integer> values) {
            addCriterion("post_rsum not in", values, "postRsum");
            return (Criteria) this;
        }

        public Criteria andPostRsumBetween(Integer value1, Integer value2) {
            addCriterion("post_rsum between", value1, value2, "postRsum");
            return (Criteria) this;
        }

        public Criteria andPostRsumNotBetween(Integer value1, Integer value2) {
            addCriterion("post_rsum not between", value1, value2, "postRsum");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNull() {
            addCriterion("post_title is null");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNotNull() {
            addCriterion("post_title is not null");
            return (Criteria) this;
        }

        public Criteria andPostTitleEqualTo(String value) {
            addCriterion("post_title =", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotEqualTo(String value) {
            addCriterion("post_title <>", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThan(String value) {
            addCriterion("post_title >", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThanOrEqualTo(String value) {
            addCriterion("post_title >=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThan(String value) {
            addCriterion("post_title <", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThanOrEqualTo(String value) {
            addCriterion("post_title <=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLike(String value) {
            addCriterion("post_title like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotLike(String value) {
            addCriterion("post_title not like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleIn(List<String> values) {
            addCriterion("post_title in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotIn(List<String> values) {
            addCriterion("post_title not in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleBetween(String value1, String value2) {
            addCriterion("post_title between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotBetween(String value1, String value2) {
            addCriterion("post_title not between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTagIsNull() {
            addCriterion("post_tag is null");
            return (Criteria) this;
        }

        public Criteria andPostTagIsNotNull() {
            addCriterion("post_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPostTagEqualTo(String value) {
            addCriterion("post_tag =", value, "postTag");
            return (Criteria) this;
        }

        public Criteria andPostTagNotEqualTo(String value) {
            addCriterion("post_tag <>", value, "postTag");
            return (Criteria) this;
        }

        public Criteria andPostTagGreaterThan(String value) {
            addCriterion("post_tag >", value, "postTag");
            return (Criteria) this;
        }

        public Criteria andPostTagGreaterThanOrEqualTo(String value) {
            addCriterion("post_tag >=", value, "postTag");
            return (Criteria) this;
        }

        public Criteria andPostTagLessThan(String value) {
            addCriterion("post_tag <", value, "postTag");
            return (Criteria) this;
        }

        public Criteria andPostTagLessThanOrEqualTo(String value) {
            addCriterion("post_tag <=", value, "postTag");
            return (Criteria) this;
        }

        public Criteria andPostTagLike(String value) {
            addCriterion("post_tag like", value, "postTag");
            return (Criteria) this;
        }

        public Criteria andPostTagNotLike(String value) {
            addCriterion("post_tag not like", value, "postTag");
            return (Criteria) this;
        }

        public Criteria andPostTagIn(List<String> values) {
            addCriterion("post_tag in", values, "postTag");
            return (Criteria) this;
        }

        public Criteria andPostTagNotIn(List<String> values) {
            addCriterion("post_tag not in", values, "postTag");
            return (Criteria) this;
        }

        public Criteria andPostTagBetween(String value1, String value2) {
            addCriterion("post_tag between", value1, value2, "postTag");
            return (Criteria) this;
        }

        public Criteria andPostTagNotBetween(String value1, String value2) {
            addCriterion("post_tag not between", value1, value2, "postTag");
            return (Criteria) this;
        }

        public Criteria andPostViewnumIsNull() {
            addCriterion("post_viewNum is null");
            return (Criteria) this;
        }

        public Criteria andPostViewnumIsNotNull() {
            addCriterion("post_viewNum is not null");
            return (Criteria) this;
        }

        public Criteria andPostViewnumEqualTo(Integer value) {
            addCriterion("post_viewNum =", value, "postViewnum");
            return (Criteria) this;
        }

        public Criteria andPostViewnumNotEqualTo(Integer value) {
            addCriterion("post_viewNum <>", value, "postViewnum");
            return (Criteria) this;
        }

        public Criteria andPostViewnumGreaterThan(Integer value) {
            addCriterion("post_viewNum >", value, "postViewnum");
            return (Criteria) this;
        }

        public Criteria andPostViewnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_viewNum >=", value, "postViewnum");
            return (Criteria) this;
        }

        public Criteria andPostViewnumLessThan(Integer value) {
            addCriterion("post_viewNum <", value, "postViewnum");
            return (Criteria) this;
        }

        public Criteria andPostViewnumLessThanOrEqualTo(Integer value) {
            addCriterion("post_viewNum <=", value, "postViewnum");
            return (Criteria) this;
        }

        public Criteria andPostViewnumIn(List<Integer> values) {
            addCriterion("post_viewNum in", values, "postViewnum");
            return (Criteria) this;
        }

        public Criteria andPostViewnumNotIn(List<Integer> values) {
            addCriterion("post_viewNum not in", values, "postViewnum");
            return (Criteria) this;
        }

        public Criteria andPostViewnumBetween(Integer value1, Integer value2) {
            addCriterion("post_viewNum between", value1, value2, "postViewnum");
            return (Criteria) this;
        }

        public Criteria andPostViewnumNotBetween(Integer value1, Integer value2) {
            addCriterion("post_viewNum not between", value1, value2, "postViewnum");
            return (Criteria) this;
        }

        public Criteria andPostIsessenceIsNull() {
            addCriterion("post_IsEssence is null");
            return (Criteria) this;
        }

        public Criteria andPostIsessenceIsNotNull() {
            addCriterion("post_IsEssence is not null");
            return (Criteria) this;
        }

        public Criteria andPostIsessenceEqualTo(Boolean value) {
            addCriterion("post_IsEssence =", value, "postIsessence");
            return (Criteria) this;
        }

        public Criteria andPostIsessenceNotEqualTo(Boolean value) {
            addCriterion("post_IsEssence <>", value, "postIsessence");
            return (Criteria) this;
        }

        public Criteria andPostIsessenceGreaterThan(Boolean value) {
            addCriterion("post_IsEssence >", value, "postIsessence");
            return (Criteria) this;
        }

        public Criteria andPostIsessenceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("post_IsEssence >=", value, "postIsessence");
            return (Criteria) this;
        }

        public Criteria andPostIsessenceLessThan(Boolean value) {
            addCriterion("post_IsEssence <", value, "postIsessence");
            return (Criteria) this;
        }

        public Criteria andPostIsessenceLessThanOrEqualTo(Boolean value) {
            addCriterion("post_IsEssence <=", value, "postIsessence");
            return (Criteria) this;
        }

        public Criteria andPostIsessenceIn(List<Boolean> values) {
            addCriterion("post_IsEssence in", values, "postIsessence");
            return (Criteria) this;
        }

        public Criteria andPostIsessenceNotIn(List<Boolean> values) {
            addCriterion("post_IsEssence not in", values, "postIsessence");
            return (Criteria) this;
        }

        public Criteria andPostIsessenceBetween(Boolean value1, Boolean value2) {
            addCriterion("post_IsEssence between", value1, value2, "postIsessence");
            return (Criteria) this;
        }

        public Criteria andPostIsessenceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("post_IsEssence not between", value1, value2, "postIsessence");
            return (Criteria) this;
        }

        public Criteria andPostTopIsNull() {
            addCriterion("post_top is null");
            return (Criteria) this;
        }

        public Criteria andPostTopIsNotNull() {
            addCriterion("post_top is not null");
            return (Criteria) this;
        }

        public Criteria andPostTopEqualTo(Boolean value) {
            addCriterion("post_top =", value, "postTop");
            return (Criteria) this;
        }

        public Criteria andPostTopNotEqualTo(Boolean value) {
            addCriterion("post_top <>", value, "postTop");
            return (Criteria) this;
        }

        public Criteria andPostTopGreaterThan(Boolean value) {
            addCriterion("post_top >", value, "postTop");
            return (Criteria) this;
        }

        public Criteria andPostTopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("post_top >=", value, "postTop");
            return (Criteria) this;
        }

        public Criteria andPostTopLessThan(Boolean value) {
            addCriterion("post_top <", value, "postTop");
            return (Criteria) this;
        }

        public Criteria andPostTopLessThanOrEqualTo(Boolean value) {
            addCriterion("post_top <=", value, "postTop");
            return (Criteria) this;
        }

        public Criteria andPostTopIn(List<Boolean> values) {
            addCriterion("post_top in", values, "postTop");
            return (Criteria) this;
        }

        public Criteria andPostTopNotIn(List<Boolean> values) {
            addCriterion("post_top not in", values, "postTop");
            return (Criteria) this;
        }

        public Criteria andPostTopBetween(Boolean value1, Boolean value2) {
            addCriterion("post_top between", value1, value2, "postTop");
            return (Criteria) this;
        }

        public Criteria andPostTopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("post_top not between", value1, value2, "postTop");
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