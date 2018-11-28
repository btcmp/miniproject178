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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.miniproject.training.model.Question;
import com.miniproject.training.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@ModelAttribute("questionForm")
	public Question getQuestionForm() {
		return new Question();
	}
	
	@RequestMapping
	public String view(Model model) {
		List<Question> questions = questionService.getAllQuestions();
		model.addAttribute("questions", questions);
		return "question";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saving(@Valid @ModelAttribute("questionForm") Question question, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "question";
		}
		questionService.saving(question);
		return "redirect:/question";
	}
	
	//delete hapus
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id){
		questionService.delete(id);
	}

}