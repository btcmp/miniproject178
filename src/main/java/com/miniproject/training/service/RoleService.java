package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.RoleDao;
import com.miniproject.training.model.Role;

@Service
@Transactional
public class RoleService {

	@Autowired
	RoleDao roleDao;
	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		return roleDao.getAllRole();
	}
	public void saving(Role role) {
		// TODO Auto-generated method stub
		roleDao.save(role);
	}
	public Role searchById(String role) {
		// TODO Auto-generated method stub
		return roleDao.searchById(role);
	}
	public Role getAllRoleById(long id) {
		// TODO Auto-generated method stub
		Role role=roleDao.getAllRoleById(id);
		return role;
	}
	public void deactivate(Role role) {
		// TODO Auto-generated method stub
		roleDao.deactivate(role);
	}
	public void update(Role role) {
		// TODO Auto-generated method stub
		roleDao.update(role);
	}
	public List<Role> searchByName(String name) {
		// TODO Auto-generated method stub
		return roleDao.searchByName(name);
	}

}
