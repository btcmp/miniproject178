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

import com.miniproject.training.model.Testimony;
import com.miniproject.training.service.TestimonyService;

@Controller
@RequestMapping("testimony")
public class TestimonyController {
	
	@Autowired
	TestimonyService testimonyService;
	
	@Autowired
	private HttpSession httpSession;
	
	@RequestMapping
	public String index(Model model,@RequestParam(required=false) String search) {
		List<Testimony> testi=testimonyService.getAllTestimony();
		if (search!=null) {
			testi=testimonyService.searchTestimony(search);
		}
		model.addAttribute("testimony", testi);
		return "testimony";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Testimony save(@RequestBody Testimony testimony) {
		testimonyService.save(testimony);
		return testimony;
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	@ResponseBody
	public Testimony update(@RequestBody Testimony testimony) {
		testimonyService.update(testimony);
		return testimony;
	}
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Testimony getTestimonyById(@PathVariable long id) {
		Testimony testi=testimonyService.getAllTestimonyById(id);
		return testi;
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable long id) {
		testimonyService.delete(id);
	}
}
