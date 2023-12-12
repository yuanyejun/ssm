package cn.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class LoggerAspect {

    /**
     * 切入点表达式
     */
    @Pointcut("execution(* cn.spring.aop.xml.CalculatorPureImpl.*(..))")
    public void pointCut(){

    }

    //@Before("execution(public int cn.spring.aop.annotation.CalculatorPureImpl.add(int,int))")
    public void beforeAdviceMethod(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("beforeAdviceMethod,前置通知.:" + signature.getName() + ",参数：" + Arrays.toString(args));
    }

    public void AfterMethod(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
//        Object[] args = joinPoint.getArgs();
        System.out.println("AfterMethod,后置通知:" + signature.getName());
    }

    /**
     *  @AfterReturning中的属性returning，用来将通知方法的某个形参，接收目标方法的返回值
     * @param joinPoint
     * @param result
     */

    public void AfterReturningMethod(JoinPoint joinPoint,Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println("AfterReturningMethod,返回通知: 方法:" + name + ",结果:" + result);
    }

    /**
     * @AfterThrowing中的属性throwing，用来将通知方法的某个形参，接收目标方法的异常
     * @param joinPoint
     * @param ex
     */

    public void AfterThrowingMethod(JoinPoint joinPoint,Throwable ex){
        String name = joinPoint.getSignature().getName();
        System.out.println("AfterThrowingMethod,异常通知: 方法:" + name + ",异常:" + ex);
    }

    /**
     *  @Around环绕通知
     */

    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
        Object result = null;
        try {
            System.out.println("环绕通知-->目标对象方法执行之前");
            //目标方法的执行，目标方法的返回值一定要返回给外界调用者
            result = proceedingJoinPoint.proceed();
            System.out.println("环绕通知-->目标对象方法返回值之后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知-->目标对象方法出现异常时");
        } finally {
            System.out.println("环绕通知-->目标对象方法执行完毕");
        }
        return result;

    }

}
