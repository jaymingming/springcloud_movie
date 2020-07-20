package com.mooc.meetingfilm.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //可以集成大部分注册中心
@SpringBootApplication
public class BackendShowProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendShowProviderApplication.class, args);
    }

}
