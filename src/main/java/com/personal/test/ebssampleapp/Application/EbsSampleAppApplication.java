package com.personal.test.ebssampleapp.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.personal.test.ebssampleapp.controller.HelloController;

@SpringBootApplication
@ComponentScan(basePackageClasses = HelloController.class)
@EnableAutoConfiguration
public class EbsSampleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbsSampleAppApplication.class, args);
	}
}
