package cn.spring.controller;

import cn.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    /**
     * @Autowired
     *      在成员变量上直接标记@Autowired注解即可完成自动装配，
     *      不需要提供setXxx()方法
     *
     */
    @Autowired
    @Qualifier("service1")
    private UserService userService;


    public void saveUser(){
        userService.saveUser();
    }
}
