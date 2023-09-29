package Codes;

import java.math.BigInteger;

public class FactUsingMT {
	
	//2.
    public static class MyThread extends Thread{
    	
    	//4. you cant pass arr[i] directly in run() function so to get that value you can create a parameterized constructor and initialise its value and the pass it
		private int num;
		private BigInteger result;
		
		MyThread(int num){
			this.num = num;
			result= BigInteger.ONE;
		}
		
    	@Override
		public void run() {
			calculate();
		}
    	
    	public void calculate() {
    		
    		//BigInteger result= BigInteger.ONE; // 5.void function hai run() to result pass krne klieye isko bahar initialized karenge aur catch karenge
    		for( int i= 2 ; i <= num; i++) {
    			result = result.multiply(BigInteger.valueOf(i));
    		}
    		
    	}
		
	}

	public static void main(String[] args) throws InterruptedException {

		int arr[]= {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000};
		//int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//1. for every number we can create a thread and compute the result.
		
		//12. How do we decide the number of threads will be required 
		System.out.println("Available Processors - "+ Runtime.getRuntime().availableProcessors()); // i got 4 output. so i can create 4 threads and use them again and again.
		
		//7. now we'll calculate the start and end time
		long start=  System.currentTimeMillis();
		
		//3.
		MyThread[] thread= new MyThread[arr.length];
		for( int i=0; i< arr.length; i++) {
			thread[i] = new MyThread(arr[i]); //har ek index keliye naya thread banake start() karenge. (by default koi parameter nhi leta but humne upar class mai parameterized constructor banaya hai)
			thread[i].start(); 
		//	System.out.println(thread[i].result); //6. we are able to private memeber result coz its in the same class
		}
		
		//10. comment above line.
		for( int i=0; i < arr.length; i++) {
			thread[i].join(); //join() function waits infinitely until the thread dies. upar wale loop mai humne bas start() kiya hai
			System.out.println("For element "+arr[i]+", result = "+ thread[i].result);
		} //jab ek thread finish honeka wait krhe the hum tabhi usi time mai baki threads bhi finish ho rhe the parallel mai
		//so max time taken = Max(max time taken by one thread out of all threads)
		//while we were waiting for one thread other thread were running that's how its parallel
		
		//11. you can do above operation either in one loop or have separate loop
		for( int i=0; i< arr.length; i++) {
		//	System.out.println("For element "+arr[i]+", result = "+ thread[i].result);
		}
		
		//12. if i put join() and print statement in first loop itself it'l become sequential it'll no longer be parallel. coz first it'll start and then wait for that thread to end. then next thread will start.
		
		long end= System.currentTimeMillis();
		
		System.out.println(end- start); 
		
		//8. the main problem with above code is main thread is not waiting for other threads to compute, and those multiple thread are not able to complete their execution.
		//9. we need to add some block of code that blocks the main thread for sometime.
	}
	
	//13. Using Stream
	

}
