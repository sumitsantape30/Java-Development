package com.sts;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Indexed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ch.qos.logback.classic.Logger;

@RestController
public class DemoController2 {
	
	 private org.slf4j.Logger logger = LoggerFactory.getLogger(DemoController2.class);


	    @Autowired
	    RestTemplate restTemplate;

	    @GetMapping("/test2")
	    @Scope("prototype")
	    public String sayHello(){
	        this.logger.info("test2, restTemplate - {}", restTemplate);
	        return "Hello World2!!";
	    }
	    
	    /*
	     * when you run this it'll create a shared instance it wont create two separate objects for SampleController and DemoController2.
	     * but when you annotate it with @Scope("prototype") it will create two different objects for SamppleController and DemoController2.
	     *prototype is the scope where an object is created wherever it is required.
	     */
	    
	    //you can set independent configurations for a object
	    
//	    DemoController2(){
//      init();
//  }

//  public void init(){
//      restTemplate // define here, you define various thing for this object here, configure your object according to you needs
//  }
	    
	    /*if there are multiple clients(means classes using this dependency) aur unkki requirement alag hai to hum uss object ko requirement ki hisab se configure kr skte hai, prototype se hi aalg object bana.
	     * Scope can also be defined at class level as well. open DemoService
	     * 
	     * when you do ctrl+T on any annotation it opens parent file which has following 3 annotations.
	     * @Target(ElementType.TYPE) //current annotation is type pe use kr skte eg. @Scope mai ctrl+T karoge to usme Target ke type method hai means Scope annotation ko method pe use kr skte ho.
		   @Retention(RetentionPolicy.RUNTIME) //it means how long do we need to retain a particular annotation before we discard. ctrl +T on RetentionPolicy: Source: compiler will read and discard it. Class means compiler will not discard it, it'll be part of the bytecode but when this bytecode is run inside jvm then that annotation will be discarded. and Runtime means this annotation will never be discarded. 
            //All the annotations which are related to springboot as defined as Runtime(RetentionPolicy.RUNTIME)  
           @Documented //it is related to davadoc documentation, this annotation will have documentation is javadoc
           @Indexed
	     * 
	     *  */

}
