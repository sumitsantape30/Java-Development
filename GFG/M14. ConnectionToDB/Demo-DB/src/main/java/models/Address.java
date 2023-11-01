package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString
public class Address {
	
	private String houseNo;
	
	private String streetName;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String pinCode;

	//8. a function that'll convert string into address.
	 //it'll be a static function
	 public static Address fromString(String address){
	        // ...
	        return new Address();
	    }

}
