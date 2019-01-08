package com.fanghuwang.autocode.dao.mapper;

import com.fanghuwang.autocode.dao.model.HouseInfo;
import com.fanghuwang.autocode.dao.model.HouseInfoExample;
import com.fanghuwang.autocode.dao.model.HouseInfoWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HouseInfoMapper {
    int countByExample(HouseInfoExample example);

    int deleteByExample(HouseInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HouseInfoWithBLOBs record);

    int insertSelective(HouseInfoWithBLOBs record);

    List<HouseInfoWithBLOBs> selectByExampleWithBLOBs(HouseInfoExample example);

    List<HouseInfo> selectByExample(HouseInfoExample example);

    HouseInfoWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HouseInfoWithBLOBs record, @Param("example") HouseInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") HouseInfoWithBLOBs record, @Param("example") HouseInfoExample example);

    int updateByExample(@Param("record") HouseInfo record, @Param("example") HouseInfoExample example);

    int updateByPrimaryKeySelective(HouseInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HouseInfoWithBLOBs record);

    int updateByPrimaryKey(HouseInfo record);
}