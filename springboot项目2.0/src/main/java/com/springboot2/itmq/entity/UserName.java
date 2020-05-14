package com.springboot2.itmq.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class UserName {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
