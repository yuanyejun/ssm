package cn.mybatis;

import cn.mybatis.mapper.EmpMapper;
import cn.mybatis.pojo.Emp;
import cn.mybatis.utils.SqlSessionUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;

public class MyBatisTest_ {


    @Test
    public void test(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        EmpMapper mapper = sqlsession.getMapper(EmpMapper.class);


        Page<Object> page = PageHelper.startPage(3, 4);

        Page<Emp> emps = (Page<Emp>) mapper.getEmpList();

        PageInfo<Emp> pageInfo = new PageInfo<>(emps,5);

        emps.forEach(System.out::println);

        System.out.println(pageInfo);


    }
}
