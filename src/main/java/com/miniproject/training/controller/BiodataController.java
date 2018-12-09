package com.miniproject.training.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.miniproject.training.model.Biodata;
import com.miniproject.training.model.Bootcamp;
import com.miniproject.training.model.User;
import com.miniproject.training.service.BiodataService;
import com.miniproject.training.service.BootcampService;

@Controller
@RequestMapping("/biodata")
public class BiodataController {

	@Autowired
	BiodataService biodataService;
	
	@Autowired
	BootcampService bootcampService;
	
	@Autowired
	HttpSession httpSession;
	
	@RequestMapping
	public String view(Model model) {
		List<Biodata> biodatas=biodataService.getAllBiodatas();
		List<Bootcamp> bootcamps=bootcampService.getAllBootcamps();
		model.addAttribute("biodatas", biodatas);
		model.addAttribute("bootcamps",bootcamps);
		return "biodata";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Biodata save(@RequestBody Biodata biodata) {
		User user=(User) httpSession.getAttribute("application-user");
		biodata.setCreatedBy(user.getId());
		biodataService.save(biodata);
		return biodata;
	}
	
	@RequestMapping(value="/editui/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Biodata editUI(@PathVariable("id") Long id) {
		Biodata biodata=biodataService.getBiodataById(id);
		return biodata;
	}
	
	@RequestMapping(value="/editbiodata", method=RequestMethod.POST)
	@ResponseBody
	public Biodata editBiodata(@RequestBody Biodata biodata) {
		User user=(User) httpSession.getAttribute("application-user");
		biodata.setModifiedBy(user.getId());
		biodataService.save(biodata);
		return biodata;
	}
	
	@RequestMapping(value="/src", method=RequestMethod.GET)
	public String search(@RequestParam("srctext") String name, Model model) {
		List<Biodata> biodatas=biodataService.searchByName(name);
		model.addAttribute("biodatas",biodatas);
		return "biodata";
	}
}
