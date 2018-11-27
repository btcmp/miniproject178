package com.miniproject.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproject.training.model.Role1;
import com.miniproject.training.model.User1;
import com.miniproject.training.service.RoleService1;
import com.miniproject.training.service.UserAccountService;

@Controller
@RequestMapping("/account")
public class Account {

	@Autowired
	UserAccountService userAccountService;
	
	@Autowired
	RoleService1 roleService;
	
	@RequestMapping
	public String index(Model model){
		List<User1> users = userAccountService.getAllUser();
		List<Role1> roles = roleService.getAllUserRoles();
		model.addAttribute("users", users);
		model.addAttribute("roles", roles);
		
		return "account/account";
	}
	
	@RequestMapping("/user/{id}")
	@ResponseBody
	public User1 getUserById(@PathVariable int id){
		return userAccountService.getUserById(id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public User1 save(@RequestBody User1 user){
		BCryptPasswordEncoder passwordEncode = new BCryptPasswordEncoder();
		String thePassword = passwordEncode.encode(user.getPassword());
		user.setPassword(thePassword);
		
		userAccountService.save(user);
		return user;
	}
	
	@RequestMapping(value="/updaterole", method=RequestMethod.PUT)
	@ResponseBody
	public User1 updateUserRole(@RequestBody User1 user){
		if(user.getPassword() == null){
			user.setPassword(userAccountService.getPassword(user.getId()));
		}
		userAccountService.updateUserRole(user);
		return user;
	}
	
	@RequestMapping(value = "/addrole", method=RequestMethod.POST)
	@ResponseBody
	public Role1 addRoleAccount(@RequestBody Role1 role){
		roleService.save(role);
		return role;
	}
}
