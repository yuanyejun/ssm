package cn.mybatis;


import cn.mybatis.mapper.EmpMapper;
import cn.mybatis.pojo.Emp;
import cn.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyBatisTest_ {

    @Test
    public void test(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        EmpMapper mapper = sqlsession.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.selectByExample(null);
        System.out.println(emps);
    }
}
