package com.xx.springsecuritydemo.mapper;

import com.xx.springsecuritydemo.domain.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author xiaoxing
* @description 针对表【t_permission】的数据库操作Mapper
* @createDate 2023-04-07 14:18:58
* @Entity com.xx.springsecuritydemo.domain.Permission
*/
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {

    List<Permission> selectPermissionsByUserId(Long userId);

    List<Permission> selectAll();

}




