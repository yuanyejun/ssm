package cn.spring.controller;

import cn.spring.service.BookService;
import cn.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer uid,Integer[] bookUid){
//        bookService.buyBook(uid,bookUid);
        checkoutService.checkout(uid,new Integer[]{1,2});
    }

}
