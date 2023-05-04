package com.api.book.bootrestbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.api.book.helper") //helper same package mai or subpackage mai hona isliye hum yaha mention krhe
public class BootrestbookApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootrestbookApplication.class, args);
		System.out.println("started");
	}
} 
