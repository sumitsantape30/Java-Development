package Codes;

@FunctionalInterface
public interface FI {
	
	int add(int a, int b);
	
	//int sub(int a, int b);
	//1. now i have two abstract functions, and now if i declare it as @FuntionalInterface it will show me a error
    //2. agar yeh interface kisi class ko extend krta hai and that class has a abstract method to bhi it wont be called a @FunctionalInterface.
	//3. @FunctionalInterface this annotation is only to show that this interface wont have more than one abstract methods
        //you can add that annotation or not its totally fine.
	//this annotation doesnt make your class functional interface, it is just for giving warning.
	
}


package Codes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.*;

public class Main  {
	
	public static void main(String[] args) {

		//interface is not but the contract, you get contract to implement some functions
		//on java 8 onwards you can implement function as default
		
		//functional interfaces : interfaces which have only one non-overriding abstract method of their own are known as functional interfaces.
		// that interface can have method which is being overidden from object.java class. Eg. in comparator class, there are 2 abstract methods equals and compare. But equals method is being overidden from object.java class that's why Comparator is functional interface means it has only one abstract method.
		
		//open FI.java
			
	}
}



