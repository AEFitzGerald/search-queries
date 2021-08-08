package com.fitzgerald.hellovisitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitorGreeting {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required = false) String searchQuery) {
		if (searchQuery == null) {
			return "<h1>Hello Visitor!</h1><br> <h2>Welcome to Spring Boot!</h2>";
		} else {
			return String.format("<h1>Hello %s </h1><br><h2>Welcome to Spring Boot!</h2><br><a href='http://localhost:8080'>Go Back</a>", searchQuery);	
		}		
	}
}
