package com.dj.ss.web.mapper;

import com.dj.ss.web.domain.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author deng jie
 * @date 2022/4/15 10:33
 */
@Mapper
public interface UserMapper {

    Userinfo getOneByUsername(@Param("username") String username);
}
