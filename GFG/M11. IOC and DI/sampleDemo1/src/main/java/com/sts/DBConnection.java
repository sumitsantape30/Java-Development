package com.sts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//18.
@Component
public class DBConnection {
	
	private String jdbcurl; //url in a format which is used to connect to database from java application
	//jdbc:mysql://localhost::3306/dbName
	
	private String username;
	private String password;
	
    private Logger logger = LoggerFactory.getLogger(DBConnection.class);
	
	DBConnection(@Value("${jdbc.url}") String jdbcurl,
			     @Value("${username}")String username, 
			     @Value("${password}") String password){ //yeh database ki woh chize hai jo kabhi badal nhi skti like username, password
		this.jdbcurl = jdbcurl;
		this.username = username;
		this.password = password;
	}//inki values application.properties mai set karo
	
	//20. i need the values of these parameters here from application.properties so we'll use @Value annotation
	//now it'll run, previously spring doesnt know what values to add
	
	//suppose this DBConnection need person object, if person class isnt annotated with @Component it'll fail to identify whats component.
	DBConnection(Person person){ //so you need to define Person class as Bean by using @Component
		
	}//why we didnt mention this parameter person as @Autowired?
	/*
	 * In case of constructors there's some kind of evident injection. for eg if you have one constructor then person you are getting here needs to be beam.
	 * Spring will try to search it in IOC container. This is about only one constructor.
	 * 
	 * The problem comes when there are two constructors, spring fails to understand which constructor to call
	 */
	@Autowired
	DBConnection(Person person, @Value("${jdbc.url}") String jdbcurl){
		this.logger.info("Inside DBConnection");
	}
	//it'll throw an error, so whichever constructor you want to run put @Autowired on top of it.
     //thats why @Autowired on constructor is not mandatory , its required only when there's conflict.
	//if i initialised any  @Autowired person variable even then it'll be still confused which contructor to call.
	
	//
}
