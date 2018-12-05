package com.miniproject.training.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproject.training.model.Bootcamp;
import com.miniproject.training.model.Office;
import com.miniproject.training.service.BootcampService;

@Controller
@RequestMapping("/bootcamp")
public class BootcampController {
//
	@Autowired
	BootcampService bootcampService;
//	
//	//bootcamp list
	@RequestMapping//(value="/view", method = RequestMethod.GET)
	public String view(Model model) {
		List<Bootcamp> bootcamps = bootcampService.getAllBootcamps();
		model.addAttribute("bootcamps", bootcamps);
		return "bootcamp";
	}
	
	//bootcamp save
	@RequestMapping(value="/save", method = RequestMethod.POST)
	@ResponseBody
	public Bootcamp save(@RequestBody Bootcamp bootcamp) {
		bootcampService.save(bootcamp);
		return bootcamp;
	}
	
	//get data bootcamp
		@RequestMapping(value="/editui/{id}", method = RequestMethod.GET)
		@ResponseBody
		public Bootcamp getBootcampById(@PathVariable("id") Long id) {
			Bootcamp bootcamp = bootcampService.getBootcampById(id);
			return bootcamp;
	}
	
	//bootcamp update
	@RequestMapping(value="/update", method = RequestMethod.POST)
	@ResponseBody
	public Bootcamp update(@RequestBody Bootcamp bootcamp) {
		bootcampService.update(bootcamp);
		return bootcamp;
	}
	
	//search bootcamp
	@RequestMapping(value="/src", method = RequestMethod.GET) //url di web
	public String search(@RequestParam("srctext") String name, Model model) {
		List<Bootcamp> bootcamps = bootcampService.searchByName(name);
		model.addAttribute("bootcamps", bootcamps);
		return "bootcamp";
	}
}
