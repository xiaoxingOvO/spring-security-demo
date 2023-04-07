package com.xx.springsecuritydemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xx.springsecuritydemo.domain.RolePermission;
import com.xx.springsecuritydemo.service.RolePermissionService;
import com.xx.springsecuritydemo.mapper.RolePermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author xiaoxing
* @description 针对表【t_role_permission】的数据库操作Service实现
* @createDate 2023-04-07 14:19:03
*/
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission>
    implements RolePermissionService{

}




