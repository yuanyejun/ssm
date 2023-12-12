package cn.mybatis.mapper;

import cn.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@SuppressWarnings("all")
public interface DynamicMapper {


    List<Emp> getEmpByCondition(Emp emp);


    List<Emp> getEmpByConditionOne(Emp emp);

    List<Emp> getEmpByConditionTwo(Emp emp);

    List<Emp> getEmpByConditionChose(Emp emp);

    void insertMoreEmp(@Param("emps") List<Emp> emps);

    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
