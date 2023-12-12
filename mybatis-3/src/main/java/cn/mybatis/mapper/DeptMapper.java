package cn.mybatis.mapper;

import cn.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings("all")
public interface DeptMapper {


    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptid);

//    一对多
    Dept getDeptAndEmpById(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
