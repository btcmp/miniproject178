package com.miniproject.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miniproject.training.service.AssignmentService;

@Controller
@RequestMapping("/assignment")
public class AssignmentController {

	@Autowired
	AssignmentService assignmentService;
}
