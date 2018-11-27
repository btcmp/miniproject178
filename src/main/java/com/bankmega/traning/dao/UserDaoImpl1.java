package com.bankmega.traning.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bankmega.traning.model.User1;

@Repository
public class UserDaoImpl1 implements UserDao1 {

	@Autowired
	SessionFactory sessionFactory;
	
	public List<User1> getAllUser() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<User1> users = session.createCriteria(User1.class).list(); 
		
		return users;
	}

	public User1 getUserById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(User1.class, id);
	}

	public void updateUserRole(User1 user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		User1 newUser = (User1)session.merge(user);
		session.saveOrUpdate(newUser);
		session.flush();
	}

	public String getPasswordByUser(int i) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		User1 us = session.get(User1.class, i);
		return us.getPassword();
	}

	public void save(User1 user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		session.flush();
	}
	

}
