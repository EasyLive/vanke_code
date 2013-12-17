package com.vanke.house.sub.repository;

import com.vanke.house.sub.entity.VankeUserRoles;

import java.util.List;

/**
 * Created by Mac on 13-12-17.
 */
public interface VankeUserRoleMapper {

    int addUserRole(VankeUserRoles userRoles);

    int addUserRolesBatch(List<VankeUserRoles> userRolesList);
}
