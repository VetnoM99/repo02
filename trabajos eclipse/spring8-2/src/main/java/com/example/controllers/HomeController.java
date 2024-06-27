package com.example.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
public class HomeController {
	
	@GetMapping("/disco")
	public String getMethodName(@RequestParam(name = "valor",required = false) Integer valor) {
		String msg;
		if( valor == null) {
			msg = " no has intruducido nada!!!";
		}else {
			if (valor >=18) {
				msg= " eres mayor de edad Bienvenid@";
			}else {
				msg= " no puedes entrar Tronc@";
			}
	}
		return msg;
	}
@ResponseBody
	@GetMapping("/moneda")
	public ResponseEntity<String> getGResponseEntityWResponseEntity(){
	final HttpHeaders httpHeaders = new HttpHeaders();
	httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		String moneda = Random2(); 
	
		if (moneda.toString() == "cara") {
			return new ResponseEntity<String>("{\"Moneda \" :"+ moneda+ " has ganado}", httpHeaders, HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("{\"Moneda \" :"+ moneda+ " has perdido}", httpHeaders, HttpStatus.OK);
		}
		
	}
//	
//	public ObjectNode index(String moneda) {
//		ObjectMapper mapper = new ObjectMapper();
//		ObjectNode objectNode = mapper.createObjectNode();
//		objectNode.put("moneda", moneda);
//		 return objectNode;
//	}
	public String Random2() {
		int a = (int) Math.floor(Math.random()*2);
		String b;
		if (a==1) {
			b = "cara";}
		else {
			b= "cruz";}
		return b;
	}
}
