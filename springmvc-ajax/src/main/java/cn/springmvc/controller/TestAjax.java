package cn.springmvc.controller;

import cn.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestAjax {

    @PostMapping("/test/RequestBody")
    @ResponseBody
    public String testRequestBody( User user){
        System.out.println("requestBody:" + user);
        return "success";
    }
}
