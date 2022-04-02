package com.example.customerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages="com.example.customerService")
//@ComponentScan(basePackages="com.example.customerService, com.example.customerService.controller, com.example.customerService.model, com.example.customerService.repo, com.example.customerService.service, com.example.customerService")
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	
	//@Bean
	//public RestTemplate getTemplate() {
		//return new RestTemplate();
	//}

}
