package com.miniproject.training.controller;

import java.security.Principal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	HttpSession httpSession;
	
	@Autowired
	RoleService roleService;
	
	@ModelAttribute("userForm")
	public User getUserForm(Principal principal) {
		String username = principal.getName();
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
		User userlogin = (User) httpSession.getAttribute("application-user");
		user.setCreatedBy(userlogin.getId());
		user.setCreatedOn(new Date());
		userService.saving(user);
		return user;
	}
	
	@RequestMapping(value="/deactivate",method=RequestMethod.POST)
	@ResponseBody
	public User deactivate(@RequestBody User user)
	{
		userService.deactivate(user);
		return user;
	}
	
	//get data user
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	@ResponseBody
	public User getUserById(@PathVariable long id)
	{
		User user = userService.getAllUserById(id);
		return user;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	@ResponseBody
	public User update(@RequestBody User user)
	{
		userService.update(user);
		return user;
	}
}
