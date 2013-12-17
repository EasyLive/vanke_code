/**   
 * Create with Eclipse IDE
 * @Title: AdminController.java 
 * @Package com.vanke.system.oa.controller 
 */
package com.vanke.house.sub.web;


import org.apache.shiro.authz.annotation.RequiresRoles;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Todo: TODO
 * Date: 2013年12月2日 下午9:12:59
 * User: Binj.pan@gmail.com
 * 
 */
@Controller
public class AdminController {
	
	org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value="/admin/index", method = RequestMethod.GET)
	public String index(Model model){
		return "admin/index";
	}
	
	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public String login(Model model){
		logger.info("login get");
		return "admin/login";
	}
	
	@RequestMapping(value = "/admin/login", method = RequestMethod.POST)
	public String doLogin(Model model){
		logger.info("login post");
		return "admin/login";
	}
	
	@RequiresRoles(value="user")
	@RequestMapping(value = "/admin/user", method = RequestMethod.GET)
	public String user(Model model){
		return "admin/user";
	}
	
	@RequiresRoles(value="admin")
	@RequestMapping(value = "/admin/admin", method = RequestMethod.GET)
	public String admin(Model model){
		return "admin/index";
	}
}
