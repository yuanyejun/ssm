package cn.spring;

import cn.spring.pojo.Student;
import cn.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycle_ {

    /**
     *  若bean的作用域为单例时 生命周期的前三个步骤会在获取ioc容器时执行
     *  若bean的作业域为多例时 生命周期的前三个步骤会在获取bean时执行
     */
    @Test
    public void lifeCycle_(){
        ConfigurableApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User ioc1 = applicationContext.getBean(User.class);

        applicationContext.close();
//
//        System.out.println(ioc1);
    }
}
