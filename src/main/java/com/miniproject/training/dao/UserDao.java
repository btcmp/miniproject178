package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.User;

public interface UserDao {

	public List<User> getAllUser();

	public void save(User user);

	public void deactivate(User user);

	public User getAllUserById(long id);

	public void update(User user);

	public User getUserByUsername(String username);

}
