Final keyword can be used on 3 places

1. Variable - can be initialised only in the constructor or during declaration.
2. Functions- final functions cant be overidden.
3. Classes- final classes cant be inherited.
(Integer, String, Double etc all wrapper classes are defined final so that no developer can inherit them and create a new data structure)

Static variable can be initialized inside static block
you can define static variable inside non static functions but non static variable cant be defined in static functions.
1. Class Level initialisation 2. inside static block 3. inside method 4. in an interface

Where can we define final static variable? At the Class Level,Inside an Interface

Code:
package Codes;

public class Main  {
	
	private final int count;
	public static int var;
	public final static int num= 30;
	
	static {
		System.out.println("Static Block");
		var= 30;		
	}
	
	Main(){
		System.out.println("Contructor Block");
		count= 3;
		var= 30;
	}
	
	public static void main(String[] args) {

		System.out.println("Main Block");
		//static block pehle run hota hai then main block run hota hai in any class		
		
		Main obj = new Main(); //contructor block will be called only when you create an object.
	}

}



