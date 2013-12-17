/**   
 * Create with Eclipse IDE
 * @Title: VankeUser.java 
 * @Package com.vanke.house.sub.entity 
 */
package com.vanke.house.sub.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Todo: TODO
 * Date: 2013年12月15日 下午2:01:29
 * User: Binj.pan@gmail.com
 * 
 */
public class VankeUser implements Serializable {
	
	/**
	 * @Fields serialVersionUID TODO
	 */
	private static final long serialVersionUID = -5699701877505643826L;

	private int id;
	
	private String userName;						// 用户名
	
	private String password;						// 登录密码
	
	private String userEmail;						// 邮箱
		
	private String userPhone;						// 电话
	
	private int groupId;							// 组ID
	
	private int userState;							// 用户状态
	
	private String userType;						// 用户类型
	
	private VankeGroup vankeGroup;					// 用户组信息
	
	private List<VankeMenus> vankeMenus;			// 用户菜单

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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		
		this.password = password;
	}
	
	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userPhone
	 */
	public String getUserPhone() {
		return userPhone;
	}

	/**
	 * @param userPhone the userPhone to set
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	/**
	 * @return the groupId
	 */
	public int getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the userState
	 */
	public int getUserState() {
		return userState;
	}

	/**
	 * @param userState the userState to set
	 */
	public void setUserState(int userState) {
		this.userState = userState;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the vankeGroup
	 */
	public VankeGroup getVankeGroup() {
		return vankeGroup;
	}

	/**
	 * @param vankeGroup the vankeGroup to set
	 */
	public void setVankeGroup(VankeGroup vankeGroup) {
		this.vankeGroup = vankeGroup;
	}
	
	

}
