package com.miniproject.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/idlenews")
public class IdleController {

	@RequestMapping
	public String view() {
		return "idlenews";
	}
}
