package cn.spring.service.impl;

import cn.spring.dao.BookDao;
import cn.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
//@Transactional(
//        timeout = 3
//        noRollbackFor = ArithmeticException.class
//        isolation = Isolation.READ_COMMITTED  事务隔离级别
//        propagation = Propagation.REQUIRES_NEW
//)
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void buyBook(Integer uid, Integer bookUid) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookUid);
        //更新图书的库存
        bookDao.updateStock(bookUid);
        //更新用户的余额
        bookDao.updateBalance(uid,price);
//        System.out.println(10/0);
    }
}
