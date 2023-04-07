package com.xx.springsecuritydemo.controlle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xx
 * @date 2023/4/7
 */
@RestController
public class EmployeeController {

    @RequestMapping("/employee/list")
    public String list(){
        return "employee.list";
    }
    @RequestMapping("/employee/add")
    public String add(){
        return "employee.add";
    }
    @RequestMapping("/employee/update")
    public String update(){
        return "employee.update";
    }
    @RequestMapping("/employee/delete")
    public String delete(){
        return "employee.delete";
    }
}
