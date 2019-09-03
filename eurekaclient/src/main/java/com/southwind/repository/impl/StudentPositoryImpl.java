package com.southwind.repository.impl;

import com.southwind.entity.Student;
import com.southwind.repository.StudentPository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: springclouddemo
 * @description: 学生代理接口的实现类
 * @author: Mr.PY
 * @create: 2019-09-02 10:57
 **/
@Repository
public class StudentPositoryImpl implements StudentPository {
    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 22));
        studentMap.put(2L, new Student(2L, "李四", 23));
        studentMap.put(3L, new Student(3L, "王五", 24));

    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deletedById(Long id) {
        studentMap.remove(id);
    }
}
