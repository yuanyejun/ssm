package cn.springmvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 通过注解使用异常处理
 */
@ControllerAdvice //将当前类标识为异常处理组件
public class ExceptionController {
    //@ExceptionHandler用于设置所标识方法处理的异常
    @ExceptionHandler(ArithmeticException.class)
    public String handleException(Throwable ex,Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
