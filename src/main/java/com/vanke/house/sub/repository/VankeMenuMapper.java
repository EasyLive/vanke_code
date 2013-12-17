/**   
 * Create with Eclipse IDE
 * @Title: VankeMenuMapper.java 
 * @Package com.vanke.house.sub.service 
 */
package com.vanke.house.sub.repository;

import java.util.List;

import com.vanke.house.sub.entity.VankeMenus;

/**
 * Todo: TODO
 * Date: 2013年12月15日 下午3:27:10
 * User: Binj.pan@gmail.com
 * 
 */
public interface VankeMenuMapper {
	
	
	List<VankeMenus> selectUserMenus(Integer userId);
	
	void insertMenus(VankeMenus vankeMenus);
	
	List<VankeMenus> selectMenus(VankeMenus vankeMenus);
	
	int updateMenus(VankeMenus vankeMenus);
	
	int updateMenusBatch(List<VankeMenus> vakMenus);

}
