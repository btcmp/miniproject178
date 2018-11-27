package com.bankmega.traning.dao;

import java.util.List;

import com.bankmega.traning.model.Role1;
import com.bankmega.traning.model.User1;

public interface RoleDao1 {

	List<Role1> getAllUserRoles();

	void save(Role1 role);

	List<Role1> getRoleByUser(User1 user);

	Role1 getRoleById(int id);

}
