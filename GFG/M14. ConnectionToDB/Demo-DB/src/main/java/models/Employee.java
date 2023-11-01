package models;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter 
@Builder //7.
public class Employee {
	
	private String id;
	
	private String name;
	
	private int age;
	
	private Department department;
	
	private Address address;

	private Long createdOn;
	
	private Long updatedOn;


}
