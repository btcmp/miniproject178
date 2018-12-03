package com.miniproject.training.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproject.training.model.Role;
import com.miniproject.training.model.User;
import com.miniproject.training.service.RoleService;
import com.miniproject.training.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	RoleService roleService;
	
	@ModelAttribute("userForm")
	public User getUserForm() {
		return new User();
	}
	
	@RequestMapping
	public String view(Model model) {
		List<User> users = userService.getAllUser();
		List<Role> roles = roleService.getAllRole();
		model.addAttribute("users",users);
		model.addAttribute("roles",roles);
		return "user";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public User saving(@RequestBody User user)
	{
		userService.saving(user);
		return user;
	}
}
