/**   
 * Create with Eclipse IDE
 * @Title: VankeBuild.java 
 * @Package com.vanke.house.sub.entity 
 */
package com.vanke.house.sub.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * Todo: 楼盘对应类
 * Date: 2013年12月15日 下午1:28:00
 * User: Binj.pan@gmail.com
 * 
 */
public class VankeBuild implements Serializable {

	/**
	 * @Fields serialVersionUID TODO
	 */
	private static final long serialVersionUID = -7654835923684792565L;
	
	/**
	 * 
	 */
	public VankeBuild() {}
	
	private int id;
	
	private int prod_id;						// 项目ID
		
	private String buildName;					// 楼盘名称
	
	private int buildUnitNum;				// 楼盘单元数
	
	private Date buildOpenTime;					// 开盘时间
		
	private int buildSaleNum;					// 已售楼盘数	
	
	private int buildHouseTotal;				// 楼盘房屋总数
	
	private VankePro vankePro;					// 项目对象

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
	 * @return the prod_id
	 */
	public int getProd_id() {
		return prod_id;
	}

	/**
	 * @param prod_id the prod_id to set
	 */
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	/**
	 * @return the buildName
	 */
	public String getBuildName() {
		return buildName;
	}

	/**
	 * @param buildName the buildName to set
	 */
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	/**
	 * @return the buildUnitNum
	 */
	public int getBuildUnitNum() {
		return buildUnitNum;
	}

	/**
	 * @param buildUnitNum the buildUnitNum to set
	 */
	public void setBuildUnitNum(int buildUnitNum) {
		this.buildUnitNum = buildUnitNum;
	}

	/**
	 * @return the buildOpenTime
	 */
	public Date getBuildOpenTime() {
		return buildOpenTime;
	}

	/**
	 * @param buildOpenTime the buildOpenTime to set
	 */
	public void setBuildOpenTime(Date buildOpenTime) {
		this.buildOpenTime = buildOpenTime;
	}

	/**
	 * @return the buildSaleNum
	 */
	public int getBuildSaleNum() {
		return buildSaleNum;
	}

	/**
	 * @param buildSaleNum the buildSaleNum to set
	 */
	public void setBuildSaleNum(int buildSaleNum) {
		this.buildSaleNum = buildSaleNum;
	}

	/**
	 * @return the buildHouseTotal
	 */
	public int getBuildHouseTotal() {
		return buildHouseTotal;
	}

	/**
	 * @param buildHouseTotal the buildHouseTotal to set
	 */
	public void setBuildHouseTotal(int buildHouseTotal) {
		this.buildHouseTotal = buildHouseTotal;
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
