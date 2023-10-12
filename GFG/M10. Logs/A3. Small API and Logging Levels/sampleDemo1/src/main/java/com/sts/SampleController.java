package com.sts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //this is making this api visible to the embedded server so that it can route to an appropriate function
public class SampleController {
	//This is an simple file which will become an entry point for any request coming on my server.
	
	//define some APIs that will do certain task.
	//basically the landing point of all requests from various clients.
	
	//every api has 
	//base URL : 127.0.0.1(localhost):900(port)
	//api path: sample/ , /hello
	//input
	
	//what kind of APIS we can create?
	//REST API / Restful Services & SOAP API
	// REST - representational state transfer : These type of APIs work on a concept that every request which is coming to the server is having no state, is basically stateless.
     // rest apis works on http protocol: hyper text tranfer protocol used for communication over client and server.
	
	//Rest Conventions: you should not use upper case characters in your API path.
	//: better to use hyphens instead of underscores
	//there are different request(http) methods you can have: 
	//get: to retrieve data from server
	//post: to add data in server
	//delete: to delete some info from server
	//put: update info on server
	//patch: update partially
	
	//put vs patch
	/* (open Person.java)
	 * Data = {id: 1, name: "ABC", age: 20} this is my current data
	 * i'll build a patch api that'll partially update the data 
	 * 
	 * patch: /person/{personId}/
	 * data: {age: 10} (i want to change only age so i'll just pass the age)
	 * result = {id: 1, name: "ABC", age: 10}
	 * sql: update person set a.age= 10 where id= 1; //we pass the data which is to be changed
	 * 
	 * put: /person/{personId}
	 * data = {age: 10, name:"ABC", age:10} //I want to change only data but i'll the complete data in put
	 * result = {age: 10, name: "ABC", age: 10 }
	 * sql: update person set p.age = 10, p.name= "ABC" where id = 1; //we pass the complete data
	 *  
	 *  HTTP Methods
	 *  GET, PATCH, PUT, POST, DELETE
	 
	 */
	
	//we'll write a simple API that'll say hello
	
	@GetMapping("/hello") //these annotations help you mark a particular function as get/put/patch. and we pass a path inside it
	public String sayHello(@RequestParam("n") String name) { // @RequestParam these annotation is responsible for taking any parameter, this is taking name so named it "n"
		//you can give the name to the parameter too, this parameter which is coming from frontent or client you can use it by its name
		
		return "Hello " + name;
	}
	
	//to run this api in browser
	//localhost:9000/hello?meSumit
	// ? is used to pass the parameter
	// URL: http://localhost:8080/hello?n=meSumit
	
	//it'll give status=404 coz this api is not visible to the outside world, the request is landing on the server but server is not able to route the request to this function
	//so that you need to add @RestController annotation at the top of the class
	
	
}
