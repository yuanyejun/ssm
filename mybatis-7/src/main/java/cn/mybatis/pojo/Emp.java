package cn.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Emp implements Serializable {

    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;

}
