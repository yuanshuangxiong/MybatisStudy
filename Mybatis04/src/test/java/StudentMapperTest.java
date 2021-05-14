import com.yuan.dao.StudentMapper;
import com.yuan.pojo.Student;
import com.yuan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void getStudentTeacherTest(){
        SqlSession sqlSession=MybatisUtil.getSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        List<Student>studentList=studentMapper.getStudentTeacherList();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void getStudentTeacherTest2(){
        SqlSession sqlSession=MybatisUtil.getSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        List<Student>studentList=studentMapper.getStudentTeacherList2();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

//    @Test
//    public void getStudentList(){
//        SqlSession sqlSession= MybatisUtil.getSession();
//        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
//        List<Student>studentList=studentMapper.getStudentList();
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
//        sqlSession.close();
//    }
//
//    @Test
//    public void InsertStudentTest(){
//        SqlSession sqlSession= MybatisUtil.getSession();
//        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
//        int res=studentMapper.addStudent(new Student(4,"shunfeng","1423"));
//        sqlSession.commit();
//        System.out.println(res);
//        sqlSession.close();
//    }
//
//    @Test
//    public void DeleteStudentTest(){
//        SqlSession sqlSession= MybatisUtil.getSession();
//        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
//        int res=studentMapper.deleteStudent(4);
//        sqlSession.commit();
//        System.out.println(res);
//        sqlSession.close();
//    }
//
//    @Test
//    public void UpdateStudentTest(){
//        SqlSession sqlSession= MybatisUtil.getSession();
//        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
//        int res=studentMapper.updateStudent(new Student(3,"wangwu","134456"));
//        sqlSession.commit();
//        System.out.println(res);
//        sqlSession.close();
//    }
}
