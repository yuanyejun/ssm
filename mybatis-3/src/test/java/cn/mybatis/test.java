package cn.mybatis;

import cn.mybatis.mapper.DeptMapper;
import cn.mybatis.mapper.EmpMapper;
import cn.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class test {

    @Test
    public void getByList(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        EmpMapper mapper = sqlsession.getMapper(EmpMapper.class);
        System.out.println(mapper.getByList());
    }

    @Test
    public void getByUserId(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        EmpMapper mapper = sqlsession.getMapper(EmpMapper.class);
        System.out.println(mapper.getByUserId(1));
    }

    @Test
    public void getEmpAndDeptByEmpId(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        EmpMapper mapper = sqlsession.getMapper(EmpMapper.class);
        System.out.println(mapper.getEmpAndDeptByEmpId(1));
    }


    @Test
    public void getEmpAndDeptByStep(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        EmpMapper mapper = sqlsession.getMapper(EmpMapper.class);
        System.out.println(mapper.getEmpAndDeptByStep(1));
    }

    @Test
    public void getDeptAndEmpById(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        DeptMapper mapper = sqlsession.getMapper(DeptMapper.class);
        System.out.println(mapper.getDeptAndEmpById(110));
    }

    @Test
    public void getDeptAndEmpByStepOne(){
        SqlSession sqlsession = SqlSessionUtils.getSqlsession();
        DeptMapper mapper = sqlsession.getMapper(DeptMapper.class);
        System.out.println(mapper.getDeptAndEmpByStepOne(110));
    }
}
