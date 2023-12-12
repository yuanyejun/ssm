package cn.spring.dao.impl;

import cn.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getPriceByBookId(Integer bookUid) {
        String sql = "select price from t_book where book_id = ?";
        return jdbcTemplate.queryForObject(sql,Integer.class,bookUid);
    }

    @Override
    public void updateStock(Integer bookUid) {
        String sql = "update t_book set stock = stock - 1 where book_id = ?";
        jdbcTemplate.update(sql,bookUid);
    }

    @Override
    public void updateBalance(Integer uid, Integer price) {
        String sql = "update tt_user set balance = balance - ? where user_id = ?";
        jdbcTemplate.update(sql,price,uid);
    }
}
