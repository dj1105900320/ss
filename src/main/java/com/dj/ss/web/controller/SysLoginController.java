package com.dj.ss.web.controller;

import com.dj.ss.web.domain.entity.AjaxResult;
import com.dj.ss.web.domain.entity.Constants;
import com.dj.ss.web.service.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author deng jie
 * @date 2022/4/15 17:09
 */
@RestController
public class SysLoginController {

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
    public AjaxResult login(String username, String password, String code, String uuid) {
        AjaxResult ajax = AjaxResult.success();

        // 生成令牌
        String token = loginService.login(username, password, code, uuid);
        ajax.put(Constants.TOKEN, token);
        return ajax;
    }
}
