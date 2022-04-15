package com.dj.ss.web.domain.entity;

import lombok.Data;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * @author deng jie
 * @date 2022/4/15 16:50
 */
@Data
public class SysRole implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long roleId;

    private String roleName;

    private String roleKey;

    private String roleSort;

    private String dataScope;

    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 用户是否存在此角色标识 默认不存在 */
    @Transient
    private boolean flag = false;

    /** 菜单组 */
    @Transient
    private Long[] menuIds;

    /** 部门组（数据权限） */
    @Transient
    private Long[] deptIds;
}
