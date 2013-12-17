/**   
 * Create with Eclipse IDE
 * @Title: VankePro.java 
 * @Package com.vanke.house.sub.entity 
 */
package com.vanke.house.sub.entity;

import java.io.Serializable;

/**
 * Todo: 项目对应类
 * Date: 2013年12月15日 下午1:26:43
 * User: Binj.pan@gmail.com
 * 
 */
public class VankePro implements Serializable {

	/**
	 * @Fields serialVersionUID TODO
	 */
	private static final long serialVersionUID = 155252031662129000L;
	
	/**
	 * 
	 */
	public VankePro() {	}
	
	private int id;
	
	private String proSerial;				// 项目编号
	
	private String proName;					// 项目名称
	
	private String proGroupId;				// 项目层次

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
	 * @return the proSerial
	 */
	public String getProSerial() {
		return proSerial;
	}

	/**
	 * @param proSerial the proSerial to set
	 */
	public void setProSerial(String proSerial) {
		this.proSerial = proSerial;
	}

	/**
	 * @return the proName
	 */
	public String getProName() {
		return proName;
	}

	/**
	 * @param proName the proName to set
	 */
	public void setProName(String proName) {
		this.proName = proName;
	}

	/**
	 * @return the proGroupId
	 */
	public String getProGroupId() {
		return proGroupId;
	}

	/**
	 * @param proGroupId the proGroupId to set
	 */
	public void setProGroupId(String proGroupId) {
		this.proGroupId = proGroupId;
	}
	
	

}
