package com.miniproject.training.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;
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

@Controller
@RequestMapping("/role")
public class RoleController{

	@Autowired
	RoleService roleService;
	
	@Autowired
	HttpSession httpSession;
	
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
		User user = (User) httpSession.getAttribute("application-user");	
		role.setCreatedOn(new Date());
		role.setCreatedBy(user.getId());
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
	
	@RequestMapping(value="/deactivate",method=RequestMethod.POST)
	@ResponseBody
	public Role deactivate(@RequestBody Role role)
	{
		User user = (User) httpSession.getAttribute("application-user");
		role.setModifiedBy(user.getId());
		roleService.deactivate(role);
		return role;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	@ResponseBody
	public Role update(@RequestBody Role role)
	{
		User user = (User) httpSession.getAttribute("application-user");
		role.setModifiedBy(user.getId());
		roleService.update(role);
		return role;
	}
}
