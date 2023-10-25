package com.sts;

import org.springframework.web.client.RestTemplate;

import ch.qos.logback.classic.Logger;

import org.slf4j.LoggerFactory;
import org.slf4j.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //6. now we'll run this app in logging.root.level =deubg
public class demoConfig {
	
	//3.
	private org.slf4j.Logger logger = LoggerFactory.getLogger(demoConfig.class);
	
	@Bean //this function is invoked on application startup, bean is addded to the top of function which is returing some object.
	public RestTemplate getTemplate() {
		RestTemplate restemplate= new RestTemplate();
		logger.info("Inside getTemplate Object: "+ restemplate);
		return new RestTemplate();
	}//now we'll call this function in SampleController
	
	/*
	 * If you mark a bean definition with the @Scope("prototype") annotation in Spring, it means that Spring will create a 
	 * new instance of the bean every time it is requested. This is in contrast to the default scope, which is singleton, 
	 * where a single instance of the bean is created and shared across the application.
	 * So dont use both bean and scope just for creating an object.
	 * And writing @Scope("singleton") is as good as skipping writing @Scope coz it does the same job only of creating single object. 
	 * 
	 */
	
	/*8. we can also name this bean as @Bean("Template")
	 * tabbhi autowiring mai koi problem nhi hogi kyuki autowiring object type se hoti hai
	 * RestTemplate restTemplate, isme variable ko nam kuch bhi de skte ho
	 */

}
