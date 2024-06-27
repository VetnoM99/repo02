package com.example.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

//	@RequestMapping("/")
//	public TextToJSON test() {
//	return new TextToJSON("index.html");
//}

//@RequestMapping(path="/", produces="application/json")
//public String test2() {
//	return "{\"page\":\"index.html\"}";
//}

//@RequestMapping("/")
//public ObjectNode index() {
//	ObjectMapper mapper = new ObjectMapper();
//	ObjectNode objectNode = mapper.createObjectNode();
//	objectNode.put("key", "value");
//	objectNode.put("foo", "bar");
//	objectNode.put("number", 42);
//	return objectNode;
//}

//	@RequestMapping("/")
//	public ResponseEntity<String> getGreetingWithResponseEntity() {
//		final HttpHeaders httpHeaders = new HttpHeaders();
////		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//		return new ResponseEntity<String>("{\"test\": \"hello with Response Entity\"}",httpHeaders, HttpStatus.OK);
//	}

}
