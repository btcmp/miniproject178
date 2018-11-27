package com.miniproject.training.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.miniproject.training.model.Employee;
import com.miniproject.training.model.Role1;
import com.miniproject.training.model.User1;

@Component
public class InitDB {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	RoleService1 roleService;
	
	@Autowired
	UserAccountService userService;
	
	@PostConstruct
	public void init(){
		Role1 roleAdmin = new Role1();
		roleAdmin.setRoleName("ROLE_ADMIN");
		Role1 roleStaff = new Role1();
		roleStaff.setRoleName("ROLE_STAFF");
		Role1 roleOpera = new Role1();
		roleOpera.setRoleName("root");
		
		roleService.save(roleAdmin);
		roleService.save(roleStaff);
		roleService.save(roleOpera);
		System.out.println("success saving");
		
		//insert user
		User1 userAdmin = new User1();
		userAdmin.setEmail("root@bankmega.com");
		userAdmin.setUsername("root@bankmega.com");
		userAdmin.setPassword(encodePassword("12345"));
		userAdmin.setEnabled(1);
		List<Role1> rolesAdmin = new ArrayList();
		rolesAdmin.add(roleAdmin);
		rolesAdmin.add(roleOpera);
		rolesAdmin.add(roleStaff);
		userAdmin.setRoles(rolesAdmin);
		userService.save(userAdmin);
		
		//insert user opera
		User1 opera = new User1();
		opera.setEmail("opera@yahoo.com");
		opera.setPassword(encodePassword("opera"));
		opera.setUsername("opera");
		opera.setEnabled(1);
		
		List<Role1> rolesOpera = new ArrayList();
		rolesOpera.add(roleOpera);
		opera.setRoles(rolesOpera);
		
		userService.save(opera);
	}
	
	public String encodePassword(String pass){
		BCryptPasswordEncoder passwordEncode = new BCryptPasswordEncoder();
		String thePassword = passwordEncode.encode(pass);
		
		return thePassword;
	}
	
}
