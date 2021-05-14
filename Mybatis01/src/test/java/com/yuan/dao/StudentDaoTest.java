package com.yuan.dao;

import com.yuan.pojo.Student;
import com.yuan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDaoTest {
    @Test
    public void test(){
        //获得sqlsession
        SqlSession sqlSession= MybatisUtil.getSession();
//方法一
        StudentMapper studentDaO=sqlSession.getMapper(StudentMapper.class);
        List<Student>studentList=studentDaO.getStudentList();
//方法二
//        List<Student>studentList=sqlSession.selectList("com.yuan.dao.StudentDaO.getStudentList");
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        sqlSession.close();
    }


    @Test
    public void getStudentById(){
        SqlSession sqlSession=MybatisUtil.getSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        Student student=studentMapper.getStudentById(1);
        System.out.println(student.toString());
        sqlSession.close();
    }

    @Test
    public void getStudentLike(){
        SqlSession sqlSession=MybatisUtil.getSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList=studentMapper.getStudentLike("li");
        for (Student student : studentList) {
            System.out.println(student);
        }
//        System.out.println(student.toString());
        sqlSession.close();
    }


    @Test//插入数据需要提交事务
    public void addStudent(){
        SqlSession sqlSession=MybatisUtil.getSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        int res=studentMapper.addStudent(new Student(3,"wangwu","sdfs"));
        if(res>0){
            System.out.println("res:"+res);
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void addStudent2(){
        SqlSession sqlSession=MybatisUtil.getSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        Map<String,Object>map=new HashMap<String, Object>();
        map.put("studentId",3);
        map.put("studentName","zhaoliu");
        map.put("password","123456");
        int res=studentMapper.addStudent2(map);
        if(res>0){
            System.out.println("res:"+res);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateStudent(){
        SqlSession sqlSession=MybatisUtil.getSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        int res=studentMapper.updateStudent(new Student(3,"wangwu","123456"));
        if(res>0){
            System.out.println("res:"+res);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteStudent(){
        SqlSession sqlSession=MybatisUtil.getSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        int res=studentMapper.deleteStudent(3);
        if(res>0){
            System.out.println("res:"+res);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
