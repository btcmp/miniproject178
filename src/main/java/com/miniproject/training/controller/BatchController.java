package com.miniproject.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String index(Model model) {
		List<Batch> batch= batchService.getAllBatch();
		List<Technology>technology=technologyService.getAllTechnology();
		List<Trainer> trainer=trainerService.getAllTrainer();
		model.addAttribute("batch",batch);
		model.addAttribute("technology", technology);
		model.addAttribute("trainer", trainer);
		return "batch";
	}
}
