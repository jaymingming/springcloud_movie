package com.mooc.meetingfilm.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author : jiangzh
 * @program : com.mooc.meetingfilm.consumer.service
 * @description :
 **/
@Service
public class ConsumerServiceImpl implements ConsumerServiceAPI{

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient eurekaClient;

    @Override
    public String sayHello(String message) {
        // 准备工作
        //String hostname = "localhost";
       int port = 7101;
//        String uri = "/provider/sayhello?message="+message;

        // GET Register
        ServiceInstance choose = eurekaClient.choose("hello-service-provider");

        String hostname = choose.getHost();
//        int port = choose.getPort();

        String uri = "/provider/sayhello?message="+message;

        //http://localhost:7101/provider/sayhello?message=hello
        String url = "http://" + hostname+ ":"+port+uri;

        // invoker provider test
        System.out.println(url);
        String result = restTemplate.getForObject(url, String.class);

        return result;
    }

}
