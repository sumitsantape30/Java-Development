package Codes;

import java.util.*;
import java.io.*;


public class Main  {
	
	
	public static void main(String[] args) {

		System.out.println("Hello World");
		System.out.println(Thread.currentThread()); 
		
		
		Thread thread= new Thread();
		thread.setPriority(10);
		thread.start(); 
		
		System.out.println(thread);
		
		myThread thread1= new myThread();
		
		thread1.start(); 
		
		System.out.println("Inside thread main...."+thread1.currentThread());
		
		//2. 
		MyThread t1= new MyThread();
		t1.start();
		
		//if you simply create thread using Thread it wont help you
		Thread th= new Thread();
		th.run(); 
		
		//another way is by extending Runnable
		//why do we see two methods?
		// suppose  myThread class is already extending Person class then it wont be able to extend Thread coz in java multiple inheritance is not possible. then we can implement Runnable.
		
		
	}
	
	//1.this is the one way to define the thread by creating an inner class. other way to create a thread is by creating an outer class
	private static class myThread extends Thread{
		
		@Override
		public void run() {
			System.out.println("Inside Thread - "+currentThread());
			long sum= 0;
			for( int i=0; i< 1000; i++) {
				sum += i;
			}
			System.out.println("Sum = "+sum);
		}
		
	}
}

/////////////////This is outer class/////////////////////////////////////
package Codes;

public class MyThread extends Thread {

	
	@Override
	public void run() {
		System.out.println("Inside Thread - "+currentThread());
		long sum= 0;
		for( int i=0; i< 1000; i++) {
			sum += i;
		}
		System.out.println("Sum = "+sum);
	}
}

////////////////////////////// Using Runnable ///////////////////////////////////////////////////////////////////

package Codes;

public class ThreadUsingRunnable {

	
	public static void main(String args[]) {
		
		//MyThread thread= new MyThread();
		//thread.start(); you cant do this coz start() method is not present in runnable. Thread() class provides start() method
		//so to execute it you can do following
		MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread); // Pass the MyThread instance to the Thread constructor. This is basically creating new runnable
        t1.start();
		
	}
	
	static class MyThread implements Runnable {

		@Override
		public void run() {
			System.out.println("Inside Thread - "+Thread.currentThread()); //currentThread method is not present in runnable interface. but its present in Thread so us THread.Runnable()
			long sum= 0;
			for( int i=0; i< 1000; i++) {
				sum += i;
			}
			System.out.println("Sum = "+sum);
		}
		
		
	}
	

}
