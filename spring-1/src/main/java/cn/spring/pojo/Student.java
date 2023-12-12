package cn.spring.pojo;

import cn.spring.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Person {

    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;
    private double score;
    private Clazz clazz;
    private String[] hobby;
    private Map<String,Teacher> teacherMap;

}
