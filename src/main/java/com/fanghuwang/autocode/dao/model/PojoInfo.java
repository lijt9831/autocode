package com.fanghuwang.autocode.dao.model;

public class PojoInfo {
    private Long id;

    private String pojoId;

    private String pojoName;

    private Byte pojoType;

    private Byte createType;

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

    public String getPojoName() {
        return pojoName;
    }

    public void setPojoName(String pojoName) {
        this.pojoName = pojoName;
    }

    public Byte getPojoType() {
        return pojoType;
    }

    public void setPojoType(Byte pojoType) {
        this.pojoType = pojoType;
    }

    public Byte getCreateType() {
        return createType;
    }

    public void setCreateType(Byte createType) {
        this.createType = createType;
    }
}