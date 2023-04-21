package com.springboot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("this is homepage");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("this is contact");
		return "contact";
	}

}