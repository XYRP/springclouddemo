package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springclouddemo
 * @description: 负载均衡的启动类
 * @author: Mr.PY
 * @create: 2019-09-02 16:01
 **/
@SpringBootApplication
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced     //提供负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
