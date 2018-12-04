package com.miniproject.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproject.training.model.Bootcamp;
import com.miniproject.training.service.BootcampService;

@Controller
@RequestMapping("/bootcamp")
public class BootcampController {

	@Autowired
	BootcampService bootcampService;
	
	@RequestMapping
	public String view(Model model) {
		List<Bootcamp> bootcamps = bootcampService.getAllBootcamps();
		model.addAttribute("bootcamps", bootcamps);
		return "bootcamp";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	@ResponseBody
	public String save(@RequestBody Bootcamp bootcamp) {
		bootcampService.save(bootcamp);
		return "office";
	}
}
