/**   
 * Create with Eclipse IDE
 * @Title: VankeHouse.java 
 * @Package com.vanke.house.sub.entity 
 */
package com.vanke.house.sub.entity;

import java.io.Serializable;

/**
 * Todo: 房屋对应类
 * Date: 2013年12月15日 下午1:28:20
 * User: Binj.pan@gmail.com
 * 
 */
public class VankeHouse implements Serializable {

	/**
	 * @Fields serialVersionUID TODO
	 */
	private static final long serialVersionUID = -3299869630484715095L;
	/**
	 * 
	 */
	public VankeHouse() {}
	
	private int id;
	
	private String houseNum;			// 房屋号
	
	private String houseArea;			// 房屋面积
	
	private double housePrice;			// 房屋价格
	
	private double houseDiscount;		// 房屋折扣
	
	private int houseState;				// 房屋状态
	
	private VankePro vankePro;
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
	 * @return the houseNum
	 */
	public String getHouseNum() {
		return houseNum;
	}

	/**
	 * @param houseNum the houseNum to set
	 */
	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	/**
	 * @return the houseArea
	 */
	public String getHouseArea() {
		return houseArea;
	}

	/**
	 * @param houseArea the houseArea to set
	 */
	public void setHouseArea(String houseArea) {
		this.houseArea = houseArea;
	}

	/**
	 * @return the housePrice
	 */
	public double getHousePrice() {
		return housePrice;
	}

	/**
	 * @param housePrice the housePrice to set
	 */
	public void setHousePrice(double housePrice) {
		this.housePrice = housePrice;
	}

	/**
	 * @return the houseDiscount
	 */
	public double getHouseDiscount() {
		return houseDiscount;
	}

	/**
	 * @param houseDiscount the houseDiscount to set
	 */
	public void setHouseDiscount(double houseDiscount) {
		this.houseDiscount = houseDiscount;
	}

	/**
	 * @return the houseState
	 */
	public int getHouseState() {
		return houseState;
	}

	/**
	 * @param houseState the houseState to set
	 */
	public void setHouseState(int houseState) {
		this.houseState = houseState;
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
	
	

}
