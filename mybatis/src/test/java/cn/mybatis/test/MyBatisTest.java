package cn.mybatis.test;

import cn.mybatis.mapper.UserMapper;
import cn.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {


    @Test
    public void testMybatis(){

        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

            SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);

            SqlSession sqlSession = build.openSession();

            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            int result = mapper.insertUser();

            System.out.println(":" + result);

            sqlSession.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUpdate(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        mapper.updateUser();
    }

    @Test
    public void testDelete(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        mapper.deleteUser();
    }

    @Test
    public void testSelectUser(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        System.out.println(mapper.selectUser());
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        System.out.println(mapper.selectAll());
    }
}
