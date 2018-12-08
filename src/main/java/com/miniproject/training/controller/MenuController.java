package com.miniproject.training.controller;

import java.util.List;

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

import com.miniproject.training.model.Menu;
import com.miniproject.training.model.User;
import com.miniproject.training.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	MenuService menuService;
	
	@Autowired
	HttpSession httpSession;
	
	@ModelAttribute("menuForm")
	public Menu getMenuForm()
	{
		return new Menu();
	}
	
	@RequestMapping
	public String view(Model model)
	{
		List<Menu> menus = menuService.getAllMenu();
		model.addAttribute("menus",menus);
		return "menu";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Menu saving(@RequestBody Menu menu)
	{
		User user = (User) httpSession.getAttribute("application-user");
		menu.setCreatedBy(user.getId());
		menuService.saving(menu);
		return menu;
	}
	
	//get data id menu
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Menu getMenuById(@PathVariable long id)
	{
		Menu menu = menuService.getAllMenuById(id);
		return menu;
	}
	
	@RequestMapping(value="/deactivate",method=RequestMethod.POST)
	@ResponseBody
	public Menu deactivate(@RequestBody Menu menu)
	{
		menuService.deactivate(menu);
		return menu;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	@ResponseBody
	public Menu update(@RequestBody Menu menu)
	{
		menuService.update(menu);
		return menu;
	}
}
