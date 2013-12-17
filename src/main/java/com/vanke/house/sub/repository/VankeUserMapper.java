/**   
 * Create with Eclipse IDE
 * @Title: VankeUserMapper.java 
 * @Package com.vanke.house.sub.service 
 */
package com.vanke.house.sub.repository;

import java.util.List;

import com.vanke.house.sub.entity.VankeUser;

/**
 * Todo: TODO
 * Date: 2013年12月15日 下午3:18:17
 * User: Binj.pan@gmail.com
 * 
 */
public interface VankeUserMapper {
	
	VankeUser userLogin(VankeUser vankeUser);
	
	int insertUser(VankeUser vankeUser);
	
	List<VankeUser> selectUserList(VankeUser vankeUser);

}
