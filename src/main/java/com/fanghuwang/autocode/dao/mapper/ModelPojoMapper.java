package com.fanghuwang.autocode.dao.mapper;

import com.fanghuwang.autocode.dao.model.ModelPojoKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ModelPojoMapper {
    int deleteByPrimaryKey(ModelPojoKey key);

    int insert(ModelPojoKey record);

    int insertSelective(ModelPojoKey record);
}