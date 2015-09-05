package com.mhuiq.spring.DAO;

import com.mhuiq.spring.model.User;

public interface UserDAO {
	public void saveUser(User user);
	public void deleteUser(String username);

}
