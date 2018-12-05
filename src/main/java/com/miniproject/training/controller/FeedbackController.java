package com.miniproject.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproject.training.model.Feedback;
import com.miniproject.training.service.FeedbackService;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@RequestMapping
	public String view(Model model) {
		List<Feedback> feedbacks = feedbackService.getAllFeedbacks();
		model.addAttribute("feedbacks", feedbacks);
		return "feedback";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Feedback saving(@RequestBody Feedback feedback) {
		feedbackService.saving(feedback);
		return feedback;
	}

}