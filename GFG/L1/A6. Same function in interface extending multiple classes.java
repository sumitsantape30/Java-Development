package Codes;

public interface L1 {
	
	default int size() {
		return -1;
	}

}


package Codes;

public interface L2 {
	
	default int size() {
		return -1;
	}

}

//both L1 and L2 interface have default function named size().
//sampleInterface is implementing both the above interfaces
//so it asks us to implement our own size() function which either returns the response of L1 or L2

package Codes;

import java.util.List;

public interface sampleInterface extends L1, L2 {
	
	public void add(int a, int b);
	
	int substract(int a, int b);
	
	default int multiply(int a, int b) {
		return a*b;
	}
	//since dono interface mai same method hai so i can define which one to call, since both functions are default so overidden function will also be overidden
	@Override
	default int size() {
		return L2.super.size();
	}

}
