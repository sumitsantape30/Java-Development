package com.sts;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ch.qos.logback.classic.Logger;

@RestController
public class SampleController {
	
	//1. Function level annotations for creating bean
	//2. you are not able to use @Component annotation (to create bean) over the class still you can create an bean using @Bean annotation by defining that class as @Configuration

	//4. 
	@Autowired
	demoConfig democonfig; //this autowiring will happen only if democonfig is bean, but currently its not acting like a bean, so there are 2 options, you can use @Component or @Configuration, @Configuration is also being inherited from @Component 
	//autowiring always happens on the object type, demoConfig is an object type. you can directly autowire the RestTemplate function as well.
	//@Autowired
	//RestTemplate restTemplate; : direct function pe bhi autowire kr skte hai
	
	org.slf4j.Logger logger=  LoggerFactory.getLogger(SampleController.class);
	
//  @Autowired
////@Qualifier("template") // use this only when there are more than 1 bean of type restTemplate
//RestTemplate restTemplate;

	
	@GetMapping("/test")
	public String sayHello() {
		RestTemplate restTemplate = democonfig.getTemplate();
		this.logger.info("Rest Template "+restTemplate);
		return "Hello World"; 
	}
	
	//5. why there are lot of configurations meanwhile most of them inherit from @Component.
	//Configuration, Controller, service inherit from @Component. and RestController from inheriting from @Controller. why there is such hierarchy.
	//their work isnt just object creation, if it was just about object creation then @Component would have been enough.
}
