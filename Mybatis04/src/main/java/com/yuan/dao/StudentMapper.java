package com.yuan.dao;

import com.yuan.pojo.Student;
import com.yuan.pojo.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {



    @Select("select * from student")
    public List<Student> getStudentList();

    public List<Student> getStudentTeacherList();

    public List<Student> getStudentTeacherList2();

    @Select("select * from student where id=#{id}")
    public Student getStudentById(int id);

    @Insert("insert into student(id,name,password) values(#{id},#{name},#{password})")
    public int addStudent(Student student);

    @Update("update student set name=#{name},password=#{password} where id=#{id}")
    public int updateStudent(Student student);

    @Delete("delete from student where id=#{id}")
    public int deleteStudent(int id);

}
