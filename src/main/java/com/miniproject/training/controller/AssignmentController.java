package com.miniproject.training.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproject.training.model.Assignment;
import com.miniproject.training.model.Biodata;
import com.miniproject.training.model.User;
import com.miniproject.training.service.AssignmentService;
import com.miniproject.training.service.BiodataService;

@Controller
@RequestMapping("/assignment")
public class AssignmentController {

	@Autowired
	AssignmentService assignmentService;
	
	@Autowired
	BiodataService biodataService;
	
	@Autowired
	HttpSession httpSession;
	
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
		User user=(User) httpSession.getAttribute("application-user");
		assignment.setCreatedBy(user.getId());
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
		User user=(User) httpSession.getAttribute("application-user");
		assignment.setModifiedBy(user.getId());
		assignmentService.save(assignment);
		return assignment;
	}
	
	@RequestMapping(value="deactive", method=RequestMethod.POST)
	@ResponseBody
	public Assignment deactive(@RequestBody Assignment assignment) {
		User user=(User) httpSession.getAttribute("application-user");
		assignment.setDeletedBy(user.getId());
		assignmentService.save(assignment);
		return assignment;
	}
	
	//attribute ngirim param: nerima value
	@RequestMapping(value="/src", method=RequestMethod.GET)
	public String search(@RequestParam("scrtxt") String name, Model model) {
		List<Assignment> assignments=assignmentService.searchByName(name);
		model.addAttribute("assignments", assignments);
		return "assignment";
	}
}
