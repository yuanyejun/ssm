package cn.mybatis.mapper;

import cn.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public interface SelectMapper {

    User getById(@Param("id") Integer id);

    List<User> getByAll();

    Integer selectCount();

    Map<String,Object> getUserByIdMap(@Param("id") Integer id);

    List<Map<String,Object>> getUserAllMap();

    @MapKey("username")
    Map<String,Object>  getUserAllMap2();

    /**
     * 模糊查询 ${}
     */

    List<User> testgetUserByLike(@Param("mohu") String mohu);

    void deleteUser(@Param("ids") String ids);

    List<User> getUserList(@Param("tableName") String tableName);

    void InsertUser(User user);
}
