package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.springframework.stereotype.Component;

@Component
public class Componente {
	@ResponseBody
	@GetMapping("/componente")
	public ObjectNode index() {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("nombre", "bulbasur");
		objectNode.put("tipo", "planta");
		objectNode.put("peso", 50);
	
	return objectNode;
	
}
}
