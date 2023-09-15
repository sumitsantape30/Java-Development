package Codes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.*;

public class Main  {
	
	public static void main(String[] args) {

		
		//filter(predicate) = predicate means boolean valued function that'll return true or false, ussi true or false pe yeh elements ko filter karega
	
		//map
		// iski help se har ke  element pe operation perform kr skte hai, each element pe koi operation perform kr skte hai
		//jaise apke pas ek list hai aur har ek element ko square krna chah rhe ho to square krke element return karo
	   // map(function) yeh ek function leta hai aur function value ko return karega
		
		List<String> names= List.of("Sumit", "Amit", "Nikhil", "Durgesh");
		
		//ab mujhe woh nam filter out krne hai jo A se start horhe
		names.stream().filter(e -> e.startsWith("A")).forEach(e -> System.out.println(e));
		
		
		List<Integer> number= List.of(23, 4, 2, 5, 7, 4);
		//mujhe square krke return krna hai
		number.stream().map(e -> e*e).forEach(e -> System.out.println(e)); //map ke valuer return krta hai aur filter predicate means bas true false return krta hai
		
		
		//numbers ko sort krna hai
		//collect krke print kr skte ho or direct forEach
		System.out.println("Sorted");
		number.stream().sorted().forEach(System.out::println);
		
		//comparison - min, max
		Integer integer= number.stream().min((x,y) -> x.compareTo(y)).get(); //single element hi hai to get() use kr skte ho
		System.out.println("min: "+integer);
		
		Integer integer2= number.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println("Max: "+integer2);
		
	}
	

}


