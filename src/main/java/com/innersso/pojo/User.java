package com.innersso.pojo;

import java.util.List;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 下午10:27 2017/12/21
 * @Description:
 */
public class User {

    private Integer id;
    private String username;
    private String password;

    private List<Role> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
