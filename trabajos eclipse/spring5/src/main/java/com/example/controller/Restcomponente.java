package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class Restcomponente {
		@GetMapping("/Rest")
		public ObjectNode index() {
			ObjectMapper mapper = new ObjectMapper();
			ObjectNode objectNode = mapper.createObjectNode();
			objectNode.put("nombre", "arboc");
			objectNode.put("tipo", "veneno");
			objectNode.put("peso", 500);
		
		return objectNode;
}
	}
