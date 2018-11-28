package com.miniproject.training.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.miniproject.training.model.Question;
import com.miniproject.training.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@RequestMapping
	public String view(Model model) {
		List<Question> questions = questionService.getAllQuestions();
		model.addAttribute("questions", questions);
		return "question";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Question saving(@RequestBody Question question) {
		questionService.saving(question);
		return question;
	}
	
	//delete hapus
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id){
		questionService.delete(id);
	}

}