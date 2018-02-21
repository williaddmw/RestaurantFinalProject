package com.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustReviewExample() {
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

        public Criteria andReviewidIsNull() {
            addCriterion("REVIEWID is null");
            return (Criteria) this;
        }

        public Criteria andReviewidIsNotNull() {
            addCriterion("REVIEWID is not null");
            return (Criteria) this;
        }

        public Criteria andReviewidEqualTo(Short value) {
            addCriterion("REVIEWID =", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotEqualTo(Short value) {
            addCriterion("REVIEWID <>", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidGreaterThan(Short value) {
            addCriterion("REVIEWID >", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidGreaterThanOrEqualTo(Short value) {
            addCriterion("REVIEWID >=", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidLessThan(Short value) {
            addCriterion("REVIEWID <", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidLessThanOrEqualTo(Short value) {
            addCriterion("REVIEWID <=", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidIn(List<Short> values) {
            addCriterion("REVIEWID in", values, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotIn(List<Short> values) {
            addCriterion("REVIEWID not in", values, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidBetween(Short value1, Short value2) {
            addCriterion("REVIEWID between", value1, value2, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotBetween(Short value1, Short value2) {
            addCriterion("REVIEWID not between", value1, value2, "reviewid");
            return (Criteria) this;
        }

        public Criteria andCustemailIsNull() {
            addCriterion("CUSTEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCustemailIsNotNull() {
            addCriterion("CUSTEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCustemailEqualTo(String value) {
            addCriterion("CUSTEMAIL =", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotEqualTo(String value) {
            addCriterion("CUSTEMAIL <>", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailGreaterThan(String value) {
            addCriterion("CUSTEMAIL >", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTEMAIL >=", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLessThan(String value) {
            addCriterion("CUSTEMAIL <", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLessThanOrEqualTo(String value) {
            addCriterion("CUSTEMAIL <=", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailLike(String value) {
            addCriterion("CUSTEMAIL like", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotLike(String value) {
            addCriterion("CUSTEMAIL not like", value, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailIn(List<String> values) {
            addCriterion("CUSTEMAIL in", values, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotIn(List<String> values) {
            addCriterion("CUSTEMAIL not in", values, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailBetween(String value1, String value2) {
            addCriterion("CUSTEMAIL between", value1, value2, "custemail");
            return (Criteria) this;
        }

        public Criteria andCustemailNotBetween(String value1, String value2) {
            addCriterion("CUSTEMAIL not between", value1, value2, "custemail");
            return (Criteria) this;
        }

        public Criteria andRestidIsNull() {
            addCriterion("RESTID is null");
            return (Criteria) this;
        }

        public Criteria andRestidIsNotNull() {
            addCriterion("RESTID is not null");
            return (Criteria) this;
        }

        public Criteria andRestidEqualTo(Short value) {
            addCriterion("RESTID =", value, "restid");
            return (Criteria) this;
        }

        public Criteria andRestidNotEqualTo(Short value) {
            addCriterion("RESTID <>", value, "restid");
            return (Criteria) this;
        }

        public Criteria andRestidGreaterThan(Short value) {
            addCriterion("RESTID >", value, "restid");
            return (Criteria) this;
        }

        public Criteria andRestidGreaterThanOrEqualTo(Short value) {
            addCriterion("RESTID >=", value, "restid");
            return (Criteria) this;
        }

        public Criteria andRestidLessThan(Short value) {
            addCriterion("RESTID <", value, "restid");
            return (Criteria) this;
        }

        public Criteria andRestidLessThanOrEqualTo(Short value) {
            addCriterion("RESTID <=", value, "restid");
            return (Criteria) this;
        }

        public Criteria andRestidIn(List<Short> values) {
            addCriterion("RESTID in", values, "restid");
            return (Criteria) this;
        }

        public Criteria andRestidNotIn(List<Short> values) {
            addCriterion("RESTID not in", values, "restid");
            return (Criteria) this;
        }

        public Criteria andRestidBetween(Short value1, Short value2) {
            addCriterion("RESTID between", value1, value2, "restid");
            return (Criteria) this;
        }

        public Criteria andRestidNotBetween(Short value1, Short value2) {
            addCriterion("RESTID not between", value1, value2, "restid");
            return (Criteria) this;
        }

        public Criteria andReviewtitleIsNull() {
            addCriterion("REVIEWTITLE is null");
            return (Criteria) this;
        }

        public Criteria andReviewtitleIsNotNull() {
            addCriterion("REVIEWTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewtitleEqualTo(String value) {
            addCriterion("REVIEWTITLE =", value, "reviewtitle");
            return (Criteria) this;
        }

        public Criteria andReviewtitleNotEqualTo(String value) {
            addCriterion("REVIEWTITLE <>", value, "reviewtitle");
            return (Criteria) this;
        }

        public Criteria andReviewtitleGreaterThan(String value) {
            addCriterion("REVIEWTITLE >", value, "reviewtitle");
            return (Criteria) this;
        }

        public Criteria andReviewtitleGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEWTITLE >=", value, "reviewtitle");
            return (Criteria) this;
        }

        public Criteria andReviewtitleLessThan(String value) {
            addCriterion("REVIEWTITLE <", value, "reviewtitle");
            return (Criteria) this;
        }

        public Criteria andReviewtitleLessThanOrEqualTo(String value) {
            addCriterion("REVIEWTITLE <=", value, "reviewtitle");
            return (Criteria) this;
        }

        public Criteria andReviewtitleLike(String value) {
            addCriterion("REVIEWTITLE like", value, "reviewtitle");
            return (Criteria) this;
        }

        public Criteria andReviewtitleNotLike(String value) {
            addCriterion("REVIEWTITLE not like", value, "reviewtitle");
            return (Criteria) this;
        }

        public Criteria andReviewtitleIn(List<String> values) {
            addCriterion("REVIEWTITLE in", values, "reviewtitle");
            return (Criteria) this;
        }

        public Criteria andReviewtitleNotIn(List<String> values) {
            addCriterion("REVIEWTITLE not in", values, "reviewtitle");
            return (Criteria) this;
        }

        public Criteria andReviewtitleBetween(String value1, String value2) {
            addCriterion("REVIEWTITLE between", value1, value2, "reviewtitle");
            return (Criteria) this;
        }

        public Criteria andReviewtitleNotBetween(String value1, String value2) {
            addCriterion("REVIEWTITLE not between", value1, value2, "reviewtitle");
            return (Criteria) this;
        }

        public Criteria andReviewdescrIsNull() {
            addCriterion("REVIEWDESCR is null");
            return (Criteria) this;
        }

        public Criteria andReviewdescrIsNotNull() {
            addCriterion("REVIEWDESCR is not null");
            return (Criteria) this;
        }

        public Criteria andReviewdescrEqualTo(String value) {
            addCriterion("REVIEWDESCR =", value, "reviewdescr");
            return (Criteria) this;
        }

        public Criteria andReviewdescrNotEqualTo(String value) {
            addCriterion("REVIEWDESCR <>", value, "reviewdescr");
            return (Criteria) this;
        }

        public Criteria andReviewdescrGreaterThan(String value) {
            addCriterion("REVIEWDESCR >", value, "reviewdescr");
            return (Criteria) this;
        }

        public Criteria andReviewdescrGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEWDESCR >=", value, "reviewdescr");
            return (Criteria) this;
        }

        public Criteria andReviewdescrLessThan(String value) {
            addCriterion("REVIEWDESCR <", value, "reviewdescr");
            return (Criteria) this;
        }

        public Criteria andReviewdescrLessThanOrEqualTo(String value) {
            addCriterion("REVIEWDESCR <=", value, "reviewdescr");
            return (Criteria) this;
        }

        public Criteria andReviewdescrLike(String value) {
            addCriterion("REVIEWDESCR like", value, "reviewdescr");
            return (Criteria) this;
        }

        public Criteria andReviewdescrNotLike(String value) {
            addCriterion("REVIEWDESCR not like", value, "reviewdescr");
            return (Criteria) this;
        }

        public Criteria andReviewdescrIn(List<String> values) {
            addCriterion("REVIEWDESCR in", values, "reviewdescr");
            return (Criteria) this;
        }

        public Criteria andReviewdescrNotIn(List<String> values) {
            addCriterion("REVIEWDESCR not in", values, "reviewdescr");
            return (Criteria) this;
        }

        public Criteria andReviewdescrBetween(String value1, String value2) {
            addCriterion("REVIEWDESCR between", value1, value2, "reviewdescr");
            return (Criteria) this;
        }

        public Criteria andReviewdescrNotBetween(String value1, String value2) {
            addCriterion("REVIEWDESCR not between", value1, value2, "reviewdescr");
            return (Criteria) this;
        }

        public Criteria andReviewdateIsNull() {
            addCriterion("REVIEWDATE is null");
            return (Criteria) this;
        }

        public Criteria andReviewdateIsNotNull() {
            addCriterion("REVIEWDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewdateEqualTo(Date value) {
            addCriterion("REVIEWDATE =", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateNotEqualTo(Date value) {
            addCriterion("REVIEWDATE <>", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateGreaterThan(Date value) {
            addCriterion("REVIEWDATE >", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateGreaterThanOrEqualTo(Date value) {
            addCriterion("REVIEWDATE >=", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateLessThan(Date value) {
            addCriterion("REVIEWDATE <", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateLessThanOrEqualTo(Date value) {
            addCriterion("REVIEWDATE <=", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateIn(List<Date> values) {
            addCriterion("REVIEWDATE in", values, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateNotIn(List<Date> values) {
            addCriterion("REVIEWDATE not in", values, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateBetween(Date value1, Date value2) {
            addCriterion("REVIEWDATE between", value1, value2, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateNotBetween(Date value1, Date value2) {
            addCriterion("REVIEWDATE not between", value1, value2, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andRatingIsNull() {
            addCriterion("RATING is null");
            return (Criteria) this;
        }

        public Criteria andRatingIsNotNull() {
            addCriterion("RATING is not null");
            return (Criteria) this;
        }

        public Criteria andRatingEqualTo(BigDecimal value) {
            addCriterion("RATING =", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotEqualTo(BigDecimal value) {
            addCriterion("RATING <>", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThan(BigDecimal value) {
            addCriterion("RATING >", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATING >=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThan(BigDecimal value) {
            addCriterion("RATING <", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATING <=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingIn(List<BigDecimal> values) {
            addCriterion("RATING in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotIn(List<BigDecimal> values) {
            addCriterion("RATING not in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATING between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATING not between", value1, value2, "rating");
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