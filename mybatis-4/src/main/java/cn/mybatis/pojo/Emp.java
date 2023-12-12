package cn.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Emp {

    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;

}
