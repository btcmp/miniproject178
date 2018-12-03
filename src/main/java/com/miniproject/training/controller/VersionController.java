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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.miniproject.training.model.Question;
import com.miniproject.training.model.Version;
import com.miniproject.training.service.QuestionService;
import com.miniproject.training.service.VersionService;

@Controller
@RequestMapping("/version")
public class VersionController {
	
	@Autowired
	VersionService versionService;
	
	@Autowired
	QuestionService questionService;
	
	@RequestMapping
	public String view(Model model) {
		List<Version> versions = versionService.getAllVersions();
		List<Question> questions = questionService.getAllQuestions();
		model.addAttribute("versions", versions);
		model.addAttribute("questions", questions);
		return "version";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Version saving(@RequestBody Version version, RedirectAttributes redirectAttributes) {
		versionService.saving(version);
		redirectAttributes.addFlashAttribute("message", "Version berhasil ditambahkan");
		return version;
	}
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Version getVersionById(@PathVariable Long id) {
		Version version = versionService.getVersionById(id);
		return version;
	}
	
	@RequestMapping(value="example", method=RequestMethod.GET)
	@ResponseBody
	public String getExample(@RequestParam("data") String data) {
		System.out.println(""+ data);
		return "value: "+data;
	}

}