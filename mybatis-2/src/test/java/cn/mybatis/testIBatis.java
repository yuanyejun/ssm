package cn.mybatis;

import cn.mybatis.mapper.UserMapper;
import cn.mybatis.pojo.User;
import cn.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class testIBatis {

    @Test
    public void testMybatis(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        System.out.println(mapper.getByUserName("admin"));
    }

    @Test
    public void testcheckLogin(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        System.out.println(mapper.checkLogin("root","admin"));
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = new User(null,"lala","lala",18,"1","lala@qq.com");
        mapper.insertUser(user);
    }

    @Test
    public void testgetUserByIdMap(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = new User(null,"lala","lala",18,"1","lala@qq.com");
        mapper.insertUser(user);
    }
}
