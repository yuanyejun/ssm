package cn.spring;

import cn.spring.web.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireTest_ {
    /**
     *  自动装配
     *     根据指定的策略 再ioc容器中匹配某个bean 自动为bean中的类类型的属性或接口类型的属性赋值
     *     可以通过bean标签中的autowire属性来设置自动装配
     *     no、 defalut 表示不装配 即bean属性不会自动匹配某个bean为属性赋值
     *     byType 根据要赋值的属性的类型 再ioc容器中匹配某个bean 为属性赋值
     *             若通过类型没有找到任何一个类型匹配的bean 此时就不装配 属性使用默认值
     *             若通过类型找到了多个类型匹配的bean 此时会抛出异常
     *             bytype实现自动装配时 ioc容器中只能有一个类型匹配的bean能够为属性赋值
     *     byName 将自动装配的属性的属性名，作为bean的id在IOC容器中匹配相对应的bean进行赋值
     */
    @Test
    public void AutoTest(){

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-autowire.xml");

        UserController userController = applicationContext.getBean(UserController.class);

        userController.saveUser();

    }
}
