package com.springcore.auto.wire.annotation;

public class Emp {
	
	private Address address;
	//yahape address ka address lane keliye autowiring use karenge. donomai toString method banao

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
