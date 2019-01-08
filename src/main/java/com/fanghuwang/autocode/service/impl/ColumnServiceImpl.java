package com.fanghuwang.autocode.service.impl;

import com.fanghuwang.autocode.common.idutils.IdUtils;
import com.fanghuwang.autocode.dao.mapper.PojoColumnInfoMapper;
import com.fanghuwang.autocode.dao.model.PojoColumnInfo;
import com.fanghuwang.autocode.dao.model.PojoColumnInfoExample;
import com.fanghuwang.autocode.entity.dto.ColumnDTO;
import com.fanghuwang.autocode.entity.qo.DeleteColumnQO;
import com.fanghuwang.autocode.entity.qo.ListColumnQO;
import com.fanghuwang.autocode.service.ColumnService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static com.fanghuwang.autocode.common.idutils.Prefix.COLUMN_ID_PROFIX;

/**
 * @program: demo
 * @description: TODO
 * @author: Lijianting
 * @create: 2019/1/8 15:29
 **/
@Service
public class ColumnServiceImpl implements ColumnService {

    @Autowired
    private PojoColumnInfoMapper pojoColumnInfoMapper;

    @Override
    public List<ColumnDTO> listColumns(ListColumnQO query) {
        PojoColumnInfoExample example = new PojoColumnInfoExample();
        PojoColumnInfoExample.Criteria criteria = example.createCriteria();
        criteria.andPojoIdEqualTo(query.getPojoId());
        List<PojoColumnInfo> resultList = pojoColumnInfoMapper.selectByExample(example);
        List<ColumnDTO> columnDTOList = new ArrayList<>();
        ColumnDTO columnDTO;
        for(PojoColumnInfo item:resultList){
            columnDTO = new ColumnDTO();
            BeanUtils.copyProperties(item,columnDTO);
            columnDTOList.add(columnDTO);
        }
        return columnDTOList;
    }

    @Override
    public int saveColumn(ColumnDTO columnDTO) {
        PojoColumnInfo pojoColumnInfo = new PojoColumnInfo();
        BeanUtils.copyProperties(columnDTO,pojoColumnInfo);
        pojoColumnInfo.setColumnId(IdUtils.getId(COLUMN_ID_PROFIX));
        return pojoColumnInfoMapper.insertSelective(pojoColumnInfo);
    }

    @Override
    @Transactional
    public int deleteColumns(DeleteColumnQO query) {
        return 0;
    }

    @Override
    public int deleteColumn(DeleteColumnQO query) {
        return 0;
    }

    @Override
    public int updateColumn(ColumnDTO columnDTO) {
        PojoColumnInfo pojoColumnInfo = new PojoColumnInfo();
        BeanUtils.copyProperties(columnDTO,pojoColumnInfo);
        PojoColumnInfoExample example = new PojoColumnInfoExample();
        PojoColumnInfoExample.Criteria criteria = example.createCriteria();
        criteria.andPojoIdEqualTo(columnDTO.getPojoId());
        return pojoColumnInfoMapper.updateByExampleSelective(pojoColumnInfo,example);
    }
}
