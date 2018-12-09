package com.miniproject.training.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

import com.miniproject.training.model.Bootcamp;
import com.miniproject.training.model.Office;
import com.miniproject.training.model.User;
import com.miniproject.training.service.BootcampService;

@Controller
@RequestMapping("/bootcamp")
public class BootcampController {
//
	@Autowired
	BootcampService bootcampService;
	
	@Autowired
	HttpSession httpSession;
//	
//	//bootcamp list
	@RequestMapping
	public String view(Model model) {
		List<Bootcamp> bootcamps = bootcampService.getAllBootcamps();
		model.addAttribute("bootcamps", bootcamps);
		return "bootcamp";
	}
	
	//bootcamp save
	@RequestMapping(value="/save", method = RequestMethod.POST)
	@ResponseBody
	public Bootcamp save(@RequestBody Bootcamp bootcamp) {
		User user = (User) httpSession.getAttribute("application-user");
		bootcamp.setCreatedBy(user.getId());
		bootcampService.save(bootcamp);
		return bootcamp;
	}
	
	//get data bootcamp
		@RequestMapping(value="/editui/{id}", method = RequestMethod.GET)
		@ResponseBody
		public Bootcamp getBootcampById(@PathVariable("id") Long id) {
			Bootcamp bootcamp = bootcampService.getBootcampById(id);
			return bootcamp;
	}
	
	//bootcamp update
	@RequestMapping(value="/update", method = RequestMethod.POST)
	@ResponseBody
	public Bootcamp update(@RequestBody Bootcamp bootcamp) {
		User user = (User) httpSession.getAttribute("application-user");
		bootcamp.setModifiedBy(user.getId());
		bootcampService.update(bootcamp);
		return bootcamp;
	}
	
	//search bootcamp
	@RequestMapping(value="/src", method = RequestMethod.GET) //url di web
	public String search(@RequestParam("srctext") String name, Model model) { //mengambil query variable di http
		List<Bootcamp> bootcamps = bootcampService.searchByName(name);
		model.addAttribute("bootcamps", bootcamps);
		return "bootcamp";
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK) //untuk memberikan status request ok atau create
	public void delete(@PathVariable("id") Long id) {
		//Bootcamp bootcamp = bootcampService.getById(id);
		bootcampService.deactiveBootcamp(id);
		//System.out.println(id);
	}
}
