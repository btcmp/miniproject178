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
import org.springframework.web.bind.annotation.ResponseStatus;

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
	@ResponseStatus(code=HttpStatus.CREATED)
	public String save(@RequestBody Biodata biodata) {
		biodataService.save(biodata);
		return "redirect:/biodata";
	}
	
}
