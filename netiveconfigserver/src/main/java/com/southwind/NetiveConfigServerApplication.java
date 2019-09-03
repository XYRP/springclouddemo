package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: springclouddemo
 * @description:
 * @author: Mr.PY
 * @create: 2019-09-03 09:31
 **/
@SpringBootApplication
@EnableConfigServer         //声明配置中心
public class NetiveConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NetiveConfigServerApplication.class, args);

    }

}
