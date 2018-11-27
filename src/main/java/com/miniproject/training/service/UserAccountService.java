package com.miniproject.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.RoleDao1;
import com.miniproject.training.dao.UserDao1;
import com.miniproject.training.model.Employee;
import com.miniproject.training.model.Role1;
import com.miniproject.training.model.User1;

@Service
@Transactional
public class UserAccountService {
	
	@Autowired
	UserDao1 userDao;
	@Autowired
	RoleDao1 roleDao;
	
	public List<User1> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

	public User1 getUserById(int id) {
		// TODO Auto-generated method stub
		/*Employee employee = new Employee();
		employee.setId(id);
		Integer idDept = null;*/
		
		User1 user = userDao.getUserById(id);
		List<Role1> roles = new ArrayList();
		if(user.getRoles() != null){
			for(Role1 role : user.getRoles()){
				Role1 dRole = roleDao.getRoleById(role.getId());
				roles.add(dRole);
			}
		}
		user.setRoles(roles);
		
		return userDao.getUserById(id);
	}

	public void updateUserRole(User1 user) {
		// TODO Auto-generated method stub
		userDao.updateUserRole(user);
	}
	
	public String getPassword(int id){
		String oldPassword = userDao.getPasswordByUser(id);
		return oldPassword;
	}

	public void save(User1 user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

}
