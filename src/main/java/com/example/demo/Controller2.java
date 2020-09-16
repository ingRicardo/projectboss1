package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
		
	@RequestMapping("/riky")
	public String index() {
		return "second controller !";
	}
}
