package cn.spring.service.impl;

import cn.spring.service.BookService;
import cn.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;
    @Autowired
    private CheckoutService checkoutService;

    @Override
//    @Transactional
    public void checkout(Integer userId,Integer[] bookIds){
        for (Integer bookId : bookIds) {
            bookService.buyBook(userId,bookId);
        }
    }
}
