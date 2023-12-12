package cn.spring.aop.xml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class VaildateAspect {

//    @Before("execution(* cn.spring.aop.annotation.CalculatorPureImpl.*(..))")
    @Before("cn.spring.aop.xml.LoggerAspect.pointCut()")
    public void beforeMethod(){
        System.out.println("VaildateAspect --> 前置通知");
    }

}
