package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: springclouddemo
 * @description: 网关的启动类
 * @author: Mr.PY
 * @create: 2019-09-02 15:26
 **/
@EnableZuulProxy            //包含了`@EnableZuulServer`,设置该类为网关的启动类
@EnableAutoConfiguration    //将所有符合条件的`@Configuration`配置加载到当前SpringBoot创建并使用的IOC容器中
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }


}
