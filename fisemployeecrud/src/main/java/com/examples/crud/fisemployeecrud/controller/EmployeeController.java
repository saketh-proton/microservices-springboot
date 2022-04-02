package com.examples.crud.fisemployeecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.crud.fisemployeecrud.model.Fisemployee;
import com.examples.crud.fisemployeecrud.service.FisemployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	FisemployeeService service;
	
	
	@GetMapping("/all")
	public List<Fisemployee> showAllEmps(){
		return service.getAllEmployees();
	}

}
