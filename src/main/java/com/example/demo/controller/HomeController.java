package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@RequestMapping("/welcome")
	public String homeController() {
		return "Hello World";
	}

}