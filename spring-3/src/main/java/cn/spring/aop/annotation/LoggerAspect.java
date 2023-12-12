package cn.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 *     * cn.spring.aop.annotation.CalculatorPureImpl.*(..))
 *     第一个*代表任何修饰符 和 任何返回值类型
 *     第二个*代表此类下所有的方法
 *     (..)任何的形参参数列表
 *
 *
 * 在切面中 需要通过指定的注解将方法标识为通知方法
 *  前置通知：使用@Before注解标识，在被代理的目标方法前执行
 * 返回通知：使用@AfterReturning注解标识，在被代理的目标方法成功结束后执行（寿终正寝）
 * 异常通知：使用@AfterThrowing注解标识，在被代理的目标方法异常结束后执行（死于非命）
 * 后置通知：使用@After注解标识，在被代理的目标方法最终结束后执行（盖棺定论）
 * 环绕通知：使用@Around注解标识，使用try...catch...finally结构围绕整个被代理的目标方法，包
 * 括上面四种通知对应的所有位置
 */

@Component
@Aspect //将当前组件标识为切面
public class LoggerAspect {

    /**
     * 切入点表达式
     */
    @Pointcut("execution(* cn.spring.aop.annotation.CalculatorPureImpl.*(..))")
    public void pointCut(){
        System.out.println("pointCut被执行了");
    }

    //@Before("execution(public int cn.spring.aop.annotation.CalculatorPureImpl.add(int,int))")
    @Before("pointCut()")
    public void beforeAdviceMethod(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("beforeAdviceMethod,前置通知.:" + signature.getName() + ",参数：" + Arrays.toString(args));
    }

    @After("pointCut()")
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
    @AfterReturning(value = "pointCut()",returning = "result")
    public void AfterReturningMethod(JoinPoint joinPoint,Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println("AfterReturningMethod,返回通知: 方法:" + name + ",结果:" + result);
    }

    /**
     * @AfterThrowing中的属性throwing，用来将通知方法的某个形参，接收目标方法的异常
     * @param joinPoint
     * @param ex
     */
    @AfterThrowing(value = "pointCut()",throwing = "ex")
    public void AfterThrowingMethod(JoinPoint joinPoint,Throwable ex){
        String name = joinPoint.getSignature().getName();
        System.out.println("AfterThrowingMethod,异常通知: 方法:" + name + ",异常:" + ex);
    }

    /**
     *  @Around环绕通知
     */
    @Around("pointCut()")
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
