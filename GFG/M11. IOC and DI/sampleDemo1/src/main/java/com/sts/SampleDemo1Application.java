package com.sts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //5. @SpringBootApplication is inheriting from @Configuration and Configuration is inheriting from @Component. (ctrl+T krke dekho). so the object of this class will be created
public class SampleDemo1Application {
	
	private static Logger logger = LoggerFactory.getLogger(SampleDemo1Application.class);

	
	public static void main(String[] args) {
		SpringApplication.run(SampleDemo1Application.class, args);
		System.out.println("Here");
		logger.error("Error log");
		logger.warn("Warn log");
		logger.info("Info log"); // ---here ---
		logger.debug("Debug log");
		logger.trace("Trace log");
		
		/*Inversion of Control: means instead of you doing the work someone else will do the work on behalf of you
		 * i have class A and i want to use the object of class A in class B and C, so I wont create the object of A again and again springboot will do it for me. Springboot will create the object once and use it everywhere that's inversion of control.
		 * Class A object will be singleton object here. Spring manages the object lifecycle
		 * 
		 */
		
		/*6. when you run this app, you'll se two sentences in console 
		 * Creating shared instance of singleton bean 'SampleDemo1Application'
		 * Creating shared instance of singleton bean 'SampleController'
		 * Spring has created an object of these two classes because they are annotated with @Componenent directly or indirectly
		 * It meant it has created an object named 'SampleController' which can be shared across other classes.
		 * 
		 * Shared Instance: It means it is creating an object which can be shared across multiple classes.
		 * Singleton : Singleton means only object will be created
		 * Spring Bean: Object created by spring, not created by users manually.
		 * These objects are create even before starting you application. (check console)
		 * 
		 * This is inversion of control
		 * 
		 * Person p = new Person():we creating object manually, this is not ioc. difference in both is object created by spring is singleton object, it wont create multiple times
		 */
		
		/*7. the object has been created but how do we use it? whats the point of creating an object if we are not able to use it?
		 * Dependency Injection: It means injecting a dependency(object) which is already created.
		 * Injecting an object in another class which has already been created. injecting means using an object of another class.
		 * When the object is created it needs to be stored in some place then only i'll be able to inject it, so its stored in IOC Container.
		 * This container is used to store all the beans means to store all the objects created by spring and not an object created by you. the object created by you is not stored here.
		 * These objects are also stored in an container in memory(RAM), and these are referenced by springboot.
		 * This is implemented by annotation @Autowired
		 * IOC creates an object by calling an contructor, if you dont create default contructor yourself, spring will create it automatically. open SampleController.java
		 */
		
	} 

}
