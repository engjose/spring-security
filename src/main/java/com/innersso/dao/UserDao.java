package com.innersso.dao;

import com.innersso.pojo.User;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 下午10:30 2017/12/21
 * @Description:
 */
public interface UserDao {

    /**
     * 根据用户名查询User
     *
     * @param username
     * @return
     */
    public User findByUserName(String username);
}
