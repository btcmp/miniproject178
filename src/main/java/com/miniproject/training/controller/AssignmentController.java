package com.miniproject.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproject.training.model.Assignment;
import com.miniproject.training.model.Biodata;
import com.miniproject.training.service.AssignmentService;
import com.miniproject.training.service.BiodataService;

@Controller
@RequestMapping("/assignment")
public class AssignmentController {

	@Autowired
	AssignmentService assignmentService;
	
	@Autowired
	BiodataService biodataService;
	
	@RequestMapping
	public String view(Model model){
		List<Assignment> assignments=assignmentService.getAllAssignments();
		List<Biodata> biodatas=biodataService.getAllBiodatas();
		model.addAttribute("assignments",assignments);
		model.addAttribute("biodatas",biodatas);
		return "assignment";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Assignment save(@RequestBody Assignment assignment) {
		assignmentService.save(assignment);
		return assignment;
	}
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Assignment get(@PathVariable("id") Long id) {
		Assignment assignment=assignmentService.getAssignmentById(id);
		return assignment;
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	@ResponseBody
	public Assignment edit(@RequestBody Assignment assignment) {
		assignmentService.save(assignment);
		return assignment;
	}
}
