package com.fanghuwang.autocode.entity.dto;

import java.util.List;

/**
 * @program: demo
 * @description: TODO
 * @author: Lijianting
 * @create: 2019/1/8 14:31
 **/
public class PojoDTO {
    private Long id;

    private String pojoId;

    private String pojoName;

    private Byte pojoType;

    private Byte createType;

    private List<ColumnDTO> columnDTOList;

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

    public List<ColumnDTO> getColumnDTOList() {
        return columnDTOList;
    }

    public void setColumnDTOList(List<ColumnDTO> columnDTOList) {
        this.columnDTOList = columnDTOList;
    }
}
