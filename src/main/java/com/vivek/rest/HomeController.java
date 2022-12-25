package com.vivek.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		
		return "HI, THIS IS HOME PAGE";
	}
	
	@GetMapping("/user")
	public String user() {
		
		return "HI, THIS IS USER PAGE";
	}
	@GetMapping("/admin")
	public String admin() {
		
		return "HI, THIS IS ADMIN PAGE";
	}
	@GetMapping("/about")
	public String about() {
		
		return "HI, THIS IS ABOUT PAGE";
	}

}
