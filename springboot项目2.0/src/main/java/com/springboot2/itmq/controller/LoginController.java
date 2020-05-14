package com.springboot2.itmq.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    /**
     * 登录
     */
     @RequestMapping(value = "/logins", method = RequestMethod.GET)
    public String login(){

         return "index";
    }
    /**
     *  注册
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(){

        return "index";
    }

    /**
     * 首页
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){

        return "index";
    }
}
