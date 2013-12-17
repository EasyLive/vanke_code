/**   
 * Create with Eclipse IDE
 * @Title: VankeMenus.java 
 * @Package com.vanke.house.sub.utils.email 
 */
package com.vanke.house.sub.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Todo: TODO
 * Date: 2013年12月15日 下午1:31:45
 * User: Binj.pan@gmail.com
 * 
 */
public class VankeMenus implements Serializable {

	/**
	 * @Fields serialVersionUID TODO
	 */
	private static final long serialVersionUID = 913608671316071617L;
	
	private int id;
	
	private String menuTitle;						// 菜单标题
	
	private String menuUrl;							// 菜单跳转路径
	
	private int menuDoc;							// 菜单深度，引用id
	
	private boolean isShow;							// 是否可用
	
	private String menuDesc;						// 菜单描述
	
	private List<VankeMenus> childrenMenus;			// 子目录菜单

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
	 * @return the menuTitle
	 */
	public String getMenuTitle() {
		return menuTitle;
	}

	/**
	 * @param menuTitle the menuTitle to set
	 */
	public void setMenuTitle(String menuTitle) {
		this.menuTitle = menuTitle;
	}

	/**
	 * @return the menuUrl
	 */
	public String getMenuUrl() {
		return menuUrl;
	}

	/**
	 * @param menuUrl the menuUrl to set
	 */
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	/**
	 * @return the menuDoc
	 */
	public int getMenuDoc() {
		return menuDoc;
	}

	/**
	 * @param menuDoc the menuDoc to set
	 */
	public void setMenuDoc(int menuDoc) {
		this.menuDoc = menuDoc;
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

	/**
	 * @return the menuDesc
	 */
	public String getMenuDesc() {
		return menuDesc;
	}

	/**
	 * @param menuDesc the menuDesc to set
	 */
	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}

	/**
	 * @return the childrenMenus
	 */
	public List<VankeMenus> getChildrenMenus() {
		return childrenMenus;
	}

	/**
	 * @param childrenMenus the childrenMenus to set
	 */
	public void setChildrenMenus(List<VankeMenus> childrenMenus) {
		this.childrenMenus = childrenMenus;
	}
	
}
