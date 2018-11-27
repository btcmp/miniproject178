package com.bankmega.traning.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bankmega.traning.model.Biodata;
import com.bankmega.traning.service.BiodataService;

@Controller
@RequestMapping("/biodata")
public class BiodataController {

	@Autowired
	BiodataService biodataService;
	
	@ModelAttribute("biodataForm")
	public Biodata biodataForm() {
		return new Biodata();
	}
	
	@RequestMapping
	public String view(Model model) {
		List<Biodata> biodatas=biodataService.getAllBiodatas();
		model.addAttribute("biodatas", biodatas);
		return "biodata";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@Valid @ModelAttribute("biodataForm") Biodata biodata, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "biodata";
		}
		biodataService.save(biodata);
		return "redirect:/biodata";
	}
	
}
