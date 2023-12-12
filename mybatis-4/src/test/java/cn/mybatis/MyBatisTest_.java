package cn.mybatis;

import cn.mybatis.mapper.DynamicMapper;
import cn.mybatis.pojo.Emp;
import cn.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class MyBatisTest_ {

    @Test
    public void getEmpByCondition(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        DynamicMapper mapper = sqlsession.getMapper(DynamicMapper.class);
        Emp emp = new Emp(null, "", null,"0");
        System.out.println(mapper.getEmpByCondition(emp));

    }

    @Test
    public void getEmpByConditionOne(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        DynamicMapper mapper = sqlsession.getMapper(DynamicMapper.class);
        Emp emp = new Emp(null, "李四", null,"0");
        System.out.println(mapper.getEmpByConditionOne(emp));

    }

    @Test
    public void getEmpByConditionTwo(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        DynamicMapper mapper = sqlsession.getMapper(DynamicMapper.class);
        Emp emp = new Emp(null, "李四", null,"0");
        System.out.println(mapper.getEmpByConditionTwo(emp));

    }

    @Test
    public void insertMoreEmp(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        DynamicMapper mapper = sqlsession.getMapper(DynamicMapper.class);
        Emp emp1 = new Emp(null, "小米", 18,"0");
        Emp emp2 = new Emp(null, "华为", 18,"0");
        Emp emp3 = new Emp(null, "vivo", 18,"0");

        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(emps);

    }

    @Test
    public void deleteMoreEmp(){

        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        DynamicMapper mapper = sqlsession.getMapper(DynamicMapper.class);

        Integer[] integers = new Integer[]{4,5};

        mapper.deleteMoreEmp(integers);

    }
}
