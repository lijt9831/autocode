package com.chinaoly.job.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
/**
 * @author cunxp
 * @date 2018/08/31
 * @description
 */
@Entity
@Table(name = "task")
public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
        @Column(name = "task_name")
private String taskName;

        @Column(name = "task_description")
private String taskDescription;

        @Column(name = "file_name")
private String fileName; 

}