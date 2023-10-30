package com.sts;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller,"+"service,"+"dto,"+"repository,"+"models")
public class DemoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiApplication.class, args);
		

		/*1. CRUD API
		 * 
		 * 1. Create: There must be some functionality which adds new employees to the directory.
		 * 2. Read: A function via which user gets the information about the employee present in the directory. will give you employee id and ask employee object.
		 * 3. Update: functionality to update the employees data in the library. eg, address of an employee is changed.
		 * 4. Delete: To delete the data from the directory
		 * 
		 * We'll build it using memory and not some database like mysql. 
		 * Also think how our model should look like, what things do i need to store to create an employee.
		 * We'll create employee class, basically we'll be storing the objects of this employee class.
		 * 
		 * You should write your code in MVC Architecture
		 * Controller -> Services -> Repository -> (data layer/model) repository should communicate with the data layer.
		 */
		
		//25. now logging level dubug karo to see some extra logs
		/*
		 * if you check the log spring will create an object of controller, service and repo. Spring boot doesnt create an object of models.
		 * 
		 * Debug: mark the check point before the variable aur fir debug mode mai run karo, you can see the values of variable from window -> show view -> variables
		 * abhi hum hashmap mai means memory mai store krhee, to application stop honeke bad post kiya hua data clear hojata hai.
		 */
	}

}
