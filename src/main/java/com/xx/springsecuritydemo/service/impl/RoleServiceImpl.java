package com.xx.springsecuritydemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xx.springsecuritydemo.domain.Role;
import com.xx.springsecuritydemo.service.RoleService;
import com.xx.springsecuritydemo.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author xiaoxing
* @description 针对表【t_role】的数据库操作Service实现
* @createDate 2023-04-07 14:19:00
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




