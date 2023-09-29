package Codes;

public class ThreadSafety {

	public static void main(String[] args) throws InterruptedException {

		//suppose we have  one joint account of two cofounders of a company. if both founders perform some action like withdrawing or depositing money there should not be any inconsistency in the trasactions.
		//we should write code in such a manner that changes of one should impact other at the end both of them should able to work.
		//it should not matter how many threads are running at which time our operations should be consistent before and after the trasaction.
		
		//This is done using critical section.
		//Critical Section: This says when multiple threads work on a shared resources, they should be allowed only few operations.
		//it is a place where multiple threads are working independently
		
		//1. Open Bank acount and add methods etc
		
		//2. 
		//BankAccount bankAccount = new BankAccount("a", 1000);
		//bankAccount.doposit(100);
		//bankAccount.withdraw(200);
		//this is in squential way, i wanna do it parallerly, we'll use thread to run both trasactions parallerly
		
		//4. 
		
		//for (int i = 0; i < 100; i++) {

		long start = System.currentTimeMillis();
        BankAccount bankAccount = new BankAccount("1", 1000);
        MyThread t1 = new MyThread(bankAccount, true, 100);
        MyThread t2 = new MyThread(bankAccount, false, 200);
        MyThread t3 = new MyThread(bankAccount, true, 500);
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(bankAccount.getBalance());
        long end = System.currentTimeMillis();

        System.out.println("time taken = " + (end - start));

	//	}
		
	}
	
	//3.
	private static class MyThread extends Thread{
		
		//5.
		private BankAccount bankAccount; //we're going to perform actions on bank account
		
		private boolean isDeposit; //if this is true means we deposited, if its false means withdrawal.
		
		private Integer amount;
		
		@Override
		public void run() {
			 try {
	                if(isDeposit) {
	                    this.bankAccount.doposit(amount);
	                }else {
	                    this.bankAccount.withdraw(amount);
	                }
	            } catch (InterruptedException e) {
	                throw new RuntimeException(e);
	            }

		}

		public MyThread(BankAccount bankAccount, boolean isDeposit, Integer amount) {
			super();
			this.bankAccount = bankAccount;
			this.isDeposit = isDeposit;
			this.amount = amount;
		}
		
	}

}
