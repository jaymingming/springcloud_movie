package com.mooc.meetingfilm.provider.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>backend-parent</h3>
 * <p></p>
 *
 * @author : java练习生
 * @date : 2020-07-19 17:24
 **/

@Slf4j
@RestController
public class ProviderController {
    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "/provider/sayhello")
    public String providerSayHello(String message){
        log.error("port:{}, message:{}",port, message);
        return "Provider sayhello port";
    }
}
