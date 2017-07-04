package com.csf.micro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by changqi.wu on 2017/7/4.
 */
@Controller
public class UserController {

    @RequestMapping("/user/add")
    public String test(){
        System.out.println("user /add ");
        return  "aadd ";
    }



}
