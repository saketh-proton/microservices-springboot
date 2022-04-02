package com.examples.crud.fisemployeecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.examples.crud.fisemployeecrud")
public class FisemployeecrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisemployeecrudApplication.class, args);
	}

}
