package com.xx.springsecuritydemo.controlle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xx
 * @date 2023/4/7
 */
@RestController
public class DeptController {

    @RequestMapping("/dept/list")
    public String list(){
        return "dept.list";
    }

    @RequestMapping("/dept/add")
    public String add(){
        return "dept.add";
    }

    @RequestMapping("/dept/update")
    public String update(){
        return "dept.update";
    }

    @RequestMapping("/dept/delete")
    public String delete(){
        return "dept.delete";
    }

}
