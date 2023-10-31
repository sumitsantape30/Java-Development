package com.sts;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller,"+"service,"+"dto,"+"repository,"+"models")
public class DemoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiApplication.class, args);
		 
		/*1. 
		 * Lombok Annotation (improve productivity)
		 * Request Validations
		 * 
		 * Lombok Annotations
		 * There are lot of classes that requires the use of setters and getters so this adds lot of code and functions in our project.
		 * we can avoid this by using lombok dependency which will automatically generate setters and getters for us.
		 * so add the dependency of lombok in pom.xml
		 * 
		 * 
		 <dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
		 </dependency>
		
		* open address.java
		
		 */
		
	}

}
