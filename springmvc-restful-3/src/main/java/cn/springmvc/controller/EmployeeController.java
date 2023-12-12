package cn.springmvc.controller;

import cn.springmvc.dao.EmployeeDao;
import cn.springmvc.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * 查询所有的员工信息 > /employee -> get
 * 跳转到添加页面 > /to/add -> get
 * 新增员工信息 > /employee -> post
 * 跳转修改页面 > /employee/1 -> get
 * 删除员工信息 > /employee/1 -> delete
 * 修改员工信息 > /employee -> put
 */

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    //查询所有的员工信息
    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        Collection<Employee> allEmployee = employeeDao.getAll();
        //将所有的请求域中共享
        model.addAttribute("allEmployee",allEmployee);
//        跳转到列表页面
        return "employee_list";
    }


    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
        employeeDao.save(employee);
        //重定向到列表功能
        return "redirect:/employee";
    }

    //将员工信息共享到请求域中
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee",employee);

        return "employee_update";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);

        return "redirect:/employee";
    }
    /**
     * 删除功能未做
     */
}
