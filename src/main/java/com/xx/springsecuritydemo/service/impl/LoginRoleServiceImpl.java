package com.xx.springsecuritydemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xx.springsecuritydemo.domain.LoginRole;
import com.xx.springsecuritydemo.service.LoginRoleService;
import com.xx.springsecuritydemo.mapper.LoginRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author xiaoxing
* @description 针对表【t_login_role】的数据库操作Service实现
* @createDate 2023-04-07 14:18:55
*/
@Service
public class LoginRoleServiceImpl extends ServiceImpl<LoginRoleMapper, LoginRole>
    implements LoginRoleService{

}




