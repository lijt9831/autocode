package com.fanghuwang.autocode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: demo
 * @description: TODO
 * @author: Lijianting
 * @create: 2019/1/8 11:15
 **/
@Controller
@RequestMapping("/autocode")
public class AutoCodeController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    public String modelList(){
        return "model/model_list";
    }

    public String modelEdit(){
        return "model/model_edit";
    }

    public String modelAdd(){
        return "model/model_add";
    }

    public String modelDelete(){
        return "success";
    }

    public String modelSave(){
        return "success";
    }

    public String apiList(){
        return "api/api_list";
    }

    public String apiEdit(){
        return "api/api_edit";
    }

    public String apiAdd(){
        return "api/api_add";
    }

    public String apiDelete(){
        return "success";
    }

    public String apiSave(){
        return "success";
    }

    public String pojoList(){
        return "pojo/pojo_list";
    }

    public String pojoEdit(){
        return "pojo/pojo_edit";
    }

    @RequestMapping("/pojoAdd")
    public String pojoAdd(){
        return "pojo/pojo_add";
    }

    public String pojoDelete(){
        return "success";
    }

    public String pojoSave(){
        return "success";
    }




}
