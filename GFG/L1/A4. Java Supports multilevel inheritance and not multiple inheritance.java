package Codes;

public class GrandParent {
	
	public void funD() {
		System.out.println("Inside Grandparent: FunD");
	}
	
	public void funE() {
		System.out.println("Inside Grandparent: FunE");
	}

}


package Codes;

public class Parent extends GrandParent {
	
	public void funcA() {
		System.out.println("Inside Parent: FuncA");
	}
	
	public void funcB() {
		System.out.println("Inside Parent: FunB");
	}

}


package Codes;

public class Child extends Parent {
	
	public void funcC() {
		System.out.println("Inside child: funcC");
	}
	
	public void funcA() {
		System.out.println("Inside child: funcA");
	}
	
	public static void main(String args[]) {
		
		//java Support multilevel inheritance like it has formed a chain
		//child is inheriting from parent and parent is inheriting from grandparent
		
		//but multiple inheritance is not possible in java like - Child extends Parent,GrandParent 
		//one class cannot inherit from multiple classes due ambiguity, soppose same function is defined in parent and grandparent now my child wont understand which function to call parent one or grandparent one
		
	}

}

