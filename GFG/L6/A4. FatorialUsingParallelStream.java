package Codes;

import java.math.BigInteger;
import java.util.Arrays;

public class FatorialUsingParallelStream {

	public static void main(String[] args) {
		
		int arr[]= {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000};

		//int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		long start= System.currentTimeMillis();
		
		Arrays.stream(arr)
			.parallel()
			.mapToObj(FatorialUsingParallelStream::calculate)
			.forEachOrdered(x -> {}); //System.out::println
		
		long end= System.currentTimeMillis();
		
		System.out.println("Time Taken: "+(end-start));
		
		//this is how parallel optimises. we dont need to create threads in case of parallel streams
		//we dont need to use threads manually we can use threadpoolexecuter like parallel() stream whichi internally uses threads()
	}
	
	public static BigInteger calculate(int num) {
		
		BigInteger result = BigInteger.ONE;
		
		//System.out.println("Inside Calculate = "+Thread.currentThread());
		for( int i=2; i<= num; i++) {
			result = result.multiply(BigInteger.valueOf(i)); 
		}
		
		return result;
	}

}
