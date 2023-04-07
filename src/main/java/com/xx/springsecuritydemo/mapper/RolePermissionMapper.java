package com.xx.springsecuritydemo.mapper;

import com.xx.springsecuritydemo.domain.RolePermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author xiaoxing
* @description 针对表【t_role_permission】的数据库操作Mapper
* @createDate 2023-04-07 14:19:03
* @Entity com.xx.springsecuritydemo.domain.RolePermission
*/
@Mapper
public interface RolePermissionMapper extends BaseMapper<RolePermission> {

}




