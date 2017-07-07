package com.csf.micro.web;

import com.csf.micro.service.IEurekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by changqi.wu on 2017/7/6.
 */

@RestController
public class FeignController {

    @Autowired
    private IEurekaService eurekaService;

    @GetMapping("/feigh/test")
    public String test(){
        return eurekaService.serviceTest();
    }
}
