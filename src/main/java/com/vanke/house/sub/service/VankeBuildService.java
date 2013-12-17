package com.vanke.house.sub.service;

import com.vanke.house.sub.entity.VankeBuild;
import com.vanke.house.sub.repository.VankeBuildMapper;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
/**
 * Created by Mac on 13-12-17.
 */
@Service
public class VankeBuildService {

    @Resource(name="vankeBuildMapper")
    VankeBuildMapper vankeBuildMapper;

    public int addBuild(VankeBuild vankeBuild){
        return  0;
    }
}
