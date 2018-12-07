package com.miniproject.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproject.training.model.Biodata;
import com.miniproject.training.model.Monitoring;
import com.miniproject.training.service.BiodataService;
import com.miniproject.training.service.MonitoringService;

@Controller
@RequestMapping("/monitoring")
public class MonitoringController {

	@Autowired
	MonitoringService monitoringService;
	@Autowired
	BiodataService biodataService;
	
	@RequestMapping
	public String view(Model model) {
		List<Monitoring> monitorings=monitoringService.getAllMonitorings();
		List<Biodata> biodatas=biodataService.getAllBiodatas();
		model.addAttribute("monitorings", monitorings);
		model.addAttribute("biodatas", biodatas);
		return "monitoring";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Monitoring save(@RequestBody Monitoring monitoring) {
		monitoringService.save(monitoring);
		return monitoring;
	}
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Monitoring get(@PathVariable("id") Long id) {
		Monitoring monitoring=monitoringService.getMonitoringById(id);
		return monitoring;
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	@ResponseBody
	public Monitoring savePlacement(@RequestBody Monitoring monitoring) {
		monitoringService.save(monitoring);
		return monitoring;
	}
}
