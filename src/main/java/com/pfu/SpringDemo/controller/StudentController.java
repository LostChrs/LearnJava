package com.pfu.SpringDemo.controller;

import com.pfu.SpringDemo.bean.Student;
import com.pfu.SpringDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(int id,String name,String sex){
         int r = this.studentService.add(new Student(id,name,sex));
         return "添加:"+name+" 结果:"+r;
    }
}
