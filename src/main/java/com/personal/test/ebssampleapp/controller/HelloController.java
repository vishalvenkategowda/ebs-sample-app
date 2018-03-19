package com.personal.test.ebssampleapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {	
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to my page";
	}
	
}
