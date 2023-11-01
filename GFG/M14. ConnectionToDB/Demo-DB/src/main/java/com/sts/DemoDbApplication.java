package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller,"+"service,"+"dto,"+"repository,"+"models")
public class DemoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDbApplication.class, args);
		
		/*
		 * I'll do my database connection from my repository only
		 * since its bean is automatically created on application startup
		 * open EmployeeRepository.java
		 */
	}

}
