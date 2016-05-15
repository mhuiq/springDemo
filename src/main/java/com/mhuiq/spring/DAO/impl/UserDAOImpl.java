package com.mhuiq.spring.DAO.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mhuiq.spring.DAO.GenericDAO;
import com.mhuiq.spring.DAO.UserDAO;
import com.mhuiq.spring.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	GenericDAO<User> genericDAO;
	
	public void saveUser(User user)  {
		genericDAO.create(user);
	}

	public void deleteUser(String username) {
		// TODO Auto-generated method stub
		
	}

	public User findByUsername(String username) {
		StringBuilder sb = new StringBuilder().append("from com.mhuiq.spring.model.User u where u.username = ?");
		
		return genericDAO.find(sb.toString(),username);
	}
	

}
