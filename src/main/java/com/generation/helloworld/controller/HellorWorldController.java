package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HellorWorldController {
	
	@GetMapping
	public String hello() {
		return "Helo World";
	}
	
	@GetMapping("/turma")
	public String turma() {
		return "Turma java 82";
	}
	@GetMapping("/carlos")
	public String carlos() {
		return "Helo World";
	}

}
