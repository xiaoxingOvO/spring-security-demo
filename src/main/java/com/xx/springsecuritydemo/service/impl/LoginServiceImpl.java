package com.xx.springsecuritydemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xx.springsecuritydemo.domain.Login;
import com.xx.springsecuritydemo.service.LoginService;
import com.xx.springsecuritydemo.mapper.LoginMapper;
import org.springframework.stereotype.Service;

/**
* @author xiaoxing
* @description 针对表【t_login】的数据库操作Service实现
* @createDate 2023-04-07 14:18:48
*/
@Service
public class LoginServiceImpl extends ServiceImpl<LoginMapper, Login>
    implements LoginService{

}




