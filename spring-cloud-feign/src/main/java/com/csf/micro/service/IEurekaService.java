package com.csf.micro.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by changqi.wu on 2017/7/6.
 */
@FeignClient("eureka-client")
public interface IEurekaService {

    @RequestMapping(value = "/test")
    String serviceTest();

}
