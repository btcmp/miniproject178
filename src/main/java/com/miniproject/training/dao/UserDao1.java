package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.User1;

public interface UserDao1 {

	List<User1> getAllUser();

	User1 getUserById(int id);

	void updateUserRole(User1 user);

	String getPasswordByUser(int i);

	void save(User1 user);


}
