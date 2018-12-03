package com.miniproject.training.controller;

import java.util.List;

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
import com.miniproject.training.service.BiodataService;

@Controller
@RequestMapping("/biodata")
public class BiodataController {

	@Autowired
	BiodataService biodataService;

	@RequestMapping
	public String view(Model model) {
		List<Biodata> biodatas=biodataService.getAllBiodatas();
		model.addAttribute("biodatas", biodatas);
		return "biodata";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Biodata save(@RequestBody Biodata biodata, RedirectAttributes redirectAttributes) {
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
		biodataService.save(biodata);
		return biodata;
	}

}
