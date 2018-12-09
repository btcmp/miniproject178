package com.miniproject.training.controller;

import java.util.List;

import javax.naming.Binding;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.miniproject.training.model.Office;
import com.miniproject.training.model.User;
import com.miniproject.training.service.OfficeService;

@Controller
@RequestMapping("/office")
public class OfficeController {

	@Autowired
	OfficeService officeService;
	
	@Autowired
	HttpSession httpSession;
	
	//office list
	@RequestMapping
	public String index(Model model){
		List<Office> offices = officeService.getAllOffices();
		model.addAttribute("offices", offices);
		return "office";
	}
	
	//office save
	@RequestMapping(value="/save", method = RequestMethod.POST)
	@ResponseBody
	public Office save(@RequestBody Office office, Model model) {
		User user = (User) httpSession.getAttribute("application-user");
		office.setCreatedBy(user.getId());
		officeService.saveOffice(office);
		return office;
	}
	
	//get data office
	@RequestMapping(value="/editui/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Office getOfficeById(@PathVariable("id") Long id) {
		Office office = officeService.getOfficeById(id);
		return office;
	}
	
	//office update
	@RequestMapping(value="/editoffice", method = RequestMethod.POST)
	@ResponseBody
	public Office update(@RequestBody Office office) {
		User user = (User) httpSession.getAttribute("application-user");
		office.setModifiedBy(user.getId());
		officeService.update(office);
		return office;
	}
	
	//office search
	@RequestMapping(value="/search", method = RequestMethod.GET)
	public String search(@RequestParam("srcoffice") String name, Model model) {
		List<Office> offices = officeService.searchByName(name);
		model.addAttribute("offices", offices);
		return "office";
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") Long id) {
		officeService.disableOffice(id);
	}
	
	
}
