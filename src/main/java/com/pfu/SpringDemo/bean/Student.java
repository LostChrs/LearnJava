package com.pfu.SpringDemo.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -339516038496531943L;
    private int id;
    private String name;
    private String sex;

    public Student(int id,String name,String sex){
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
