package com.miniproject.training.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.miniproject.training.model.Employee;
import com.miniproject.training.model.Technology;
import com.miniproject.training.model.Trainer;
import com.miniproject.training.service.TechnologyService;
import com.miniproject.training.service.TrainerService;

@Controller
@RequestMapping("technology")
public class TechnologyController {
	
	@Autowired
	TechnologyService technologyService;
	
	@Autowired
	TrainerService trainerService;
	
/*	@ModelAttribute("techForm")
	public Technology techForm() {
		return new Technology();
	}*/
	
	@RequestMapping
	public String index(Model model) {
		List<Technology> technology=technologyService.getAllTechnology();
		List<Trainer>trainer=trainerService.getAllTrainer();
		model.addAttribute("technology", technology);
		model.addAttribute("training",trainer);
		return "technology";
	}
/*	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@Valid @ModelAttribute("techForm") Technology technology,BindingResult bindingResult,Model model) {
		if (bindingResult.hasErrors()) {
			List<Technology>technologys=technologyService.getAllTechnology();
			model.addAttribute("technology",technologys);	
		}
		technologyService.save(technology);
		return "redirect:/technology";
	}*/
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Technology save(@RequestBody Technology technology) {
		technologyService.save(technology);
		return technology;
	}
	@RequestMapping(value="/savetrain",method=RequestMethod.POST)
	@ResponseBody
	public Trainer save(@RequestBody Trainer trainer) {
		trainerService.saving(trainer);
		return trainer;
	}
	
	
}
