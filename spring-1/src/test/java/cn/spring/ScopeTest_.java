package cn.spring;

import cn.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest_ {


    @Test
    public void ScopeTest01_(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        Student ioc1 = applicationContext.getBean(Student.class);

        Student ioc2 = applicationContext.getBean(Student.class);

        System.out.println(ioc1 == ioc2);
    }
}
