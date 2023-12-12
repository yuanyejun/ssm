package cn.mybatis.mapper;


import cn.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {


    int insertUser();

    void updateUser();

    int deleteUser();

    User selectUser();

    List<User> selectAll();
}
