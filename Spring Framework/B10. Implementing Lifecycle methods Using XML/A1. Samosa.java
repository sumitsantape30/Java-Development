package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}
	
	//sab sahi hai upar ka ab hum bananyenge apni methods
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	//inn methods ko hume nhi chalana, hume bas itna btana hai ki yeh method initialisation pe chalega aur yeh method destroy pe chalega, yeh lifecycle method hai to spring khudse call krlega
	//open xml file
	
}
