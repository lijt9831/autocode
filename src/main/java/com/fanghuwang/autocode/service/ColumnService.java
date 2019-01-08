package com.fanghuwang.autocode.service;

import com.fanghuwang.autocode.entity.dto.ColumnDTO;
import com.fanghuwang.autocode.entity.qo.DeleteColumnQO;
import com.fanghuwang.autocode.entity.qo.ListColumnQO;

import java.util.List;

public interface ColumnService {
    List<ColumnDTO> listColumns(ListColumnQO query);

    int saveColumn(ColumnDTO columnDTO);

    int deleteColumns(DeleteColumnQO query);

    int deleteColumn(DeleteColumnQO query);

    int updateColumn(ColumnDTO columnDTO);
}
