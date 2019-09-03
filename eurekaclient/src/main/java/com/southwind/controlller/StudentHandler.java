package com.southwind.controlller;

import com.southwind.entity.Student;
import com.southwind.repository.StudentPository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @program: springclouddemo
 * @description:
 * @author: Mr.PY
 * @create: 2019-09-02 11:23
 **/
@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Resource
    private StudentPository studentPository;

    @Value("${server.port}")    //读取配置文件中的server.port的值并将其赋值给port
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentPository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentPository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentPository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentPository.saveOrUpdate(student );
    }

    @DeleteMapping("/deleted/{id}")
    public void deleted(@PathVariable("id") long id){
        studentPository.deletedById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口："+this.port;
    }
}
