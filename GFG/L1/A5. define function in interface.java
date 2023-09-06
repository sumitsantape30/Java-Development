//after java 8 we can define the functions inside interface

package Codes;

public interface sampleInterface {
	
	public void add(int a, int b);
	
	int substract(int a, int b);
	
	//1.you can have default methods here
	default int multiply(int a, int b) {
		return a*b;
	}
	
	//2. you can't create objects of interface except with anonymous innner class :as soon as you try to create an object of interface it'll ask you to implement the methods

}


package Codes;

public class Main {
	
	
	public static void main(String[] args) {

		sampleInterface sampleInt = new sampleInterface() { //3. the content inside this double bracket is anonymous inner class

			@Override
			public void add(int a, int b) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int substract(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			//multiply is already defined in interface
			
		};// you cant create object of interface, when you try to create one you'll have to implement these abstract methods
		
		//4. if all the methods in interface are defined as default then i can create object like below, i'll have to define anonymous inner class even if its empty
		// sampleInterface si= new sampleInterface() {}; 
		
	}

}

//another way is just using our regular way of implementing interfaces
//you should use interface like a contract, forcing other class to implement for us.
//and interfaces can extend multiple classes

package Codes;

import java.util.List;

public interface sampleInterface extends Runnable, List {
	//now the class implementing sampleInterface will have to implement all the methods of sampleInterface, Runnable, List.
	//you're making compulsory for the class that is imlementing you(sampleInterface) to implement all the methods 
	
	public void add(int a, int b);
	
	int substract(int a, int b);
	
	default int multiply(int a, int b) {
		return a*b;
	}
}


