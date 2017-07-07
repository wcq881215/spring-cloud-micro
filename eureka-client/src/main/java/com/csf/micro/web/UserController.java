package com.csf.micro.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by changqi.wu on 2017/7/5.
 */

@RestController
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/user/test")
    public String utest(){
        System.out.println("now call me " + discoveryClient.getServices());
        return  "success";
    }

    @RequestMapping("/test")
    public Map<String,String> test(){
        System.out.println("now call me " );
        Map<String,String> map = new HashMap<String,String>();
        map.put("test","1111");
        map.put("success","2222");
        return  map;
    }
}
