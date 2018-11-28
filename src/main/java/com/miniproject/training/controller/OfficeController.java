package com.miniproject.training.controller;

import java.util.List;

import javax.naming.Binding;
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

import com.miniproject.training.model.Office;
import com.miniproject.training.service.OfficeService;

@Controller
@RequestMapping("/office")
public class OfficeController {

	@Autowired
	OfficeService officeService;
	
	@ModelAttribute("officeForm")
	public Office getOfficeForm() {
		return new Office();
	}
	
	
	@RequestMapping
	public String index(Model model){
		List<Office> offices = officeService.getAllOffices();
		model.addAttribute("offices", offices);
		return "office";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public String save(@RequestBody Office office) {
		officeService.save(office);
		return "redirect:/office";
	}
}
