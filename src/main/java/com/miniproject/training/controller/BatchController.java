package com.miniproject.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproject.training.model.Batch;
import com.miniproject.training.model.Technology;
import com.miniproject.training.model.Trainer;
import com.miniproject.training.service.BatchService;
import com.miniproject.training.service.TechnologyService;
import com.miniproject.training.service.TrainerService;

@Controller
@RequestMapping("batch")
public class BatchController {
	
	@Autowired
	BatchService batchService;
	@Autowired
	TechnologyService technologyService;
	@Autowired
	TrainerService trainerService;
	
	@RequestMapping
	public String index(Model model,@RequestParam(required=false) String search) {
		List<Batch> batch= batchService.getAllBatch();
		List<Technology>technology=technologyService.getAllTechnology();
		List<Trainer> trainer=trainerService.getAllTrainer();
		if(search!=null) {
			technology=technologyService.searchTechnology(search);
			batch=batchService.searchBatch(search);
		}
		model.addAttribute("batch",batch);
		model.addAttribute("technology", technology);
		model.addAttribute("trainer", trainer);
		return "batch";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Batch save(@RequestBody Batch batch) {
		batchService.save(batch);
		return batch;
	}
	@RequestMapping(value="/get1/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Technology getTechnologyById(@PathVariable long id) {
		Technology technology=technologyService.getAllTechnologyById(id);
		return technology;
	}
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Batch getBatchById(@PathVariable long id) {
		Batch batch=batchService.getBatchById(id);
		return batch;
	}
}
