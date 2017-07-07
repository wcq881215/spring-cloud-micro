package com.csf.micro;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by changqi.wu on 2017/7/4.
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaApp {

    public static void main(String[] args) {
        System.out.println("start eureka service");
        new SpringApplicationBuilder(EurekaApp.class).web(true).run(args);
    }


}
