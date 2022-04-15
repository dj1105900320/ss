package com.dj.ss.web.service;

import com.dj.ss.web.domain.entity.Userinfo;
import com.dj.ss.web.mapper.UserMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author deng jie
 * @date 2022/4/15 10:45
 */
@Service
public class UserService implements UserDetailsService {

    @Resource
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Userinfo userinfo = this.userMapper.getOneByUsername(username);
//        return User.withUsername(userinfo.getUsername()).password(userinfo.getPassword());
        return null;
    }
}
