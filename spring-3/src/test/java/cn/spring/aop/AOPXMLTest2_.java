package cn.spring.aop;

import cn.spring.aop.annotation.Calculator;
import cn.spring.aop.annotation.CalculatorPureImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPXMLTest2_ {


    @Test
    public void testAOPBefore(){
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("aop-xml.xml");

        Calculator calculator = ioc.getBean(CalculatorPureImpl.class);
        calculator.div(10,1);

    }
}
