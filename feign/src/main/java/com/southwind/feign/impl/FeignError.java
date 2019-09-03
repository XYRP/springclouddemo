package com.southwind.feign.impl;

import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @program: springclouddemo
 * @description: 熔断机制，用于定义容错逻辑
 * @author: Mr.PY
 * @create: 2019-09-02 16:52
 **/
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器忙碌中...";
    }
}
