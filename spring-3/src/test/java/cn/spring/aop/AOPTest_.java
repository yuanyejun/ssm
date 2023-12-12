package cn.spring.aop;

import cn.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest_ {


    @Test
    public void testAOPBefore(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("aop-annotation.xml");

        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(10,1);

    }
}
