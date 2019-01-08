package com.fanghuwang.autocode.dao.mapper;

import com.fanghuwang.autocode.dao.model.ApiInfo;
import com.fanghuwang.autocode.dao.model.ApiInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ApiInfoMapper {
    int countByExample(ApiInfoExample example);

    int deleteByExample(ApiInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiInfo record);

    int insertSelective(ApiInfo record);

    List<ApiInfo> selectByExample(ApiInfoExample example);

    ApiInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiInfo record, @Param("example") ApiInfoExample example);

    int updateByExample(@Param("record") ApiInfo record, @Param("example") ApiInfoExample example);

    int updateByPrimaryKeySelective(ApiInfo record);

    int updateByPrimaryKey(ApiInfo record);
}