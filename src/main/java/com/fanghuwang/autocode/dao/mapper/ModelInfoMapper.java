package com.fanghuwang.autocode.dao.mapper;

import com.fanghuwang.autocode.dao.model.ModelInfo;
import com.fanghuwang.autocode.dao.model.ModelInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ModelInfoMapper {
    int countByExample(ModelInfoExample example);

    int deleteByExample(ModelInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ModelInfo record);

    int insertSelective(ModelInfo record);

    List<ModelInfo> selectByExample(ModelInfoExample example);

    ModelInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ModelInfo record, @Param("example") ModelInfoExample example);

    int updateByExample(@Param("record") ModelInfo record, @Param("example") ModelInfoExample example);

    int updateByPrimaryKeySelective(ModelInfo record);

    int updateByPrimaryKey(ModelInfo record);
}