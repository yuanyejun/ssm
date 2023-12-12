package cn.spring;

import cn.spring.controller.UserController;
import cn.spring.dao.UserDao;
import cn.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationTest_ {


    @Test
    public void testAnntation(){

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-annotation.xml");

        UserController userController = applicationContext.getBean("userController",UserController.class);
        System.out.println(userController);

        UserService userService = applicationContext.getBean("userServiceImpl",UserService.class);
        System.out.println(userService);

        UserDao userDao = applicationContext.getBean("userdao",UserDao.class);
        System.out.println(userDao);

        userController.saveUser();
    }
}
