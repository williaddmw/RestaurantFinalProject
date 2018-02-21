package com.domain;

import java.util.ArrayList;
import java.util.List;

public class RestaurantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RestaurantExample() {
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

        public Criteria andRnameIsNull() {
            addCriterion("RNAME is null");
            return (Criteria) this;
        }

        public Criteria andRnameIsNotNull() {
            addCriterion("RNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRnameEqualTo(String value) {
            addCriterion("RNAME =", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotEqualTo(String value) {
            addCriterion("RNAME <>", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThan(String value) {
            addCriterion("RNAME >", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThanOrEqualTo(String value) {
            addCriterion("RNAME >=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThan(String value) {
            addCriterion("RNAME <", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThanOrEqualTo(String value) {
            addCriterion("RNAME <=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLike(String value) {
            addCriterion("RNAME like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotLike(String value) {
            addCriterion("RNAME not like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameIn(List<String> values) {
            addCriterion("RNAME in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotIn(List<String> values) {
            addCriterion("RNAME not in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameBetween(String value1, String value2) {
            addCriterion("RNAME between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotBetween(String value1, String value2) {
            addCriterion("RNAME not between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andHoursIsNull() {
            addCriterion("HOURS is null");
            return (Criteria) this;
        }

        public Criteria andHoursIsNotNull() {
            addCriterion("HOURS is not null");
            return (Criteria) this;
        }

        public Criteria andHoursEqualTo(String value) {
            addCriterion("HOURS =", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotEqualTo(String value) {
            addCriterion("HOURS <>", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThan(String value) {
            addCriterion("HOURS >", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThanOrEqualTo(String value) {
            addCriterion("HOURS >=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThan(String value) {
            addCriterion("HOURS <", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThanOrEqualTo(String value) {
            addCriterion("HOURS <=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLike(String value) {
            addCriterion("HOURS like", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotLike(String value) {
            addCriterion("HOURS not like", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursIn(List<String> values) {
            addCriterion("HOURS in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotIn(List<String> values) {
            addCriterion("HOURS not in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursBetween(String value1, String value2) {
            addCriterion("HOURS between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotBetween(String value1, String value2) {
            addCriterion("HOURS not between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andDiningtypeIsNull() {
            addCriterion("DININGTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDiningtypeIsNotNull() {
            addCriterion("DININGTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDiningtypeEqualTo(String value) {
            addCriterion("DININGTYPE =", value, "diningtype");
            return (Criteria) this;
        }

        public Criteria andDiningtypeNotEqualTo(String value) {
            addCriterion("DININGTYPE <>", value, "diningtype");
            return (Criteria) this;
        }

        public Criteria andDiningtypeGreaterThan(String value) {
            addCriterion("DININGTYPE >", value, "diningtype");
            return (Criteria) this;
        }

        public Criteria andDiningtypeGreaterThanOrEqualTo(String value) {
            addCriterion("DININGTYPE >=", value, "diningtype");
            return (Criteria) this;
        }

        public Criteria andDiningtypeLessThan(String value) {
            addCriterion("DININGTYPE <", value, "diningtype");
            return (Criteria) this;
        }

        public Criteria andDiningtypeLessThanOrEqualTo(String value) {
            addCriterion("DININGTYPE <=", value, "diningtype");
            return (Criteria) this;
        }

        public Criteria andDiningtypeLike(String value) {
            addCriterion("DININGTYPE like", value, "diningtype");
            return (Criteria) this;
        }

        public Criteria andDiningtypeNotLike(String value) {
            addCriterion("DININGTYPE not like", value, "diningtype");
            return (Criteria) this;
        }

        public Criteria andDiningtypeIn(List<String> values) {
            addCriterion("DININGTYPE in", values, "diningtype");
            return (Criteria) this;
        }

        public Criteria andDiningtypeNotIn(List<String> values) {
            addCriterion("DININGTYPE not in", values, "diningtype");
            return (Criteria) this;
        }

        public Criteria andDiningtypeBetween(String value1, String value2) {
            addCriterion("DININGTYPE between", value1, value2, "diningtype");
            return (Criteria) this;
        }

        public Criteria andDiningtypeNotBetween(String value1, String value2) {
            addCriterion("DININGTYPE not between", value1, value2, "diningtype");
            return (Criteria) this;
        }

        public Criteria andStreetnoIsNull() {
            addCriterion("STREETNO is null");
            return (Criteria) this;
        }

        public Criteria andStreetnoIsNotNull() {
            addCriterion("STREETNO is not null");
            return (Criteria) this;
        }

        public Criteria andStreetnoEqualTo(Integer value) {
            addCriterion("STREETNO =", value, "streetno");
            return (Criteria) this;
        }

        public Criteria andStreetnoNotEqualTo(Integer value) {
            addCriterion("STREETNO <>", value, "streetno");
            return (Criteria) this;
        }

        public Criteria andStreetnoGreaterThan(Integer value) {
            addCriterion("STREETNO >", value, "streetno");
            return (Criteria) this;
        }

        public Criteria andStreetnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("STREETNO >=", value, "streetno");
            return (Criteria) this;
        }

        public Criteria andStreetnoLessThan(Integer value) {
            addCriterion("STREETNO <", value, "streetno");
            return (Criteria) this;
        }

        public Criteria andStreetnoLessThanOrEqualTo(Integer value) {
            addCriterion("STREETNO <=", value, "streetno");
            return (Criteria) this;
        }

        public Criteria andStreetnoIn(List<Integer> values) {
            addCriterion("STREETNO in", values, "streetno");
            return (Criteria) this;
        }

        public Criteria andStreetnoNotIn(List<Integer> values) {
            addCriterion("STREETNO not in", values, "streetno");
            return (Criteria) this;
        }

        public Criteria andStreetnoBetween(Integer value1, Integer value2) {
            addCriterion("STREETNO between", value1, value2, "streetno");
            return (Criteria) this;
        }

        public Criteria andStreetnoNotBetween(Integer value1, Integer value2) {
            addCriterion("STREETNO not between", value1, value2, "streetno");
            return (Criteria) this;
        }

        public Criteria andStreetnameIsNull() {
            addCriterion("STREETNAME is null");
            return (Criteria) this;
        }

        public Criteria andStreetnameIsNotNull() {
            addCriterion("STREETNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStreetnameEqualTo(String value) {
            addCriterion("STREETNAME =", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameNotEqualTo(String value) {
            addCriterion("STREETNAME <>", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameGreaterThan(String value) {
            addCriterion("STREETNAME >", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameGreaterThanOrEqualTo(String value) {
            addCriterion("STREETNAME >=", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameLessThan(String value) {
            addCriterion("STREETNAME <", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameLessThanOrEqualTo(String value) {
            addCriterion("STREETNAME <=", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameLike(String value) {
            addCriterion("STREETNAME like", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameNotLike(String value) {
            addCriterion("STREETNAME not like", value, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameIn(List<String> values) {
            addCriterion("STREETNAME in", values, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameNotIn(List<String> values) {
            addCriterion("STREETNAME not in", values, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameBetween(String value1, String value2) {
            addCriterion("STREETNAME between", value1, value2, "streetname");
            return (Criteria) this;
        }

        public Criteria andStreetnameNotBetween(String value1, String value2) {
            addCriterion("STREETNAME not between", value1, value2, "streetname");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andZipIsNull() {
            addCriterion("ZIP is null");
            return (Criteria) this;
        }

        public Criteria andZipIsNotNull() {
            addCriterion("ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andZipEqualTo(Long value) {
            addCriterion("ZIP =", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotEqualTo(Long value) {
            addCriterion("ZIP <>", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThan(Long value) {
            addCriterion("ZIP >", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThanOrEqualTo(Long value) {
            addCriterion("ZIP >=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThan(Long value) {
            addCriterion("ZIP <", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThanOrEqualTo(Long value) {
            addCriterion("ZIP <=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipIn(List<Long> values) {
            addCriterion("ZIP in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotIn(List<Long> values) {
            addCriterion("ZIP not in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipBetween(Long value1, Long value2) {
            addCriterion("ZIP between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotBetween(Long value1, Long value2) {
            addCriterion("ZIP not between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andPricerangeIsNull() {
            addCriterion("PRICERANGE is null");
            return (Criteria) this;
        }

        public Criteria andPricerangeIsNotNull() {
            addCriterion("PRICERANGE is not null");
            return (Criteria) this;
        }

        public Criteria andPricerangeEqualTo(String value) {
            addCriterion("PRICERANGE =", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeNotEqualTo(String value) {
            addCriterion("PRICERANGE <>", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeGreaterThan(String value) {
            addCriterion("PRICERANGE >", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeGreaterThanOrEqualTo(String value) {
            addCriterion("PRICERANGE >=", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeLessThan(String value) {
            addCriterion("PRICERANGE <", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeLessThanOrEqualTo(String value) {
            addCriterion("PRICERANGE <=", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeLike(String value) {
            addCriterion("PRICERANGE like", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeNotLike(String value) {
            addCriterion("PRICERANGE not like", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeIn(List<String> values) {
            addCriterion("PRICERANGE in", values, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeNotIn(List<String> values) {
            addCriterion("PRICERANGE not in", values, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeBetween(String value1, String value2) {
            addCriterion("PRICERANGE between", value1, value2, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeNotBetween(String value1, String value2) {
            addCriterion("PRICERANGE not between", value1, value2, "pricerange");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagIsNull() {
            addCriterion("DELIVERYFLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagIsNotNull() {
            addCriterion("DELIVERYFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagEqualTo(String value) {
            addCriterion("DELIVERYFLAG =", value, "deliveryflag");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagNotEqualTo(String value) {
            addCriterion("DELIVERYFLAG <>", value, "deliveryflag");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagGreaterThan(String value) {
            addCriterion("DELIVERYFLAG >", value, "deliveryflag");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERYFLAG >=", value, "deliveryflag");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagLessThan(String value) {
            addCriterion("DELIVERYFLAG <", value, "deliveryflag");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagLessThanOrEqualTo(String value) {
            addCriterion("DELIVERYFLAG <=", value, "deliveryflag");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagLike(String value) {
            addCriterion("DELIVERYFLAG like", value, "deliveryflag");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagNotLike(String value) {
            addCriterion("DELIVERYFLAG not like", value, "deliveryflag");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagIn(List<String> values) {
            addCriterion("DELIVERYFLAG in", values, "deliveryflag");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagNotIn(List<String> values) {
            addCriterion("DELIVERYFLAG not in", values, "deliveryflag");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagBetween(String value1, String value2) {
            addCriterion("DELIVERYFLAG between", value1, value2, "deliveryflag");
            return (Criteria) this;
        }

        public Criteria andDeliveryflagNotBetween(String value1, String value2) {
            addCriterion("DELIVERYFLAG not between", value1, value2, "deliveryflag");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagIsNull() {
            addCriterion("OUTDOORSEATINGFLAG is null");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagIsNotNull() {
            addCriterion("OUTDOORSEATINGFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagEqualTo(String value) {
            addCriterion("OUTDOORSEATINGFLAG =", value, "outdoorseatingflag");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagNotEqualTo(String value) {
            addCriterion("OUTDOORSEATINGFLAG <>", value, "outdoorseatingflag");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagGreaterThan(String value) {
            addCriterion("OUTDOORSEATINGFLAG >", value, "outdoorseatingflag");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagGreaterThanOrEqualTo(String value) {
            addCriterion("OUTDOORSEATINGFLAG >=", value, "outdoorseatingflag");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagLessThan(String value) {
            addCriterion("OUTDOORSEATINGFLAG <", value, "outdoorseatingflag");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagLessThanOrEqualTo(String value) {
            addCriterion("OUTDOORSEATINGFLAG <=", value, "outdoorseatingflag");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagLike(String value) {
            addCriterion("OUTDOORSEATINGFLAG like", value, "outdoorseatingflag");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagNotLike(String value) {
            addCriterion("OUTDOORSEATINGFLAG not like", value, "outdoorseatingflag");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagIn(List<String> values) {
            addCriterion("OUTDOORSEATINGFLAG in", values, "outdoorseatingflag");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagNotIn(List<String> values) {
            addCriterion("OUTDOORSEATINGFLAG not in", values, "outdoorseatingflag");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagBetween(String value1, String value2) {
            addCriterion("OUTDOORSEATINGFLAG between", value1, value2, "outdoorseatingflag");
            return (Criteria) this;
        }

        public Criteria andOutdoorseatingflagNotBetween(String value1, String value2) {
            addCriterion("OUTDOORSEATINGFLAG not between", value1, value2, "outdoorseatingflag");
            return (Criteria) this;
        }
        
        public Criteria andRestaurantNameLikeInsensitive(String value) {
      	  addCriterion("upper(RNAME) like",
      	    value.toUpperCase(), "rname");
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