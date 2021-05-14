package com.yuan.util;

//import jdk.internal.loader.Resource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        try{
            String resource="mybatis-config.xml";
            InputStream inputStream= Resources.getResourceAsStream(resource);
             sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static SqlSession getSession(){
        return sqlSessionFactory.openSession(true);//设置为ture就不用再提交事务，自动提交

    }
}
