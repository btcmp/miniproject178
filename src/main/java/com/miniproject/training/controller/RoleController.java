package com.miniproject.training.controller;

import java.util.List;

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
import com.miniproject.training.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	RoleService roleService;
	
	@ModelAttribute("roleForm")
	public Role getRoleForm()
	{
		return new Role();
	}
	
	@RequestMapping
	public String view(Model model)
	{
		List<Role> roles = roleService.getAllRole();
		model.addAttribute("roles",roles);
		return "role";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Role saving(@RequestBody Role role)
	{
		roleService.saving(role);
		return role;
	}
	
	//get data role
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Role getRoleById(@PathVariable long id)
	{
		Role role = roleService.getAllRoleById(id);
		return role;
	}
}
