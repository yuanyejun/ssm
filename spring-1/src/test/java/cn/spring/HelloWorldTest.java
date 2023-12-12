package cn.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldTest {

    @Test
    public void test(){

        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld hw = (HelloWorld) ioc.getBean("hw");

        hw.sayHello();

    }

}
