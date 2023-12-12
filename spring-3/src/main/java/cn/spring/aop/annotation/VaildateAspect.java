package cn.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
/**
 * 使用@Order注解可以控制切面的优先级：
 * @Order(较小的数)：优先级高
 * @Order(较大的数)：优先级低
 */
public class VaildateAspect {

//    @Before("execution(* cn.spring.aop.annotation.CalculatorPureImpl.*(..))")
    @Before("cn.spring.aop.annotation.LoggerAspect.pointCut()")
    public void beforeMethod(){
        System.out.println("VaildateAspect --> 前置通知");
    }

}
