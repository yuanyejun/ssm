package cn.mybatis.pojo;

import lombok.Data;

@Data
public class Emp {

    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
    private Integer deptId;
    private Dept dept;
}
