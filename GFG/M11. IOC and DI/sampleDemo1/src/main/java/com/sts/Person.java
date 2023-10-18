package com.sts;

import java.util.Random;

import org.springframework.stereotype.Component;

//B
@Component //mark it @Component then only spring will be able to create an object
public class Person {
	
	private int id;
	
	private String name;
	
	private int age;
	
	//11. we'll create object of person in SampleController and also we'll try to inject the object(created by springboot) of Person in SampleController 
	public Integer getRandomInteger() {
		return 10;
		
	}
	
	//17. as soon as you add the parameterized constructor it hides the default constructor. 
	public Person(String name, int age) {
		this.age = age;
		this.name= name;
		this.id= new Random().nextInt(100);
	}//my application wont run coz we have not passed the parameter it would need parameters when it'll call the constructor. So i'll add the default constructor

	public Person() {
		
	}
	//but what if we want to make run this parameterized thing anyways. open DBConnection.java
	
}
