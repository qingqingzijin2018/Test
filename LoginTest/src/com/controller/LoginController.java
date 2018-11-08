package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Userss;
import com.service.UsersService;

/**
 * 登录控制器
 * 
 * @author fengcong
 *
 */
@Controller
public class LoginController extends GenericController {

	@Resource(name = "usersService")
	private UsersService usersService;

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping("LoginController_login.do")
	public ModelAndView login(Userss obj) {
		Userss users = this.usersService.loginValidate(obj.getUsername());
		if (users != null) {
			if (users.getPassword().equals(obj.getPassword())) {
				
				return new ModelAndView("index");
			} else {
				return new ModelAndView("login", "error", "密码错误");
			}
		} else {
			return new ModelAndView("login", "error", "该用户不存在");
		}
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/LoginController_goLogin")
	public ModelAndView goLogin() {
		return new ModelAndView("login");
	}
}
