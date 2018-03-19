package com.personal.test.ebssampleapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {	
	
	@Value("${env.prop}")
	private String envProp;
	
	@Autowired
	private ConfigurableEnvironment env;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to my page with env: "+envProp;
	}
	
}
