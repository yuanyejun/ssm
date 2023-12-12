package cn.mybatis.mapper;

import cn.mybatis.pojo.Emp;

import java.util.List;

@SuppressWarnings("all")
public interface EmpMapper {

    List<Emp> getEmpList();

}
