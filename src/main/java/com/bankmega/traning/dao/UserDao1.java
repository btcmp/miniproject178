package com.bankmega.traning.dao;

import java.util.List;

import com.bankmega.traning.model.User1;

public interface UserDao1 {

	List<User1> getAllUser();

	User1 getUserById(int id);

	void updateUserRole(User1 user);

	String getPasswordByUser(int i);

	void save(User1 user);


}
