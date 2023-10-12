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
		
		//all these logs comes from slf4j library, we cant add our custom log in it. you cant add more levels to it coz its spring boot library
		logger.info("inside main");
		logger.info("inside main2");
		
		/*
		 * There are type of logging levels depending upon the severity
		 * 
		 * When you run your application you'll get the logs in output
		 * ERROR: will be most severe and less in number (when there is error)
		 * WARN: we get this when there is some kind of error which is less severe, code is going to an unexpected block
		 * INFO: logs which help you in debugging your application logic
		 * DEBUG: logs which help you in debugging your logic + spring boot's internal working
		 * TRACE: these will be least severe and present maximum in number (when you want to print even the tiniest of the things eg. heartbit of an embedded server)
		 * 
		 * The more severe will be present in less number
		 * the least severe will be present in max number
		 * 
		 * These are in the order from more severity to least severity
		 */
		
		logger.error("Error log");
		logger.warn("Warn log");
		logger.info("info log");
		logger.debug("debug log");
		logger.trace("trace log");
		
		//debug and trace logs are not sever that's why they wont be printed
		//logs are printed only if there severity if equal to or more than info log
		//we can change this condition as well
		//open application.properties
		//now it'll print till debug
		//by default logging.level.root value is info. you can change according to you
	   //you can use level according to you need to debug.
	} 

}
