package com.springcore.ci;

public class Person {
	
	private String name;
	private int personId;
	private Certificate certi; //yeh object keliye badme try krna pehle upar ke 2 keliye karo
	
	//hum koi bhi getter setter nhi banayenge kyuki inki values hume setter getter se nhi set karni hume constructor use krke dalni hai
	
	public Person(String name, int personId, Certificate certi) { //yeh 3rd parameter badme liya pehle 2 hi parameter pe krke dekho then object parameter
		this.name=  name;
		this.personId = personId;
		this.certi = certi;// so ab basically yeh Person is dependent on certi object
	}

	@Override
	public String toString() {
		
		return this.name+" "+this.personId+"{ "+this.certi.name+" }";
	}
	
//	If you want to customize the string representation of the Person object when you print it 
//	using System.out.println(), you can override the toString() method in the Person class and return 
//			a custom string representation that you define.
	
	

}
