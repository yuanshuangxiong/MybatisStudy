package dao;

import com.yuan.pojo.Student;
import com.yuan.util.MybatisUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import com.yuan.dao.StudentMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMapperTest {

    static  Logger logger=Logger.getLogger(StudentMapperTest.class);

    @Test
    public void test(){
        //获得sqlsession
        SqlSession sqlSession= MybatisUtil.getSession();
//方法一
        StudentMapper studentDaO=sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList=studentDaO.getStudentList();
//方法二
//        List<Student>studentList=sqlSession.selectList("com.yuan.dao.StudentDaO.getStudentList");
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info:"+"进入testLogger");
        logger.debug("degub:");
        logger.error("error");
    }

    @Test
    public void getStudentByLimit(){
        SqlSession sqlSession= MybatisUtil.getSession();
//方法一
        StudentMapper studentDaO=sqlSession.getMapper(StudentMapper.class);
        Map<String,Integer>map=new HashMap<String,Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<Student>studentList=studentDaO.getStudentByLimit(map);
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }


    @Test
    public void getStudentByRowBond(){
        SqlSession sqlSession= MybatisUtil.getSession();
//方法一
        StudentMapper studentDaO=sqlSession.getMapper(StudentMapper.class);

        RowBounds rowbond=new RowBounds(1,2);
        List<Student>studentList=sqlSession.selectList("com.yuan.dao.StudentMapper.getStudentByRowBonds","null",rowbond);
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
