package com.innersso.Service;

import org.springframework.security.core.GrantedAuthority;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 下午10:32 2017/12/25
 * @Description:
 */
public class MyGrantedAuthority implements GrantedAuthority {

    private String url;

    private String method;

    public String getPermissionUrl() {
        return url;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.url = permissionUrl;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public MyGrantedAuthority(String url, String method) {
        this.url = url;
        this.method = method;
    }

    @Override
    public String getAuthority() {
        return this.url + ";" + this.method;
    }
}
