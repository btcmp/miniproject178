package com.miniproject.training.controller;

import java.nio.channels.GatheringByteChannel;
import java.util.List;

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

import com.miniproject.training.model.Category;
import com.miniproject.training.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	//list category
	@RequestMapping
	public String view(Model model) {
		List<Category> categorys = categoryService.getAllCategorys();
		model.addAttribute("categorys", categorys);
		return "category";
	}
	
	//save category
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Category save(@RequestBody Category category) {
		categoryService.saveCategory(category);
		return category;
	}
	
	//get data category
	@RequestMapping(value="/get/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Category getCategoryById(@PathVariable ("id") Long id){
		Category category = categoryService.getCategoryById(id);
		return category;
	}
	
	//update category
	@RequestMapping(value="/update", method = RequestMethod.POST)
	@ResponseBody
	public Category update(@RequestBody Category category) {
		categoryService.update(category);
		return category;
	}
	
	//search category
	@RequestMapping(value="/search", method = RequestMethod.GET)
	public String search(@RequestParam("srctext") String name, Model model) {
		List<Category> categorys= categoryService.searchByName(name);
		model.addAttribute("categorys", categorys);
		return"category";
	}
	
	//deactive category
	@RequestMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") Long id) {
		categoryService.deactiveCategory(id);
	}
}
