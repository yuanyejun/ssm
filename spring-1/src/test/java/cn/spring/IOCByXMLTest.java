package cn.spring;

import cn.spring.pojo.Clazz;
import cn.spring.pojo.Student;
import cn.spring.pojo.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByXMLTest {

    @Test
    public void testIOC(){

        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("spring-ioc.xml");

        Student studentOne = (Student) ioc.getBean("student");
        System.out.println(studentOne);
    }

    @Test
    public void testClass(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("spring-ioc.xml");

        Student studentTwo = ioc.getBean(Student.class);
        System.out.println(studentTwo);
    }

    @Test
    public void testClassId(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("spring-ioc.xml");

        Student studentTwo = ioc.getBean("student",Student.class);
        System.out.println(studentTwo);
    }

    @Test
    public void testPerson(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("spring-ioc.xml");

        Person person = ioc.getBean(Student.class);
        System.out.println(person);
    }

    @Test
    public void testTeacher(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("spring-ioc.xml");

        Person tea = ioc.getBean(Teacher.class);
        System.out.println(tea);
    }

    @Test
    public void testConstruct(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("spring-ioc.xml");

        Person tea = ioc.getBean("stustruct",Student.class);
        System.out.println(tea);
    }

    @Test
    public void testFour(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("spring-ioc.xml");

        Person tea = ioc.getBean("studentfour",Student.class);
        System.out.println(tea);
    }

    @Test
    public void studentFive(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("spring-ioc.xml");

        Person tea = ioc.getBean("studentFive",Student.class);
        System.out.println(tea);
    }

    @Test
    public void classOne(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("spring-ioc.xml");

        Clazz tea = ioc.getBean("clazzId", Clazz.class);
        System.out.println(tea);
    }
}
