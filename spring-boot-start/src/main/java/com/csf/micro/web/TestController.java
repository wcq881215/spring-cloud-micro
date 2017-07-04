package com.csf.micro.web;

import com.csf.micro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by changqi.wu on 2017/7/4.
 */
@RestController
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println(userService.userInfo());
        System.out.println("=======this is a test====");
        return  "you are a test";
    }

    @RequestMapping("/user/add")
    @ResponseBody
    public String test2(){
        System.out.println("user /add ");
        return  "aadd ";
    }
}
