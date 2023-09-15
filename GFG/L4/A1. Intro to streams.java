package Codes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;

public class Main  {
	
	public static void main(String[] args) {

		//streams are use to perform bulk operations and the process of objects of collection.
		//streams reduce the length of code
		
		List<Integer>list1= new ArrayList<>();
		
		list1.add(12);
		list1.add(34);
		list1.add(23);
		list1.add(78);
		
		//muje yeh sare even numbers ko nikalke dusri list mai krna hai
		 
		//without stream
		List<Integer> evenList= new ArrayList<>();
		
		for(Integer val: list1) {
			if( val % 2 == 0) {
				evenList.add(val);
			}
		}
		
		System.out.println(list1);
		System.out.println(evenList);
		
		//yahi kam stream api se ek line mai bhi hojayegah
		
		Stream<Integer> stream = list1.stream(); //list1 se maine stream nikal liye aur iss stream ko maine stream variable mai rakh diya
		//stream ko object hum kisibhi collection pe iss tarah se bana skte hai -^
		
		List<Integer> newList = stream.filter(i -> i%2 == 0).collect(Collectors.toList()); //hum mari stream mai jo elements hai usko filter krhe ek condition(lambda function) ke basis then usko collection krhe into a list aur usko store krhe newList variable mai
		System.out.println(newList);
		
		//in one line
		List<Integer> listone=  list1.stream().filter(j -> j%2== 0).collect(Collectors.toList());
		System.out.println(listone);
		
		//ab aise number nikalenge jo 50 se bde ho
		
		List<Integer> listGreaterThan50 = list1.stream().filter(i -> i > 50).collect(Collectors.toList());
		System.out.println(listGreaterThan50);
	}

}


