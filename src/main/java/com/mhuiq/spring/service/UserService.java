package com.mhuiq.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mhuiq.spring.DAO.UserDAO;
import com.mhuiq.spring.model.User;

@Service
@Transactional
public class UserService {

	@Autowired
	UserDAO userDAO;
	
	public void saveUser(User user) {
		userDAO.saveUser(user);
	}
}
