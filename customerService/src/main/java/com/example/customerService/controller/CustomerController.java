package com.example.customerService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerService.model.Customers;
import com.example.customerService.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Customers>> showAllCustomers(){
		return new ResponseEntity(service.getAllCustomers(), HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Customers> addCustomer(@RequestBody Customers customer){
		return new ResponseEntity(service.insertCustomer(customer), HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer(@RequestBody Customers customer){
		return new ResponseEntity(service.deleteCustomer(customer), HttpStatus.OK);
	}
	
	/*
	@GetMapping("/search/cname/{cname}")
	public ResponseEntity<List<Customers>> getAllCustomersByCname(@PathVariable("cname") String cname){
		return new ResponseEntity(service.searchCustomersByCname(cname),HttpStatus.OK);
	}
	@GetMapping("/search/item/{item}")
	public ResponseEntity<List<Customers>> getAllCustomersByItem(@PathVariable("item") String item){
		return new ResponseEntity(service.searchCnamesByItem(item), HttpStatus.OK);
	}
	*/
}
