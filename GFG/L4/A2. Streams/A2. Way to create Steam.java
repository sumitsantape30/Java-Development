package Codes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.*;

public class Main  {
	
	public static void main(String[] args) {

		
		//stream api sirf collections tak hi simit hi hai boht sari chizo pe use kr skte hai
		//collections/group of object pe bhi kr skte hai
		
		//stream mai boht sari methods hai jo stream object return krta hai, ctrl + T krke dekho static methods that returns stream as object

		//1. BLANK
			
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e -> {
			System.out.println(e);
		});
		
		//2. from array
		String string[]= {"Sumit", "Amit", "Nikhil"};
		//hum chahte hai iss array pe stream operation perform kare
		
		//agar chahte hai ki S letter wale name ko filter karado to filter lageke condition lagado.
		
		Stream<String> names= Stream.of(string);
		names.forEach(e ->{
			System.out.println(e);
		});
		
		//3. builder pattern
		Stream<Object> streamBuilder = Stream.builder().build();
		
		//4. 
		IntStream stream = Arrays.stream(new int[] {2,3,4,5,6});
		stream.forEach(e ->{
			System.out.println(e);
		});
		
		
		//5. list, set. inn sare objects pe aap directly stream call kr skte ho
		
		List<Integer> list1= new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		Stream<Integer> stream1 = list1.stream();
		stream1.forEach(e -> {
			System.out.println(e);
		});
		
		//there are many ways to get stream object, these are general ones
	
	}

}


