package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

	@GetMapping({"/hola" , "/hello","/salut"} )
	public String getMethodName() {
		return "Hello, Hola, Salut";
	}
	
}
