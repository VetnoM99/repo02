package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@GetMapping("/apiVersion/hacercafe")
	@ResponseStatus(code = HttpStatus.OK)
	public String HacerCafe() {
		return "OK";
	}
	
	@GetMapping("/apiVersion/hacerte")
	@ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
	public String Hacerte() {
		return "Soy una Tetera";
	}
	
	@GetMapping("/apiVersion/notfound")
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String NotFoud() {
		return "Not Foud";
	}
	
	
}
