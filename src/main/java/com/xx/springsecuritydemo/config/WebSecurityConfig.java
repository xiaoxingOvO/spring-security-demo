package com.xx.springsecuritydemo.config;

import com.xx.springsecuritydemo.domain.Permission;
import com.xx.springsecuritydemo.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.List;

/**
 * @author xx
 * @date 2023/4/7
 */
@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private PermissionMapper permissionMapper;

    //授权规则配置
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        List<Permission> permissions = permissionMapper.selectList(null);
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry
                expressionInterceptUrlRegistry = http.csrf().disable()   //关闭CSRF跨站点请求伪造防护
                .authorizeRequests()          //对请求做授权处理
                .antMatchers("/login").permitAll()  //登录路径放行
                .antMatchers("/login.html").permitAll();//对登录页面跳转路径放行

        //动态添加授权:从数据库动态查询出，哪些资源需要什么样的权限
        for(Permission permission : permissions){
            System.out.println(permission.getResource()+" - "+permission.getSn());
            //如： /employee/list    需要     employee:list 权限才能访问
            expressionInterceptUrlRegistry.antMatchers(permission.getResource()).hasAuthority(permission.getSn());
        }

        expressionInterceptUrlRegistry
                .anyRequest().authenticated() //其他路径都要拦截
                .and().formLogin()  //允许表单登录， 设置登陆页
                .successForwardUrl("/loginSuccess") // 设置登陆成功页
                .loginPage("/login.html")   //登录页面跳转地址
                .loginProcessingUrl("/login")   //登录处理地址
                .and().logout().permitAll();    //登出

    }


    @Bean
    public PasswordEncoder passwordEncoder(){
        //return NoOpPasswordEncoder.getInstance();
        return new BCryptPasswordEncoder();
    }

}
