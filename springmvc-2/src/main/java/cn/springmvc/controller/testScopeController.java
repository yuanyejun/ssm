package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 *  通过modelandview向请求域共享数据
 *   使用modelandview时 可以使用其Model功能向请求域共享数据
 *   使用view功能设置逻辑视图 但是控制器方法一定要将modelandview作为方法的返回值
 *
 *   通过model向请求域共享数据
 *
 *   通过modelMap向请求域共享数据
 *
 *   通过map向请求域共享数据
 */
@Controller
public class testScopeController {

    @RequestMapping("/test/mav")
    public ModelAndView testMav(){

        /**
         *  modelandview包含model和view功能
         *  model 向请求域中共享数据
         *  view 设置逻辑实现页面跳转
         */
        ModelAndView modelAndView = new ModelAndView();
        //向请求域中共享数据
        System.out.println(modelAndView.getClass().getName());
        modelAndView.addObject("testRequestScope","hello ModelAndView");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/test/model")
    public String testModel(Model model){
        System.out.println(model.getClass().getName());
        model.addAttribute("testRequestScope","hello model");

        return "success";
    }

    @RequestMapping("/test/modelmap")
    public String testModelmap(ModelMap modelMap){
        System.out.println(modelMap.getClass().getName());
        modelMap.addAttribute("testRequestScope","hello modelmap");

        return "success";
    }

    @RequestMapping("/test/map")
    public String testmap(Map<String,Object> map){
        System.out.println(map.getClass().getName());
        map.put("testRequestScope","hello map");
        return "success";
    }

    /**
     *  Model、ModelMap、Map类型的参数其实本质上都是 BindingAwareModelMap 类型的
     */


    @RequestMapping("/test/session")
    public String testSession(HttpSession httpSession){
        httpSession.setAttribute("testSessionScope","hello,session");
        return "success";
    }

    @RequestMapping("/test/application")
    public String testApplication(HttpSession httpSession){
        ServletContext servletContext = httpSession.getServletContext();
        servletContext.setAttribute("testApplicationScope","hello Application");
        return "success";
    }
}
