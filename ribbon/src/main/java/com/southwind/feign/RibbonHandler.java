package com.southwind.feign;

import com.southwind.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @program: springclouddemo
 * @description:
 * @author: Mr.PY
 * @create: 2019-09-02 16:06
 **/
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://provider/student/findAll", Collection.class);
    }

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/student/index", String.class);
    }
}
