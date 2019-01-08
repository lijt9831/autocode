package com.fanghuwang.autocode.dao.mapper;

import com.fanghuwang.autocode.dao.model.PojoInfo;
import com.fanghuwang.autocode.dao.model.PojoInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PojoInfoMapper {
    int countByExample(PojoInfoExample example);

    int deleteByExample(PojoInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PojoInfo record);

    int insertSelective(PojoInfo record);

    List<PojoInfo> selectByExample(PojoInfoExample example);

    PojoInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PojoInfo record, @Param("example") PojoInfoExample example);

    int updateByExample(@Param("record") PojoInfo record, @Param("example") PojoInfoExample example);

    int updateByPrimaryKeySelective(PojoInfo record);

    int updateByPrimaryKey(PojoInfo record);
}