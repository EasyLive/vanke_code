package com.vanke.house.sub.service;

import com.vanke.house.sub.entity.VankeData;
import com.vanke.house.sub.repository.VankeDataMapper;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * Created by Mac on 13-12-17.
 */
@Service
public class VankeDataService {

    @Resource(name = "vankeDataMapper")
    VankeDataMapper vankeDataMapper;

    public int addVankeData(VankeData vankeData){
        return vankeDataMapper.addVankeData(vankeData);
    }
}
