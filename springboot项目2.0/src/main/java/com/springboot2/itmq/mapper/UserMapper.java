package com.springboot2.itmq.mapper;


import com.springboot2.itmq.entity.PageRequest;
import com.springboot2.itmq.entity.Teacher;
import com.springboot2.itmq.entity.UserName;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    /**
     * 查询一个数据
     * @return
     */
    public UserName selectUserById(int id);
    /**
     * 查询全部用户
     * @return
     */
    List<UserName> selectAll();
    /**
     * 联合查询：一对多
     * @return
     */
    public Teacher GetTeacher(int id);
    /**
     * 联合查询：一对多
     * @return
     */
    public Teacher GetTeacher2(int id);

    /**
     * 分页查询用户
     * @return
     */
    List<UserName> selectPage();
    /**
     * 多对一查询
     */
    Object getStudent();
}
