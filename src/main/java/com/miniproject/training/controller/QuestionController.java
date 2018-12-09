package com.miniproject.training.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.miniproject.training.model.Question;
import com.miniproject.training.model.User;
import com.miniproject.training.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@Autowired
	HttpSession httpSession;
	
	@RequestMapping
	public String view(Model model, @RequestParam(required=false) String search) {
		List<Question> questions = questionService.getAllQuestions();
		if (search!=null) {
			questions = questionService.searchQuestion(search);
		}
		model.addAttribute("questions", questions);
		return "question";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Question saving(@RequestBody Question question) {
		User user = (User) httpSession.getAttribute("application-user");
		question.setCreatedBy(user.getId());
		questionService.saving(question);
		return question;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseBody
	public Question update(@RequestBody Question question) {
		User user = (User) httpSession.getAttribute("application-user");
		question.setModifiedBy(user.getId());
		question.setDeletedBy(user.getId());
		questionService.saving(question);
		return question;
	}
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Question getQuestionById(@PathVariable Long id) {
		Question question = questionService.getQuestionById(id);
		return question;
	}
	
	@RequestMapping(value="/example", method=RequestMethod.GET)
	@ResponseBody
	public String getExample(@RequestParam("data") String data) {
		System.out.println(""+ data);
		return "value: "+data;
	}

}