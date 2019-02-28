package com.bit.management.manual_management.entity;

import javax.persistence.*;

public class User {
    /**
     * id
     */
    private Short id;

    /**
     * 用户名
     */
    @Column(name = "userName")
    private String username;

    /**
     * 用户密码
     */
    @Column(name = "userPwd")
    private String userpwd;

    /**
     * 权限0:普通，1:管理员
     */
    @Column(name = "roleId")
    private int roleid;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Short getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return userName - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户密码
     *
     * @return userPwd - 用户密码
     */
    public String getUserpwd() {
        return userpwd;
    }

    /**
     * 设置用户密码
     *
     * @param userpwd 用户密码
     */
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    /**
     * 获取权限0:普通，1:管理员
     *
     * @return roleId - 权限0:普通，1:管理员
     */
    public int getRoleid() {
        return roleid;
    }

    /**
     * 设置权限0:普通，1:管理员
     *
     * @param roleid 权限0:普通，1:管理员
     */
    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }
}