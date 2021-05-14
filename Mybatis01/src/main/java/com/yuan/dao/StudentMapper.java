package com.yuan.dao;

import com.yuan.pojo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface StudentMapper {

    public List<Student> getStudentList();

    public Student getStudentById(int id);

    public List<Student> getStudentLike(String name);

    public int addStudent(Student student);

    public int addStudent2(Map<String,Object>map);

    public int updateStudent(Student student);

    public int deleteStudent(int id);

}
