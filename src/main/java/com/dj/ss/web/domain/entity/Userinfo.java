package com.dj.ss.web.domain.entity;

import lombok.Data;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author deng jie
 * @date 2022/4/15 10:41
 */
@Data
public class Userinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private Long deptId;

    private String userName;

    private String nickName;

    private String email;

    private String phonenumber;

    private String sex;

    /** 用户头像 */
    private String avatar;

    /** 密码 */
    private String password;

    /** 盐加密 */
    private String salt;

    private String status;

    private String delFlag;

    private String loginIp;

    private Date loginDate;


//    @Transient
//    private SysDept dept;

    /** 角色对象 */
    @Transient
    private List<SysRole> roles;

    /** 角色组 */
    @Transient
    private Long[] roleIds;

    /** 岗位组 */
    @Transient
    private Long[] postIds;
}
