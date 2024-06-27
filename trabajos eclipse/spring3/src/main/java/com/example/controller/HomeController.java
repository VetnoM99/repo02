package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	@ResponseStatus(code = HttpStatus.BANDWIDTH_LIMIT_EXCEEDED)
    @GetMapping("/")
    public String getTeapotResponse() {
        return "I'm a teapot!";
    }
}