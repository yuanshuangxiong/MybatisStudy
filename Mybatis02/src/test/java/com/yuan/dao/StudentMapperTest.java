package com.yuan.dao;

import com.yuan.pojo.Student;
import com.yuan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession= MybatisUtil.getSession();
        StudentMapper studentDaO=sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList=studentDaO.getStudentList();
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        sqlSession.close();
    }
}
