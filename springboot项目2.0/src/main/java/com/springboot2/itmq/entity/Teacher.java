package com.springboot2.itmq.entity;

import lombok.Data;

import org.springframework.stereotype.Repository;

/**
 * 老师类
 */
@Data
@Repository
public class Teacher {

    private  Integer Tid;

    private String Tname;

    /**
     * 课程对象
     */
    private  Course course;

}
