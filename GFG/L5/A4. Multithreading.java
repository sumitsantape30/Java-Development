Apackage Codes;

import java.util.*;
import java.io.*;


public class Main  {
	
	
	public static void main(String[] args) {
		
		/* Threads
		 * Multithreading- this is when mutliple threads run at the same time
		 * Multiprocessing- this is when multiple processes run at the same time.(more than one CPU)
		 * 
		 * Parallelism - If multiple thread or multiple processes are running at the same time this is known parallelism
		 * Concurrency - suppose mere system mai 4 hi threads run ho skte hai. and i have opened 1 tab in chrome, each tab requires seperate thread to run. 
		 * 2 tabs CPU mai run horhe to if i click on 3rd tab then my 3rd tab will context switch in and my 2nd tab will be context switch out so this is how they're running concurrently but it seems like they are running parallelly.   
		 * This is difference between concurrency and parallelism
		 * concurrency can be converted into parallelism by adding the infrastructure. (increading number of core, CPU etc)
		 */
		
		//Native is keyword used before a function name which doesnt have definition. it doesnt have abstract keyword too. it have implementation in OS libraries.
		
		System.out.println("Hello World");
		System.out.println(Thread.currentThread()); //println just calls the toString method and it basically prints the object of toString and here object thread.java.
		
		
		Thread thread= new Thread();
		thread.setPriority(10);
		thread.start(); //this starts the thread
		
		System.out.println(thread);
		//O/p: Thread[Thread-0,10,main]  => Thread[ThreadName, priority, group]
		
		myThread thread1= new myThread();
		//thread1.run(); //this will directly call the run() function directly and it'll not create or initialise a new thread, it'll be inside main thread only
		
		thread1.start(); // start() function is not defined in myThead class so it'll go to parent. then it'll call the overriden method of run() function.
		
		System.out.println("Inside thread main...."+thread1.currentThread());// all the content in main function will run in main thread. and myThread class will run in different thread.
		
		//never use thead1.run() its not going to a new thread.
		// never start an already starting thread.
		
		//Daemen Thread - These are those threads which run in backround. They'll run when start() and stop.
	
		//next lecture we'll see how multithreading is faster than normal sequential programming. 
		//eg. suppose we are given some big numbers like [1000, 2000, 10000, ...] and you have to find the factorial of all these
		//Brute Force- traverse sequentially find factorial and print it.
		//another approach: since these numbers are independent of each other you can run these in a different threads. But your time will be saved
		//when you try to reduce time, the usage of resources will increase
	}
	
	//i want to write something in this thread, i want to execute something.
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


//Usecase: Suppose there's data coming from multiple sources like SQL, redis etc. and you want to combine those, you can collect the data in multiple different threads. and while combining you can combine in main thread.
