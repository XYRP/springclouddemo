package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springclouddemo
 * @description: Rest的启动类
 * @author: Mr.PY
 * @create: 2019-09-02 13:46
 **/
@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class, args);
    }

    /**
     *创建一个RestTemplate实例并将其交给Spring容器管理
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
