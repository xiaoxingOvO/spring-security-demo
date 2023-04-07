package com.xx.springsecuritydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xx
 * @date 2023/4/7
 */
@Configuration
public class MyLogoutHandler implements LogoutSuccessHandler {

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        try {
            //登出成功，响应结果给客户端，通常是一个JSON数据
            response.getWriter().println("logout success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
