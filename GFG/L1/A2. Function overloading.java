package Codes;

public class Main {
	
	public static void add( int a, int b) {
		System.out.println(a+b);
	}
	
	public static void add(String a, String b) {
		System.out.print(a+b); 
	}
	//This is function overloading
	
	public static int subs( int a, int b) {
		return a-b;
	}
	
	public static void subs( int a, int b) {
		
	}// will show error
	//this is not function overloading. arguments should have different datatypes.
	// it will cause an ambiguity. main method se functon ko call kiya to usko nhi smjhega which function to call
    // so this an compilation error
	//if you change the request(arguments) then only it'll be function overloading, changing response wont make it function overloading
	
	//return type has nothing to do with function overloading. function overloading is because of number of arguments or the type of arguments
	
	public static void main(String[] args) {

		subs(2,5);
		
	}

}
