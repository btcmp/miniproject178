package com.miniproject.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miniproject.training.model.User;
import com.miniproject.training.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@ModelAttribute("userForm")
	public User getUserForm() {
		return new User();
	}
	
	@RequestMapping
	public String view(Model model) {
		List<User> users = userService.getAllUser();
		model.addAttribute("users",users);
		return "user";
	}
}
