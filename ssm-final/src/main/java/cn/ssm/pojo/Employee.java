package cn.ssm.pojo;

import lombok.Data;

@Data
public class Employee {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
    private String email;
}
