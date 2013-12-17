/**   
 * Create with Eclipse IDE
 * @Title: VankeSubData.java 
 * @Package com.vanke.house.sub.entity 
 */
package com.vanke.house.sub.entity;

import java.io.Serializable;

/**
 * Todo: 资料对应类
 * Date: 2013年12月15日 下午1:29:07
 * User: Binj.pan@gmail.com
 * 
 */
public class VankeData implements Serializable {

	/**
	 * @Fields serialVersionUID TODO
	 */
	private static final long serialVersionUID = -3334033498895390050L;
	
	private int id ;
	
	private String dataTypeName;					// 资料类型名称
	
	private Integer dataTypeId;							// 资料隶属ID
	
	private String dataTitle;						// 资料名称	
	
	private boolean isShow;							// 是否显示

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
	 * @return the dataTypeName
	 */
	public String getDataTypeName() {
		return dataTypeName;
	}

	/**
	 * @param dataTypeName the dataTypeName to set
	 */
	public void setDataTypeName(String dataTypeName) {
		this.dataTypeName = dataTypeName;
	}

	/**
	 * @return the dataTypeId
	 */
	public Integer getDataTypeId() {
		return dataTypeId;
	}

	/**
	 * @param dataTypeId the dataTypeId to set
	 */
	public void setDataTypeId(Integer dataTypeId) {
		this.dataTypeId = dataTypeId;
	}

	/**
	 * @return the dataTitle
	 */
	public String getDataTitle() {
		return dataTitle;
	}

	/**
	 * @param dataTitle the dataTitle to set
	 */
	public void setDataTitle(String dataTitle) {
		this.dataTitle = dataTitle;
	}

	/**
	 * @return the isShow
	 */
	public boolean isShow() {
		return isShow;
	}

	/**
	 * @param isShow the isShow to set
	 */
	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}
	
	

}
