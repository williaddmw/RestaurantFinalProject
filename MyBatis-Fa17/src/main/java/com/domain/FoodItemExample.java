package com.domain;

import java.util.ArrayList;
import java.util.List;

public class FoodItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodItemExample() {
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

        public Criteria andFoodnameIsNull() {
            addCriterion("FOODNAME is null");
            return (Criteria) this;
        }

        public Criteria andFoodnameIsNotNull() {
            addCriterion("FOODNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFoodnameEqualTo(String value) {
            addCriterion("FOODNAME =", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotEqualTo(String value) {
            addCriterion("FOODNAME <>", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameGreaterThan(String value) {
            addCriterion("FOODNAME >", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("FOODNAME >=", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLessThan(String value) {
            addCriterion("FOODNAME <", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLessThanOrEqualTo(String value) {
            addCriterion("FOODNAME <=", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLike(String value) {
            addCriterion("FOODNAME like", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotLike(String value) {
            addCriterion("FOODNAME not like", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameIn(List<String> values) {
            addCriterion("FOODNAME in", values, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotIn(List<String> values) {
            addCriterion("FOODNAME not in", values, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameBetween(String value1, String value2) {
            addCriterion("FOODNAME between", value1, value2, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotBetween(String value1, String value2) {
            addCriterion("FOODNAME not between", value1, value2, "foodname");
            return (Criteria) this;
        }

        public Criteria andFcatnameIsNull() {
            addCriterion("FCATNAME is null");
            return (Criteria) this;
        }

        public Criteria andFcatnameIsNotNull() {
            addCriterion("FCATNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFcatnameEqualTo(String value) {
            addCriterion("FCATNAME =", value, "fcatname");
            return (Criteria) this;
        }

        public Criteria andFcatnameNotEqualTo(String value) {
            addCriterion("FCATNAME <>", value, "fcatname");
            return (Criteria) this;
        }

        public Criteria andFcatnameGreaterThan(String value) {
            addCriterion("FCATNAME >", value, "fcatname");
            return (Criteria) this;
        }

        public Criteria andFcatnameGreaterThanOrEqualTo(String value) {
            addCriterion("FCATNAME >=", value, "fcatname");
            return (Criteria) this;
        }

        public Criteria andFcatnameLessThan(String value) {
            addCriterion("FCATNAME <", value, "fcatname");
            return (Criteria) this;
        }

        public Criteria andFcatnameLessThanOrEqualTo(String value) {
            addCriterion("FCATNAME <=", value, "fcatname");
            return (Criteria) this;
        }

        public Criteria andFcatnameLike(String value) {
            addCriterion("FCATNAME like", value, "fcatname");
            return (Criteria) this;
        }

        public Criteria andFcatnameNotLike(String value) {
            addCriterion("FCATNAME not like", value, "fcatname");
            return (Criteria) this;
        }

        public Criteria andFcatnameIn(List<String> values) {
            addCriterion("FCATNAME in", values, "fcatname");
            return (Criteria) this;
        }

        public Criteria andFcatnameNotIn(List<String> values) {
            addCriterion("FCATNAME not in", values, "fcatname");
            return (Criteria) this;
        }

        public Criteria andFcatnameBetween(String value1, String value2) {
            addCriterion("FCATNAME between", value1, value2, "fcatname");
            return (Criteria) this;
        }

        public Criteria andFcatnameNotBetween(String value1, String value2) {
            addCriterion("FCATNAME not between", value1, value2, "fcatname");
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