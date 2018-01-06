package com.innersso.dao;

import com.innersso.pojo.Permission;
import java.util.List;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 下午1:07 2017/12/22
 * @Description:
 */
public interface PermissionDao {

    /**
     * 查询所有权限
     * @return
     */
    public List<Permission> findAll();


    /**
     * 根据用户ID查询权限
     *
     * @param userId
     * @return
     */
    public List<Permission> findByAdminUserId(int userId);
}
