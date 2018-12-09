package com.miniproject.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.miniproject.training.model.Batch;
import com.miniproject.training.model.Class;
import com.miniproject.training.service.BatchService;
import com.miniproject.training.service.ClassService;

@Controller
@RequestMapping("class")
public class ClassController {
	
	@Autowired
	ClassService classService;
	@Autowired
	BatchService batchService;
	@RequestMapping
	public String index(Model model,@RequestParam(required=false) String search) {
		List<Class> classes=classService.getAllClass();
		List<Batch> batch=batchService.getAllBatch();
		if (search!=null) {
			
			classes=classService.searchBatch(search);
		}
		model.addAttribute("class", classes);
		model.addAttribute("batch",batch);
		return "class";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Class save(@RequestBody Class classes) {
		classService.save(classes);
		return classes;
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable long id) {
		classService.delete(id);
	}
}
