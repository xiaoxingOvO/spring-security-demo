package com.xx.springsecuritydemo.mapper;

import com.xx.springsecuritydemo.domain.Login;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author xiaoxing
* @description 针对表【t_login】的数据库操作Mapper
* @createDate 2023-04-07 14:18:48
* @Entity com.xx.springsecuritydemo.domain.Login
*/
@Mapper
public interface LoginMapper extends BaseMapper<Login> {

    Login selectByUsername(String username);

}




