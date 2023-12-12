package cn.spring.dao.impl;

import cn.spring.dao.UserDao;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("userdao")
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("用户信息保存了....");
    }
}
