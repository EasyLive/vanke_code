package com.vanke.house.sub.repository;

import com.vanke.house.sub.entity.VankeBuild;
import com.vanke.house.sub.entity.VankeData;

import java.util.List;

/**
 * Created by Mac on 13-12-17.
 */
public interface VankeBuildMapper {

    int addVankeBuild(VankeBuild vankeBuild);

    List<VankeBuild> selectVankeBuildList(VankeBuild vankeBuild);

    VankeBuild getVankeBuild(VankeBuild vankeBuild);

    int updateVankeBuild(VankeBuild vankeBuild);
}
