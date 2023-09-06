package Codes;

public class Main {
	
	
	public static void main(String[] args) {

		//Difference between abstract class and an interface
		//abstract and interface seem same after java 8 as both can initialize some function and can also implement it but only difference is inheritance
		//abstract class can extend only one class at a time
		//if your normal is extending one class then you can implement a interface
		//eg: public class IndianCalculator extends ArrayList implements Calculator; 
		
		//Key Difference
		//Abstract Classes: Java supports single inheritance, which means a class can extend only one abstract class. 
		//This can lead to a limitation when trying to inherit behavior from multiple sources.
		
		//Interfaces: Java supports multiple inheritance through interfaces. 
		//A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.
		
		//you can create an object of interface as well as abstract but can call function which are defined in those interface and abstract class also assuming those functions are overidden
		Calculator c1= new IndCalculator();
		
		OneInterface f1= new oneInterfaceImpl();
		
		//not possible coz unme not implemented functions hai
		//Calculator c2= new Calculator();
		//OneInterface f2= new OneInterface();
		
	}

}
