package com.yuan.dao;

import com.yuan.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    public List<Student> getStudentList();

    public Student getStudentById(int id);

    public List<Student> getStudentByLimit(Map<String,Integer>map);

    public List<Student> getStudentByRowBonds();


    public int addStudent(Student student);


    public int updateStudent(Student student);

    public int deleteStudent(int id);

}
