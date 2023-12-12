package cn.mybatis;

import cn.mybatis.mapper.CacheMapper;
import cn.mybatis.pojo.Emp;
import cn.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class MyBatisTest_ {

    /** 一级缓存:
     *  不同的sqlsession
     *  同sqlsession不同的查询条件
     *  同sqlsession但是清空了缓存
     *  同sqlsession但是执行了增删改
     */
    @Test
    public void getById(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        CacheMapper mapper = sqlsession.getMapper(CacheMapper.class);
        Emp em1 = mapper.getById(1);
        System.out.println(em1);
        Emp emp2 = mapper.getById(2);
        System.out.println(emp2);

        Emp emp3 = mapper.getById(1);
        System.out.println(emp3);

    }

    /** 二级缓存是SqlSessionFactory级别
     * 二级缓存:
     *     二级缓存必须在SqlSession关闭或提交之后有效
     *
     *     使二级缓存失效的情况：
     *          两次查询之间执行了任意的增删改，会使一级和二级缓存同时失效
     */
    @Test
    public void testCache(){

        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);

            SqlSession sqlSession1 = build.openSession(true);

            CacheMapper mapper = sqlSession1.getMapper(CacheMapper.class);
            System.out.println(mapper.getById(1));
            sqlSession1.close();
            //NotSerializableException
            SqlSession sqlSession2 = build.openSession(true);
            CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
            System.out.println(mapper2.getById(1));
            sqlSession2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
