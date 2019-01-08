package com.fanghuwang.autocode.controller;

import com.fanghuwang.autocode.entity.dto.ColumnDTO;
import com.fanghuwang.autocode.entity.qo.ListColumnQO;
import com.fanghuwang.autocode.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: demo
 * @description: TODO
 * @author: Lijianting
 * @create: 2019/1/8 18:59
 **/
@Controller
@RequestMapping("column")
public class ColumnController {

    @Autowired
    private ColumnService columnService;

    @RequestMapping("listColumn")
    public List<ColumnDTO> listColumn(ListColumnQO query){
        return columnService.listColumns(query);
    }

    public String columnDelete(){
        return "success";
    }

    public String columnSave(){
        return "success";
    }
}
