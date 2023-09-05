package Codes;

public class Parent {
	
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
		//reference = instance (left mai reference hota hai, right mai instance hota hai)
		Child c1= new Child();
		//Explanation: I'm using the reference of child and I'm creating an instance of child. parent has nothing to do with this.
		
		//below reference is of parent and instance is of child
		Parent c2= new Child();
		//c2.funcC(); we cant call this fuction
		c2.funcA();
		
		
		//although both are child objects. reference is used for calling out particular functions which are present in that class 
	   //when we create reference of parent: when we want to restrict that we should use the function which are there in parent
		
		//Child c3= new Parent(); //we are downcasting here and its not possible
		
		//summary
		//references are only use for accessing. and whenever we call a function, we call a function of a class which is defined on the right side, assuming the method is overridden in the Child class.
		//if that method is not overidden it'll throw an error. or if that method is present in parent class it'll execute that.
	
		//benefit of doing : Parent c2= new Child(); we're restricting that you cannot use any function of child which is not there in parent.
		
	
	}

}
