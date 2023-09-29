package Codes;

import java.util.*;
import java.io.*;
import java.math.BigInteger;


public class Main  {
	
	
	public static void main(String[] args) {

		//practical use of thread
		
		//1. int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int arr[]= {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000};
		
		//2. if values are long you can store them in BigInteger
		
		//8. now we're calculating the time taken for all the values of an array
		long start= System.currentTimeMillis();
		
		for( int i=0; i< arr.length; i++) {
			calculate(arr[i]);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		//9. so a non threaded algorithm takes round 6-7 seconds to execute
		
		//10. this all is getting executed in main thread
		
		//How can we optimse it?
		/*
		 * Suppose my 10000 is computing in main thread. then I can also trigger a command to compute 2000 in another thread and so on. So these computations will be happening parallerly
		 * instead of having 1 computation you'll be having 8 computations in different different threads parallerly
		 * now see below FactUsingMT.java
		 *  */
	}
	
	//3. we'll calculate amount of time requires to run the below algorithm
	public static BigInteger calculate(int num) {
		
		BigInteger result = BigInteger.ONE;
		//4. long start= System.currentTimeMillis(); //epoch time (google epoch time convertor)
		
		System.out.println("Inside Calculate = "+Thread.currentThread());//11.
		for( int i=2; i<= num; i++) {
			result = result.multiply(BigInteger.valueOf(i)); //valueOf function converts this integer value to BigInteger
		}
		
		//5. long end = System.currentTimeMillis();
		//6. so we are calcuating epoch timing at start and end. That is the time spend to run this algorithm
		
		//7. System.out.println(end - start);
		
		return result;
	}
	
}


