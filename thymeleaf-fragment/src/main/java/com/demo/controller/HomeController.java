package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	String Home() {
		return "home";
	}

	@RequestMapping("/about")
	String About() {
		return "About";
	}
}
