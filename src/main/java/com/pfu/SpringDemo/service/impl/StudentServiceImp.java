package com.pfu.SpringDemo.service.impl;

import com.pfu.SpringDemo.bean.Student;
import com.pfu.SpringDemo.mapper.StudentMapper;
import com.pfu.SpringDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public int add(Student student) {
        return studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int deleteById(int id) {
        return studentMapper.deleteById(id);
    }
}
