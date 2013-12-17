/**
 * Create with Eclipse IDE
 * @Title: VaneUserDao.java
 * @Package com.vanke.house.sub.service
 */
package com.vanke.house.sub.repository;

import com.vanke.house.sub.entity.VankeGroup;

/**
 * Todo: TODO
 * Date: 2013年12月15日 下午2:52:46
 * User: Binj.pan@gmail.com
 *
 */
public interface VankeGroupMapper {

    void insertVankeGroup(VankeGroup vankeGroup);

    VankeGroup selectVankeGroupById(Integer groupId);

}
