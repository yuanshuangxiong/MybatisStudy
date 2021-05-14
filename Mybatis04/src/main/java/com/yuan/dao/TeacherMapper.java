package com.yuan.dao;

import com.yuan.pojo.Student;
import com.yuan.pojo.Teacher;
import com.yuan.pojo.Teacher2;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    @Select("select * from teacher where id=#{id}")
    public Teacher selectTeacher(int id);

    public Teacher2 getTeacher(int id);

    public Teacher2 getTeacher2(int id);

    public List<Student> getStudentList();
}
