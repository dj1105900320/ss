package com.dj.ss.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author deng jie
 * @date 2022/4/15 17:09
 */
@RestController
public class LoginController {

    @Autowired
    private SysLoginService loginService;

    /**
     * 登录方法
     *
     * @param username 用户名
     * @param password 密码
     * @param code 验证码
     * @param uuid 唯一标识
     * @return 结果
     */
    @PostMapping("/login")
    public AjaxResult login
}
