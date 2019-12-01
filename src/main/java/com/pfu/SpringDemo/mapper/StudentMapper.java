package com.pfu.SpringDemo.mapper;

import com.pfu.SpringDemo.bean.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * 映射基本的增删查改
 */
@Component
@Mapper
public interface StudentMapper {
    @Insert("insert into student(id,name,sex) values(#{id},#{name},#{sex})")
    int add(Student student);
    @Update("update student set name=#{name},sex=#{sex} where id=#{id}")
    int update(Student student);
    @Delete("delete from student where id=#{id}")
    int deleteById(int id);
}
