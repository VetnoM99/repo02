package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class HomeController {
@GetMapping("/wellcome")
public String Bienvenida(@RequestParam (required= false)String name , String surname) {
    return "Bienbenido "+ name+" " + surname ;
}

	@GetMapping("/wellcome2")
	 public ObjectNode getParams(@RequestParam(name = "name", required = false, defaultValue = "desconocido") String name,
             @RequestParam(name = "surname", required = false, defaultValue = "desconocido") String surname) {
return index(name, surname);
	}
	
	public ObjectNode index(String name , String surname) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("nombre", name);
		objectNode.put("tipo", surname);
	 
	return objectNode;
}
	
}
