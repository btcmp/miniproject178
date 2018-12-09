package com.miniproject.training.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.miniproject.training.model.Menu;
import com.miniproject.training.model.Menu_Access;
import com.miniproject.training.model.Role;
import com.miniproject.training.model.User;
import com.miniproject.training.service.MenuService;
import com.miniproject.training.service.Menu_AccessService;
import com.miniproject.training.service.RoleService;

@Controller
@RequestMapping("/menu_access")
public class Menu_AccessController {

	@Autowired
	Menu_AccessService menu_AccessService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	MenuService menuService;
	
	@Autowired
	HttpSession httpSession;
	
	@ModelAttribute("menu_accessForm")
	public Menu_Access getMenu_AccessForm()
	{
		return new Menu_Access();
	}
	
	@RequestMapping
	public String view(Model model)
	{
		List<Menu_Access> menu_access = menu_AccessService.getAllMenu_Access();
		List<Role> role = roleService.getAllRole();
		List<Menu> menu = menuService.getAllMenu();
		
		model.addAttribute("menu_access",menu_access);
		model.addAttribute("role",role);
		model.addAttribute("menu",menu);
		return "menu_access";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Menu_Access saving(@RequestBody Menu_Access menu_access)
	{
		User user = (User) httpSession.getAttribute("application-user");
		menu_access.setCreatedBy(user.getId());
		menu_AccessService.saving(menu_access);
		return menu_access;
	}
	
	//get data menu_Access id
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Menu_Access getMenu_AccessById(@PathVariable long id)
	{
		Menu_Access menu_access = menu_AccessService.getAllMenu_AccessById(id);
		return menu_access;
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable long id)
	{
		menu_AccessService.delete(id);
	}
	
	//search menu_access dropdown for role
	@RequestMapping(value="/search", method = RequestMethod.GET)
	public String search(@RequestParam("srcmenu_access") String name, Model model)
	{
		List<Menu_Access> menu_access = menu_AccessService.searchByName(name);
		model.addAttribute("menu_access",menu_access);
		return "menu_access";
	}
}
