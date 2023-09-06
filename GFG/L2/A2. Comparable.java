package Codes;

public class Main implements Comparable<Main> {
	//iss Comparable mai aur bhi methods hongi unimplemented but humko error nhi aya coz every class in java is implemented from object class
	//but compareTo() is present is object.java isliye it showed that function automatically
	//The compareTo() method is not implemented in the Object class in Java
	
	int age;
	String name;
	
	public Main(int age, String name) {
		this.age= age;
		this.name= name;
	}
	
	//2. Comparable demands only one object that you want to compare to. coz this an instance function and not an static function so we'll be calling it on some particular object
	@Override
	public int compareTo(Main o) {//this o is p2
		
		if(this.age == o.age) { //here this is p1. so here age or p1 and p2 is being compared
			return this.name.compareTo(o.name);
		}
		
		return this.age- o.age; //negative value return hui means p1 chota hai
	}
	
	
	public static void main(String[] args) {

		Main p1= new Main(5, "abs");
		Main p2 = new Main(6, "xyz");
		//1. i want to compare both the students so we'll need to implement comparable interface
		
		//3.
		int result = p1.compareTo(p2); //this line is saying we're comparing p1 with p2
		
		if( result < 0) {
			System.out.println("P1 is smaller");
		}else if( result > 0) {
			System.out.println("p2 is smaller");
		}else {
			System.out.println("Both are same");
		}
		
	}

	

}
