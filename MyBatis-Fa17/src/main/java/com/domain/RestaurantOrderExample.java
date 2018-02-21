package com.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RestaurantOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RestaurantOrderExample() {
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

        public Criteria andOnoIsNull() {
            addCriterion("ONO is null");
            return (Criteria) this;
        }

        public Criteria andOnoIsNotNull() {
            addCriterion("ONO is not null");
            return (Criteria) this;
        }

        public Criteria andOnoEqualTo(Short value) {
            addCriterion("ONO =", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoNotEqualTo(Short value) {
            addCriterion("ONO <>", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoGreaterThan(Short value) {
            addCriterion("ONO >", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoGreaterThanOrEqualTo(Short value) {
            addCriterion("ONO >=", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoLessThan(Short value) {
            addCriterion("ONO <", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoLessThanOrEqualTo(Short value) {
            addCriterion("ONO <=", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoIn(List<Short> values) {
            addCriterion("ONO in", values, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoNotIn(List<Short> values) {
            addCriterion("ONO not in", values, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoBetween(Short value1, Short value2) {
            addCriterion("ONO between", value1, value2, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoNotBetween(Short value1, Short value2) {
            addCriterion("ONO not between", value1, value2, "ono");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("ORDERDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("ORDERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterion("ORDERDATE =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterion("ORDERDATE <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterion("ORDERDATE >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDERDATE >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterion("ORDERDATE <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterion("ORDERDATE <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterion("ORDERDATE in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterion("ORDERDATE not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterion("ORDERDATE between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterion("ORDERDATE not between", value1, value2, "orderdate");
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

        public Criteria andOrderdineinflagIsNull() {
            addCriterion("ORDERDINEINFLAG is null");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagIsNotNull() {
            addCriterion("ORDERDINEINFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagEqualTo(String value) {
            addCriterion("ORDERDINEINFLAG =", value, "orderdineinflag");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagNotEqualTo(String value) {
            addCriterion("ORDERDINEINFLAG <>", value, "orderdineinflag");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagGreaterThan(String value) {
            addCriterion("ORDERDINEINFLAG >", value, "orderdineinflag");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERDINEINFLAG >=", value, "orderdineinflag");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagLessThan(String value) {
            addCriterion("ORDERDINEINFLAG <", value, "orderdineinflag");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagLessThanOrEqualTo(String value) {
            addCriterion("ORDERDINEINFLAG <=", value, "orderdineinflag");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagLike(String value) {
            addCriterion("ORDERDINEINFLAG like", value, "orderdineinflag");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagNotLike(String value) {
            addCriterion("ORDERDINEINFLAG not like", value, "orderdineinflag");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagIn(List<String> values) {
            addCriterion("ORDERDINEINFLAG in", values, "orderdineinflag");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagNotIn(List<String> values) {
            addCriterion("ORDERDINEINFLAG not in", values, "orderdineinflag");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagBetween(String value1, String value2) {
            addCriterion("ORDERDINEINFLAG between", value1, value2, "orderdineinflag");
            return (Criteria) this;
        }

        public Criteria andOrderdineinflagNotBetween(String value1, String value2) {
            addCriterion("ORDERDINEINFLAG not between", value1, value2, "orderdineinflag");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagIsNull() {
            addCriterion("ORDERDELIVERYFLAG is null");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagIsNotNull() {
            addCriterion("ORDERDELIVERYFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagEqualTo(String value) {
            addCriterion("ORDERDELIVERYFLAG =", value, "orderdeliveryflag");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagNotEqualTo(String value) {
            addCriterion("ORDERDELIVERYFLAG <>", value, "orderdeliveryflag");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagGreaterThan(String value) {
            addCriterion("ORDERDELIVERYFLAG >", value, "orderdeliveryflag");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERDELIVERYFLAG >=", value, "orderdeliveryflag");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagLessThan(String value) {
            addCriterion("ORDERDELIVERYFLAG <", value, "orderdeliveryflag");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagLessThanOrEqualTo(String value) {
            addCriterion("ORDERDELIVERYFLAG <=", value, "orderdeliveryflag");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagLike(String value) {
            addCriterion("ORDERDELIVERYFLAG like", value, "orderdeliveryflag");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagNotLike(String value) {
            addCriterion("ORDERDELIVERYFLAG not like", value, "orderdeliveryflag");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagIn(List<String> values) {
            addCriterion("ORDERDELIVERYFLAG in", values, "orderdeliveryflag");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagNotIn(List<String> values) {
            addCriterion("ORDERDELIVERYFLAG not in", values, "orderdeliveryflag");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagBetween(String value1, String value2) {
            addCriterion("ORDERDELIVERYFLAG between", value1, value2, "orderdeliveryflag");
            return (Criteria) this;
        }

        public Criteria andOrderdeliveryflagNotBetween(String value1, String value2) {
            addCriterion("ORDERDELIVERYFLAG not between", value1, value2, "orderdeliveryflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagIsNull() {
            addCriterion("ORDERPICKUPFLAG is null");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagIsNotNull() {
            addCriterion("ORDERPICKUPFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagEqualTo(String value) {
            addCriterion("ORDERPICKUPFLAG =", value, "orderpickupflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagNotEqualTo(String value) {
            addCriterion("ORDERPICKUPFLAG <>", value, "orderpickupflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagGreaterThan(String value) {
            addCriterion("ORDERPICKUPFLAG >", value, "orderpickupflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERPICKUPFLAG >=", value, "orderpickupflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagLessThan(String value) {
            addCriterion("ORDERPICKUPFLAG <", value, "orderpickupflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagLessThanOrEqualTo(String value) {
            addCriterion("ORDERPICKUPFLAG <=", value, "orderpickupflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagLike(String value) {
            addCriterion("ORDERPICKUPFLAG like", value, "orderpickupflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagNotLike(String value) {
            addCriterion("ORDERPICKUPFLAG not like", value, "orderpickupflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagIn(List<String> values) {
            addCriterion("ORDERPICKUPFLAG in", values, "orderpickupflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagNotIn(List<String> values) {
            addCriterion("ORDERPICKUPFLAG not in", values, "orderpickupflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagBetween(String value1, String value2) {
            addCriterion("ORDERPICKUPFLAG between", value1, value2, "orderpickupflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupflagNotBetween(String value1, String value2) {
            addCriterion("ORDERPICKUPFLAG not between", value1, value2, "orderpickupflag");
            return (Criteria) this;
        }

        public Criteria andOrderpickupdateIsNull() {
            addCriterion("ORDERPICKUPDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderpickupdateIsNotNull() {
            addCriterion("ORDERPICKUPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpickupdateEqualTo(Date value) {
            addCriterion("ORDERPICKUPDATE =", value, "orderpickupdate");
            return (Criteria) this;
        }

        public Criteria andOrderpickupdateNotEqualTo(Date value) {
            addCriterion("ORDERPICKUPDATE <>", value, "orderpickupdate");
            return (Criteria) this;
        }

        public Criteria andOrderpickupdateGreaterThan(Date value) {
            addCriterion("ORDERPICKUPDATE >", value, "orderpickupdate");
            return (Criteria) this;
        }

        public Criteria andOrderpickupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDERPICKUPDATE >=", value, "orderpickupdate");
            return (Criteria) this;
        }

        public Criteria andOrderpickupdateLessThan(Date value) {
            addCriterion("ORDERPICKUPDATE <", value, "orderpickupdate");
            return (Criteria) this;
        }

        public Criteria andOrderpickupdateLessThanOrEqualTo(Date value) {
            addCriterion("ORDERPICKUPDATE <=", value, "orderpickupdate");
            return (Criteria) this;
        }

        public Criteria andOrderpickupdateIn(List<Date> values) {
            addCriterion("ORDERPICKUPDATE in", values, "orderpickupdate");
            return (Criteria) this;
        }

        public Criteria andOrderpickupdateNotIn(List<Date> values) {
            addCriterion("ORDERPICKUPDATE not in", values, "orderpickupdate");
            return (Criteria) this;
        }

        public Criteria andOrderpickupdateBetween(Date value1, Date value2) {
            addCriterion("ORDERPICKUPDATE between", value1, value2, "orderpickupdate");
            return (Criteria) this;
        }

        public Criteria andOrderpickupdateNotBetween(Date value1, Date value2) {
            addCriterion("ORDERPICKUPDATE not between", value1, value2, "orderpickupdate");
            return (Criteria) this;
        }

        public Criteria andOrderdeliverydateIsNull() {
            addCriterion("ORDERDELIVERYDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderdeliverydateIsNotNull() {
            addCriterion("ORDERDELIVERYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdeliverydateEqualTo(Date value) {
            addCriterion("ORDERDELIVERYDATE =", value, "orderdeliverydate");
            return (Criteria) this;
        }

        public Criteria andOrderdeliverydateNotEqualTo(Date value) {
            addCriterion("ORDERDELIVERYDATE <>", value, "orderdeliverydate");
            return (Criteria) this;
        }

        public Criteria andOrderdeliverydateGreaterThan(Date value) {
            addCriterion("ORDERDELIVERYDATE >", value, "orderdeliverydate");
            return (Criteria) this;
        }

        public Criteria andOrderdeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDERDELIVERYDATE >=", value, "orderdeliverydate");
            return (Criteria) this;
        }

        public Criteria andOrderdeliverydateLessThan(Date value) {
            addCriterion("ORDERDELIVERYDATE <", value, "orderdeliverydate");
            return (Criteria) this;
        }

        public Criteria andOrderdeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("ORDERDELIVERYDATE <=", value, "orderdeliverydate");
            return (Criteria) this;
        }

        public Criteria andOrderdeliverydateIn(List<Date> values) {
            addCriterion("ORDERDELIVERYDATE in", values, "orderdeliverydate");
            return (Criteria) this;
        }

        public Criteria andOrderdeliverydateNotIn(List<Date> values) {
            addCriterion("ORDERDELIVERYDATE not in", values, "orderdeliverydate");
            return (Criteria) this;
        }

        public Criteria andOrderdeliverydateBetween(Date value1, Date value2) {
            addCriterion("ORDERDELIVERYDATE between", value1, value2, "orderdeliverydate");
            return (Criteria) this;
        }

        public Criteria andOrderdeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("ORDERDELIVERYDATE not between", value1, value2, "orderdeliverydate");
            return (Criteria) this;
        }

        public Criteria andOrderdineinreceiveddateIsNull() {
            addCriterion("ORDERDINEINRECEIVEDDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderdineinreceiveddateIsNotNull() {
            addCriterion("ORDERDINEINRECEIVEDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdineinreceiveddateEqualTo(Date value) {
            addCriterion("ORDERDINEINRECEIVEDDATE =", value, "orderdineinreceiveddate");
            return (Criteria) this;
        }

        public Criteria andOrderdineinreceiveddateNotEqualTo(Date value) {
            addCriterion("ORDERDINEINRECEIVEDDATE <>", value, "orderdineinreceiveddate");
            return (Criteria) this;
        }

        public Criteria andOrderdineinreceiveddateGreaterThan(Date value) {
            addCriterion("ORDERDINEINRECEIVEDDATE >", value, "orderdineinreceiveddate");
            return (Criteria) this;
        }

        public Criteria andOrderdineinreceiveddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDERDINEINRECEIVEDDATE >=", value, "orderdineinreceiveddate");
            return (Criteria) this;
        }

        public Criteria andOrderdineinreceiveddateLessThan(Date value) {
            addCriterion("ORDERDINEINRECEIVEDDATE <", value, "orderdineinreceiveddate");
            return (Criteria) this;
        }

        public Criteria andOrderdineinreceiveddateLessThanOrEqualTo(Date value) {
            addCriterion("ORDERDINEINRECEIVEDDATE <=", value, "orderdineinreceiveddate");
            return (Criteria) this;
        }

        public Criteria andOrderdineinreceiveddateIn(List<Date> values) {
            addCriterion("ORDERDINEINRECEIVEDDATE in", values, "orderdineinreceiveddate");
            return (Criteria) this;
        }

        public Criteria andOrderdineinreceiveddateNotIn(List<Date> values) {
            addCriterion("ORDERDINEINRECEIVEDDATE not in", values, "orderdineinreceiveddate");
            return (Criteria) this;
        }

        public Criteria andOrderdineinreceiveddateBetween(Date value1, Date value2) {
            addCriterion("ORDERDINEINRECEIVEDDATE between", value1, value2, "orderdineinreceiveddate");
            return (Criteria) this;
        }

        public Criteria andOrderdineinreceiveddateNotBetween(Date value1, Date value2) {
            addCriterion("ORDERDINEINRECEIVEDDATE not between", value1, value2, "orderdineinreceiveddate");
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