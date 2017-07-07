package com.csf.micro.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by changqi.wu on 2017/7/6.
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon/test")
    public String test() {

        System.out.println("test - ribbon ");
        return  restTemplate.getForObject("http://eureka-client/test",String.class);
    }


}
