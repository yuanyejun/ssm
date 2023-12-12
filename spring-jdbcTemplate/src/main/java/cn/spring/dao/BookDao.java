package cn.spring.dao;

public interface BookDao {
    /**
     * 根据图书的id查询图书的价格
     * @param bookUid
     * @return
     */
    Integer getPriceByBookId(Integer bookUid);

    /**
     * 更新图书的库存
     * @param bookUid
     */
    void updateStock(Integer bookUid);

    /**
     * 更新用户的余额
     * @param uid
     * @param price
     */
    void updateBalance(Integer uid, Integer price);
}
