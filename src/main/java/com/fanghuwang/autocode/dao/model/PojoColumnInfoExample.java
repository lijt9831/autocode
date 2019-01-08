package com.fanghuwang.autocode.dao.model;

import java.util.ArrayList;
import java.util.List;

public class PojoColumnInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PojoColumnInfoExample() {
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

        public Criteria andColumnIdIsNull() {
            addCriterion("column_id is null");
            return (Criteria) this;
        }

        public Criteria andColumnIdIsNotNull() {
            addCriterion("column_id is not null");
            return (Criteria) this;
        }

        public Criteria andColumnIdEqualTo(String value) {
            addCriterion("column_id =", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotEqualTo(String value) {
            addCriterion("column_id <>", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdGreaterThan(String value) {
            addCriterion("column_id >", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdGreaterThanOrEqualTo(String value) {
            addCriterion("column_id >=", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdLessThan(String value) {
            addCriterion("column_id <", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdLessThanOrEqualTo(String value) {
            addCriterion("column_id <=", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdLike(String value) {
            addCriterion("column_id like", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotLike(String value) {
            addCriterion("column_id not like", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdIn(List<String> values) {
            addCriterion("column_id in", values, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotIn(List<String> values) {
            addCriterion("column_id not in", values, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdBetween(String value1, String value2) {
            addCriterion("column_id between", value1, value2, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotBetween(String value1, String value2) {
            addCriterion("column_id not between", value1, value2, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNull() {
            addCriterion("column_name is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNotNull() {
            addCriterion("column_name is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameEqualTo(String value) {
            addCriterion("column_name =", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotEqualTo(String value) {
            addCriterion("column_name <>", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThan(String value) {
            addCriterion("column_name >", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("column_name >=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThan(String value) {
            addCriterion("column_name <", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThanOrEqualTo(String value) {
            addCriterion("column_name <=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLike(String value) {
            addCriterion("column_name like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotLike(String value) {
            addCriterion("column_name not like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIn(List<String> values) {
            addCriterion("column_name in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotIn(List<String> values) {
            addCriterion("column_name not in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameBetween(String value1, String value2) {
            addCriterion("column_name between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotBetween(String value1, String value2) {
            addCriterion("column_name not between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameIsNull() {
            addCriterion("column_cn_name is null");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameIsNotNull() {
            addCriterion("column_cn_name is not null");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameEqualTo(String value) {
            addCriterion("column_cn_name =", value, "columnCnName");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameNotEqualTo(String value) {
            addCriterion("column_cn_name <>", value, "columnCnName");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameGreaterThan(String value) {
            addCriterion("column_cn_name >", value, "columnCnName");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("column_cn_name >=", value, "columnCnName");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameLessThan(String value) {
            addCriterion("column_cn_name <", value, "columnCnName");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameLessThanOrEqualTo(String value) {
            addCriterion("column_cn_name <=", value, "columnCnName");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameLike(String value) {
            addCriterion("column_cn_name like", value, "columnCnName");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameNotLike(String value) {
            addCriterion("column_cn_name not like", value, "columnCnName");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameIn(List<String> values) {
            addCriterion("column_cn_name in", values, "columnCnName");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameNotIn(List<String> values) {
            addCriterion("column_cn_name not in", values, "columnCnName");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameBetween(String value1, String value2) {
            addCriterion("column_cn_name between", value1, value2, "columnCnName");
            return (Criteria) this;
        }

        public Criteria andColumnCnNameNotBetween(String value1, String value2) {
            addCriterion("column_cn_name not between", value1, value2, "columnCnName");
            return (Criteria) this;
        }

        public Criteria andDbTableIsNull() {
            addCriterion("db_table is null");
            return (Criteria) this;
        }

        public Criteria andDbTableIsNotNull() {
            addCriterion("db_table is not null");
            return (Criteria) this;
        }

        public Criteria andDbTableEqualTo(String value) {
            addCriterion("db_table =", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableNotEqualTo(String value) {
            addCriterion("db_table <>", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableGreaterThan(String value) {
            addCriterion("db_table >", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableGreaterThanOrEqualTo(String value) {
            addCriterion("db_table >=", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableLessThan(String value) {
            addCriterion("db_table <", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableLessThanOrEqualTo(String value) {
            addCriterion("db_table <=", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableLike(String value) {
            addCriterion("db_table like", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableNotLike(String value) {
            addCriterion("db_table not like", value, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableIn(List<String> values) {
            addCriterion("db_table in", values, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableNotIn(List<String> values) {
            addCriterion("db_table not in", values, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableBetween(String value1, String value2) {
            addCriterion("db_table between", value1, value2, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableNotBetween(String value1, String value2) {
            addCriterion("db_table not between", value1, value2, "dbTable");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnIsNull() {
            addCriterion("db_table_column is null");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnIsNotNull() {
            addCriterion("db_table_column is not null");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnEqualTo(String value) {
            addCriterion("db_table_column =", value, "dbTableColumn");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnNotEqualTo(String value) {
            addCriterion("db_table_column <>", value, "dbTableColumn");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnGreaterThan(String value) {
            addCriterion("db_table_column >", value, "dbTableColumn");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnGreaterThanOrEqualTo(String value) {
            addCriterion("db_table_column >=", value, "dbTableColumn");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnLessThan(String value) {
            addCriterion("db_table_column <", value, "dbTableColumn");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnLessThanOrEqualTo(String value) {
            addCriterion("db_table_column <=", value, "dbTableColumn");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnLike(String value) {
            addCriterion("db_table_column like", value, "dbTableColumn");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnNotLike(String value) {
            addCriterion("db_table_column not like", value, "dbTableColumn");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnIn(List<String> values) {
            addCriterion("db_table_column in", values, "dbTableColumn");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnNotIn(List<String> values) {
            addCriterion("db_table_column not in", values, "dbTableColumn");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnBetween(String value1, String value2) {
            addCriterion("db_table_column between", value1, value2, "dbTableColumn");
            return (Criteria) this;
        }

        public Criteria andDbTableColumnNotBetween(String value1, String value2) {
            addCriterion("db_table_column not between", value1, value2, "dbTableColumn");
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