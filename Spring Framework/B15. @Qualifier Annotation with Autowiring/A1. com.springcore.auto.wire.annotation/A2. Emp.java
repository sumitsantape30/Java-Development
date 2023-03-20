package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("temp") //iss qualifier ke andar hum de skte hai kis bean ko inject krna chahte hai. name of the bean denge
	//The @Autowired and @Qualifier annotations are used to inject an instance of the Address class into the Emp class.
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}
	

}
