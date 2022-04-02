package com.example.springboot.springBootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class2")
public class HomeController {
	
	@GetMapping("/{name}/{city}")
	public String test(@PathVariable("name") String name, @PathVariable("city") String city) {
		return "Hi, "+name+" you are from "+city;
	}
}
