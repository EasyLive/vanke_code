/**   
 * Create with Eclipse IDE
 * @Title: VankeHouseSu.java 
 * @Package com.vanke.house.sub.entity 
 */
package com.vanke.house.sub.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * Todo: 认购对应类
 * Date: 2013年12月15日 下午1:28:33
 * User: Binj.pan@gmail.com
 * 
 */
public class VankeHouseSub implements Serializable {

	/**
	 * @Fields serialVersionUID TODO
	 */
	private static final long serialVersionUID = 8598116459300128546L;

	private int id;
	
	private String cusName;						// 客户姓名
		
	private String subInfo;						// 认购信息
	
	private String cusPhone;					// 客户电话
	
	private String cusCardNum;					// 客户证件号
	
	private int cusPayment;						// 客户付款类型
	
	private String cusArea;						// 客户隶属区域
	
	private int cusHouseNum;					// 客户名下房屋套数
	
	private Date cusSubTime;					// 认购时间
	
	private String subUser;						// 签约负责人
	
	private int subState;						// 认购状态

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
	 * @return the cusName
	 */
	public String getCusName() {
		return cusName;
	}

	/**
	 * @param cusName the cusName to set
	 */
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	/**
	 * @return the subInfo
	 */
	public String getSubInfo() {
		return subInfo;
	}

	/**
	 * @param subInfo the subInfo to set
	 */
	public void setSubInfo(String subInfo) {
		this.subInfo = subInfo;
	}

	/**
	 * @return the cusPhone
	 */
	public String getCusPhone() {
		return cusPhone;
	}

	/**
	 * @param cusPhone the cusPhone to set
	 */
	public void setCusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}

	/**
	 * @return the cusCardNum
	 */
	public String getCusCardNum() {
		return cusCardNum;
	}

	/**
	 * @param cusCardNum the cusCardNum to set
	 */
	public void setCusCardNum(String cusCardNum) {
		this.cusCardNum = cusCardNum;
	}

	/**
	 * @return the cusPayment
	 */
	public int getCusPayment() {
		return cusPayment;
	}

	/**
	 * @param cusPayment the cusPayment to set
	 */
	public void setCusPayment(int cusPayment) {
		this.cusPayment = cusPayment;
	}

	/**
	 * @return the cusArea
	 */
	public String getCusArea() {
		return cusArea;
	}

	/**
	 * @param cusArea the cusArea to set
	 */
	public void setCusArea(String cusArea) {
		this.cusArea = cusArea;
	}

	/**
	 * @return the cusHouseNum
	 */
	public int getCusHouseNum() {
		return cusHouseNum;
	}

	/**
	 * @param cusHouseNum the cusHouseNum to set
	 */
	public void setCusHouseNum(int cusHouseNum) {
		this.cusHouseNum = cusHouseNum;
	}

	/**
	 * @return the cusSubTime
	 */
	public Date getCusSubTime() {
		return cusSubTime;
	}

	/**
	 * @param cusSubTime the cusSubTime to set
	 */
	public void setCusSubTime(Date cusSubTime) {
		this.cusSubTime = cusSubTime;
	}

	/**
	 * @return the subUser
	 */
	public String getSubUser() {
		return subUser;
	}

	/**
	 * @param subUser the subUser to set
	 */
	public void setSubUser(String subUser) {
		this.subUser = subUser;
	}

	/**
	 * @return the subState
	 */
	public int getSubState() {
		return subState;
	}

	/**
	 * @param subState the subState to set
	 */
	public void setSubState(int subState) {
		this.subState = subState;
	}
	
	
	
}
