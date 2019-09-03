package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springclouddemo
 * @description: 注册中心的启动类
 * @author: Mr.PY
 * @create: 2019-09-02 10:16
 **/
@SpringBootApplication      //声明该类是springboot服务的入口
@EnableEurekaServer         //申明该类是一个EurekaServer微服务，提供服务注册和服务发现功能，即注册中心
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
