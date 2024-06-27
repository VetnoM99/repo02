package com.example.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping ("/")
public class HomeControler {

		@GetMapping("/")
		public String Index() {
			return "index.html";
		}
		
		@GetMapping("/contacto")
		public String Contacto() {
			return "contacto/index.html";
		}
	
		@GetMapping("/tamagochi")
		public String Tamagochi () {
			return "tamagochi/index.html";
		}
		
		
		
	
	}

