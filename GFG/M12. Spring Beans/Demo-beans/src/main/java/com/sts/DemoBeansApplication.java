package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBeansApplication.class, args);
	}
	
	/*7. After running app
	 * 
	 * These 4 beans will be automatically created
	 * DemoBeansApplication, demoConfig, SampleController, getTemplate.
	 * 
	 * SampleController is returning SampleController object type
	 * getTemplate is returning getTemplate object type.
	 * 
	 * when getTemplate is annotated with @Bean it will create the object only once, you can try by running it number of times, it'll print the same address again and again.
	 * but when you remove the @Bean annotation, it will print the different object eveytime you call it. spring created it only once coz it was annotated with @Bean.
	 */
	
}
