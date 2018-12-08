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
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//List technology dan trainer
	@RequestMapping
	public String index(Model model,@RequestParam(required=false) String search) {
		List<Technology> technology=technologyService.getAllTechnology();
		List<Trainer>trainer=trainerService.getAllTrainer();
		if (search!=null) {
			technology=technologyService.searchTechnology(search);
		}
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
	
	//save technology
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Technology save(@RequestBody Technology technology) {
		technologyService.save(technology);
		return technology;
	}
	//update technology
	@RequestMapping(value="/update",method=RequestMethod.POST)
	@ResponseBody
	public Technology update(@RequestBody Technology technology) {
		technologyService.update(technology);
		return technology;
	}
	
	//get data technology
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Technology getTechnologyById(@PathVariable long id) {
		Technology technology=technologyService.getAllTechnologyById(id);
		return technology;
	}
	
	@RequestMapping(value="/get1/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Trainer getTrainerById(@PathVariable long id) {
		Trainer trainer=trainerService.getAllTrainerById(id);
		return trainer;
	}
	//save trainer
	@RequestMapping(value="/savetrain",method=RequestMethod.POST)
	@ResponseBody
	public Trainer save(@RequestBody Trainer trainer) {
		trainerService.saving(trainer);
		return trainer;
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable long id) {
		trainerService.delete(id);
	}
	
}
