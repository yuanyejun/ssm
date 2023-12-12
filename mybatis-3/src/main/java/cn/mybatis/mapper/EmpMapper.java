package cn.mybatis.mapper;

import cn.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@SuppressWarnings("all")
public interface EmpMapper {

    List<Emp> getByList();


    Emp getByUserId(@Param("id") Integer id);

    Emp getEmpAndDeptByEmpId(@Param("empid") Integer empid);

    Emp getEmpAndDeptByStep(@Param("empid") Integer empid);

    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
