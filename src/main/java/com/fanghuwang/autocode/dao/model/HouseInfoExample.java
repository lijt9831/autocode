package com.fanghuwang.autocode.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HouseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHouseCodeIsNull() {
            addCriterion("house_code is null");
            return (Criteria) this;
        }

        public Criteria andHouseCodeIsNotNull() {
            addCriterion("house_code is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCodeEqualTo(String value) {
            addCriterion("house_code =", value, "houseCode");
            return (Criteria) this;
        }

        public Criteria andHouseCodeNotEqualTo(String value) {
            addCriterion("house_code <>", value, "houseCode");
            return (Criteria) this;
        }

        public Criteria andHouseCodeGreaterThan(String value) {
            addCriterion("house_code >", value, "houseCode");
            return (Criteria) this;
        }

        public Criteria andHouseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("house_code >=", value, "houseCode");
            return (Criteria) this;
        }

        public Criteria andHouseCodeLessThan(String value) {
            addCriterion("house_code <", value, "houseCode");
            return (Criteria) this;
        }

        public Criteria andHouseCodeLessThanOrEqualTo(String value) {
            addCriterion("house_code <=", value, "houseCode");
            return (Criteria) this;
        }

        public Criteria andHouseCodeLike(String value) {
            addCriterion("house_code like", value, "houseCode");
            return (Criteria) this;
        }

        public Criteria andHouseCodeNotLike(String value) {
            addCriterion("house_code not like", value, "houseCode");
            return (Criteria) this;
        }

        public Criteria andHouseCodeIn(List<String> values) {
            addCriterion("house_code in", values, "houseCode");
            return (Criteria) this;
        }

        public Criteria andHouseCodeNotIn(List<String> values) {
            addCriterion("house_code not in", values, "houseCode");
            return (Criteria) this;
        }

        public Criteria andHouseCodeBetween(String value1, String value2) {
            addCriterion("house_code between", value1, value2, "houseCode");
            return (Criteria) this;
        }

        public Criteria andHouseCodeNotBetween(String value1, String value2) {
            addCriterion("house_code not between", value1, value2, "houseCode");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoIsNull() {
            addCriterion("house_cert_no is null");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoIsNotNull() {
            addCriterion("house_cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoEqualTo(String value) {
            addCriterion("house_cert_no =", value, "houseCertNo");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoNotEqualTo(String value) {
            addCriterion("house_cert_no <>", value, "houseCertNo");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoGreaterThan(String value) {
            addCriterion("house_cert_no >", value, "houseCertNo");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("house_cert_no >=", value, "houseCertNo");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoLessThan(String value) {
            addCriterion("house_cert_no <", value, "houseCertNo");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoLessThanOrEqualTo(String value) {
            addCriterion("house_cert_no <=", value, "houseCertNo");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoLike(String value) {
            addCriterion("house_cert_no like", value, "houseCertNo");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoNotLike(String value) {
            addCriterion("house_cert_no not like", value, "houseCertNo");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoIn(List<String> values) {
            addCriterion("house_cert_no in", values, "houseCertNo");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoNotIn(List<String> values) {
            addCriterion("house_cert_no not in", values, "houseCertNo");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoBetween(String value1, String value2) {
            addCriterion("house_cert_no between", value1, value2, "houseCertNo");
            return (Criteria) this;
        }

        public Criteria andHouseCertNoNotBetween(String value1, String value2) {
            addCriterion("house_cert_no not between", value1, value2, "houseCertNo");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeIsNull() {
            addCriterion("house_province_code is null");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeIsNotNull() {
            addCriterion("house_province_code is not null");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeEqualTo(String value) {
            addCriterion("house_province_code =", value, "houseProvinceCode");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeNotEqualTo(String value) {
            addCriterion("house_province_code <>", value, "houseProvinceCode");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeGreaterThan(String value) {
            addCriterion("house_province_code >", value, "houseProvinceCode");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("house_province_code >=", value, "houseProvinceCode");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeLessThan(String value) {
            addCriterion("house_province_code <", value, "houseProvinceCode");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("house_province_code <=", value, "houseProvinceCode");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeLike(String value) {
            addCriterion("house_province_code like", value, "houseProvinceCode");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeNotLike(String value) {
            addCriterion("house_province_code not like", value, "houseProvinceCode");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeIn(List<String> values) {
            addCriterion("house_province_code in", values, "houseProvinceCode");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeNotIn(List<String> values) {
            addCriterion("house_province_code not in", values, "houseProvinceCode");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeBetween(String value1, String value2) {
            addCriterion("house_province_code between", value1, value2, "houseProvinceCode");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("house_province_code not between", value1, value2, "houseProvinceCode");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceIsNull() {
            addCriterion("house_province is null");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceIsNotNull() {
            addCriterion("house_province is not null");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceEqualTo(String value) {
            addCriterion("house_province =", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceNotEqualTo(String value) {
            addCriterion("house_province <>", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceGreaterThan(String value) {
            addCriterion("house_province >", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("house_province >=", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceLessThan(String value) {
            addCriterion("house_province <", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceLessThanOrEqualTo(String value) {
            addCriterion("house_province <=", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceLike(String value) {
            addCriterion("house_province like", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceNotLike(String value) {
            addCriterion("house_province not like", value, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceIn(List<String> values) {
            addCriterion("house_province in", values, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceNotIn(List<String> values) {
            addCriterion("house_province not in", values, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceBetween(String value1, String value2) {
            addCriterion("house_province between", value1, value2, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProvinceNotBetween(String value1, String value2) {
            addCriterion("house_province not between", value1, value2, "houseProvince");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeIsNull() {
            addCriterion("house_city_code is null");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeIsNotNull() {
            addCriterion("house_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeEqualTo(String value) {
            addCriterion("house_city_code =", value, "houseCityCode");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeNotEqualTo(String value) {
            addCriterion("house_city_code <>", value, "houseCityCode");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeGreaterThan(String value) {
            addCriterion("house_city_code >", value, "houseCityCode");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("house_city_code >=", value, "houseCityCode");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeLessThan(String value) {
            addCriterion("house_city_code <", value, "houseCityCode");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeLessThanOrEqualTo(String value) {
            addCriterion("house_city_code <=", value, "houseCityCode");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeLike(String value) {
            addCriterion("house_city_code like", value, "houseCityCode");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeNotLike(String value) {
            addCriterion("house_city_code not like", value, "houseCityCode");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeIn(List<String> values) {
            addCriterion("house_city_code in", values, "houseCityCode");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeNotIn(List<String> values) {
            addCriterion("house_city_code not in", values, "houseCityCode");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeBetween(String value1, String value2) {
            addCriterion("house_city_code between", value1, value2, "houseCityCode");
            return (Criteria) this;
        }

        public Criteria andHouseCityCodeNotBetween(String value1, String value2) {
            addCriterion("house_city_code not between", value1, value2, "houseCityCode");
            return (Criteria) this;
        }

        public Criteria andHouseCityIsNull() {
            addCriterion("house_city is null");
            return (Criteria) this;
        }

        public Criteria andHouseCityIsNotNull() {
            addCriterion("house_city is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCityEqualTo(String value) {
            addCriterion("house_city =", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityNotEqualTo(String value) {
            addCriterion("house_city <>", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityGreaterThan(String value) {
            addCriterion("house_city >", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityGreaterThanOrEqualTo(String value) {
            addCriterion("house_city >=", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityLessThan(String value) {
            addCriterion("house_city <", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityLessThanOrEqualTo(String value) {
            addCriterion("house_city <=", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityLike(String value) {
            addCriterion("house_city like", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityNotLike(String value) {
            addCriterion("house_city not like", value, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityIn(List<String> values) {
            addCriterion("house_city in", values, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityNotIn(List<String> values) {
            addCriterion("house_city not in", values, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityBetween(String value1, String value2) {
            addCriterion("house_city between", value1, value2, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCityNotBetween(String value1, String value2) {
            addCriterion("house_city not between", value1, value2, "houseCity");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeIsNull() {
            addCriterion("house_county_code is null");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeIsNotNull() {
            addCriterion("house_county_code is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeEqualTo(String value) {
            addCriterion("house_county_code =", value, "houseCountyCode");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeNotEqualTo(String value) {
            addCriterion("house_county_code <>", value, "houseCountyCode");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeGreaterThan(String value) {
            addCriterion("house_county_code >", value, "houseCountyCode");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("house_county_code >=", value, "houseCountyCode");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeLessThan(String value) {
            addCriterion("house_county_code <", value, "houseCountyCode");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("house_county_code <=", value, "houseCountyCode");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeLike(String value) {
            addCriterion("house_county_code like", value, "houseCountyCode");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeNotLike(String value) {
            addCriterion("house_county_code not like", value, "houseCountyCode");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeIn(List<String> values) {
            addCriterion("house_county_code in", values, "houseCountyCode");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeNotIn(List<String> values) {
            addCriterion("house_county_code not in", values, "houseCountyCode");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeBetween(String value1, String value2) {
            addCriterion("house_county_code between", value1, value2, "houseCountyCode");
            return (Criteria) this;
        }

        public Criteria andHouseCountyCodeNotBetween(String value1, String value2) {
            addCriterion("house_county_code not between", value1, value2, "houseCountyCode");
            return (Criteria) this;
        }

        public Criteria andHouseCountyIsNull() {
            addCriterion("house_county is null");
            return (Criteria) this;
        }

        public Criteria andHouseCountyIsNotNull() {
            addCriterion("house_county is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCountyEqualTo(String value) {
            addCriterion("house_county =", value, "houseCounty");
            return (Criteria) this;
        }

        public Criteria andHouseCountyNotEqualTo(String value) {
            addCriterion("house_county <>", value, "houseCounty");
            return (Criteria) this;
        }

        public Criteria andHouseCountyGreaterThan(String value) {
            addCriterion("house_county >", value, "houseCounty");
            return (Criteria) this;
        }

        public Criteria andHouseCountyGreaterThanOrEqualTo(String value) {
            addCriterion("house_county >=", value, "houseCounty");
            return (Criteria) this;
        }

        public Criteria andHouseCountyLessThan(String value) {
            addCriterion("house_county <", value, "houseCounty");
            return (Criteria) this;
        }

        public Criteria andHouseCountyLessThanOrEqualTo(String value) {
            addCriterion("house_county <=", value, "houseCounty");
            return (Criteria) this;
        }

        public Criteria andHouseCountyLike(String value) {
            addCriterion("house_county like", value, "houseCounty");
            return (Criteria) this;
        }

        public Criteria andHouseCountyNotLike(String value) {
            addCriterion("house_county not like", value, "houseCounty");
            return (Criteria) this;
        }

        public Criteria andHouseCountyIn(List<String> values) {
            addCriterion("house_county in", values, "houseCounty");
            return (Criteria) this;
        }

        public Criteria andHouseCountyNotIn(List<String> values) {
            addCriterion("house_county not in", values, "houseCounty");
            return (Criteria) this;
        }

        public Criteria andHouseCountyBetween(String value1, String value2) {
            addCriterion("house_county between", value1, value2, "houseCounty");
            return (Criteria) this;
        }

        public Criteria andHouseCountyNotBetween(String value1, String value2) {
            addCriterion("house_county not between", value1, value2, "houseCounty");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNull() {
            addCriterion("house_address is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNotNull() {
            addCriterion("house_address is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressEqualTo(String value) {
            addCriterion("house_address =", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotEqualTo(String value) {
            addCriterion("house_address <>", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThan(String value) {
            addCriterion("house_address >", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("house_address >=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThan(String value) {
            addCriterion("house_address <", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThanOrEqualTo(String value) {
            addCriterion("house_address <=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLike(String value) {
            addCriterion("house_address like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotLike(String value) {
            addCriterion("house_address not like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIn(List<String> values) {
            addCriterion("house_address in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotIn(List<String> values) {
            addCriterion("house_address not in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressBetween(String value1, String value2) {
            addCriterion("house_address between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotBetween(String value1, String value2) {
            addCriterion("house_address not between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseLocationIsNull() {
            addCriterion("house_location is null");
            return (Criteria) this;
        }

        public Criteria andHouseLocationIsNotNull() {
            addCriterion("house_location is not null");
            return (Criteria) this;
        }

        public Criteria andHouseLocationEqualTo(String value) {
            addCriterion("house_location =", value, "houseLocation");
            return (Criteria) this;
        }

        public Criteria andHouseLocationNotEqualTo(String value) {
            addCriterion("house_location <>", value, "houseLocation");
            return (Criteria) this;
        }

        public Criteria andHouseLocationGreaterThan(String value) {
            addCriterion("house_location >", value, "houseLocation");
            return (Criteria) this;
        }

        public Criteria andHouseLocationGreaterThanOrEqualTo(String value) {
            addCriterion("house_location >=", value, "houseLocation");
            return (Criteria) this;
        }

        public Criteria andHouseLocationLessThan(String value) {
            addCriterion("house_location <", value, "houseLocation");
            return (Criteria) this;
        }

        public Criteria andHouseLocationLessThanOrEqualTo(String value) {
            addCriterion("house_location <=", value, "houseLocation");
            return (Criteria) this;
        }

        public Criteria andHouseLocationLike(String value) {
            addCriterion("house_location like", value, "houseLocation");
            return (Criteria) this;
        }

        public Criteria andHouseLocationNotLike(String value) {
            addCriterion("house_location not like", value, "houseLocation");
            return (Criteria) this;
        }

        public Criteria andHouseLocationIn(List<String> values) {
            addCriterion("house_location in", values, "houseLocation");
            return (Criteria) this;
        }

        public Criteria andHouseLocationNotIn(List<String> values) {
            addCriterion("house_location not in", values, "houseLocation");
            return (Criteria) this;
        }

        public Criteria andHouseLocationBetween(String value1, String value2) {
            addCriterion("house_location between", value1, value2, "houseLocation");
            return (Criteria) this;
        }

        public Criteria andHouseLocationNotBetween(String value1, String value2) {
            addCriterion("house_location not between", value1, value2, "houseLocation");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIsNull() {
            addCriterion("family_member is null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIsNotNull() {
            addCriterion("family_member is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberEqualTo(String value) {
            addCriterion("family_member =", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNotEqualTo(String value) {
            addCriterion("family_member <>", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGreaterThan(String value) {
            addCriterion("family_member >", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGreaterThanOrEqualTo(String value) {
            addCriterion("family_member >=", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberLessThan(String value) {
            addCriterion("family_member <", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberLessThanOrEqualTo(String value) {
            addCriterion("family_member <=", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberLike(String value) {
            addCriterion("family_member like", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNotLike(String value) {
            addCriterion("family_member not like", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIn(List<String> values) {
            addCriterion("family_member in", values, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNotIn(List<String> values) {
            addCriterion("family_member not in", values, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberBetween(String value1, String value2) {
            addCriterion("family_member between", value1, value2, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNotBetween(String value1, String value2) {
            addCriterion("family_member not between", value1, value2, "familyMember");
            return (Criteria) this;
        }

        public Criteria andHouseUseIsNull() {
            addCriterion("house_use is null");
            return (Criteria) this;
        }

        public Criteria andHouseUseIsNotNull() {
            addCriterion("house_use is not null");
            return (Criteria) this;
        }

        public Criteria andHouseUseEqualTo(String value) {
            addCriterion("house_use =", value, "houseUse");
            return (Criteria) this;
        }

        public Criteria andHouseUseNotEqualTo(String value) {
            addCriterion("house_use <>", value, "houseUse");
            return (Criteria) this;
        }

        public Criteria andHouseUseGreaterThan(String value) {
            addCriterion("house_use >", value, "houseUse");
            return (Criteria) this;
        }

        public Criteria andHouseUseGreaterThanOrEqualTo(String value) {
            addCriterion("house_use >=", value, "houseUse");
            return (Criteria) this;
        }

        public Criteria andHouseUseLessThan(String value) {
            addCriterion("house_use <", value, "houseUse");
            return (Criteria) this;
        }

        public Criteria andHouseUseLessThanOrEqualTo(String value) {
            addCriterion("house_use <=", value, "houseUse");
            return (Criteria) this;
        }

        public Criteria andHouseUseLike(String value) {
            addCriterion("house_use like", value, "houseUse");
            return (Criteria) this;
        }

        public Criteria andHouseUseNotLike(String value) {
            addCriterion("house_use not like", value, "houseUse");
            return (Criteria) this;
        }

        public Criteria andHouseUseIn(List<String> values) {
            addCriterion("house_use in", values, "houseUse");
            return (Criteria) this;
        }

        public Criteria andHouseUseNotIn(List<String> values) {
            addCriterion("house_use not in", values, "houseUse");
            return (Criteria) this;
        }

        public Criteria andHouseUseBetween(String value1, String value2) {
            addCriterion("house_use between", value1, value2, "houseUse");
            return (Criteria) this;
        }

        public Criteria andHouseUseNotBetween(String value1, String value2) {
            addCriterion("house_use not between", value1, value2, "houseUse");
            return (Criteria) this;
        }

        public Criteria andGuihuayongtuIsNull() {
            addCriterion("guihuayongtu is null");
            return (Criteria) this;
        }

        public Criteria andGuihuayongtuIsNotNull() {
            addCriterion("guihuayongtu is not null");
            return (Criteria) this;
        }

        public Criteria andGuihuayongtuEqualTo(Byte value) {
            addCriterion("guihuayongtu =", value, "guihuayongtu");
            return (Criteria) this;
        }

        public Criteria andGuihuayongtuNotEqualTo(Byte value) {
            addCriterion("guihuayongtu <>", value, "guihuayongtu");
            return (Criteria) this;
        }

        public Criteria andGuihuayongtuGreaterThan(Byte value) {
            addCriterion("guihuayongtu >", value, "guihuayongtu");
            return (Criteria) this;
        }

        public Criteria andGuihuayongtuGreaterThanOrEqualTo(Byte value) {
            addCriterion("guihuayongtu >=", value, "guihuayongtu");
            return (Criteria) this;
        }

        public Criteria andGuihuayongtuLessThan(Byte value) {
            addCriterion("guihuayongtu <", value, "guihuayongtu");
            return (Criteria) this;
        }

        public Criteria andGuihuayongtuLessThanOrEqualTo(Byte value) {
            addCriterion("guihuayongtu <=", value, "guihuayongtu");
            return (Criteria) this;
        }

        public Criteria andGuihuayongtuIn(List<Byte> values) {
            addCriterion("guihuayongtu in", values, "guihuayongtu");
            return (Criteria) this;
        }

        public Criteria andGuihuayongtuNotIn(List<Byte> values) {
            addCriterion("guihuayongtu not in", values, "guihuayongtu");
            return (Criteria) this;
        }

        public Criteria andGuihuayongtuBetween(Byte value1, Byte value2) {
            addCriterion("guihuayongtu between", value1, value2, "guihuayongtu");
            return (Criteria) this;
        }

        public Criteria andGuihuayongtuNotBetween(Byte value1, Byte value2) {
            addCriterion("guihuayongtu not between", value1, value2, "guihuayongtu");
            return (Criteria) this;
        }

        public Criteria andPropertyAccessIsNull() {
            addCriterion("property_access is null");
            return (Criteria) this;
        }

        public Criteria andPropertyAccessIsNotNull() {
            addCriterion("property_access is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyAccessEqualTo(Byte value) {
            addCriterion("property_access =", value, "propertyAccess");
            return (Criteria) this;
        }

        public Criteria andPropertyAccessNotEqualTo(Byte value) {
            addCriterion("property_access <>", value, "propertyAccess");
            return (Criteria) this;
        }

        public Criteria andPropertyAccessGreaterThan(Byte value) {
            addCriterion("property_access >", value, "propertyAccess");
            return (Criteria) this;
        }

        public Criteria andPropertyAccessGreaterThanOrEqualTo(Byte value) {
            addCriterion("property_access >=", value, "propertyAccess");
            return (Criteria) this;
        }

        public Criteria andPropertyAccessLessThan(Byte value) {
            addCriterion("property_access <", value, "propertyAccess");
            return (Criteria) this;
        }

        public Criteria andPropertyAccessLessThanOrEqualTo(Byte value) {
            addCriterion("property_access <=", value, "propertyAccess");
            return (Criteria) this;
        }

        public Criteria andPropertyAccessIn(List<Byte> values) {
            addCriterion("property_access in", values, "propertyAccess");
            return (Criteria) this;
        }

        public Criteria andPropertyAccessNotIn(List<Byte> values) {
            addCriterion("property_access not in", values, "propertyAccess");
            return (Criteria) this;
        }

        public Criteria andPropertyAccessBetween(Byte value1, Byte value2) {
            addCriterion("property_access between", value1, value2, "propertyAccess");
            return (Criteria) this;
        }

        public Criteria andPropertyAccessNotBetween(Byte value1, Byte value2) {
            addCriterion("property_access not between", value1, value2, "propertyAccess");
            return (Criteria) this;
        }

        public Criteria andChanquanIsNull() {
            addCriterion("chanquan is null");
            return (Criteria) this;
        }

        public Criteria andChanquanIsNotNull() {
            addCriterion("chanquan is not null");
            return (Criteria) this;
        }

        public Criteria andChanquanEqualTo(Byte value) {
            addCriterion("chanquan =", value, "chanquan");
            return (Criteria) this;
        }

        public Criteria andChanquanNotEqualTo(Byte value) {
            addCriterion("chanquan <>", value, "chanquan");
            return (Criteria) this;
        }

        public Criteria andChanquanGreaterThan(Byte value) {
            addCriterion("chanquan >", value, "chanquan");
            return (Criteria) this;
        }

        public Criteria andChanquanGreaterThanOrEqualTo(Byte value) {
            addCriterion("chanquan >=", value, "chanquan");
            return (Criteria) this;
        }

        public Criteria andChanquanLessThan(Byte value) {
            addCriterion("chanquan <", value, "chanquan");
            return (Criteria) this;
        }

        public Criteria andChanquanLessThanOrEqualTo(Byte value) {
            addCriterion("chanquan <=", value, "chanquan");
            return (Criteria) this;
        }

        public Criteria andChanquanIn(List<Byte> values) {
            addCriterion("chanquan in", values, "chanquan");
            return (Criteria) this;
        }

        public Criteria andChanquanNotIn(List<Byte> values) {
            addCriterion("chanquan not in", values, "chanquan");
            return (Criteria) this;
        }

        public Criteria andChanquanBetween(Byte value1, Byte value2) {
            addCriterion("chanquan between", value1, value2, "chanquan");
            return (Criteria) this;
        }

        public Criteria andChanquanNotBetween(Byte value1, Byte value2) {
            addCriterion("chanquan not between", value1, value2, "chanquan");
            return (Criteria) this;
        }

        public Criteria andIsManwuweiyiIsNull() {
            addCriterion("is_manwuweiyi is null");
            return (Criteria) this;
        }

        public Criteria andIsManwuweiyiIsNotNull() {
            addCriterion("is_manwuweiyi is not null");
            return (Criteria) this;
        }

        public Criteria andIsManwuweiyiEqualTo(Byte value) {
            addCriterion("is_manwuweiyi =", value, "isManwuweiyi");
            return (Criteria) this;
        }

        public Criteria andIsManwuweiyiNotEqualTo(Byte value) {
            addCriterion("is_manwuweiyi <>", value, "isManwuweiyi");
            return (Criteria) this;
        }

        public Criteria andIsManwuweiyiGreaterThan(Byte value) {
            addCriterion("is_manwuweiyi >", value, "isManwuweiyi");
            return (Criteria) this;
        }

        public Criteria andIsManwuweiyiGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_manwuweiyi >=", value, "isManwuweiyi");
            return (Criteria) this;
        }

        public Criteria andIsManwuweiyiLessThan(Byte value) {
            addCriterion("is_manwuweiyi <", value, "isManwuweiyi");
            return (Criteria) this;
        }

        public Criteria andIsManwuweiyiLessThanOrEqualTo(Byte value) {
            addCriterion("is_manwuweiyi <=", value, "isManwuweiyi");
            return (Criteria) this;
        }

        public Criteria andIsManwuweiyiIn(List<Byte> values) {
            addCriterion("is_manwuweiyi in", values, "isManwuweiyi");
            return (Criteria) this;
        }

        public Criteria andIsManwuweiyiNotIn(List<Byte> values) {
            addCriterion("is_manwuweiyi not in", values, "isManwuweiyi");
            return (Criteria) this;
        }

        public Criteria andIsManwuweiyiBetween(Byte value1, Byte value2) {
            addCriterion("is_manwuweiyi between", value1, value2, "isManwuweiyi");
            return (Criteria) this;
        }

        public Criteria andIsManwuweiyiNotBetween(Byte value1, Byte value2) {
            addCriterion("is_manwuweiyi not between", value1, value2, "isManwuweiyi");
            return (Criteria) this;
        }

        public Criteria andIsXuequIsNull() {
            addCriterion("is_xuequ is null");
            return (Criteria) this;
        }

        public Criteria andIsXuequIsNotNull() {
            addCriterion("is_xuequ is not null");
            return (Criteria) this;
        }

        public Criteria andIsXuequEqualTo(Byte value) {
            addCriterion("is_xuequ =", value, "isXuequ");
            return (Criteria) this;
        }

        public Criteria andIsXuequNotEqualTo(Byte value) {
            addCriterion("is_xuequ <>", value, "isXuequ");
            return (Criteria) this;
        }

        public Criteria andIsXuequGreaterThan(Byte value) {
            addCriterion("is_xuequ >", value, "isXuequ");
            return (Criteria) this;
        }

        public Criteria andIsXuequGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_xuequ >=", value, "isXuequ");
            return (Criteria) this;
        }

        public Criteria andIsXuequLessThan(Byte value) {
            addCriterion("is_xuequ <", value, "isXuequ");
            return (Criteria) this;
        }

        public Criteria andIsXuequLessThanOrEqualTo(Byte value) {
            addCriterion("is_xuequ <=", value, "isXuequ");
            return (Criteria) this;
        }

        public Criteria andIsXuequIn(List<Byte> values) {
            addCriterion("is_xuequ in", values, "isXuequ");
            return (Criteria) this;
        }

        public Criteria andIsXuequNotIn(List<Byte> values) {
            addCriterion("is_xuequ not in", values, "isXuequ");
            return (Criteria) this;
        }

        public Criteria andIsXuequBetween(Byte value1, Byte value2) {
            addCriterion("is_xuequ between", value1, value2, "isXuequ");
            return (Criteria) this;
        }

        public Criteria andIsXuequNotBetween(Byte value1, Byte value2) {
            addCriterion("is_xuequ not between", value1, value2, "isXuequ");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("school_name is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("school_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("school_name =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("school_name <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("school_name >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("school_name >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("school_name <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("school_name <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("school_name like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_name not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("school_name in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("school_name not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("school_name between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("school_name not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andAllFloorsIsNull() {
            addCriterion("all_floors is null");
            return (Criteria) this;
        }

        public Criteria andAllFloorsIsNotNull() {
            addCriterion("all_floors is not null");
            return (Criteria) this;
        }

        public Criteria andAllFloorsEqualTo(Integer value) {
            addCriterion("all_floors =", value, "allFloors");
            return (Criteria) this;
        }

        public Criteria andAllFloorsNotEqualTo(Integer value) {
            addCriterion("all_floors <>", value, "allFloors");
            return (Criteria) this;
        }

        public Criteria andAllFloorsGreaterThan(Integer value) {
            addCriterion("all_floors >", value, "allFloors");
            return (Criteria) this;
        }

        public Criteria andAllFloorsGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_floors >=", value, "allFloors");
            return (Criteria) this;
        }

        public Criteria andAllFloorsLessThan(Integer value) {
            addCriterion("all_floors <", value, "allFloors");
            return (Criteria) this;
        }

        public Criteria andAllFloorsLessThanOrEqualTo(Integer value) {
            addCriterion("all_floors <=", value, "allFloors");
            return (Criteria) this;
        }

        public Criteria andAllFloorsIn(List<Integer> values) {
            addCriterion("all_floors in", values, "allFloors");
            return (Criteria) this;
        }

        public Criteria andAllFloorsNotIn(List<Integer> values) {
            addCriterion("all_floors not in", values, "allFloors");
            return (Criteria) this;
        }

        public Criteria andAllFloorsBetween(Integer value1, Integer value2) {
            addCriterion("all_floors between", value1, value2, "allFloors");
            return (Criteria) this;
        }

        public Criteria andAllFloorsNotBetween(Integer value1, Integer value2) {
            addCriterion("all_floors not between", value1, value2, "allFloors");
            return (Criteria) this;
        }

        public Criteria andInFloorsIsNull() {
            addCriterion("in_floors is null");
            return (Criteria) this;
        }

        public Criteria andInFloorsIsNotNull() {
            addCriterion("in_floors is not null");
            return (Criteria) this;
        }

        public Criteria andInFloorsEqualTo(Integer value) {
            addCriterion("in_floors =", value, "inFloors");
            return (Criteria) this;
        }

        public Criteria andInFloorsNotEqualTo(Integer value) {
            addCriterion("in_floors <>", value, "inFloors");
            return (Criteria) this;
        }

        public Criteria andInFloorsGreaterThan(Integer value) {
            addCriterion("in_floors >", value, "inFloors");
            return (Criteria) this;
        }

        public Criteria andInFloorsGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_floors >=", value, "inFloors");
            return (Criteria) this;
        }

        public Criteria andInFloorsLessThan(Integer value) {
            addCriterion("in_floors <", value, "inFloors");
            return (Criteria) this;
        }

        public Criteria andInFloorsLessThanOrEqualTo(Integer value) {
            addCriterion("in_floors <=", value, "inFloors");
            return (Criteria) this;
        }

        public Criteria andInFloorsIn(List<Integer> values) {
            addCriterion("in_floors in", values, "inFloors");
            return (Criteria) this;
        }

        public Criteria andInFloorsNotIn(List<Integer> values) {
            addCriterion("in_floors not in", values, "inFloors");
            return (Criteria) this;
        }

        public Criteria andInFloorsBetween(Integer value1, Integer value2) {
            addCriterion("in_floors between", value1, value2, "inFloors");
            return (Criteria) this;
        }

        public Criteria andInFloorsNotBetween(Integer value1, Integer value2) {
            addCriterion("in_floors not between", value1, value2, "inFloors");
            return (Criteria) this;
        }

        public Criteria andHouseSizeIsNull() {
            addCriterion("house_size is null");
            return (Criteria) this;
        }

        public Criteria andHouseSizeIsNotNull() {
            addCriterion("house_size is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSizeEqualTo(Float value) {
            addCriterion("house_size =", value, "houseSize");
            return (Criteria) this;
        }

        public Criteria andHouseSizeNotEqualTo(Float value) {
            addCriterion("house_size <>", value, "houseSize");
            return (Criteria) this;
        }

        public Criteria andHouseSizeGreaterThan(Float value) {
            addCriterion("house_size >", value, "houseSize");
            return (Criteria) this;
        }

        public Criteria andHouseSizeGreaterThanOrEqualTo(Float value) {
            addCriterion("house_size >=", value, "houseSize");
            return (Criteria) this;
        }

        public Criteria andHouseSizeLessThan(Float value) {
            addCriterion("house_size <", value, "houseSize");
            return (Criteria) this;
        }

        public Criteria andHouseSizeLessThanOrEqualTo(Float value) {
            addCriterion("house_size <=", value, "houseSize");
            return (Criteria) this;
        }

        public Criteria andHouseSizeIn(List<Float> values) {
            addCriterion("house_size in", values, "houseSize");
            return (Criteria) this;
        }

        public Criteria andHouseSizeNotIn(List<Float> values) {
            addCriterion("house_size not in", values, "houseSize");
            return (Criteria) this;
        }

        public Criteria andHouseSizeBetween(Float value1, Float value2) {
            addCriterion("house_size between", value1, value2, "houseSize");
            return (Criteria) this;
        }

        public Criteria andHouseSizeNotBetween(Float value1, Float value2) {
            addCriterion("house_size not between", value1, value2, "houseSize");
            return (Criteria) this;
        }

        public Criteria andBuiltInIsNull() {
            addCriterion("built_in is null");
            return (Criteria) this;
        }

        public Criteria andBuiltInIsNotNull() {
            addCriterion("built_in is not null");
            return (Criteria) this;
        }

        public Criteria andBuiltInEqualTo(String value) {
            addCriterion("built_in =", value, "builtIn");
            return (Criteria) this;
        }

        public Criteria andBuiltInNotEqualTo(String value) {
            addCriterion("built_in <>", value, "builtIn");
            return (Criteria) this;
        }

        public Criteria andBuiltInGreaterThan(String value) {
            addCriterion("built_in >", value, "builtIn");
            return (Criteria) this;
        }

        public Criteria andBuiltInGreaterThanOrEqualTo(String value) {
            addCriterion("built_in >=", value, "builtIn");
            return (Criteria) this;
        }

        public Criteria andBuiltInLessThan(String value) {
            addCriterion("built_in <", value, "builtIn");
            return (Criteria) this;
        }

        public Criteria andBuiltInLessThanOrEqualTo(String value) {
            addCriterion("built_in <=", value, "builtIn");
            return (Criteria) this;
        }

        public Criteria andBuiltInLike(String value) {
            addCriterion("built_in like", value, "builtIn");
            return (Criteria) this;
        }

        public Criteria andBuiltInNotLike(String value) {
            addCriterion("built_in not like", value, "builtIn");
            return (Criteria) this;
        }

        public Criteria andBuiltInIn(List<String> values) {
            addCriterion("built_in in", values, "builtIn");
            return (Criteria) this;
        }

        public Criteria andBuiltInNotIn(List<String> values) {
            addCriterion("built_in not in", values, "builtIn");
            return (Criteria) this;
        }

        public Criteria andBuiltInBetween(String value1, String value2) {
            addCriterion("built_in between", value1, value2, "builtIn");
            return (Criteria) this;
        }

        public Criteria andBuiltInNotBetween(String value1, String value2) {
            addCriterion("built_in not between", value1, value2, "builtIn");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateIsNull() {
            addCriterion("house_register_date is null");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateIsNotNull() {
            addCriterion("house_register_date is not null");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateEqualTo(Date value) {
            addCriterionForJDBCDate("house_register_date =", value, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("house_register_date <>", value, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("house_register_date >", value, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("house_register_date >=", value, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateLessThan(Date value) {
            addCriterionForJDBCDate("house_register_date <", value, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("house_register_date <=", value, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateIn(List<Date> values) {
            addCriterionForJDBCDate("house_register_date in", values, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("house_register_date not in", values, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("house_register_date between", value1, value2, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("house_register_date not between", value1, value2, "houseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andHouseBuyDateIsNull() {
            addCriterion("house_buy_date is null");
            return (Criteria) this;
        }

        public Criteria andHouseBuyDateIsNotNull() {
            addCriterion("house_buy_date is not null");
            return (Criteria) this;
        }

        public Criteria andHouseBuyDateEqualTo(Date value) {
            addCriterionForJDBCDate("house_buy_date =", value, "houseBuyDate");
            return (Criteria) this;
        }

        public Criteria andHouseBuyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("house_buy_date <>", value, "houseBuyDate");
            return (Criteria) this;
        }

        public Criteria andHouseBuyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("house_buy_date >", value, "houseBuyDate");
            return (Criteria) this;
        }

        public Criteria andHouseBuyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("house_buy_date >=", value, "houseBuyDate");
            return (Criteria) this;
        }

        public Criteria andHouseBuyDateLessThan(Date value) {
            addCriterionForJDBCDate("house_buy_date <", value, "houseBuyDate");
            return (Criteria) this;
        }

        public Criteria andHouseBuyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("house_buy_date <=", value, "houseBuyDate");
            return (Criteria) this;
        }

        public Criteria andHouseBuyDateIn(List<Date> values) {
            addCriterionForJDBCDate("house_buy_date in", values, "houseBuyDate");
            return (Criteria) this;
        }

        public Criteria andHouseBuyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("house_buy_date not in", values, "houseBuyDate");
            return (Criteria) this;
        }

        public Criteria andHouseBuyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("house_buy_date between", value1, value2, "houseBuyDate");
            return (Criteria) this;
        }

        public Criteria andHouseBuyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("house_buy_date not between", value1, value2, "houseBuyDate");
            return (Criteria) this;
        }

        public Criteria andHouseStructureIsNull() {
            addCriterion("house_structure is null");
            return (Criteria) this;
        }

        public Criteria andHouseStructureIsNotNull() {
            addCriterion("house_structure is not null");
            return (Criteria) this;
        }

        public Criteria andHouseStructureEqualTo(Byte value) {
            addCriterion("house_structure =", value, "houseStructure");
            return (Criteria) this;
        }

        public Criteria andHouseStructureNotEqualTo(Byte value) {
            addCriterion("house_structure <>", value, "houseStructure");
            return (Criteria) this;
        }

        public Criteria andHouseStructureGreaterThan(Byte value) {
            addCriterion("house_structure >", value, "houseStructure");
            return (Criteria) this;
        }

        public Criteria andHouseStructureGreaterThanOrEqualTo(Byte value) {
            addCriterion("house_structure >=", value, "houseStructure");
            return (Criteria) this;
        }

        public Criteria andHouseStructureLessThan(Byte value) {
            addCriterion("house_structure <", value, "houseStructure");
            return (Criteria) this;
        }

        public Criteria andHouseStructureLessThanOrEqualTo(Byte value) {
            addCriterion("house_structure <=", value, "houseStructure");
            return (Criteria) this;
        }

        public Criteria andHouseStructureIn(List<Byte> values) {
            addCriterion("house_structure in", values, "houseStructure");
            return (Criteria) this;
        }

        public Criteria andHouseStructureNotIn(List<Byte> values) {
            addCriterion("house_structure not in", values, "houseStructure");
            return (Criteria) this;
        }

        public Criteria andHouseStructureBetween(Byte value1, Byte value2) {
            addCriterion("house_structure between", value1, value2, "houseStructure");
            return (Criteria) this;
        }

        public Criteria andHouseStructureNotBetween(Byte value1, Byte value2) {
            addCriterion("house_structure not between", value1, value2, "houseStructure");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Byte value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Byte value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Byte value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Byte value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Byte value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Byte> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Byte> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Byte value1, Byte value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Byte value1, Byte value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andHouseBuyMoneyIsNull() {
            addCriterion("house_buy_money is null");
            return (Criteria) this;
        }

        public Criteria andHouseBuyMoneyIsNotNull() {
            addCriterion("house_buy_money is not null");
            return (Criteria) this;
        }

        public Criteria andHouseBuyMoneyEqualTo(BigDecimal value) {
            addCriterion("house_buy_money =", value, "houseBuyMoney");
            return (Criteria) this;
        }

        public Criteria andHouseBuyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("house_buy_money <>", value, "houseBuyMoney");
            return (Criteria) this;
        }

        public Criteria andHouseBuyMoneyGreaterThan(BigDecimal value) {
            addCriterion("house_buy_money >", value, "houseBuyMoney");
            return (Criteria) this;
        }

        public Criteria andHouseBuyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("house_buy_money >=", value, "houseBuyMoney");
            return (Criteria) this;
        }

        public Criteria andHouseBuyMoneyLessThan(BigDecimal value) {
            addCriterion("house_buy_money <", value, "houseBuyMoney");
            return (Criteria) this;
        }

        public Criteria andHouseBuyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("house_buy_money <=", value, "houseBuyMoney");
            return (Criteria) this;
        }

        public Criteria andHouseBuyMoneyIn(List<BigDecimal> values) {
            addCriterion("house_buy_money in", values, "houseBuyMoney");
            return (Criteria) this;
        }

        public Criteria andHouseBuyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("house_buy_money not in", values, "houseBuyMoney");
            return (Criteria) this;
        }

        public Criteria andHouseBuyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_buy_money between", value1, value2, "houseBuyMoney");
            return (Criteria) this;
        }

        public Criteria andHouseBuyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("house_buy_money not between", value1, value2, "houseBuyMoney");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(Byte value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(Byte value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(Byte value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(Byte value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(Byte value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<Byte> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<Byte> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(Byte value1, Byte value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHousePropertyIsNull() {
            addCriterion("house_property is null");
            return (Criteria) this;
        }

        public Criteria andHousePropertyIsNotNull() {
            addCriterion("house_property is not null");
            return (Criteria) this;
        }

        public Criteria andHousePropertyEqualTo(Byte value) {
            addCriterion("house_property =", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyNotEqualTo(Byte value) {
            addCriterion("house_property <>", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyGreaterThan(Byte value) {
            addCriterion("house_property >", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyGreaterThanOrEqualTo(Byte value) {
            addCriterion("house_property >=", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyLessThan(Byte value) {
            addCriterion("house_property <", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyLessThanOrEqualTo(Byte value) {
            addCriterion("house_property <=", value, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyIn(List<Byte> values) {
            addCriterion("house_property in", values, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyNotIn(List<Byte> values) {
            addCriterion("house_property not in", values, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyBetween(Byte value1, Byte value2) {
            addCriterion("house_property between", value1, value2, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHousePropertyNotBetween(Byte value1, Byte value2) {
            addCriterion("house_property not between", value1, value2, "houseProperty");
            return (Criteria) this;
        }

        public Criteria andHuxingIsNull() {
            addCriterion("huxing is null");
            return (Criteria) this;
        }

        public Criteria andHuxingIsNotNull() {
            addCriterion("huxing is not null");
            return (Criteria) this;
        }

        public Criteria andHuxingEqualTo(Byte value) {
            addCriterion("huxing =", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingNotEqualTo(Byte value) {
            addCriterion("huxing <>", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingGreaterThan(Byte value) {
            addCriterion("huxing >", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingGreaterThanOrEqualTo(Byte value) {
            addCriterion("huxing >=", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingLessThan(Byte value) {
            addCriterion("huxing <", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingLessThanOrEqualTo(Byte value) {
            addCriterion("huxing <=", value, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingIn(List<Byte> values) {
            addCriterion("huxing in", values, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingNotIn(List<Byte> values) {
            addCriterion("huxing not in", values, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingBetween(Byte value1, Byte value2) {
            addCriterion("huxing between", value1, value2, "huxing");
            return (Criteria) this;
        }

        public Criteria andHuxingNotBetween(Byte value1, Byte value2) {
            addCriterion("huxing not between", value1, value2, "huxing");
            return (Criteria) this;
        }

        public Criteria andFangwuchaoxiangIsNull() {
            addCriterion("fangwuchaoxiang is null");
            return (Criteria) this;
        }

        public Criteria andFangwuchaoxiangIsNotNull() {
            addCriterion("fangwuchaoxiang is not null");
            return (Criteria) this;
        }

        public Criteria andFangwuchaoxiangEqualTo(Byte value) {
            addCriterion("fangwuchaoxiang =", value, "fangwuchaoxiang");
            return (Criteria) this;
        }

        public Criteria andFangwuchaoxiangNotEqualTo(Byte value) {
            addCriterion("fangwuchaoxiang <>", value, "fangwuchaoxiang");
            return (Criteria) this;
        }

        public Criteria andFangwuchaoxiangGreaterThan(Byte value) {
            addCriterion("fangwuchaoxiang >", value, "fangwuchaoxiang");
            return (Criteria) this;
        }

        public Criteria andFangwuchaoxiangGreaterThanOrEqualTo(Byte value) {
            addCriterion("fangwuchaoxiang >=", value, "fangwuchaoxiang");
            return (Criteria) this;
        }

        public Criteria andFangwuchaoxiangLessThan(Byte value) {
            addCriterion("fangwuchaoxiang <", value, "fangwuchaoxiang");
            return (Criteria) this;
        }

        public Criteria andFangwuchaoxiangLessThanOrEqualTo(Byte value) {
            addCriterion("fangwuchaoxiang <=", value, "fangwuchaoxiang");
            return (Criteria) this;
        }

        public Criteria andFangwuchaoxiangIn(List<Byte> values) {
            addCriterion("fangwuchaoxiang in", values, "fangwuchaoxiang");
            return (Criteria) this;
        }

        public Criteria andFangwuchaoxiangNotIn(List<Byte> values) {
            addCriterion("fangwuchaoxiang not in", values, "fangwuchaoxiang");
            return (Criteria) this;
        }

        public Criteria andFangwuchaoxiangBetween(Byte value1, Byte value2) {
            addCriterion("fangwuchaoxiang between", value1, value2, "fangwuchaoxiang");
            return (Criteria) this;
        }

        public Criteria andFangwuchaoxiangNotBetween(Byte value1, Byte value2) {
            addCriterion("fangwuchaoxiang not between", value1, value2, "fangwuchaoxiang");
            return (Criteria) this;
        }

        public Criteria andJuzhuzhuangkuangIsNull() {
            addCriterion("juzhuzhuangkuang is null");
            return (Criteria) this;
        }

        public Criteria andJuzhuzhuangkuangIsNotNull() {
            addCriterion("juzhuzhuangkuang is not null");
            return (Criteria) this;
        }

        public Criteria andJuzhuzhuangkuangEqualTo(Byte value) {
            addCriterion("juzhuzhuangkuang =", value, "juzhuzhuangkuang");
            return (Criteria) this;
        }

        public Criteria andJuzhuzhuangkuangNotEqualTo(Byte value) {
            addCriterion("juzhuzhuangkuang <>", value, "juzhuzhuangkuang");
            return (Criteria) this;
        }

        public Criteria andJuzhuzhuangkuangGreaterThan(Byte value) {
            addCriterion("juzhuzhuangkuang >", value, "juzhuzhuangkuang");
            return (Criteria) this;
        }

        public Criteria andJuzhuzhuangkuangGreaterThanOrEqualTo(Byte value) {
            addCriterion("juzhuzhuangkuang >=", value, "juzhuzhuangkuang");
            return (Criteria) this;
        }

        public Criteria andJuzhuzhuangkuangLessThan(Byte value) {
            addCriterion("juzhuzhuangkuang <", value, "juzhuzhuangkuang");
            return (Criteria) this;
        }

        public Criteria andJuzhuzhuangkuangLessThanOrEqualTo(Byte value) {
            addCriterion("juzhuzhuangkuang <=", value, "juzhuzhuangkuang");
            return (Criteria) this;
        }

        public Criteria andJuzhuzhuangkuangIn(List<Byte> values) {
            addCriterion("juzhuzhuangkuang in", values, "juzhuzhuangkuang");
            return (Criteria) this;
        }

        public Criteria andJuzhuzhuangkuangNotIn(List<Byte> values) {
            addCriterion("juzhuzhuangkuang not in", values, "juzhuzhuangkuang");
            return (Criteria) this;
        }

        public Criteria andJuzhuzhuangkuangBetween(Byte value1, Byte value2) {
            addCriterion("juzhuzhuangkuang between", value1, value2, "juzhuzhuangkuang");
            return (Criteria) this;
        }

        public Criteria andJuzhuzhuangkuangNotBetween(Byte value1, Byte value2) {
            addCriterion("juzhuzhuangkuang not between", value1, value2, "juzhuzhuangkuang");
            return (Criteria) this;
        }

        public Criteria andHousePatternIsNull() {
            addCriterion("house_pattern is null");
            return (Criteria) this;
        }

        public Criteria andHousePatternIsNotNull() {
            addCriterion("house_pattern is not null");
            return (Criteria) this;
        }

        public Criteria andHousePatternEqualTo(Byte value) {
            addCriterion("house_pattern =", value, "housePattern");
            return (Criteria) this;
        }

        public Criteria andHousePatternNotEqualTo(Byte value) {
            addCriterion("house_pattern <>", value, "housePattern");
            return (Criteria) this;
        }

        public Criteria andHousePatternGreaterThan(Byte value) {
            addCriterion("house_pattern >", value, "housePattern");
            return (Criteria) this;
        }

        public Criteria andHousePatternGreaterThanOrEqualTo(Byte value) {
            addCriterion("house_pattern >=", value, "housePattern");
            return (Criteria) this;
        }

        public Criteria andHousePatternLessThan(Byte value) {
            addCriterion("house_pattern <", value, "housePattern");
            return (Criteria) this;
        }

        public Criteria andHousePatternLessThanOrEqualTo(Byte value) {
            addCriterion("house_pattern <=", value, "housePattern");
            return (Criteria) this;
        }

        public Criteria andHousePatternIn(List<Byte> values) {
            addCriterion("house_pattern in", values, "housePattern");
            return (Criteria) this;
        }

        public Criteria andHousePatternNotIn(List<Byte> values) {
            addCriterion("house_pattern not in", values, "housePattern");
            return (Criteria) this;
        }

        public Criteria andHousePatternBetween(Byte value1, Byte value2) {
            addCriterion("house_pattern between", value1, value2, "housePattern");
            return (Criteria) this;
        }

        public Criteria andHousePatternNotBetween(Byte value1, Byte value2) {
            addCriterion("house_pattern not between", value1, value2, "housePattern");
            return (Criteria) this;
        }

        public Criteria andFitmentSituationIsNull() {
            addCriterion("fitment_situation is null");
            return (Criteria) this;
        }

        public Criteria andFitmentSituationIsNotNull() {
            addCriterion("fitment_situation is not null");
            return (Criteria) this;
        }

        public Criteria andFitmentSituationEqualTo(Byte value) {
            addCriterion("fitment_situation =", value, "fitmentSituation");
            return (Criteria) this;
        }

        public Criteria andFitmentSituationNotEqualTo(Byte value) {
            addCriterion("fitment_situation <>", value, "fitmentSituation");
            return (Criteria) this;
        }

        public Criteria andFitmentSituationGreaterThan(Byte value) {
            addCriterion("fitment_situation >", value, "fitmentSituation");
            return (Criteria) this;
        }

        public Criteria andFitmentSituationGreaterThanOrEqualTo(Byte value) {
            addCriterion("fitment_situation >=", value, "fitmentSituation");
            return (Criteria) this;
        }

        public Criteria andFitmentSituationLessThan(Byte value) {
            addCriterion("fitment_situation <", value, "fitmentSituation");
            return (Criteria) this;
        }

        public Criteria andFitmentSituationLessThanOrEqualTo(Byte value) {
            addCriterion("fitment_situation <=", value, "fitmentSituation");
            return (Criteria) this;
        }

        public Criteria andFitmentSituationIn(List<Byte> values) {
            addCriterion("fitment_situation in", values, "fitmentSituation");
            return (Criteria) this;
        }

        public Criteria andFitmentSituationNotIn(List<Byte> values) {
            addCriterion("fitment_situation not in", values, "fitmentSituation");
            return (Criteria) this;
        }

        public Criteria andFitmentSituationBetween(Byte value1, Byte value2) {
            addCriterion("fitment_situation between", value1, value2, "fitmentSituation");
            return (Criteria) this;
        }

        public Criteria andFitmentSituationNotBetween(Byte value1, Byte value2) {
            addCriterion("fitment_situation not between", value1, value2, "fitmentSituation");
            return (Criteria) this;
        }

        public Criteria andIndoorSunlightIsNull() {
            addCriterion("indoor_sunlight is null");
            return (Criteria) this;
        }

        public Criteria andIndoorSunlightIsNotNull() {
            addCriterion("indoor_sunlight is not null");
            return (Criteria) this;
        }

        public Criteria andIndoorSunlightEqualTo(Byte value) {
            addCriterion("indoor_sunlight =", value, "indoorSunlight");
            return (Criteria) this;
        }

        public Criteria andIndoorSunlightNotEqualTo(Byte value) {
            addCriterion("indoor_sunlight <>", value, "indoorSunlight");
            return (Criteria) this;
        }

        public Criteria andIndoorSunlightGreaterThan(Byte value) {
            addCriterion("indoor_sunlight >", value, "indoorSunlight");
            return (Criteria) this;
        }

        public Criteria andIndoorSunlightGreaterThanOrEqualTo(Byte value) {
            addCriterion("indoor_sunlight >=", value, "indoorSunlight");
            return (Criteria) this;
        }

        public Criteria andIndoorSunlightLessThan(Byte value) {
            addCriterion("indoor_sunlight <", value, "indoorSunlight");
            return (Criteria) this;
        }

        public Criteria andIndoorSunlightLessThanOrEqualTo(Byte value) {
            addCriterion("indoor_sunlight <=", value, "indoorSunlight");
            return (Criteria) this;
        }

        public Criteria andIndoorSunlightIn(List<Byte> values) {
            addCriterion("indoor_sunlight in", values, "indoorSunlight");
            return (Criteria) this;
        }

        public Criteria andIndoorSunlightNotIn(List<Byte> values) {
            addCriterion("indoor_sunlight not in", values, "indoorSunlight");
            return (Criteria) this;
        }

        public Criteria andIndoorSunlightBetween(Byte value1, Byte value2) {
            addCriterion("indoor_sunlight between", value1, value2, "indoorSunlight");
            return (Criteria) this;
        }

        public Criteria andIndoorSunlightNotBetween(Byte value1, Byte value2) {
            addCriterion("indoor_sunlight not between", value1, value2, "indoorSunlight");
            return (Criteria) this;
        }

        public Criteria andHaveLiftIsNull() {
            addCriterion("have_lift is null");
            return (Criteria) this;
        }

        public Criteria andHaveLiftIsNotNull() {
            addCriterion("have_lift is not null");
            return (Criteria) this;
        }

        public Criteria andHaveLiftEqualTo(Byte value) {
            addCriterion("have_lift =", value, "haveLift");
            return (Criteria) this;
        }

        public Criteria andHaveLiftNotEqualTo(Byte value) {
            addCriterion("have_lift <>", value, "haveLift");
            return (Criteria) this;
        }

        public Criteria andHaveLiftGreaterThan(Byte value) {
            addCriterion("have_lift >", value, "haveLift");
            return (Criteria) this;
        }

        public Criteria andHaveLiftGreaterThanOrEqualTo(Byte value) {
            addCriterion("have_lift >=", value, "haveLift");
            return (Criteria) this;
        }

        public Criteria andHaveLiftLessThan(Byte value) {
            addCriterion("have_lift <", value, "haveLift");
            return (Criteria) this;
        }

        public Criteria andHaveLiftLessThanOrEqualTo(Byte value) {
            addCriterion("have_lift <=", value, "haveLift");
            return (Criteria) this;
        }

        public Criteria andHaveLiftIn(List<Byte> values) {
            addCriterion("have_lift in", values, "haveLift");
            return (Criteria) this;
        }

        public Criteria andHaveLiftNotIn(List<Byte> values) {
            addCriterion("have_lift not in", values, "haveLift");
            return (Criteria) this;
        }

        public Criteria andHaveLiftBetween(Byte value1, Byte value2) {
            addCriterion("have_lift between", value1, value2, "haveLift");
            return (Criteria) this;
        }

        public Criteria andHaveLiftNotBetween(Byte value1, Byte value2) {
            addCriterion("have_lift not between", value1, value2, "haveLift");
            return (Criteria) this;
        }

        public Criteria andJitiJihuIsNull() {
            addCriterion("jiti_jihu is null");
            return (Criteria) this;
        }

        public Criteria andJitiJihuIsNotNull() {
            addCriterion("jiti_jihu is not null");
            return (Criteria) this;
        }

        public Criteria andJitiJihuEqualTo(String value) {
            addCriterion("jiti_jihu =", value, "jitiJihu");
            return (Criteria) this;
        }

        public Criteria andJitiJihuNotEqualTo(String value) {
            addCriterion("jiti_jihu <>", value, "jitiJihu");
            return (Criteria) this;
        }

        public Criteria andJitiJihuGreaterThan(String value) {
            addCriterion("jiti_jihu >", value, "jitiJihu");
            return (Criteria) this;
        }

        public Criteria andJitiJihuGreaterThanOrEqualTo(String value) {
            addCriterion("jiti_jihu >=", value, "jitiJihu");
            return (Criteria) this;
        }

        public Criteria andJitiJihuLessThan(String value) {
            addCriterion("jiti_jihu <", value, "jitiJihu");
            return (Criteria) this;
        }

        public Criteria andJitiJihuLessThanOrEqualTo(String value) {
            addCriterion("jiti_jihu <=", value, "jitiJihu");
            return (Criteria) this;
        }

        public Criteria andJitiJihuLike(String value) {
            addCriterion("jiti_jihu like", value, "jitiJihu");
            return (Criteria) this;
        }

        public Criteria andJitiJihuNotLike(String value) {
            addCriterion("jiti_jihu not like", value, "jitiJihu");
            return (Criteria) this;
        }

        public Criteria andJitiJihuIn(List<String> values) {
            addCriterion("jiti_jihu in", values, "jitiJihu");
            return (Criteria) this;
        }

        public Criteria andJitiJihuNotIn(List<String> values) {
            addCriterion("jiti_jihu not in", values, "jitiJihu");
            return (Criteria) this;
        }

        public Criteria andJitiJihuBetween(String value1, String value2) {
            addCriterion("jiti_jihu between", value1, value2, "jitiJihu");
            return (Criteria) this;
        }

        public Criteria andJitiJihuNotBetween(String value1, String value2) {
            addCriterion("jiti_jihu not between", value1, value2, "jitiJihu");
            return (Criteria) this;
        }

        public Criteria andIsExcellentPlaceIsNull() {
            addCriterion("is_excellent_place is null");
            return (Criteria) this;
        }

        public Criteria andIsExcellentPlaceIsNotNull() {
            addCriterion("is_excellent_place is not null");
            return (Criteria) this;
        }

        public Criteria andIsExcellentPlaceEqualTo(Byte value) {
            addCriterion("is_excellent_place =", value, "isExcellentPlace");
            return (Criteria) this;
        }

        public Criteria andIsExcellentPlaceNotEqualTo(Byte value) {
            addCriterion("is_excellent_place <>", value, "isExcellentPlace");
            return (Criteria) this;
        }

        public Criteria andIsExcellentPlaceGreaterThan(Byte value) {
            addCriterion("is_excellent_place >", value, "isExcellentPlace");
            return (Criteria) this;
        }

        public Criteria andIsExcellentPlaceGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_excellent_place >=", value, "isExcellentPlace");
            return (Criteria) this;
        }

        public Criteria andIsExcellentPlaceLessThan(Byte value) {
            addCriterion("is_excellent_place <", value, "isExcellentPlace");
            return (Criteria) this;
        }

        public Criteria andIsExcellentPlaceLessThanOrEqualTo(Byte value) {
            addCriterion("is_excellent_place <=", value, "isExcellentPlace");
            return (Criteria) this;
        }

        public Criteria andIsExcellentPlaceIn(List<Byte> values) {
            addCriterion("is_excellent_place in", values, "isExcellentPlace");
            return (Criteria) this;
        }

        public Criteria andIsExcellentPlaceNotIn(List<Byte> values) {
            addCriterion("is_excellent_place not in", values, "isExcellentPlace");
            return (Criteria) this;
        }

        public Criteria andIsExcellentPlaceBetween(Byte value1, Byte value2) {
            addCriterion("is_excellent_place between", value1, value2, "isExcellentPlace");
            return (Criteria) this;
        }

        public Criteria andIsExcellentPlaceNotBetween(Byte value1, Byte value2) {
            addCriterion("is_excellent_place not between", value1, value2, "isExcellentPlace");
            return (Criteria) this;
        }

        public Criteria andIsFrontageIsNull() {
            addCriterion("is_frontage is null");
            return (Criteria) this;
        }

        public Criteria andIsFrontageIsNotNull() {
            addCriterion("is_frontage is not null");
            return (Criteria) this;
        }

        public Criteria andIsFrontageEqualTo(Byte value) {
            addCriterion("is_frontage =", value, "isFrontage");
            return (Criteria) this;
        }

        public Criteria andIsFrontageNotEqualTo(Byte value) {
            addCriterion("is_frontage <>", value, "isFrontage");
            return (Criteria) this;
        }

        public Criteria andIsFrontageGreaterThan(Byte value) {
            addCriterion("is_frontage >", value, "isFrontage");
            return (Criteria) this;
        }

        public Criteria andIsFrontageGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_frontage >=", value, "isFrontage");
            return (Criteria) this;
        }

        public Criteria andIsFrontageLessThan(Byte value) {
            addCriterion("is_frontage <", value, "isFrontage");
            return (Criteria) this;
        }

        public Criteria andIsFrontageLessThanOrEqualTo(Byte value) {
            addCriterion("is_frontage <=", value, "isFrontage");
            return (Criteria) this;
        }

        public Criteria andIsFrontageIn(List<Byte> values) {
            addCriterion("is_frontage in", values, "isFrontage");
            return (Criteria) this;
        }

        public Criteria andIsFrontageNotIn(List<Byte> values) {
            addCriterion("is_frontage not in", values, "isFrontage");
            return (Criteria) this;
        }

        public Criteria andIsFrontageBetween(Byte value1, Byte value2) {
            addCriterion("is_frontage between", value1, value2, "isFrontage");
            return (Criteria) this;
        }

        public Criteria andIsFrontageNotBetween(Byte value1, Byte value2) {
            addCriterion("is_frontage not between", value1, value2, "isFrontage");
            return (Criteria) this;
        }

        public Criteria andIsNearsubwayIsNull() {
            addCriterion("is_nearsubway is null");
            return (Criteria) this;
        }

        public Criteria andIsNearsubwayIsNotNull() {
            addCriterion("is_nearsubway is not null");
            return (Criteria) this;
        }

        public Criteria andIsNearsubwayEqualTo(Byte value) {
            addCriterion("is_nearsubway =", value, "isNearsubway");
            return (Criteria) this;
        }

        public Criteria andIsNearsubwayNotEqualTo(Byte value) {
            addCriterion("is_nearsubway <>", value, "isNearsubway");
            return (Criteria) this;
        }

        public Criteria andIsNearsubwayGreaterThan(Byte value) {
            addCriterion("is_nearsubway >", value, "isNearsubway");
            return (Criteria) this;
        }

        public Criteria andIsNearsubwayGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_nearsubway >=", value, "isNearsubway");
            return (Criteria) this;
        }

        public Criteria andIsNearsubwayLessThan(Byte value) {
            addCriterion("is_nearsubway <", value, "isNearsubway");
            return (Criteria) this;
        }

        public Criteria andIsNearsubwayLessThanOrEqualTo(Byte value) {
            addCriterion("is_nearsubway <=", value, "isNearsubway");
            return (Criteria) this;
        }

        public Criteria andIsNearsubwayIn(List<Byte> values) {
            addCriterion("is_nearsubway in", values, "isNearsubway");
            return (Criteria) this;
        }

        public Criteria andIsNearsubwayNotIn(List<Byte> values) {
            addCriterion("is_nearsubway not in", values, "isNearsubway");
            return (Criteria) this;
        }

        public Criteria andIsNearsubwayBetween(Byte value1, Byte value2) {
            addCriterion("is_nearsubway between", value1, value2, "isNearsubway");
            return (Criteria) this;
        }

        public Criteria andIsNearsubwayNotBetween(Byte value1, Byte value2) {
            addCriterion("is_nearsubway not between", value1, value2, "isNearsubway");
            return (Criteria) this;
        }

        public Criteria andZhongdaBiandongIsNull() {
            addCriterion("zhongda_biandong is null");
            return (Criteria) this;
        }

        public Criteria andZhongdaBiandongIsNotNull() {
            addCriterion("zhongda_biandong is not null");
            return (Criteria) this;
        }

        public Criteria andZhongdaBiandongEqualTo(Byte value) {
            addCriterion("zhongda_biandong =", value, "zhongdaBiandong");
            return (Criteria) this;
        }

        public Criteria andZhongdaBiandongNotEqualTo(Byte value) {
            addCriterion("zhongda_biandong <>", value, "zhongdaBiandong");
            return (Criteria) this;
        }

        public Criteria andZhongdaBiandongGreaterThan(Byte value) {
            addCriterion("zhongda_biandong >", value, "zhongdaBiandong");
            return (Criteria) this;
        }

        public Criteria andZhongdaBiandongGreaterThanOrEqualTo(Byte value) {
            addCriterion("zhongda_biandong >=", value, "zhongdaBiandong");
            return (Criteria) this;
        }

        public Criteria andZhongdaBiandongLessThan(Byte value) {
            addCriterion("zhongda_biandong <", value, "zhongdaBiandong");
            return (Criteria) this;
        }

        public Criteria andZhongdaBiandongLessThanOrEqualTo(Byte value) {
            addCriterion("zhongda_biandong <=", value, "zhongdaBiandong");
            return (Criteria) this;
        }

        public Criteria andZhongdaBiandongIn(List<Byte> values) {
            addCriterion("zhongda_biandong in", values, "zhongdaBiandong");
            return (Criteria) this;
        }

        public Criteria andZhongdaBiandongNotIn(List<Byte> values) {
            addCriterion("zhongda_biandong not in", values, "zhongdaBiandong");
            return (Criteria) this;
        }

        public Criteria andZhongdaBiandongBetween(Byte value1, Byte value2) {
            addCriterion("zhongda_biandong between", value1, value2, "zhongdaBiandong");
            return (Criteria) this;
        }

        public Criteria andZhongdaBiandongNotBetween(Byte value1, Byte value2) {
            addCriterion("zhongda_biandong not between", value1, value2, "zhongdaBiandong");
            return (Criteria) this;
        }

        public Criteria andIsXiongzhaiIsNull() {
            addCriterion("is_xiongzhai is null");
            return (Criteria) this;
        }

        public Criteria andIsXiongzhaiIsNotNull() {
            addCriterion("is_xiongzhai is not null");
            return (Criteria) this;
        }

        public Criteria andIsXiongzhaiEqualTo(Byte value) {
            addCriterion("is_xiongzhai =", value, "isXiongzhai");
            return (Criteria) this;
        }

        public Criteria andIsXiongzhaiNotEqualTo(Byte value) {
            addCriterion("is_xiongzhai <>", value, "isXiongzhai");
            return (Criteria) this;
        }

        public Criteria andIsXiongzhaiGreaterThan(Byte value) {
            addCriterion("is_xiongzhai >", value, "isXiongzhai");
            return (Criteria) this;
        }

        public Criteria andIsXiongzhaiGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_xiongzhai >=", value, "isXiongzhai");
            return (Criteria) this;
        }

        public Criteria andIsXiongzhaiLessThan(Byte value) {
            addCriterion("is_xiongzhai <", value, "isXiongzhai");
            return (Criteria) this;
        }

        public Criteria andIsXiongzhaiLessThanOrEqualTo(Byte value) {
            addCriterion("is_xiongzhai <=", value, "isXiongzhai");
            return (Criteria) this;
        }

        public Criteria andIsXiongzhaiIn(List<Byte> values) {
            addCriterion("is_xiongzhai in", values, "isXiongzhai");
            return (Criteria) this;
        }

        public Criteria andIsXiongzhaiNotIn(List<Byte> values) {
            addCriterion("is_xiongzhai not in", values, "isXiongzhai");
            return (Criteria) this;
        }

        public Criteria andIsXiongzhaiBetween(Byte value1, Byte value2) {
            addCriterion("is_xiongzhai between", value1, value2, "isXiongzhai");
            return (Criteria) this;
        }

        public Criteria andIsXiongzhaiNotBetween(Byte value1, Byte value2) {
            addCriterion("is_xiongzhai not between", value1, value2, "isXiongzhai");
            return (Criteria) this;
        }

        public Criteria andIsRiverViewHouseIsNull() {
            addCriterion("is_river_view_house is null");
            return (Criteria) this;
        }

        public Criteria andIsRiverViewHouseIsNotNull() {
            addCriterion("is_river_view_house is not null");
            return (Criteria) this;
        }

        public Criteria andIsRiverViewHouseEqualTo(Byte value) {
            addCriterion("is_river_view_house =", value, "isRiverViewHouse");
            return (Criteria) this;
        }

        public Criteria andIsRiverViewHouseNotEqualTo(Byte value) {
            addCriterion("is_river_view_house <>", value, "isRiverViewHouse");
            return (Criteria) this;
        }

        public Criteria andIsRiverViewHouseGreaterThan(Byte value) {
            addCriterion("is_river_view_house >", value, "isRiverViewHouse");
            return (Criteria) this;
        }

        public Criteria andIsRiverViewHouseGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_river_view_house >=", value, "isRiverViewHouse");
            return (Criteria) this;
        }

        public Criteria andIsRiverViewHouseLessThan(Byte value) {
            addCriterion("is_river_view_house <", value, "isRiverViewHouse");
            return (Criteria) this;
        }

        public Criteria andIsRiverViewHouseLessThanOrEqualTo(Byte value) {
            addCriterion("is_river_view_house <=", value, "isRiverViewHouse");
            return (Criteria) this;
        }

        public Criteria andIsRiverViewHouseIn(List<Byte> values) {
            addCriterion("is_river_view_house in", values, "isRiverViewHouse");
            return (Criteria) this;
        }

        public Criteria andIsRiverViewHouseNotIn(List<Byte> values) {
            addCriterion("is_river_view_house not in", values, "isRiverViewHouse");
            return (Criteria) this;
        }

        public Criteria andIsRiverViewHouseBetween(Byte value1, Byte value2) {
            addCriterion("is_river_view_house between", value1, value2, "isRiverViewHouse");
            return (Criteria) this;
        }

        public Criteria andIsRiverViewHouseNotBetween(Byte value1, Byte value2) {
            addCriterion("is_river_view_house not between", value1, value2, "isRiverViewHouse");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictIsNull() {
            addCriterion("house_district is null");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictIsNotNull() {
            addCriterion("house_district is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictEqualTo(String value) {
            addCriterion("house_district =", value, "houseDistrict");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictNotEqualTo(String value) {
            addCriterion("house_district <>", value, "houseDistrict");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictGreaterThan(String value) {
            addCriterion("house_district >", value, "houseDistrict");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("house_district >=", value, "houseDistrict");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictLessThan(String value) {
            addCriterion("house_district <", value, "houseDistrict");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictLessThanOrEqualTo(String value) {
            addCriterion("house_district <=", value, "houseDistrict");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictLike(String value) {
            addCriterion("house_district like", value, "houseDistrict");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictNotLike(String value) {
            addCriterion("house_district not like", value, "houseDistrict");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictIn(List<String> values) {
            addCriterion("house_district in", values, "houseDistrict");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictNotIn(List<String> values) {
            addCriterion("house_district not in", values, "houseDistrict");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictBetween(String value1, String value2) {
            addCriterion("house_district between", value1, value2, "houseDistrict");
            return (Criteria) this;
        }

        public Criteria andHouseDistrictNotBetween(String value1, String value2) {
            addCriterion("house_district not between", value1, value2, "houseDistrict");
            return (Criteria) this;
        }

        public Criteria andParkingSituationIsNull() {
            addCriterion("parking_situation is null");
            return (Criteria) this;
        }

        public Criteria andParkingSituationIsNotNull() {
            addCriterion("parking_situation is not null");
            return (Criteria) this;
        }

        public Criteria andParkingSituationEqualTo(Byte value) {
            addCriterion("parking_situation =", value, "parkingSituation");
            return (Criteria) this;
        }

        public Criteria andParkingSituationNotEqualTo(Byte value) {
            addCriterion("parking_situation <>", value, "parkingSituation");
            return (Criteria) this;
        }

        public Criteria andParkingSituationGreaterThan(Byte value) {
            addCriterion("parking_situation >", value, "parkingSituation");
            return (Criteria) this;
        }

        public Criteria andParkingSituationGreaterThanOrEqualTo(Byte value) {
            addCriterion("parking_situation >=", value, "parkingSituation");
            return (Criteria) this;
        }

        public Criteria andParkingSituationLessThan(Byte value) {
            addCriterion("parking_situation <", value, "parkingSituation");
            return (Criteria) this;
        }

        public Criteria andParkingSituationLessThanOrEqualTo(Byte value) {
            addCriterion("parking_situation <=", value, "parkingSituation");
            return (Criteria) this;
        }

        public Criteria andParkingSituationIn(List<Byte> values) {
            addCriterion("parking_situation in", values, "parkingSituation");
            return (Criteria) this;
        }

        public Criteria andParkingSituationNotIn(List<Byte> values) {
            addCriterion("parking_situation not in", values, "parkingSituation");
            return (Criteria) this;
        }

        public Criteria andParkingSituationBetween(Byte value1, Byte value2) {
            addCriterion("parking_situation between", value1, value2, "parkingSituation");
            return (Criteria) this;
        }

        public Criteria andParkingSituationNotBetween(Byte value1, Byte value2) {
            addCriterion("parking_situation not between", value1, value2, "parkingSituation");
            return (Criteria) this;
        }

        public Criteria andEstateParkingSituationIsNull() {
            addCriterion("estate_parking_situation is null");
            return (Criteria) this;
        }

        public Criteria andEstateParkingSituationIsNotNull() {
            addCriterion("estate_parking_situation is not null");
            return (Criteria) this;
        }

        public Criteria andEstateParkingSituationEqualTo(Byte value) {
            addCriterion("estate_parking_situation =", value, "estateParkingSituation");
            return (Criteria) this;
        }

        public Criteria andEstateParkingSituationNotEqualTo(Byte value) {
            addCriterion("estate_parking_situation <>", value, "estateParkingSituation");
            return (Criteria) this;
        }

        public Criteria andEstateParkingSituationGreaterThan(Byte value) {
            addCriterion("estate_parking_situation >", value, "estateParkingSituation");
            return (Criteria) this;
        }

        public Criteria andEstateParkingSituationGreaterThanOrEqualTo(Byte value) {
            addCriterion("estate_parking_situation >=", value, "estateParkingSituation");
            return (Criteria) this;
        }

        public Criteria andEstateParkingSituationLessThan(Byte value) {
            addCriterion("estate_parking_situation <", value, "estateParkingSituation");
            return (Criteria) this;
        }

        public Criteria andEstateParkingSituationLessThanOrEqualTo(Byte value) {
            addCriterion("estate_parking_situation <=", value, "estateParkingSituation");
            return (Criteria) this;
        }

        public Criteria andEstateParkingSituationIn(List<Byte> values) {
            addCriterion("estate_parking_situation in", values, "estateParkingSituation");
            return (Criteria) this;
        }

        public Criteria andEstateParkingSituationNotIn(List<Byte> values) {
            addCriterion("estate_parking_situation not in", values, "estateParkingSituation");
            return (Criteria) this;
        }

        public Criteria andEstateParkingSituationBetween(Byte value1, Byte value2) {
            addCriterion("estate_parking_situation between", value1, value2, "estateParkingSituation");
            return (Criteria) this;
        }

        public Criteria andEstateParkingSituationNotBetween(Byte value1, Byte value2) {
            addCriterion("estate_parking_situation not between", value1, value2, "estateParkingSituation");
            return (Criteria) this;
        }

        public Criteria andEstateSafeFacilityIsNull() {
            addCriterion("estate_safe_facility is null");
            return (Criteria) this;
        }

        public Criteria andEstateSafeFacilityIsNotNull() {
            addCriterion("estate_safe_facility is not null");
            return (Criteria) this;
        }

        public Criteria andEstateSafeFacilityEqualTo(Byte value) {
            addCriterion("estate_safe_facility =", value, "estateSafeFacility");
            return (Criteria) this;
        }

        public Criteria andEstateSafeFacilityNotEqualTo(Byte value) {
            addCriterion("estate_safe_facility <>", value, "estateSafeFacility");
            return (Criteria) this;
        }

        public Criteria andEstateSafeFacilityGreaterThan(Byte value) {
            addCriterion("estate_safe_facility >", value, "estateSafeFacility");
            return (Criteria) this;
        }

        public Criteria andEstateSafeFacilityGreaterThanOrEqualTo(Byte value) {
            addCriterion("estate_safe_facility >=", value, "estateSafeFacility");
            return (Criteria) this;
        }

        public Criteria andEstateSafeFacilityLessThan(Byte value) {
            addCriterion("estate_safe_facility <", value, "estateSafeFacility");
            return (Criteria) this;
        }

        public Criteria andEstateSafeFacilityLessThanOrEqualTo(Byte value) {
            addCriterion("estate_safe_facility <=", value, "estateSafeFacility");
            return (Criteria) this;
        }

        public Criteria andEstateSafeFacilityIn(List<Byte> values) {
            addCriterion("estate_safe_facility in", values, "estateSafeFacility");
            return (Criteria) this;
        }

        public Criteria andEstateSafeFacilityNotIn(List<Byte> values) {
            addCriterion("estate_safe_facility not in", values, "estateSafeFacility");
            return (Criteria) this;
        }

        public Criteria andEstateSafeFacilityBetween(Byte value1, Byte value2) {
            addCriterion("estate_safe_facility between", value1, value2, "estateSafeFacility");
            return (Criteria) this;
        }

        public Criteria andEstateSafeFacilityNotBetween(Byte value1, Byte value2) {
            addCriterion("estate_safe_facility not between", value1, value2, "estateSafeFacility");
            return (Criteria) this;
        }

        public Criteria andAfforestSanitationIsNull() {
            addCriterion("afforest_sanitation is null");
            return (Criteria) this;
        }

        public Criteria andAfforestSanitationIsNotNull() {
            addCriterion("afforest_sanitation is not null");
            return (Criteria) this;
        }

        public Criteria andAfforestSanitationEqualTo(Byte value) {
            addCriterion("afforest_sanitation =", value, "afforestSanitation");
            return (Criteria) this;
        }

        public Criteria andAfforestSanitationNotEqualTo(Byte value) {
            addCriterion("afforest_sanitation <>", value, "afforestSanitation");
            return (Criteria) this;
        }

        public Criteria andAfforestSanitationGreaterThan(Byte value) {
            addCriterion("afforest_sanitation >", value, "afforestSanitation");
            return (Criteria) this;
        }

        public Criteria andAfforestSanitationGreaterThanOrEqualTo(Byte value) {
            addCriterion("afforest_sanitation >=", value, "afforestSanitation");
            return (Criteria) this;
        }

        public Criteria andAfforestSanitationLessThan(Byte value) {
            addCriterion("afforest_sanitation <", value, "afforestSanitation");
            return (Criteria) this;
        }

        public Criteria andAfforestSanitationLessThanOrEqualTo(Byte value) {
            addCriterion("afforest_sanitation <=", value, "afforestSanitation");
            return (Criteria) this;
        }

        public Criteria andAfforestSanitationIn(List<Byte> values) {
            addCriterion("afforest_sanitation in", values, "afforestSanitation");
            return (Criteria) this;
        }

        public Criteria andAfforestSanitationNotIn(List<Byte> values) {
            addCriterion("afforest_sanitation not in", values, "afforestSanitation");
            return (Criteria) this;
        }

        public Criteria andAfforestSanitationBetween(Byte value1, Byte value2) {
            addCriterion("afforest_sanitation between", value1, value2, "afforestSanitation");
            return (Criteria) this;
        }

        public Criteria andAfforestSanitationNotBetween(Byte value1, Byte value2) {
            addCriterion("afforest_sanitation not between", value1, value2, "afforestSanitation");
            return (Criteria) this;
        }

        public Criteria andAfforestPercentIsNull() {
            addCriterion("afforest_percent is null");
            return (Criteria) this;
        }

        public Criteria andAfforestPercentIsNotNull() {
            addCriterion("afforest_percent is not null");
            return (Criteria) this;
        }

        public Criteria andAfforestPercentEqualTo(BigDecimal value) {
            addCriterion("afforest_percent =", value, "afforestPercent");
            return (Criteria) this;
        }

        public Criteria andAfforestPercentNotEqualTo(BigDecimal value) {
            addCriterion("afforest_percent <>", value, "afforestPercent");
            return (Criteria) this;
        }

        public Criteria andAfforestPercentGreaterThan(BigDecimal value) {
            addCriterion("afforest_percent >", value, "afforestPercent");
            return (Criteria) this;
        }

        public Criteria andAfforestPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("afforest_percent >=", value, "afforestPercent");
            return (Criteria) this;
        }

        public Criteria andAfforestPercentLessThan(BigDecimal value) {
            addCriterion("afforest_percent <", value, "afforestPercent");
            return (Criteria) this;
        }

        public Criteria andAfforestPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("afforest_percent <=", value, "afforestPercent");
            return (Criteria) this;
        }

        public Criteria andAfforestPercentIn(List<BigDecimal> values) {
            addCriterion("afforest_percent in", values, "afforestPercent");
            return (Criteria) this;
        }

        public Criteria andAfforestPercentNotIn(List<BigDecimal> values) {
            addCriterion("afforest_percent not in", values, "afforestPercent");
            return (Criteria) this;
        }

        public Criteria andAfforestPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("afforest_percent between", value1, value2, "afforestPercent");
            return (Criteria) this;
        }

        public Criteria andAfforestPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("afforest_percent not between", value1, value2, "afforestPercent");
            return (Criteria) this;
        }

        public Criteria andPlotRatioIsNull() {
            addCriterion("plot_ratio is null");
            return (Criteria) this;
        }

        public Criteria andPlotRatioIsNotNull() {
            addCriterion("plot_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andPlotRatioEqualTo(BigDecimal value) {
            addCriterion("plot_ratio =", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioNotEqualTo(BigDecimal value) {
            addCriterion("plot_ratio <>", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioGreaterThan(BigDecimal value) {
            addCriterion("plot_ratio >", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plot_ratio >=", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioLessThan(BigDecimal value) {
            addCriterion("plot_ratio <", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plot_ratio <=", value, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioIn(List<BigDecimal> values) {
            addCriterion("plot_ratio in", values, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioNotIn(List<BigDecimal> values) {
            addCriterion("plot_ratio not in", values, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plot_ratio between", value1, value2, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andPlotRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plot_ratio not between", value1, value2, "plotRatio");
            return (Criteria) this;
        }

        public Criteria andDevelopersIsNull() {
            addCriterion("developers is null");
            return (Criteria) this;
        }

        public Criteria andDevelopersIsNotNull() {
            addCriterion("developers is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopersEqualTo(String value) {
            addCriterion("developers =", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersNotEqualTo(String value) {
            addCriterion("developers <>", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersGreaterThan(String value) {
            addCriterion("developers >", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersGreaterThanOrEqualTo(String value) {
            addCriterion("developers >=", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersLessThan(String value) {
            addCriterion("developers <", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersLessThanOrEqualTo(String value) {
            addCriterion("developers <=", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersLike(String value) {
            addCriterion("developers like", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersNotLike(String value) {
            addCriterion("developers not like", value, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersIn(List<String> values) {
            addCriterion("developers in", values, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersNotIn(List<String> values) {
            addCriterion("developers not in", values, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersBetween(String value1, String value2) {
            addCriterion("developers between", value1, value2, "developers");
            return (Criteria) this;
        }

        public Criteria andDevelopersNotBetween(String value1, String value2) {
            addCriterion("developers not between", value1, value2, "developers");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementIsNull() {
            addCriterion("property_management is null");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementIsNotNull() {
            addCriterion("property_management is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementEqualTo(String value) {
            addCriterion("property_management =", value, "propertyManagement");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementNotEqualTo(String value) {
            addCriterion("property_management <>", value, "propertyManagement");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementGreaterThan(String value) {
            addCriterion("property_management >", value, "propertyManagement");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementGreaterThanOrEqualTo(String value) {
            addCriterion("property_management >=", value, "propertyManagement");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementLessThan(String value) {
            addCriterion("property_management <", value, "propertyManagement");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementLessThanOrEqualTo(String value) {
            addCriterion("property_management <=", value, "propertyManagement");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementLike(String value) {
            addCriterion("property_management like", value, "propertyManagement");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementNotLike(String value) {
            addCriterion("property_management not like", value, "propertyManagement");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementIn(List<String> values) {
            addCriterion("property_management in", values, "propertyManagement");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementNotIn(List<String> values) {
            addCriterion("property_management not in", values, "propertyManagement");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementBetween(String value1, String value2) {
            addCriterion("property_management between", value1, value2, "propertyManagement");
            return (Criteria) this;
        }

        public Criteria andPropertyManagementNotBetween(String value1, String value2) {
            addCriterion("property_management not between", value1, value2, "propertyManagement");
            return (Criteria) this;
        }

        public Criteria andResidentTotalIsNull() {
            addCriterion("resident_total is null");
            return (Criteria) this;
        }

        public Criteria andResidentTotalIsNotNull() {
            addCriterion("resident_total is not null");
            return (Criteria) this;
        }

        public Criteria andResidentTotalEqualTo(Integer value) {
            addCriterion("resident_total =", value, "residentTotal");
            return (Criteria) this;
        }

        public Criteria andResidentTotalNotEqualTo(Integer value) {
            addCriterion("resident_total <>", value, "residentTotal");
            return (Criteria) this;
        }

        public Criteria andResidentTotalGreaterThan(Integer value) {
            addCriterion("resident_total >", value, "residentTotal");
            return (Criteria) this;
        }

        public Criteria andResidentTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("resident_total >=", value, "residentTotal");
            return (Criteria) this;
        }

        public Criteria andResidentTotalLessThan(Integer value) {
            addCriterion("resident_total <", value, "residentTotal");
            return (Criteria) this;
        }

        public Criteria andResidentTotalLessThanOrEqualTo(Integer value) {
            addCriterion("resident_total <=", value, "residentTotal");
            return (Criteria) this;
        }

        public Criteria andResidentTotalIn(List<Integer> values) {
            addCriterion("resident_total in", values, "residentTotal");
            return (Criteria) this;
        }

        public Criteria andResidentTotalNotIn(List<Integer> values) {
            addCriterion("resident_total not in", values, "residentTotal");
            return (Criteria) this;
        }

        public Criteria andResidentTotalBetween(Integer value1, Integer value2) {
            addCriterion("resident_total between", value1, value2, "residentTotal");
            return (Criteria) this;
        }

        public Criteria andResidentTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("resident_total not between", value1, value2, "residentTotal");
            return (Criteria) this;
        }

        public Criteria andEstateAreaIsNull() {
            addCriterion("estate_area is null");
            return (Criteria) this;
        }

        public Criteria andEstateAreaIsNotNull() {
            addCriterion("estate_area is not null");
            return (Criteria) this;
        }

        public Criteria andEstateAreaEqualTo(Integer value) {
            addCriterion("estate_area =", value, "estateArea");
            return (Criteria) this;
        }

        public Criteria andEstateAreaNotEqualTo(Integer value) {
            addCriterion("estate_area <>", value, "estateArea");
            return (Criteria) this;
        }

        public Criteria andEstateAreaGreaterThan(Integer value) {
            addCriterion("estate_area >", value, "estateArea");
            return (Criteria) this;
        }

        public Criteria andEstateAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("estate_area >=", value, "estateArea");
            return (Criteria) this;
        }

        public Criteria andEstateAreaLessThan(Integer value) {
            addCriterion("estate_area <", value, "estateArea");
            return (Criteria) this;
        }

        public Criteria andEstateAreaLessThanOrEqualTo(Integer value) {
            addCriterion("estate_area <=", value, "estateArea");
            return (Criteria) this;
        }

        public Criteria andEstateAreaIn(List<Integer> values) {
            addCriterion("estate_area in", values, "estateArea");
            return (Criteria) this;
        }

        public Criteria andEstateAreaNotIn(List<Integer> values) {
            addCriterion("estate_area not in", values, "estateArea");
            return (Criteria) this;
        }

        public Criteria andEstateAreaBetween(Integer value1, Integer value2) {
            addCriterion("estate_area between", value1, value2, "estateArea");
            return (Criteria) this;
        }

        public Criteria andEstateAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("estate_area not between", value1, value2, "estateArea");
            return (Criteria) this;
        }

        public Criteria andAversionFacilityIsNull() {
            addCriterion("aversion_facility is null");
            return (Criteria) this;
        }

        public Criteria andAversionFacilityIsNotNull() {
            addCriterion("aversion_facility is not null");
            return (Criteria) this;
        }

        public Criteria andAversionFacilityEqualTo(Byte value) {
            addCriterion("aversion_facility =", value, "aversionFacility");
            return (Criteria) this;
        }

        public Criteria andAversionFacilityNotEqualTo(Byte value) {
            addCriterion("aversion_facility <>", value, "aversionFacility");
            return (Criteria) this;
        }

        public Criteria andAversionFacilityGreaterThan(Byte value) {
            addCriterion("aversion_facility >", value, "aversionFacility");
            return (Criteria) this;
        }

        public Criteria andAversionFacilityGreaterThanOrEqualTo(Byte value) {
            addCriterion("aversion_facility >=", value, "aversionFacility");
            return (Criteria) this;
        }

        public Criteria andAversionFacilityLessThan(Byte value) {
            addCriterion("aversion_facility <", value, "aversionFacility");
            return (Criteria) this;
        }

        public Criteria andAversionFacilityLessThanOrEqualTo(Byte value) {
            addCriterion("aversion_facility <=", value, "aversionFacility");
            return (Criteria) this;
        }

        public Criteria andAversionFacilityIn(List<Byte> values) {
            addCriterion("aversion_facility in", values, "aversionFacility");
            return (Criteria) this;
        }

        public Criteria andAversionFacilityNotIn(List<Byte> values) {
            addCriterion("aversion_facility not in", values, "aversionFacility");
            return (Criteria) this;
        }

        public Criteria andAversionFacilityBetween(Byte value1, Byte value2) {
            addCriterion("aversion_facility between", value1, value2, "aversionFacility");
            return (Criteria) this;
        }

        public Criteria andAversionFacilityNotBetween(Byte value1, Byte value2) {
            addCriterion("aversion_facility not between", value1, value2, "aversionFacility");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIsNull() {
            addCriterion("environment is null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIsNotNull() {
            addCriterion("environment is not null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentEqualTo(String value) {
            addCriterion("environment =", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentNotEqualTo(String value) {
            addCriterion("environment <>", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentGreaterThan(String value) {
            addCriterion("environment >", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentGreaterThanOrEqualTo(String value) {
            addCriterion("environment >=", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentLessThan(String value) {
            addCriterion("environment <", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentLessThanOrEqualTo(String value) {
            addCriterion("environment <=", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentLike(String value) {
            addCriterion("environment like", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentNotLike(String value) {
            addCriterion("environment not like", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIn(List<String> values) {
            addCriterion("environment in", values, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentNotIn(List<String> values) {
            addCriterion("environment not in", values, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentBetween(String value1, String value2) {
            addCriterion("environment between", value1, value2, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentNotBetween(String value1, String value2) {
            addCriterion("environment not between", value1, value2, "environment");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingIsNull() {
            addCriterion("peripheral_matching is null");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingIsNotNull() {
            addCriterion("peripheral_matching is not null");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingEqualTo(String value) {
            addCriterion("peripheral_matching =", value, "peripheralMatching");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingNotEqualTo(String value) {
            addCriterion("peripheral_matching <>", value, "peripheralMatching");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingGreaterThan(String value) {
            addCriterion("peripheral_matching >", value, "peripheralMatching");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingGreaterThanOrEqualTo(String value) {
            addCriterion("peripheral_matching >=", value, "peripheralMatching");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingLessThan(String value) {
            addCriterion("peripheral_matching <", value, "peripheralMatching");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingLessThanOrEqualTo(String value) {
            addCriterion("peripheral_matching <=", value, "peripheralMatching");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingLike(String value) {
            addCriterion("peripheral_matching like", value, "peripheralMatching");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingNotLike(String value) {
            addCriterion("peripheral_matching not like", value, "peripheralMatching");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingIn(List<String> values) {
            addCriterion("peripheral_matching in", values, "peripheralMatching");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingNotIn(List<String> values) {
            addCriterion("peripheral_matching not in", values, "peripheralMatching");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingBetween(String value1, String value2) {
            addCriterion("peripheral_matching between", value1, value2, "peripheralMatching");
            return (Criteria) this;
        }

        public Criteria andPeripheralMatchingNotBetween(String value1, String value2) {
            addCriterion("peripheral_matching not between", value1, value2, "peripheralMatching");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersIsNull() {
            addCriterion("house_owners is null");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersIsNotNull() {
            addCriterion("house_owners is not null");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersEqualTo(String value) {
            addCriterion("house_owners =", value, "houseOwners");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersNotEqualTo(String value) {
            addCriterion("house_owners <>", value, "houseOwners");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersGreaterThan(String value) {
            addCriterion("house_owners >", value, "houseOwners");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersGreaterThanOrEqualTo(String value) {
            addCriterion("house_owners >=", value, "houseOwners");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersLessThan(String value) {
            addCriterion("house_owners <", value, "houseOwners");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersLessThanOrEqualTo(String value) {
            addCriterion("house_owners <=", value, "houseOwners");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersLike(String value) {
            addCriterion("house_owners like", value, "houseOwners");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersNotLike(String value) {
            addCriterion("house_owners not like", value, "houseOwners");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersIn(List<String> values) {
            addCriterion("house_owners in", values, "houseOwners");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersNotIn(List<String> values) {
            addCriterion("house_owners not in", values, "houseOwners");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersBetween(String value1, String value2) {
            addCriterion("house_owners between", value1, value2, "houseOwners");
            return (Criteria) this;
        }

        public Criteria andHouseOwnersNotBetween(String value1, String value2) {
            addCriterion("house_owners not between", value1, value2, "houseOwners");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameIsNull() {
            addCriterion("mortgage_user_name is null");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameIsNotNull() {
            addCriterion("mortgage_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameEqualTo(String value) {
            addCriterion("mortgage_user_name =", value, "mortgageUserName");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameNotEqualTo(String value) {
            addCriterion("mortgage_user_name <>", value, "mortgageUserName");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameGreaterThan(String value) {
            addCriterion("mortgage_user_name >", value, "mortgageUserName");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("mortgage_user_name >=", value, "mortgageUserName");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameLessThan(String value) {
            addCriterion("mortgage_user_name <", value, "mortgageUserName");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameLessThanOrEqualTo(String value) {
            addCriterion("mortgage_user_name <=", value, "mortgageUserName");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameLike(String value) {
            addCriterion("mortgage_user_name like", value, "mortgageUserName");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameNotLike(String value) {
            addCriterion("mortgage_user_name not like", value, "mortgageUserName");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameIn(List<String> values) {
            addCriterion("mortgage_user_name in", values, "mortgageUserName");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameNotIn(List<String> values) {
            addCriterion("mortgage_user_name not in", values, "mortgageUserName");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameBetween(String value1, String value2) {
            addCriterion("mortgage_user_name between", value1, value2, "mortgageUserName");
            return (Criteria) this;
        }

        public Criteria andMortgageUserNameNotBetween(String value1, String value2) {
            addCriterion("mortgage_user_name not between", value1, value2, "mortgageUserName");
            return (Criteria) this;
        }

        public Criteria andCurrentMortgageStatusIsNull() {
            addCriterion("current_mortgage_status is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMortgageStatusIsNotNull() {
            addCriterion("current_mortgage_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMortgageStatusEqualTo(Byte value) {
            addCriterion("current_mortgage_status =", value, "currentMortgageStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentMortgageStatusNotEqualTo(Byte value) {
            addCriterion("current_mortgage_status <>", value, "currentMortgageStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentMortgageStatusGreaterThan(Byte value) {
            addCriterion("current_mortgage_status >", value, "currentMortgageStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentMortgageStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("current_mortgage_status >=", value, "currentMortgageStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentMortgageStatusLessThan(Byte value) {
            addCriterion("current_mortgage_status <", value, "currentMortgageStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentMortgageStatusLessThanOrEqualTo(Byte value) {
            addCriterion("current_mortgage_status <=", value, "currentMortgageStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentMortgageStatusIn(List<Byte> values) {
            addCriterion("current_mortgage_status in", values, "currentMortgageStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentMortgageStatusNotIn(List<Byte> values) {
            addCriterion("current_mortgage_status not in", values, "currentMortgageStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentMortgageStatusBetween(Byte value1, Byte value2) {
            addCriterion("current_mortgage_status between", value1, value2, "currentMortgageStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentMortgageStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("current_mortgage_status not between", value1, value2, "currentMortgageStatus");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdIsNull() {
            addCriterion("mortgage_order_id is null");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdIsNotNull() {
            addCriterion("mortgage_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdEqualTo(String value) {
            addCriterion("mortgage_order_id =", value, "mortgageOrderId");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdNotEqualTo(String value) {
            addCriterion("mortgage_order_id <>", value, "mortgageOrderId");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdGreaterThan(String value) {
            addCriterion("mortgage_order_id >", value, "mortgageOrderId");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("mortgage_order_id >=", value, "mortgageOrderId");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdLessThan(String value) {
            addCriterion("mortgage_order_id <", value, "mortgageOrderId");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdLessThanOrEqualTo(String value) {
            addCriterion("mortgage_order_id <=", value, "mortgageOrderId");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdLike(String value) {
            addCriterion("mortgage_order_id like", value, "mortgageOrderId");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdNotLike(String value) {
            addCriterion("mortgage_order_id not like", value, "mortgageOrderId");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdIn(List<String> values) {
            addCriterion("mortgage_order_id in", values, "mortgageOrderId");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdNotIn(List<String> values) {
            addCriterion("mortgage_order_id not in", values, "mortgageOrderId");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdBetween(String value1, String value2) {
            addCriterion("mortgage_order_id between", value1, value2, "mortgageOrderId");
            return (Criteria) this;
        }

        public Criteria andMortgageOrderIdNotBetween(String value1, String value2) {
            addCriterion("mortgage_order_id not between", value1, value2, "mortgageOrderId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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