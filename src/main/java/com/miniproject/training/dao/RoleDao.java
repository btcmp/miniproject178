package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Role;

public interface RoleDao {

	public List<Role> getAllRole();

	public void save(Role role);

	public Role searchById(String roleId);

	public Role getAllRoleById(long id);

}
