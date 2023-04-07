package com.xx.springsecuritydemo.mapper;

import com.xx.springsecuritydemo.domain.LoginRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author xiaoxing
* @description 针对表【t_login_role】的数据库操作Mapper
* @createDate 2023-04-07 14:18:55
* @Entity com.xx.springsecuritydemo.domain.LoginRole
*/
@Mapper
public interface LoginRoleMapper extends BaseMapper<LoginRole> {

}




