package com.mooc.meetingfilm.cinema;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@EnableHystrix
@EnableHystrixDashboard
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.mooc.meetingfilm"})
@MapperScan(basePackages = {"com.mooc.meetingfilm.cinema.dao"})
@SpringBootApplication
public class BackendCinemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendCinemaApplication.class, args);
    }

}
