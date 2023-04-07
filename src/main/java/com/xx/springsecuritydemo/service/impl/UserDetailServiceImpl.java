package com.xx.springsecuritydemo.service.impl;

import com.xx.springsecuritydemo.domain.Login;
import com.xx.springsecuritydemo.domain.Permission;
import com.xx.springsecuritydemo.mapper.LoginMapper;
import com.xx.springsecuritydemo.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xx
 * @date 2023/4/7
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Login loginFromMysql = loginMapper.selectByUsername(username);
        if(loginFromMysql == null){
            throw new UsernameNotFoundException("无效的用户名");
        }

        //前台用户
        List<GrantedAuthority> permissions = new ArrayList<>();
        List<Permission> permissionSnList =
                permissionMapper.selectPermissionsByUserId(loginFromMysql.getId());
        permissionSnList.forEach(permission->{
            System.out.println("用户:"+username+" ：加载权限 :"+permission.getSn());
            permissions.add(new SimpleGrantedAuthority(permission.getSn()));
        });

        return new User(username,loginFromMysql.getPassword(),permissions);
    }
}
