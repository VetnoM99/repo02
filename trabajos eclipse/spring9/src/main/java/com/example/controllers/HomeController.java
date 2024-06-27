package com.example.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {
	@GetMapping({"/","{id}/fac"})
	public ResponseEntity<String> index(@PathVariable (name = "id")String id) {
	
		 return getResponseEntitywResponseEntity(id);
	}

	
public ResponseEntity<String> getResponseEntitywResponseEntity( String id){
	final HttpHeaders http = new HttpHeaders();
	http.setContentType(MediaType.APPLICATION_JSON);
	ResponseEntity<String> msg;
	if (id.matches("\\d+")) {
		int valor = Integer.parseInt(id);
		if (valor %2 ==0) {
			msg=new ResponseEntity<String>("{\"numero\" : "+ id +" el numero es par}", http, HttpStatus.OK);
		}else {
			msg=new ResponseEntity<String>("{\"numero\" : "+ id +" el numero es inpar}", http, HttpStatus.OK);
		}

	}else {
		msg=new ResponseEntity<String>("El endpoint tiene que ser numerico", http, HttpStatus.CONFLICT);

	
}
	return msg;	
}
}

