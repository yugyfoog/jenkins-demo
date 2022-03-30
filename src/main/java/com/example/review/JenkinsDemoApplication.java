package com.example.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

	@GetMapping("/sayHello")
	public String getRequest0() {
		return "This is a test";
	}

	@GetMapping("/giveFeedback")
	public String getRequest1() {
		return "You suck";
	}
	
}

