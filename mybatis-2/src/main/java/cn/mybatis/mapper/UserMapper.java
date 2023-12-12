package cn.mybatis.mapper;

import cn.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User getByUserName(String username);

    User checkLogin(@Param("username") String username,@Param("password") String password);

    void insertUser(User user);

}
