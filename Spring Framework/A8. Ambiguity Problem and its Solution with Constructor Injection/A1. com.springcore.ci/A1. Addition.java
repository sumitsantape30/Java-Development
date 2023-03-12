package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor: int, int");
	}
	
	public Addition( double a, double b) {
		this.a =(int) a;
		this.b =(int) b;
		System.out.println("Constructor: double, double");
	}
	
	//pehle upar wala run karo then yeh method add karna, ab woh yeh string wala constructor run karayega
	public Addition( String a, String b) {
		this.a = Integer.parseInt(b);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor: String, String");
	}
	
	public void doSum() {
		System.out.println("a: "+this.a+" b: "+this.b);
		System.out.println("Sum:"+(this.a+this.b));
	}

}
