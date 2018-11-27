package com.bankmega.traning.controller;

import java.util.List;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bankmega.traning.model.Office;
import com.bankmega.traning.service.OfficeService;

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
	public String save(@Valid @ModelAttribute("officeForm") Office office, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "office";
		}
		officeService.save(office);
		return "redirect:/office";
	}
}
