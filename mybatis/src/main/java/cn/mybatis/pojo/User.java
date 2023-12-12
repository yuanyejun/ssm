package cn.mybatis.pojo;

import lombok.Data;
import lombok.ToString;

@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String gender;
    private String email;

}