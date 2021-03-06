package com.mhuiq.spring.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mhuiq.spring.model.User;
import com.mhuiq.spring.service.UserService;
import com.mhuiq.spring.util.MyUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=("classpath:ApplicationContext.xml"))
public class TestUserService {
	
	@Autowired	
	UserService userService;
	
	//@Test
	public void testSaveUser() {
		User user = new User();
		//user.setUserID(1L);
		user.setUsername("Wong");
		user.setFullname("test");
		user.setPassword(MyUtil.MD5encoding("123456789"));
		userService.saveUser(user);
		System.out.println("执行完成");
	}
	
	@Test
	public void testFindUser() {
		User user = userService.findByUsername("Wong");
		System.out.println(user.getUserID());
	}
	
}
