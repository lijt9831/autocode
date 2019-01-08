package com.fanghuwang.autocode.common.codeutils;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: demo
 * @description: TODO
 * @author: Lijianting
 * @create: 2019/1/4 15:59
 **/
public class CreateController {

    public static void createController(){
        try {
            Map root = new HashMap();
            root.put("package", "com.chinaoly.job.entity");
            root.put("user", "cunxp");
            root.put("date", "2018/08/31");
            root.put("tableName", "task");
            root.put("className", "Task");
            List data = new ArrayList();
            data.add("@Column(name = \"task_name\")\nprivate String taskName;\n");
            data.add("@Column(name = \"task_description\")\nprivate String taskDescription;\n");
            data.add("@Column(name = \"file_name\")\nprivate String fileName; \n");
            root.put("data", data);
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
            Resource resource = new ClassPathResource("codetemplate");
            cfg.setDirectoryForTemplateLoading(resource.getFile());
            cfg.setObjectWrapper(new DefaultObjectWrapper(Configuration.VERSION_2_3_28));
            Template temp = cfg.getTemplate("controllerTemplate.ftl");
            String fileName = "Controller.java";
            File filetemp = new File("project/hivetest/template/");
            if(!filetemp.exists()){
                filetemp.mkdirs();
            }
            File file = new File("project/hivetest/template/" + fileName);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            temp.process(root, bw);
            bw.flush();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
