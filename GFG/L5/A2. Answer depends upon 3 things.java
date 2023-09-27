package Codes;

import java.util.*;
import java.io.*;


public class Main  {
	
	// Q. Given an integer array, you have to find the first odd number.
	public static void firstOdd() {

		int arr[] = { 2, 12, 4, 59, 7, 8, 9 };

		for (int i = 0; i < arr.length; i++) {

			//2. 
			System.out.println("i = " + arr[i] + ", Current Thread- " + Thread.currentThread());
			if (arr[i] % 2 == 1) {
				System.out.println( arr[i]);
				return;
			}
		}
	}
	
	//3.
//	        i = 2, Current Thread- Thread[main,5,main]
//			i = 12, Current Thread- Thread[main,5,main]
//			i = 4, Current Thread- Thread[main,5,main]
//			i = 59, Current Thread- Thread[main,5,main]
//			59
	//Here all the iterations and running in main thread.
	
	public static void firstOddStream() {
		
		int arr[] = { 2, 12, 4, 59, 7, 8, 9 };

		Integer ans= Arrays.stream(arr)
						  .parallel() //6. this is parallel stream. you can write .sequential() to but by default its sequential only
						  .filter(x -> {
							  System.out.println("Inside filter block: "+ x +", thread = "+ Thread.currentThread().getName());
							  return x % 2 == 1;
							  })
						  .findFirst()
						  .getAsInt();
		
		System.out.println(ans);
	}
	//7.
//	Inside filter block: 7, thread = main
//			Inside filter block: 59, thread = main
//			Inside filter block: 12, thread = ForkJoinPool.commonPool-worker-1
//			Inside filter block: 4, thread = ForkJoinPool.commonPool-worker-1
//			Inside filter block: 2, thread = main
//			59
//Its running randomly coz its parallel. and parallel is faster than sequential
	
	//8. print number( to understand threads)
	public static void print() {
		int arr[]= {1,2,3,4,5};
		
		Arrays.stream(arr)
		.parallel()
		.filter(x ->{
			System.out.println("Inside Filter x - "+x);
			return x >0;
		})
		.forEach(x -> System.out.println("Inside forEach X : "+x+" , thread = "+Thread.currentThread().getName()));
	}
	
	//11. If i use set data structure
	public static int getFirstOddUsingSet() {
		
		Set<Integer> set= new HashSet<>();
		//1, 12, 4, 50, 62, 7, 8, 9, 11, 13, 15, 19, 21
		set.add(1);
		set.add(12);
		set.add(4);
		set.add(50);
		set.add(62);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(11);
		set.add(13);
		set.add(15);
		set.add(19);
		set.add(21);
		
		return set.stream()
				.parallel()
				.filter(x -> x % 2 == 1)
				.findFirst().get();
	} //but if you have used list, it would have given you 1 as answer.
	
	
	public static void main(String[] args) {
		
		//1. Thread: CPU ke konse part mai humara code run horha yeh btata hai
		
		
		firstOdd();
		firstOddStream();
		
		//4. 
		//There are two types of Stream
		//1. Sequential Stream- By default, runs in a single thread
		//2. Paraller Stream- Runs in multiple thread at any given instance of time
		
		//5. When we create a stream it create sequential stream by default. if we have to create parallel stream we need to mention that
		
		//9.
		print();
		
		//10. when you are using streams, your answer depends upon 3 things
		//a. Type of Stream
		//b. Type of Dataset- Data Structure
		//c. Type of Operation
		
		//eg. (1,2,3,4,5) if this is in set (unordered) and i'm asked to find first odd number.
		//if i use sequential stream it can give me any answer coz elements are in unorder sequence in map
		// if i use parallel it can give me random answer too. but agar yahi data list mai hota aur sequential stream use ki to hume expected answer milega
		//how dependent on operation - if i do findFirst() in squential it'll give me first odd numbers.
		//if i do findAny() in squential it'll also give me first odd num. if i do findFirst() in sequential it'll give me 59 as answer all the time. but if you use findAny() you'll get different different answers.
		
		//12.
		System.out.println(getFirstOddUsingSet());
		//so this is how you result depends upon the type of DS you use.
	}
}


