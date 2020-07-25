package com.mooc.meetingfilm.hall.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <h3>backend-parent</h3>
 * <p></p>
 *
 * @author : java练习生
 * @date : 2020-07-21 15:43
 **/
@Configuration
public class RestConf {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}