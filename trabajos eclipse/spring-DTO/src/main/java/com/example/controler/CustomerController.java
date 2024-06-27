package com.example.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.CustomersDTO;
import com.example.service.CustomerService;

import lombok.extern.java.Log;


@RestController
@Log
@RequestMapping(value="/")
public class CustomerController {
	@Autowired (required = false)
	CustomerService customerService;
	
	@RequestMapping(value ="/getAll")
	public List<CustomersDTO> getCustomers(){
	
		log.info("peticion a la base de datos customers GET");
		return customerService.findAllCustomers();
			
		}
		
	
			
	}
	


