package com.mhuiq.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mhuiq.spring.DAO.UserDAO;
import com.mhuiq.spring.model.User;
import com.mhuiq.spring.service.UserService;
import com.mhuiq.spring.util.MyUtil;

@Controller
public class HomeController {
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping({"/","/home"})
	public String shwoHomePage(Map<String,Object> model) {
		User user = new User();
		//user.setUserID(1l);
		user.setUsername("test");
		user.setFullname("test,full");
		user.setPassword(MyUtil.MD5encoding("123456789"));
		user.setAddress("深圳");
		user.setMobile("1244");
		user.setSex("m");
		user.setUserRole(0);
		userDAO.saveUser(user);
		model.put("user", user);
		return "home";
	}
	
	@RequestMapping("/main/common")
	public String getCommonPage() {
		return "commonpage";
	}
	
	@RequestMapping("/main/admin")
	public String getAdminPage() {
		return "adminpage";
	}
}
