package com.sts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //2.this annotation is to make the class visible to the dispatcher servelet such that if any request comes it'll redirect to the particular function.
public class SampleController {
	
	//1. All the classes which have @Component either directly or indirectly annotation above the class, their object will be created by spring boot on application startup.
	//3. if you ctr+T on @RestController it have controller annotation and in controller annotation there's component.
	//4. RestController -> Controller -> Component (RestController is inheriting from controller and controller is inheriting from Component.
	//below function will be called only if the object of this class is created so @Component does it automatically
	
    private Logger logger = LoggerFactory.getLogger(SampleController.class);
    
    //13. I want to inject the object of Person here so we do that using @Autowired
    @Autowired //this tells spring not to create an object instead get an object from IOC Container. coz iska already spring ne object banaya hai aur woh IOC container mai hai
    Person person;// now print this person in below function
    //bean is not always an object, bean is a value which is stored in the container it can be a number or reference to an object.
    //@Autowired can only be used on top of object, for any abstract class or primitive datatype you should use @Value
    //autowired simply means pick the reference from IOC container and add it in the instance reference of the class.
    
    //15. 
    @Autowired
    Person person2; 
    
	//8. we are adding default contructor to see how it calls the contructor which creating an object. we'll also create an object manually in sayHello function and put a log.
	public SampleController() {
		this.logger.info("Inside SampleController constructor, object = {}", this); //this log will be printed two time, once when spring will be creating an object and second when we will be creating it in sayHello function.
	}
	
    @Value("${discount.percentage}") 
    private Long discountPercentage;

    @GetMapping("/hello")
    public String sayHello(@RequestParam("n") String name){ // starting point for you to think on ioc
       
    	//9.
    	SampleController sc = new SampleController();
        logger.info("newly created sample controller object is {}", sc);
        
        //12. 
        Person p= new Person();
        logger.info("Person class in SampleController "+ p);
    	
        //14
        logger.info("Injected person "+person);//the number of times you run this function the person object will be created only once.
        
        //16.
        logger.info("person2 "+person2);///person and person2 variable same hi value print karega coz IOC container mai sirf ekbar object banata hai, these two are just variable referring to that object in IOC container. (open person.java) 
        
        
        return "Hello " + name;
    }
    
    /*10. these both the objects will be different
     * Inside SampleController constructor, object = com.sts.SampleController@399f66b0 : created by springboot               
     * newly created sample controller object is com.sts.SampleController@399f66b0 : created by me
     * number of times i run this app, the object inside sayHello will be created that number of times with a different address everytime.
     * and spring will create its object only once
     * now open person.java
     * 
     * 
     */
	
}
