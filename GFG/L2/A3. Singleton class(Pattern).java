package Codes;

public class Main  {
	
	//4.
	private Main() {
		System.out.println("Inside main contructor: "+this);
		
	}//iss Main class ka object sirf yahi class bana skta hai, koi aur class iska object nhi bana skta coz contructor is private
	
	//6. we'll write a static function. why static? Because it doesnt need a object to invoke the function, it can be invoked with class.
	public static Main object =null; //humara ek object isme store hoga
	
	static Main getInstance() { //this class returns the Main object
		
		if( object == null) { //agar object variable null hai means object abhi bana nhi hai to you can create its object and return it
			object= new Main(); //if object is null we call the constructor
		} 
		return object;
	} //even if i call this getInstance() function n number of times i'll have only one object with me
	
	//we created a local variable Object which is storing the object, initially it would be null
	//inside it we checked if the object was null we call the private constructor and set the variable with this object
	//and return the object
	
	public static void main(String[] args) {

		//1. so I have this main class and I can create infinte number of objects of this class
		//2. but agar if we have to restrict that user can create only one object of this class, user cant create multiple objects
		//3. we can restrict the creation of object of this class from other class by making the contructor as private
		    
	    //5. my goal was to restrict it to only object which can be used at all the places
		
		//7. 
		Main obj1 = Main.getInstance();
		Main obj2 = Main.getInstance();
		Main obj3 = Main.getInstance();
		//getInstace is static function isliye we were able to call it without object
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		//will give the same address for all the objects aur ek par contructor ka inner part print hoga
		
		//even if we call this function from other class it will create only one object of that class
		//if we make this contructor public it'll not be singleton class anymore
		
	}
}

//Output: 
//Inside main contructor: Codes.Main@27f674d
//Codes.Main@27f674d
//Codes.Main@27f674d
//Codes.Main@27f674d

