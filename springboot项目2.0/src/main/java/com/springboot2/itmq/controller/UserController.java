package com.springboot2.itmq.controller;







import com.github.pagehelper.PageInfo;
import com.springboot2.itmq.entity.PageRequest;
import com.springboot2.itmq.entity.Teacher;
import com.springboot2.itmq.entity.UserName;
import com.springboot2.itmq.service.UserServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Api(tags ="分页")
@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    UserName user2;
    @Autowired
    Teacher teacher;



    /**
     * 首页
     * @return
     */
    @RequestMapping("/index")
    public String getindex(){
        System.out.println("首页进来了");
        return "index";
    }

    /**
     * 查询出所有的数据
     * @return
     */
    @GetMapping(value = "/findAll")
    public Object findAll(Model model) {
        List<UserName> all = userService.findAll();
        System.out.println("查询出来了"+ all);
        model.addAttribute("all",all);
        return "index";
    }

    /**
     * 查询一条数据
     */
    @RequestMapping("/getUser")
    public String GetUser(Model model){
        int id=1;
        System.out.println("哈哈哈 " + id);
        user2=userService.Sel(id);
        model.addAttribute("user2",user2);
        return "index";
    }
    /**
     * 联合查询：一对多0
     */
    @RequestMapping("/GetTeacher")
    public String GetTeacher(Model model){
        int id=2;
        System.out.println("controller安全");
        teacher=userService.GetTeacher(id);
        System.out.println(teacher);
        model.addAttribute("teacher",teacher);
        return "index";
    }    /**
     * 联合查询：一对多0 第二种方式
     */
    @RequestMapping("/GetTeacher2")
    public String GetTeacher2(Model model){
        int id=2;
        System.out.println("controller安全");
        teacher=userService.GetTeacher2(id);
        System.out.println(teacher);
        model.addAttribute("teacher",teacher);
        return "index";
    }
    /**
     * 分页查询，分页查询有三种方式
     *              一种用list  然后sublist就行截取，分页查询
     *              二种用limit (0,1)第一个是从哪里开始，第二个是截取几个
     *              三种用pagehelper就行分页查询
     * @return
     */
    @RequestMapping(value="/findPage")
    public Object findPage() {
        PageRequest pageRequest=new PageRequest();
        pageRequest.setPageNum(1);
        pageRequest.setPageSize(3);
        List<UserName> pageInfo = userService.getPageInfo(pageRequest);
        for (int i=0;i<pageInfo.size();i++){
            System.out.println(pageInfo.get(i));
        }
        System.out.println(pageInfo);
        return "index";
    }
    /**
     *  多对一查询
     * @return
     */
    @GetMapping(value="/getStudent")
    public Object getStudent() {
        System.out.println(userService.getStudent(1));
        return "index";
    }




}
