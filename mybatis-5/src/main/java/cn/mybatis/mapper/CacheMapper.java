package cn.mybatis.mapper;

import cn.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings("all")
public interface CacheMapper {

    Emp getById(@Param("id") Integer id);

}
