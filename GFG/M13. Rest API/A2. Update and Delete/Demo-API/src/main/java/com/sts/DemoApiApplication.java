package com.sts;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller,"+"service,"+"dto,"+"repository,"+"models")
public class DemoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiApplication.class, args);
		 
		/*Put and Patch method
		 * 
		 * Put: you can use it when you want to get entire data from the UI/client and you'll save it as it is.
		 * 
		 * PUT: The PUT method is used to update or replace the entire resource at a specific URI. When you make a PUT request, 
		 * you are essentially providing a complete representation of the resource that should replace the existing resource at 
		 * the specified URI.
		 * 
		 * Patch: The PATCH method is used to apply partial modifications to a resource. When you make a PATCH request, you are 
		 * sending a set of instructions on how the resource should be updated, rather than providing a complete replacement. 
		 * It is often used for making incremental changes to a resource.
		 * 
		 * open EmployeeController
		 * 
		 */
		
	}

}
