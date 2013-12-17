/**   
 * Create with Eclipse IDE
 * @Title: VankeGroup.java 
 * @Package com.vanke.house.sub.entity 
 */
package com.vanke.house.sub.entity;

import java.util.List;
import java.io.Serializable;

/**
 * Todo: 组对应实体类
 * Date: 2013年12月15日 下午2:03:15
 * User: Binj.pan@gmail.com
 * 
 */
public class VankeGroup implements Serializable{

	/**
	 * @Fields serialVersionUID TODO
	 */
	private static final long serialVersionUID = 5045212288544983848L;
	
	private int id;
	
	private String groupName;					// 组名称
	
	private String groupDesc;					// 组描述
	
	private int groupState;						// 组状态
	
	private List<VankeUser> vankeUsers;

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
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	

	/**
	 * @return the groupDesc
	 */
	public String getGroupDesc() {
		return groupDesc;
	}

	/**
	 * @param groupDesc the groupDesc to set
	 */
	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}

	/**
	 * @return the groupState
	 */
	public int getGroupState() {
		return groupState;
	}

	/**
	 * @param groupState the groupState to set
	 */
	public void setGroupState(int groupState) {
		this.groupState = groupState;
	}

	/**
	 * @return the vankeUsers
	 */
	public List<VankeUser> getVankeUsers() {
		return vankeUsers;
	}

	/**
	 * @param vankeUsers the vankeUsers to set
	 */
	public void setVankeUsers(List<VankeUser> vankeUsers) {
		this.vankeUsers = vankeUsers;
	}
	
	

}
