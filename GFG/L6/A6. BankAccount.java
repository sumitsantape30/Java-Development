package Codes;

public class BankAccount {
	
	private String name;
	
	private Integer balance;

	public BankAccount(String name, Integer amount) {
		super();
		this.name = name;
		this.balance = amount;
	}
	
	//this will return how much balance we have after depositing money
	public Integer doposit(int money) throws InterruptedException {
		 System.out.println("Inside deposit: money, thread - " + money + " " + Thread.currentThread()); //this becomes entry section
//       Thread.sleep(1000);
       synchronized (this) { //critical section
           System.out.println("Inside deposit synchronized: money, thread - " + money + " " + Thread.currentThread());
           this.balance += money;
           Thread.sleep(200);
           System.out.println("Exiting deposit synchronized: money, thread - " + money + " " + Thread.currentThread());
       }

       System.out.println("Exiting deposit: money, thread - " + money + " " + Thread.currentThread()); //remainder section
       return this.balance;
	}
	//block level synchronization is fast than function level synchronization.
	
	public Integer withdraw(int money) throws InterruptedException {
		 System.out.println("Inside withdraw: money, thread - " + money + " " + Thread.currentThread()); // entry section
//       Thread.sleep(1000);
       synchronized(this) { // critical section
           System.out.println("Inside deposit synchronized: money, thread - " + money + " " + Thread.currentThread());
           this.balance -= money;
           Thread.sleep(100);
           System.out.println("Exiting deposit synchronized: money, thread - " + money + " " + Thread.currentThread());
       }
       System.out.println("Exiting withdraw: money, thread - " + money + " " + Thread.currentThread()); // remainder section
       return this.balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	

}
