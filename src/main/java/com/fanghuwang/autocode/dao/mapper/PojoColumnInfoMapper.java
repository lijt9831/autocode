package com.fanghuwang.autocode.dao.mapper;

import com.fanghuwang.autocode.dao.model.PojoColumnInfo;
import com.fanghuwang.autocode.dao.model.PojoColumnInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PojoColumnInfoMapper {
    int countByExample(PojoColumnInfoExample example);

    int deleteByExample(PojoColumnInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PojoColumnInfo record);

    int insertSelective(PojoColumnInfo record);

    List<PojoColumnInfo> selectByExample(PojoColumnInfoExample example);

    PojoColumnInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PojoColumnInfo record, @Param("example") PojoColumnInfoExample example);

    int updateByExample(@Param("record") PojoColumnInfo record, @Param("example") PojoColumnInfoExample example);

    int updateByPrimaryKeySelective(PojoColumnInfo record);

    int updateByPrimaryKey(PojoColumnInfo record);
}