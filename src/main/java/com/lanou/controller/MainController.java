package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dllo on 17/11/8.
 */
@Controller
public class MainController  {

    @RequestMapping(value = "/index")
    public  String toIndex(){
        return "index";
    }

    @RequestMapping(value = "/login")
    public  String toLogin(){
        return "login";
    }
    @RequestMapping(value = "/welcome")
    public  String toWelcome(){
        return "welcome";
    }
}
