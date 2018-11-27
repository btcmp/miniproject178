package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.RoleDao1;
import com.miniproject.training.model.Role1;

@Transactional
@Service
public class RoleService1 {

	@Autowired
	RoleDao1 roleDao;
	
	public List<Role1> getAllUserRoles() {
		// TODO Auto-generated method stub
		return roleDao.getAllUserRoles();
	}

	public void save(Role1 role) {
		// TODO Auto-generated method stub
		roleDao.save(role);
	}

}
