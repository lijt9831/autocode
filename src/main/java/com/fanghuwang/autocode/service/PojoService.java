package com.fanghuwang.autocode.service;

import com.fanghuwang.autocode.entity.dto.PojoDTO;
import com.fanghuwang.autocode.entity.qo.DeletePojoQO;
import com.fanghuwang.autocode.entity.qo.GetPojoQO;
import com.fanghuwang.autocode.entity.qo.ListPojoQO;

import java.util.List;

public interface PojoService {
    List<PojoDTO> listPojo(ListPojoQO query);

    PojoDTO getPojo(GetPojoQO query);

    int savePojo(PojoDTO pojoDTO);

    int deletePojo(DeletePojoQO query);

    int deletePojos(DeletePojoQO query);

    int updatePojo(PojoDTO pojoDTO);
}
