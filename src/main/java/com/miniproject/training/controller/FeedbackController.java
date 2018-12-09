package com.miniproject.training.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproject.training.model.Feedback;
import com.miniproject.training.model.Question;
import com.miniproject.training.model.Test;
import com.miniproject.training.model.User;
import com.miniproject.training.model.Version;
import com.miniproject.training.model.VersionDetail;
import com.miniproject.training.service.FeedbackService;
import com.miniproject.training.service.QuestionService;
import com.miniproject.training.service.TestService;
import com.miniproject.training.service.VersionService;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@Autowired
	TestService testService;
	
	@Autowired
	QuestionService questionService;
	
	@Autowired
	VersionService versionService;
	
	@Autowired
	HttpSession httpSession;
	
	@RequestMapping
	public String view(Model model) {
		List<Feedback> feedbacks = feedbackService.getAllFeedbacks();
		List<Test> tests = testService.getAllTests();
		Version version = versionService.getLastVersion();
		model.addAttribute("feedbacks", feedbacks);
		model.addAttribute("tests", tests);
		model.addAttribute("versions", version);
		return "feedback";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Feedback saving(@RequestBody Feedback feedback) {
		User user = (User) httpSession.getAttribute("application-user");
		feedback.setCreatedBy(user.getId());
		feedbackService.saving(feedback);
		return feedback;
	}

}