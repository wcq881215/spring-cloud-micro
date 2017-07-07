package com.csf.micro;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new SpringApplicationBuilder(EurekaClientApp.class).web(true).run(args);

    }
}
