package com.xx.springsecuritydemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xx.springsecuritydemo.domain.Permission;
import com.xx.springsecuritydemo.service.PermissionService;
import com.xx.springsecuritydemo.mapper.PermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author xiaoxing
* @description 针对表【t_permission】的数据库操作Service实现
* @createDate 2023-04-07 14:18:58
*/
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission>
    implements PermissionService{

}




