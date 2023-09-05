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

package Codes;

import java.util.List;

public interface sampleInterface extends L1, L2 {
	
	public void add(int a, int b);
	
	int substract(int a, int b);
	
	default int multiply(int a, int b) {
		return a*b;
	}
	//since dono interface mai same method hai so i can define which one to call
	@Override
	default int size() {
		return L2.super.size();
	}

}
