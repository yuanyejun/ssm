package cn.mybatis;

import cn.mybatis.mapper.SelectMapper;
import cn.mybatis.pojo.User;
import cn.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestSelect {

    @Test
    public void testSelectById(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        SelectMapper mapper = sqlsession.getMapper(SelectMapper.class);

        System.out.println(mapper.getById(1));
    }

    @Test
    public void testSelectAll(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        SelectMapper mapper = sqlsession.getMapper(SelectMapper.class);

        System.out.println(mapper.getByAll());
    }

    @Test
    public void testSelectCount(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        SelectMapper mapper = sqlsession.getMapper(SelectMapper.class);

        System.out.println(mapper.selectCount());
    }


    @Test
    public void testgetUserByIdMap(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        SelectMapper mapper = sqlsession.getMapper(SelectMapper.class);

        System.out.println(mapper.getUserByIdMap(1));
    }

    @Test
    public void testgetUserByAllMap(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        SelectMapper mapper = sqlsession.getMapper(SelectMapper.class);

        System.out.println(mapper.getUserAllMap());
    }

    @Test
    public void testgetUserByAllMap2(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        SelectMapper mapper = sqlsession.getMapper(SelectMapper.class);

        System.out.println(mapper.getUserAllMap2());
    }

    @Test
    public void testgetUserByLike(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        SelectMapper mapper = sqlsession.getMapper(SelectMapper.class);

        System.out.println(mapper.testgetUserByLike("r"));
    }

    @Test
    public void deleteUser(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        SelectMapper mapper = sqlsession.getMapper(SelectMapper.class);

        mapper.deleteUser("9,10");
    }

    @Test
    public void getUserList(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        SelectMapper mapper = sqlsession.getMapper(SelectMapper.class);

        System.out.println(mapper.getUserList("t_user"));
    }

    @Test
    public void InsertUser(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        SelectMapper mapper = sqlsession.getMapper(SelectMapper.class);

        User user = new User(null, "haha2", "haha2", 19, "0", "haha@qq.com");
        mapper.InsertUser(user);

        System.out.println(user);
    }
}
