package com.example.springboot.springBootDemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class1")
public class TestController {
	
	
	@GetMapping
	public String test1() {
		return "class1 - Response from get method";
	}
	
	@GetMapping("/test2")
	public ResponseEntity<String> test2() {
		
		return new ResponseEntity<String>("Respone is got from response entity", HttpStatus.OK);
	}
	
	@PostMapping
	public String postMethod() {
		return "class1 - Response from post method";
	}
	@PutMapping
	public String putMethod() {
		return "class1- Response from put method";
	}
	@DeleteMapping
	public String deleteMethod() {
		return "class1 - Response from delete method";
	}

}