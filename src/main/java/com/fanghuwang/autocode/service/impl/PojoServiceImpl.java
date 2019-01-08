package com.fanghuwang.autocode.service.impl;

import com.fanghuwang.autocode.dao.mapper.PojoInfoMapper;
import com.fanghuwang.autocode.entity.dto.PojoDTO;
import com.fanghuwang.autocode.service.PojoService;
import com.fanghuwang.autocode.entity.qo.DeletePojoQO;
import com.fanghuwang.autocode.entity.qo.GetPojoQO;
import com.fanghuwang.autocode.entity.qo.ListPojoQO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo
 * @description: TODO
 * @author: Lijianting
 * @create: 2019/1/8 14:41
 **/
@Service
public class PojoServiceImpl implements PojoService {

    @Autowired
    private PojoInfoMapper pojoInfoMapper;

    @Override
    public List<PojoDTO> listPojo(ListPojoQO query) {
        return null;
    }

    @Override
    public PojoDTO getPojo(GetPojoQO query) {
        return null;
    }

    @Override
    public int savePojo(PojoDTO pojoDTO) {
        return 0;
    }

    @Override
    public int deletePojo(DeletePojoQO query) {
        return 0;
    }

    @Override
    public int deletePojos(DeletePojoQO query) {
        return 0;
    }

    @Override
    public int updatePojo(PojoDTO pojoDTO) {
        return 0;
    }
}
