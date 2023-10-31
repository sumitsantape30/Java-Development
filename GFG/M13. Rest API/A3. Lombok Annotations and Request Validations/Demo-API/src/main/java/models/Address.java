package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter //2. so instead of creating setter and getter functions we'll use lombok annotations
@Setter 
@AllArgsConstructor //3. default constructor is already added so this is for parameterized constructor, this takes all the attribute it cant be customized. Do this in every class
public class Address {//when you compile the code, your test folder will have bytecode and that bytecode will have all these methods
	// but it'll still show errors in functions of getter setter in createEmployeeRequest and updateEmployeeRequest. to avoid this we need to install lambok plugin.
	// watch this video to understand how to add lombok manually: https://www.youtube.com/watch?v=UKQdv3cu2Ok&t=17s
	//open CreateEmployeeRequest
	
	private String houseNo;
	
	private String streetName;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String pinCode;


}
