import com.yuan.dao.BlogMapper;
import com.yuan.pojo.Blog;
import com.yuan.util.IDUtils;
import com.yuan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class BlogMapperTest {
    @Test
    public void addBlog(){
        SqlSession sqlSession= MybatisUtil.getSession();
        BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);

        Blog blog=new Blog(IDUtils.getId(),"张三","fdsa",new Date(),999);
        blogMapper.addBlog(blog);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlog(){
        SqlSession sqlSession= MybatisUtil.getSession();
        BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
        Map map=new HashMap();
        map.put("title","mybatisr");
//        map.put("author","袁双雄");
//        Blog blog=new Blog(IDUtils.getId(),"mybatisr公司的","fdsa",new Date(),999);
        List<Blog>blogList=blogMapper.queryBlog(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
//        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession= MybatisUtil.getSession();
        BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
        Map map=new HashMap();
//        map.put("title","mybatisr");
//        map.put("author","袁双雄");
        map.put("views","999");
        List<Blog>blogList=blogMapper.queryBlogChoose(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
//        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void TestUpdate(){
        SqlSession sqlSession= MybatisUtil.getSession();
        BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
        Map map=new HashMap();
        map.put("title","yuanshuangxiong");
        map.put("author","123123");
//        map.put("views","0543bcdc3713489b979e8252f3acf2d4");
        map.put("id","0543bcdc3713489b979e8252f3acf2d4");
        int res=blogMapper.updateBlog(map);
//        for (Blog blog : blogList) {
//            System.out.println(blog);
//        }
//        sqlSession.commit();
         sqlSession.close();
    }

    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession= MybatisUtil.getSession();
        BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
        Map map=new HashMap();
        ArrayList ids=new ArrayList<Integer>();
        ids.add(1);
        map.put("ids",ids);
        List<Blog>blogList=blogMapper.queryBlogForeach(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

}
