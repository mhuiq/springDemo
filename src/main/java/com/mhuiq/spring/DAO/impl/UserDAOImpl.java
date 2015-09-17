package com.mhuiq.spring.DAO.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mhuiq.spring.DAO.UserDAO;
import com.mhuiq.spring.model.User;

@Repository
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class UserDAOImpl implements UserDAO {
	
	private SessionFactory sessionFactory;

	@Autowired
	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void saveUser(User user) {
		//Transaction tx = currentSession().beginTransaction();
		currentSession().save(user);
		//tx.commit();
	}

	public void deleteUser(String username) {
		// TODO Auto-generated method stub

	}

}
