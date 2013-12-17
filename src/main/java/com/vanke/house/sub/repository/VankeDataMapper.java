/**
 * Create with Eclipse IDE
 * @Title: VankeDataMapper.java
 * @Package com.vanke.house.sub.service
 */
package com.vanke.house.sub.repository;

import com.vanke.house.sub.entity.VankeData;

import java.util.List;

/**
 * Todo: TODO
 * Date: 2013年12月15日 下午3:20:08
 * User: Binj.pan@gmail.com
 *
 */
public interface VankeDataMapper {

    int addVankeData(VankeData vankeData);

    List<VankeData> selectData(VankeData vankeData);

    int updateData(VankeData vankeData);

    int updateDataBatch(List<VankeData> vankeDataList);

    VankeData getData(VankeData vankeData);
}
