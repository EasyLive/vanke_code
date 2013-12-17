package com.vanke.house.sub.service;

import com.vanke.house.sub.entity.VankeUser;
import com.vanke.house.sub.repository.VankeUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Mac on 13-12-17.
 */
@Service
public class VankeUserSerivce {

    @Resource(name = "vankeUserMapper")
    VankeUserMapper vankeUserMapper;

    /**
     * 用户登录
     * @param vankeUser
     * @return
     */
    public VankeUser userLogin(VankeUser vankeUser){
       return  vankeUserMapper.userLogin(vankeUser);
    }

    /**
     * 增加信息用户
     * @param vankeUser
     * @return
     */
    public int addNewUser(VankeUser vankeUser){
        return vankeUserMapper.insertUser(vankeUser);
    }

    /**
     * 获取用户列表
     * @param vankeUser
     * @return
     */
    public List<VankeUser> selectUserList(VankeUser vankeUser){
        return vankeUserMapper.selectUserList(vankeUser);
    }



}
