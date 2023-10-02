
package Codes;

import java.util.*;
import java.io.*;


public class Main  {
	
	public static int calculate(int arr[]) { //this is imperative programming
		int sum = 0;
		
		for( int i=0 ;i < arr.length; i++) {
			if( arr[i] % 2== 1) {
				sum += (arr[i]*arr[i]);
			}
		}
		return sum;
	}
	
	public static void calculateUsingStreams(int arr[]) {
		
		//Arrays.stream() is a function that converts the array into stream. IntStream if its integer array, longStream for long array
		Integer ans= Arrays.stream(arr)
				.boxed()
				.filter(x -> x%2 == 1)
				.map(i -> i*i)
				.reduce(0, Integer::sum); 
		//boxed function converts the IntStream into stream of integers
		//we were getting lots of numbers till map so we need to use reduce() 
		//we need to pass identity in reduce() function: just like we initiaise sum=0; before adding element to this sum that's identity. when you're multiplying you define with 1
		System.out.println(ans);
		//stream is basically converting your dataset into pipeline
		//reduce: reduce is a method available on collections in Java, such as Lists, that allows you to reduce the elements of the collection to a single result.
		//It takes a binary operator as its argument, which specifies how the elements should be combined.
	}
	
	public static void main(String[] args) {
		
		int arr[]= { 1,2,3,4,5,6,7,8,9};
		
		//1. find the sum of squares of even number
		System.out.println(calculate(arr));
		
		//using stream it'll be declarative programming
		calculateUsingStreams(arr);
		
		//Rules to follow while coding
		//1. correctnoess 2. Optimization (performance, memory) 3. Enhance readability 4. 
		
	}

}


