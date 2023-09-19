package Codes;

public interface ParentInterface {
	
	default int substract(int a, int b) {
		return a-b;
	}

}

package Codes;

@FunctionalInterface
public interface FI extends ParentInterface {
	
	int add(int a, int b);
	
	//int sub(int a, int b);
}


package Codes;

import java.util.*;
import java.io.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main  {
	
	public static void main(String[] args) {

		FI obj1= new FI() {

			@Override
			public int add(int a, int b) {
				return a+b;
			}
			
		};
		//we are writing lot of code above, we can avoid that using lamba expression
		
		
		//lambda says: instead of creating new object you pass the argument in the parenthesis and tell me what to do by defining the arrow function
		
		FI obj2 = (a, b) -> a + b; //we have used the lambda function to not define the anonymous inner class.
		//in order to create object of that class add on that object i would need to implement the add method first
		 
		//we use lambda when we are creating an object for an interface, we do not use lambda for normal classes
		//while using lambda i'm not defining any function name, still its getting map to add function only. that's fuction of functional interface that only one abstract method will be there.
		// sirf ek hi abstract method hai uss functional interface mai, aur hum iss object pe lambda expression use krhe means woh wahi ek abstract function ko hi map karega
		
		//this lambda function wont work if there is any other abstract method in the interface.lambda works for functional interface only.
		
		//now suppose FI is extending ParentInterface
		
		FI obj3 = (a, b) ->{ //you just have to tell what's going inside function and what's coming out of function
			return a+ b; 
		};
		
		System.out.println(obj3.add(1, 2)); 
		
		
		//there are some functional interfaces to explore
		// consumer, function, predicate, producer
		
		//consumer function interface: this interface accepts but not return something. Cosumer means youre consuming something without producing anything.

	}
	
	//1. consumer functional interface- isme accept yeh ek abstract method hai
	//Q1. toggle the string- lowercase to uppercase
    
	public static void toggle() {
		
		Consumer<String> consumer = new Consumer<String>() {
			
			@Override
			public void accept(String s) {
				String str= "";

				for( int i=0; i< s.length(); i++) {
					if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
						
						str += (char) (s.charAt(i) - ('a'- 'A'));
					}else {
						
						str += (char) (s.charAt(i) + ('a' - 'A'));
					}
				}
				
				System.out.println(str);
				
			}
			
		};
		
		consumer.accept("city");
		
	}
	
	//with lambda
	public static void toggleWithLambda() {
		
		
		Consumer<String> consumer = s ->{ //ek hi paremeter hai to without () bhi rakh skte ho or aise bhi (s) -> {}
			
			String str= "";

			for( int i=0; i< s.length(); i++) {
				if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					
					str += (char) (s.charAt(i) - ('a'- 'A'));
				}else {
					
					str += (char) (s.charAt(i) + ('a' - 'A'));
				}
			}
			
			System.out.println(str);
			
		};
		
		consumer.accept("city");

	}// this is more readable
	
	
	//Q.  given a numer string you have to return the square of a number
	public static void squareOfNum() {
		
		String numString ="84";
		
		//Function ek functional interface hai which has apply abstract method. Function<T, R> T is input datatype and R is output datatype
		Function<String, Double> function = (str) -> Math.pow(Integer.parseInt(str), 2); //numString variable already declared tha to first wahi use hi krskte so used str variable
		//isme humne Function interface ka object create kiye, woh ek functional interface tha to usme apply method hume implement krna tha to woh humna lambda expression se kiye
		
		System.out.println(function.apply(numString));//ab hume object mila to uspe humne apply method call kiya
		
		//direct result bhi return kr skte hai
		
		Function<String, Double> function2 = (str) -> {
			double result = Math.pow(Integer.parseInt(str), 2);
			return result;
		};
		
		System.out.println(function2);
		
	}

}

