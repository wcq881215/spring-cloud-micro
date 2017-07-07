package com.csf.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulApp {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        for (String service : discoveryClient.getServices()) {
            System.out.println("service : " + service);
            List<ServiceInstance> list = discoveryClient.getInstances(service);
            for (ServiceInstance serviceInstance : list) {
                System.out.println("====：" + serviceInstance.getUri() + ", " + serviceInstance.getMetadata());
            }
        }
        Map map = new HashMap<String, String>();
        map.put("xxx", "111");
        map.put("ccc", "2222");
        return "hello-1";
    }

    @RequestMapping(value = "/map", method = RequestMethod.GET)
    public Map map() {

        Map map = new HashMap<String, String>();
        map.put("xxx", "111");
        map.put("ccc", "2222");
        return map;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsulApp.class, args);
        System.out.println("start consul service ");
    }

}
