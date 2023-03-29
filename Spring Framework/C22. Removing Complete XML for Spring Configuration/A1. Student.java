package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component //1. yeh container object bana dega
//client mai context2 pura run hone ke bad come here again
//hum chahte hai ki without mentioning @Component ioc container ko pta chale ki muje Student class ka object banana hai
//ab javaConfig mai ek method banayenge
public class Student {
	//pehle study method banao uska kam karo then end mai samosa banao
	//iss class mai ek dependency leke dekhenge
	private Samosa samosa;

	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public void study() {
		this.samosa.display();//yeh method samosa banane ke bad call krna
		System.out.println("Student is reading book");
	}
	
	
	

}
