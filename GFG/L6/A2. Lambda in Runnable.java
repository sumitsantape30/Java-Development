package Codes;

public class ThreadUsingRunnable {

	
	public static void main(String args[]) {
		
		
		MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread); 
        t1.start();
        //you can see Runnale is fuctional interface so we can reduce it using Lambda Expression
        
        Runnable r1 = () ->{ //we were able to use lambdas coz Runnable is function interface
        	
        	System.out.println("Inside Thread - "+Thread.currentThread()); //currentThread method is not present in runnable interface. but its present in Thread so us THread.Runnable()
			long sum= 0;
			for( int i=0; i< 1000; i++) {
				sum += i;
			}
			System.out.println("Sum = "+sum);
			
        };
        
        Thread t2= new Thread(r1);
        t2.start();
		
	}
	/* i dont need this class, i can do thing without this class also with lambdas
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
		
		
	} */
	

}
