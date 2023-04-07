package com.xx.springsecuritydemo.mapper;

import com.xx.springsecuritydemo.domain.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author xiaoxing
* @description 针对表【t_role】的数据库操作Mapper
* @createDate 2023-04-07 14:19:00
* @Entity com.xx.springsecuritydemo.domain.Role
*/
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}




