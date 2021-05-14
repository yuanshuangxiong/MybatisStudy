import com.yuan.dao.StudentMapper;
import com.yuan.pojo.Student;
import com.yuan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentTest {


    @Test
    public void test(){
        SqlSession sqlSession= MybatisUtil.getSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        Student student=studentMapper.queryStudentById(1);
        System.out.println(student);

        System.out.println("=========");
        Student student2= studentMapper.queryStudentById(1);
        System.out.println(student2);

        sqlSession.close();
    }
}
