package Codes;

import java.util.*;
import java.io.*;


public class Main  {
	
	// Q. Given an integer array, you have to find the first odd number.
	public static void firstOdd() {

		int arr[] = { 2, 12, 4, 59, 7, 8, 9 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 1) {
				System.out.println( arr[i]);
				return;
			}
		}

	}
	
	public static void firstOddStream() {
		
		int arr[] = { 2, 12, 4, 59, 7, 8, 9 };

		Integer ans= Arrays.stream(arr)
						  .filter(x -> x % 2 == 1)
						  .findFirst()
						  .getAsInt();
		
		System.out.println(ans);
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= { 1,2,3,4,5,6,7,8,9};
		
		Arrays.stream(arr)
		.map(x -> {
			System.out.println("Inside map x :"+x);
			return x*x;
		});
//		.forEach(p -> {
//			System.out.println("Inside ForEach: "+ p);
//		});
		
		//if we comment out the forEach part. it'll print nothing kyuki stream run hi nhi hui
		//a stream willl run only if it has a terminal function.
		
		//There are two types of function
		// intermediate (non- Teminal functions) and Terminal functions
		// terminate functions are ones that terminate the stream at that point of time
		//and map is not terminating function coz this function return a stream
		//so a function that doesnt return a stream is more or less terminating function
		//and functions ruturning stream are not terminating functions
		//we cannot add any other function after terminal function
		//forEach().map() -> This is not possible
		
		firstOdd();
		firstOddStream();
		
	}
}
