package cn.spring;

import cn.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-xml.xml")
public class TxByXML_ {

    @Autowired
    private BookController bookController;

    @Test
    public void testTxByXML(){
//        bookController.buyBook(1,1);
            bookController.buyBook(1,new Integer[]{1,2});

    }

}
