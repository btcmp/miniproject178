package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.UserDao;
import com.miniproject.training.model.User;

@Service
@Transactional
public class UserService {

	@Autowired
	UserDao userDao;

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

	public void saving(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	public void deactivate(User user) {
		// TODO Auto-generated method stub
		userDao.deactivate(user);
	}

	public User getAllUserById(long id) {
		// TODO Auto-generated method stub
		User user=userDao.getAllUserById(id);
		return user;
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userDao.getUserByUsername(username);
	}

}
