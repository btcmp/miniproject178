package com.miniproject.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproject.training.model.Test;
import com.miniproject.training.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping
	public String view(Model model) {
		List<Test> tests = testService.getAllTests();
		model.addAttribute("tests", tests);
		return "test";
	}
	
	@RequestMapping(value="save")
	@ResponseBody
	public Test saving(@RequestBody Test test) {
		testService.saving(test);
		return test;
	}
	
}