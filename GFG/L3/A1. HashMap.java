Lpackage Codes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.*;

public class Main  {
	
	public static void main(String[] args) {

		//ArrayList is better than array
		//arraylist is dynamic you dont need to mention the size beforehand.
		//in performace also arraylist is better, remove element by index is O(1) as we already know where the index is.
		// remove element by value is O(n) as firstly we might need to search the element and then remove.
		
		//HashSet is a unordered datastructure, it stores the elements in  random form 
		//HashMap is unordered DS too.
		
		//Question: count of all possible pairs which result to target.
		int arr[] = {1,2,3,4,5,6,7};
		int target= 8;
		//ans = [(1,7) , (2,4), (3,5)] => 3
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		List<List<Integer>> list= new ArrayList<>();
		int count =0;
		for( int i=0; i< arr.length; i++) {
			
			if( map.containsKey(target - arr[i])) {
				List<Integer> pair= new ArrayList<>();
				pair.add(arr[i]);
				pair.add(target - arr[i]);
				list.add(pair);
				
				count++;
			}else {
				map.put((arr[i]), true);
			}
		}
		
		System.out.println(count);
		System.out.println(list);
	}
}


