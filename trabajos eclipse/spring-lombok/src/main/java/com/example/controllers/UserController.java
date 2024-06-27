package com.example.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j 
@RequestMapping("/")
public class UserController {
	
	  @Autowired
	    private UserService userService;

	  @GetMapping("/getAll")
	    public ResponseEntity<List<Map<String, Object>>> getAllUsers() {
	        List<Map<String, Object>> users = userService.getAllUsers();
	        log.info("usuario entregado");
	        return ResponseEntity.status(HttpStatus.OK).body(users);
	    }

	    @GetMapping("/get/{id}")
	    public ResponseEntity<Map<String, Object>> getUserById(@PathVariable int id) {
	        Map<String, Object> user = userService.getUserById(id);
	        if (user != null) {
	            return ResponseEntity.status(HttpStatus.OK).body(user);
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	        }
}
}