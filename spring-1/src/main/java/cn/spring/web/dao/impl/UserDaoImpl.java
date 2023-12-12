package cn.spring.web.dao.impl;

import cn.spring.web.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功...");
    }
}
