package com.miniproject.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.miniproject.training.model.Trainer;
import com.miniproject.training.service.TrainerService;

@Controller
@RequestMapping("/trainer")
public class TrainerController {
	
	@Autowired
	TrainerService trainerService;
	
	@ModelAttribute("trainForm")
	public Trainer trainForm() {
		return new Trainer();
	}
	public String index(Model model) {
		List<Trainer> trainer=trainerService.getAllTrainer();
		model.addAttribute("trainer", trainer);
		return "technology";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public Trainer save(@RequestBody Trainer trainer) {
		trainerService.saving(trainer);
		return trainer;
	}
	
}
