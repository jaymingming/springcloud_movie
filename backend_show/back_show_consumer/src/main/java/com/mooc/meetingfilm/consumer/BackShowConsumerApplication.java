package com.mooc.meetingfilm.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BackShowConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackShowConsumerApplication.class, args);
    }

}
