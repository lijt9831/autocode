package com.fanghuwang.autocode.dao.model;

import java.util.ArrayList;
import java.util.List;

public class PojoInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PojoInfoExample() {
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

        public Criteria andPojoIdIsNull() {
            addCriterion("pojo_id is null");
            return (Criteria) this;
        }

        public Criteria andPojoIdIsNotNull() {
            addCriterion("pojo_id is not null");
            return (Criteria) this;
        }

        public Criteria andPojoIdEqualTo(String value) {
            addCriterion("pojo_id =", value, "pojoId");
            return (Criteria) this;
        }

        public Criteria andPojoIdNotEqualTo(String value) {
            addCriterion("pojo_id <>", value, "pojoId");
            return (Criteria) this;
        }

        public Criteria andPojoIdGreaterThan(String value) {
            addCriterion("pojo_id >", value, "pojoId");
            return (Criteria) this;
        }

        public Criteria andPojoIdGreaterThanOrEqualTo(String value) {
            addCriterion("pojo_id >=", value, "pojoId");
            return (Criteria) this;
        }

        public Criteria andPojoIdLessThan(String value) {
            addCriterion("pojo_id <", value, "pojoId");
            return (Criteria) this;
        }

        public Criteria andPojoIdLessThanOrEqualTo(String value) {
            addCriterion("pojo_id <=", value, "pojoId");
            return (Criteria) this;
        }

        public Criteria andPojoIdLike(String value) {
            addCriterion("pojo_id like", value, "pojoId");
            return (Criteria) this;
        }

        public Criteria andPojoIdNotLike(String value) {
            addCriterion("pojo_id not like", value, "pojoId");
            return (Criteria) this;
        }

        public Criteria andPojoIdIn(List<String> values) {
            addCriterion("pojo_id in", values, "pojoId");
            return (Criteria) this;
        }

        public Criteria andPojoIdNotIn(List<String> values) {
            addCriterion("pojo_id not in", values, "pojoId");
            return (Criteria) this;
        }

        public Criteria andPojoIdBetween(String value1, String value2) {
            addCriterion("pojo_id between", value1, value2, "pojoId");
            return (Criteria) this;
        }

        public Criteria andPojoIdNotBetween(String value1, String value2) {
            addCriterion("pojo_id not between", value1, value2, "pojoId");
            return (Criteria) this;
        }

        public Criteria andPojoNameIsNull() {
            addCriterion("pojo_name is null");
            return (Criteria) this;
        }

        public Criteria andPojoNameIsNotNull() {
            addCriterion("pojo_name is not null");
            return (Criteria) this;
        }

        public Criteria andPojoNameEqualTo(String value) {
            addCriterion("pojo_name =", value, "pojoName");
            return (Criteria) this;
        }

        public Criteria andPojoNameNotEqualTo(String value) {
            addCriterion("pojo_name <>", value, "pojoName");
            return (Criteria) this;
        }

        public Criteria andPojoNameGreaterThan(String value) {
            addCriterion("pojo_name >", value, "pojoName");
            return (Criteria) this;
        }

        public Criteria andPojoNameGreaterThanOrEqualTo(String value) {
            addCriterion("pojo_name >=", value, "pojoName");
            return (Criteria) this;
        }

        public Criteria andPojoNameLessThan(String value) {
            addCriterion("pojo_name <", value, "pojoName");
            return (Criteria) this;
        }

        public Criteria andPojoNameLessThanOrEqualTo(String value) {
            addCriterion("pojo_name <=", value, "pojoName");
            return (Criteria) this;
        }

        public Criteria andPojoNameLike(String value) {
            addCriterion("pojo_name like", value, "pojoName");
            return (Criteria) this;
        }

        public Criteria andPojoNameNotLike(String value) {
            addCriterion("pojo_name not like", value, "pojoName");
            return (Criteria) this;
        }

        public Criteria andPojoNameIn(List<String> values) {
            addCriterion("pojo_name in", values, "pojoName");
            return (Criteria) this;
        }

        public Criteria andPojoNameNotIn(List<String> values) {
            addCriterion("pojo_name not in", values, "pojoName");
            return (Criteria) this;
        }

        public Criteria andPojoNameBetween(String value1, String value2) {
            addCriterion("pojo_name between", value1, value2, "pojoName");
            return (Criteria) this;
        }

        public Criteria andPojoNameNotBetween(String value1, String value2) {
            addCriterion("pojo_name not between", value1, value2, "pojoName");
            return (Criteria) this;
        }

        public Criteria andPojoTypeIsNull() {
            addCriterion("pojo_type is null");
            return (Criteria) this;
        }

        public Criteria andPojoTypeIsNotNull() {
            addCriterion("pojo_type is not null");
            return (Criteria) this;
        }

        public Criteria andPojoTypeEqualTo(Byte value) {
            addCriterion("pojo_type =", value, "pojoType");
            return (Criteria) this;
        }

        public Criteria andPojoTypeNotEqualTo(Byte value) {
            addCriterion("pojo_type <>", value, "pojoType");
            return (Criteria) this;
        }

        public Criteria andPojoTypeGreaterThan(Byte value) {
            addCriterion("pojo_type >", value, "pojoType");
            return (Criteria) this;
        }

        public Criteria andPojoTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("pojo_type >=", value, "pojoType");
            return (Criteria) this;
        }

        public Criteria andPojoTypeLessThan(Byte value) {
            addCriterion("pojo_type <", value, "pojoType");
            return (Criteria) this;
        }

        public Criteria andPojoTypeLessThanOrEqualTo(Byte value) {
            addCriterion("pojo_type <=", value, "pojoType");
            return (Criteria) this;
        }

        public Criteria andPojoTypeIn(List<Byte> values) {
            addCriterion("pojo_type in", values, "pojoType");
            return (Criteria) this;
        }

        public Criteria andPojoTypeNotIn(List<Byte> values) {
            addCriterion("pojo_type not in", values, "pojoType");
            return (Criteria) this;
        }

        public Criteria andPojoTypeBetween(Byte value1, Byte value2) {
            addCriterion("pojo_type between", value1, value2, "pojoType");
            return (Criteria) this;
        }

        public Criteria andPojoTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("pojo_type not between", value1, value2, "pojoType");
            return (Criteria) this;
        }

        public Criteria andCreateTypeIsNull() {
            addCriterion("create_type is null");
            return (Criteria) this;
        }

        public Criteria andCreateTypeIsNotNull() {
            addCriterion("create_type is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTypeEqualTo(Byte value) {
            addCriterion("create_type =", value, "createType");
            return (Criteria) this;
        }

        public Criteria andCreateTypeNotEqualTo(Byte value) {
            addCriterion("create_type <>", value, "createType");
            return (Criteria) this;
        }

        public Criteria andCreateTypeGreaterThan(Byte value) {
            addCriterion("create_type >", value, "createType");
            return (Criteria) this;
        }

        public Criteria andCreateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("create_type >=", value, "createType");
            return (Criteria) this;
        }

        public Criteria andCreateTypeLessThan(Byte value) {
            addCriterion("create_type <", value, "createType");
            return (Criteria) this;
        }

        public Criteria andCreateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("create_type <=", value, "createType");
            return (Criteria) this;
        }

        public Criteria andCreateTypeIn(List<Byte> values) {
            addCriterion("create_type in", values, "createType");
            return (Criteria) this;
        }

        public Criteria andCreateTypeNotIn(List<Byte> values) {
            addCriterion("create_type not in", values, "createType");
            return (Criteria) this;
        }

        public Criteria andCreateTypeBetween(Byte value1, Byte value2) {
            addCriterion("create_type between", value1, value2, "createType");
            return (Criteria) this;
        }

        public Criteria andCreateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("create_type not between", value1, value2, "createType");
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