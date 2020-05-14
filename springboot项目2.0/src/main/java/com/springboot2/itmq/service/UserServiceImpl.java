package com.springboot2.itmq.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot2.itmq.Utils.PageUtils;
import com.springboot2.itmq.entity.PageResult;
import com.springboot2.itmq.entity.Teacher;
import com.springboot2.itmq.entity.UserName;
import com.springboot2.itmq.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.springboot2.itmq.entity.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserName userName;

    //查询一个
    @Override
    public UserName Sel(int id) {
        System.out.println("UserServiceImpl层");
        userName = userMapper.selectUserById(id);
        System.out.println("返回值：" + userName);
        return userName;

    }
    //查询全部
    @Override
    public List<UserName> findAll() {
        return userMapper.selectAll();
    }
    /**
     * 一对多关系查询
     * @param
     * @return
     */
    @Override
    public Teacher GetTeacher(Integer id) {
        System.out.println("安全");
        return userMapper.GetTeacher(id);
    }

    @Override
    public Teacher GetTeacher2(Integer id) {
        System.out.println("controller安全");
        return userMapper.GetTeacher2(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }


    /**
     * 调用分页插件完成分页
     *
     * @param
     * @return
     */

    public List<UserName> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<UserName> sysMenus = userMapper.selectPage();
        return sysMenus;
    }

    /**
     * 一对多关系查询
     * @param a
     * @return
     */
    @Override
    public Object getStudent(Integer a) {

        return userMapper.getStudent();
    }

}
