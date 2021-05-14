import com.yuan.dao.TeacherMapper;
import com.yuan.pojo.Teacher;
import com.yuan.pojo.Teacher2;
import com.yuan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Map;

public class TeacherMapperTest {

    @Test
    public void testSelectTeacher(){
        SqlSession sqlSession= MybatisUtil.getSession();
        TeacherMapper teacherMapper=sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher=teacherMapper.selectTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void testGetTeacher(){
        SqlSession sqlSession= MybatisUtil.getSession();
        TeacherMapper teacherMapper=sqlSession.getMapper(TeacherMapper.class);
        Teacher2 teacher2=teacherMapper.getTeacher2(1);
        System.out.println(teacher2);
        sqlSession.close();
    }

}
