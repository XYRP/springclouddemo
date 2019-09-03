package com.southwind.controller;

import com.southwind.HystrixApplication;
import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @program: springclouddemo
 * @description:
 * @author: Mr.PY
 * @create: 2019-09-02 17:26
 **/
@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    @Resource
    private FeignProviderClient feignProviderClient;

    @RequestMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @RequestMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }

}
