package com.miniproject.training.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miniproject.training.model.Biodata;
import com.miniproject.training.model.Monitoring;
import com.miniproject.training.model.User;
import com.miniproject.training.service.BiodataService;
import com.miniproject.training.service.MonitoringService;

@Controller
@RequestMapping("/monitoring")
public class MonitoringController {

	@Autowired
	MonitoringService monitoringService;
	@Autowired
	BiodataService biodataService;
	@Autowired
	HttpSession httpSession;
	
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
		User user=(User) httpSession.getAttribute("application-user");
		monitoring.setCreatedBy(user.getId());
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
		User user=(User) httpSession.getAttribute("application-user");
		monitoring.setModifiedBy(user.getId());
		monitoringService.save(monitoring);
		return monitoring;
	}
	
	@RequestMapping(value="delete", method=RequestMethod.POST)
	@ResponseBody
	public Monitoring delete(@RequestBody Monitoring monitoring) {
		User user=(User) httpSession.getAttribute("application-user");
		monitoring.setDeleteBy(user.getId());
		monitoringService.save(monitoring);
		return monitoring;
	}
	
	@RequestMapping(value="/src", method=RequestMethod.GET)
	public String search(@RequestParam("srctext") String name, Model model) {
		List<Monitoring> monitorings=monitoringService.getSearchByName(name);
		model.addAttribute("monitorings",monitorings);
		return "monitoring";
	}
}
