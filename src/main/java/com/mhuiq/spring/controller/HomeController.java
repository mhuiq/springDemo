package com.mhuiq.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mhuiq.spring.model.User;
import com.mhuiq.spring.service.UserService;

@Controller
public class HomeController {
	@Autowired
	UserService userService;
	
	@RequestMapping({"/","/home"})
	public String shwoHomePage(Map<String,Object> model) {
		User user = new User();
		//user.setUserID(1l);
		user.setUsername("test");
		user.setFullname("test,full");
		user.setPassword("13");
		userService.saveUser(user);
		model.put("user", user);
		return "home";
	}
}
