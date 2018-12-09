package com.miniproject.training.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.miniproject.training.model.IdleNews;
import com.miniproject.training.model.User;
import com.miniproject.training.model.Bootcamp;
import com.miniproject.training.model.Category;
import com.miniproject.training.service.CategoryService;
import com.miniproject.training.service.IdleService;

@Controller
@RequestMapping("/idlenews")
public class IdleController {

	@Autowired
	IdleService idleService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	HttpSession httpSession;
	
	@RequestMapping
	public String view(Model model) {
		List<IdleNews> idlenews = idleService.getAllIdlenews();
		List<Category> categorys = categoryService.getAllCategorys();
		model.addAttribute("idlenews", idlenews);
		model.addAttribute("categorys", categorys);
		return "idlenews";
	}
	@RequestMapping(value="/save", method = RequestMethod.POST)
	@ResponseBody
	public IdleNews save(@RequestBody IdleNews idlenews) {
		/*User user = (User) httpSession.getAttribute("application-user");
		idlenews.setCreatedBy(user.getId());*/
		idleService.save(idlenews);
		return idlenews;
		
	}
	
	//get data idlenews
	@RequestMapping(value="/get/{id}", method = RequestMethod.GET)
	@ResponseBody
	public IdleNews getIdleById(@PathVariable("id") Long id) {
		IdleNews idlenews = idleService.getIdleById(id);
		return idlenews;
		}
		
	//bootcamp update
	@RequestMapping(value="/update", method = RequestMethod.POST)
	@ResponseBody
	public IdleNews update(@RequestBody IdleNews idlenews) {
		User user = (User) httpSession.getAttribute("application-user");
		idlenews.setModifiedBy(user.getId());
		idleService.update(idlenews);
		return idlenews;
	}
	
	//search
	@RequestMapping(value="/src", method = RequestMethod.GET) //url di web
	public String search(@RequestParam("srctext") String title, Model model) { //mengambil query variable di http
		List<IdleNews> idlenews = idleService.searchByName(title);
		model.addAttribute("idlenews", idlenews);
		return "idlenews";
	}
	
	//publish
	@RequestMapping("/publish/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void publish(@PathVariable("id") Long id) {
		idleService.publishIdle(id);
	}
	
	//delete
	@RequestMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") Long id) {
		idleService.deleteIdle(id);
	}
	
}
