package com.dj.ss.web.domain.entity;

import lombok.Data;

import javax.management.relation.Role;
import java.beans.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * @author deng jie
 * @date 2022/4/15 10:41
 */
@Data
public class Userinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String username;

    private String password;

}
