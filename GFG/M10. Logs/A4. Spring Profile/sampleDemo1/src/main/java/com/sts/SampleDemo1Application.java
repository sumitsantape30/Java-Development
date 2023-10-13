package com.sts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleDemo1Application {
	
	private static Logger logger = LoggerFactory.getLogger(SampleDemo1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SampleDemo1Application.class, args);
		System.out.println("inside main");
		System.out.println("inside main2");
		
		logger.info("inside main");
		logger.info("inside main2");
		
		/*
		 * n summary, having multiple environments in the software development process is 
		 * a best practice that helps ensure the reliability, security, and quality of 
		 * software, minimizes risks, and facilitates collaboration among development and 
		 * operations teams. It's a fundamental aspect of modern software development and 
		 * deployment practices.
		 * 
		 * For this we create multiple application.properties files
		 * 
		 * Do we create new enviornment in spring boot by creating another application.properties file?
ChatGPT
In Spring Boot, creating a new environment or profile is typically done by creating a new properties or YAML file specifically for that profile.
 While the application.properties (or application.yml) file is the default configuration file for Spring Boot applications, you can create additional configuration files for different profiles.

Here's how you can do it:

Create a New Configuration File: Create a new properties or YAML file and name it following the convention application-{profile}.properties or application-{profile}.yml, 
where {profile} is the name of the profile you want to define. For example, if you want to create a "development" profile, you can create a file named application-development.properties or application-development.yml.

Define Profile-Specific Properties: In the new configuration file, define properties specific to that profile. These properties will override the values in the main 
application.properties or application.yml file when the application is running in the specified profile.

Example (application-development.properties):


# Database configuration for the development profile
spring.datasource.url=jdbc:mysql://localhost:3306/devdb
spring.datasource.username=devuser
spring.datasource.password=devpassword

Activate the Profile: To activate a specific profile, you can set the spring.profiles.active property in your application.properties or application.yml file. This property specifies which profile(s) should be active when the application starts. 
You can set it to the name of the profile you want to use.
Example (application.properties)

# Set the active profile to "development"
spring.profiles.active=development


Now create two application-{}.properties files and give them different port and logging level.
After creating it i want to run this application for different different environment.

Then you can the application from specific environment by adding env variable: spring.profiles.active= staging/production, use chatgpt to run
This is spring profile, you can create multiple profiles like this
	 */
		
	} 

}
