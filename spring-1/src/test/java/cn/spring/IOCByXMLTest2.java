package cn.spring;

import cn.spring.pojo.Clazz;
import cn.spring.pojo.Student;
import cn.spring.pojo.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByXMLTest2 {


    @Test
    public void testOne(){

        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc2.xml");
        Clazz clazzOne = ioc.getBean("clazzOne", Clazz.class);

        System.out.println(clazzOne);
    }

    @Test
    public void StudentOne(){

        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc2.xml");
        Student student = ioc.getBean("stuone", Student.class);

        System.out.println(student);
    }

    @Test
    public void studentSix(){

        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc2.xml");
        Student student = ioc.getBean("stusix", Student.class);

        System.out.println(student);
    }

}
