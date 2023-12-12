package cn.spring.pojo;

import cn.spring.Person;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Teacher implements Person {

    private Integer tId;
    private String tname;
}
