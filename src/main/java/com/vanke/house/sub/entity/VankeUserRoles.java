/**   
 * Create with Eclipse IDE
 * @Title: VankeUserRoles.java 
 * @Package com.vanke.house.sub.entity 
 */
package com.vanke.house.sub.entity;

import java.io.Serializable;

/**
 * Todo: TODO
 * Date: 2013年12月15日 下午1:32:22
 * User: Binj.pan@gmail.com
 * 
 */
public class VankeUserRoles implements Serializable {

	/**
	 * @Fields serialVersionUID TODO
	 */
	private static final long serialVersionUID = -9089074670258045456L;
	
	
	private int id;
	
	private String userId;								// 用户编号
	
	private String roleString;							// 用户权限

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the roleString
	 */
	public String getRoleString() {
		return roleString;
	}

	/**
	 * @param roleString the roleString to set
	 */
	public void setRoleString(String roleString) {
		this.roleString = roleString;
	}
	
	

}
