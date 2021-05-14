package com.yuan.dao;

import com.yuan.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface StudentMapper {


    public List<Student> getStudentList();

    public Student getStudentById(int id);


    public int addStudent(Student student);


    public int updateStudent(Student student);

    public int deleteStudent(int id);

}
