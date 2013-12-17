/**   
 * Create with Eclipse IDE
 * @Title: MenuController.java 
 * @Package com.vanke.system.oa.controller 
 */
package com.vanke.house.sub.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Todo: TODO Date: 2013年11月23日 下午11:22:00 User: Binj.pan@gmail.com
 * 
 */
@Controller
public class MenuController {

	@RequestMapping("/sitemesh/{page}")
	public String page(@PathVariable("page") String page) {
		return "admin/" + page;
	}
	

}
