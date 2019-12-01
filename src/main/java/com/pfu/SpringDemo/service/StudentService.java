package com.pfu.SpringDemo.service;

import com.pfu.SpringDemo.bean.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteById(int id);
}
