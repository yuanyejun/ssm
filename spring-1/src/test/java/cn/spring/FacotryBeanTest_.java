package cn.spring;

import cn.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  factoryBean是一个接口 需要创建一个类实现接口
 *          其中有三个方法:
 *              getObject() 通过一个u对象交给ioc容器管理
 *              getObjectType 设置所提供对象的类型
 *              isSingleton() 所提供对象是否单例
 *              当把factoryBean的实现类配置为bean时 会将当前类中getObject() 所返回的对象交给ioc容器管理
 */
public class FacotryBeanTest_ {

    @Test
    public void userFactory_(){

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-factory.xml");
        User bean = applicationContext.getBean(User.class);

        System.out.println(bean);

    }
}
