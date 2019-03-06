package com.qfedu.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {

    private static SqlSessionFactory sessionFactory = null;

    static{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
    }



    public static SqlSession getSqlSession() {
        return sessionFactory.openSession(true);
    }
}
