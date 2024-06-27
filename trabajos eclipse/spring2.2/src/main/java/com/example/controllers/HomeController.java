package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String getRandomPage() {
        int randomNumber = (int) Math.floor(Math.random()*2);

        if (randomNumber == 0) {
            return "success.html"; // Devuelve la vista success.html
        } else {
            return "notfound.html"; // Devuelve la vista notfound.html
        }
    }
}
