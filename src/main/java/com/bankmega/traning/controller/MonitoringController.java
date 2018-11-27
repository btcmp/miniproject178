package com.bankmega.traning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bankmega.traning.service.MonitoringService;

@Controller
@RequestMapping("/monitoring")
public class MonitoringController {

	@Autowired
	MonitoringService monitoringService;
}
