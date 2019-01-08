package com.fanghuwang.autocode.dao.model;

public class PojoColumnInfo {
    private Long id;

    private String pojoId;

    private String columnId;

    private String columnName;

    private String columnCnName;

    private String dbTable;

    private String dbTableColumn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPojoId() {
        return pojoId;
    }

    public void setPojoId(String pojoId) {
        this.pojoId = pojoId;
    }

    public String getColumnId() {
        return columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnCnName() {
        return columnCnName;
    }

    public void setColumnCnName(String columnCnName) {
        this.columnCnName = columnCnName;
    }

    public String getDbTable() {
        return dbTable;
    }

    public void setDbTable(String dbTable) {
        this.dbTable = dbTable;
    }

    public String getDbTableColumn() {
        return dbTableColumn;
    }

    public void setDbTableColumn(String dbTableColumn) {
        this.dbTableColumn = dbTableColumn;
    }
}