package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *  查询操作 getUserById?id=1 user/1-->get请求方式
 *  保存操作 saveUser user-->post请求方式
 *  删除操作 deleteUser?id=1 user/1-->delete请求方式
 *  更新操作 updateUser user-->put请求方式
 */
@Controller
public class testRestController {

    //@RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAllUser(){
        System.out.println("查询所有的用户信息.....");
        return "success";
    }


//    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("根据id查询用户的全部信息");
        return "success";
    }

//    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public String insertUser(){
        System.out.println("添加用户信息...");
        return "success";
    }

//    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @PutMapping("/user")
    public String updateUser(){
        System.out.println("修改用户信息...");
        return "success";
    }

//    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println("删除用户信息...." + id);
        return "success";
    }

}
