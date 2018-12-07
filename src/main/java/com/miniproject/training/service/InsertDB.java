package com.miniproject.training.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.hibernate.dialect.function.VarArgsSQLFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.miniproject.training.model.Role;
import com.miniproject.training.model.User;

@Component
public class InsertDB {

	@Autowired
	RoleService roleService;
	
	@Autowired
	UserService userService;
	
	@PostConstruct
	public void init() {
		//insert role
		Role roleUser = new Role();
		Long id = 6L;
		roleUser.setCreatedBy(id);
		roleUser.setName("ROLE_USER");
		roleUser.setCode("RO0001");
		roleUser.setDescription("Ini role user");
		roleUser.setActive(true);
		roleUser.setCreatedOn(new Date());
		roleService.saving(roleUser);
		System.out.println("Success saving");
		
		//insert user
		Role roleid = roleService.getAllRoleById(id);
		User userUser = new User();
		userUser.setActive(true);
		userUser.setEnabled(1);
		userUser.setUsername("faiz");
		userUser.setPassword("12345");
		userUser.setCreatedOn(new Date());
		userUser.setRole(roleid);
		userService.saving(userUser);
		System.out.println("Success Saving");
	}
}
