package com.littlefox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-11-25 09:31
 */
@EnableZipkinServer
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZipkinApplication.class,args);
    }

}