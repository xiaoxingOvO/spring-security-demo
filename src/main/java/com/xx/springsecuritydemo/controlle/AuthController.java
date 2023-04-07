package com.xx.springsecuritydemo.controlle;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xx
 * @date 2023/4/7
 */
@RestController
public class AuthController {

    @PostMapping("/loginSuccess")
    public String loginSuccess(){
        return "登录成功";
    }


}
