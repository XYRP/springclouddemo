package com.southwind.feign;

import com.southwind.entity.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @program: springclouddemo
 * @description: RestTemplate的控制器
 * @author: Mr.PY
 * @create: 2019-09-02 13:50
 **/
@RestController
@RequestMapping("/rest")
public class RestHandler {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        /*
        * getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
        * getForEntity：通过发出GET请求获取到一个实体对象
        * "http://localhost:8010/student/findAll"：请求的URL
        * Collection.class：返回对象的数据类型
        * .getBody()：getForEntity方法返回值类型是ResponseEntity，需要此方法装换为对应类型
        *
        * */
        return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){

        //getForObject不用调用getBody()方法，根据对象数据类型直接返回不会进行封装
        return restTemplate.getForObject("http://localhost:8010/student/findAll", Collection.class);
    }


    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class,id).getBody();
    }

    @GetMapping("/findById2/{id}")
    public Student findById2(@PathVariable("id") long id){
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForEntity("http://localhost:8010/student/save", student, null).getBody();
    }

    @PostMapping("/save2")
    public  void  save2(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/save", student, null);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update", student);
    }

    @DeleteMapping("/deleted/{id}")
    public void deleted(@PathVariable long id){
        restTemplate.delete("http://localhost:8010/student/deleted/{id}", id);
    }
}
