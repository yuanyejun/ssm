package cn.spring;

import cn.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 声明式事务 在spring配置文件中配置事务管理器
 *      开启事务的注解驱动
 *      在需要被事务管理的方法上 添加@Transactional注解 该方法就回被事务管理
 *      1.标识在方法上
 *      2.标识在类上 则类中所有的方法都会被事务管理
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class TxByAnnotationTest_ {

    @Autowired
    private BookController bookController;

    @Test
    public void testByBook(){
//        bookController.buyBook(1,1);
        bookController.buyBook(1,new Integer[]{1,2});
    }
}
