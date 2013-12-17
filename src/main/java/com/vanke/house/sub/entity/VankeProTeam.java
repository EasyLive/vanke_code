/**   
 * Create with Eclipse IDE
 * @Title: VankeProTeam.java 
 * @Package com.vanke.house.sub.entity 
 */
package com.vanke.house.sub.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Todo: 项目成员对应类
 * Date: 2013年12月15日 下午1:27:25
 * User: Binj.pan@gmail.com
 * 
 */
public class VankeProTeam implements Serializable {

	/**
	 * @Fields serialVersionUID TODO
	 */
	private static final long serialVersionUID = 814153112640729274L;
	
	private int id;
	
	private int proId;						// 项目ID
	
	private int userId;							// 用户ID
	
	private VankePro vankePro;					// 项目信息
	
	private List<VankeUser> vankeUsers;			// 项目团队成员

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
	 * @return the proId
	 */
	public int getProId() {
		return proId;
	}

	/**
	 * @param proId the proId to set
	 */
	public void setProId(int proId) {
		this.proId = proId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the vankePro
	 */
	public VankePro getVankePro() {
		return vankePro;
	}

	/**
	 * @param vankePro the vankePro to set
	 */
	public void setVankePro(VankePro vankePro) {
		this.vankePro = vankePro;
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
