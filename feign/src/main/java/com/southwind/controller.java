package com.southwind;

import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @program: springclouddemo
 * @description:
 * @author: Mr.PY
 * @create: 2019-09-02 16:41
 **/
@RestController
@RequestMapping("/feign")
public class controller {
    @Resource
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
