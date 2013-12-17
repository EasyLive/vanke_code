package com.vanke.house.sub.service;

import com.vanke.house.sub.repository.VankeUserRoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Mac on 13-12-17.
 */
@Service
public class VankeUserRoleService {

    @Resource(name = "vankeUserRoleMapper")
    VankeUserRoleMapper vankeUserRoleMapper;

}
