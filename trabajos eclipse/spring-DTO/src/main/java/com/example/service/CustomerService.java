package com.example.service;


import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Customer;
import com.example.entities.CustomersDTO;
import com.example.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public List<CustomersDTO> findAllCustomers(){
		List<Customer> customers = customerRepository.findAll();
		List<CustomersDTO> customerDTOList = new ArrayList<>();
		ModelMapper mm = new ModelMapper();
		customers.forEach(customerElement -> {
			CustomersDTO customerDTO = mm.map(customerElement, CustomersDTO.class);
			customerDTOList.add(customerDTO);
		});
		return customerDTOList;
	}
}
