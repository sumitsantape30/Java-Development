package dto;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import models.Address;
import models.Department;
import models.Employee;

@Getter
@Setter
@ToString //4. this gives us toString method
@Builder //5. this helps to create new object
public class CreateEmployeeRequest {

	//8. when you take input from user you might want name of 30 charrachters, you dont want peole above age 80 all these validations you can add.
	//open pom.xml and add a dependency to add the validations. 
	
	@NotBlank //i dont want a blank name. @NotEmpty bhi use kr skte. @NotNull bhi use kr skte but null nhi rha to empty input dega so use @NotBlank
	private String name;
	
	//we'll give min and max age
	@Min(20)
	@Max(80)
	private int age;
	
	@NotNull //department should be not null coz even if its empty it'll automatically ruled out by enum it can have those values. but what if someone sends null it wont resolve to those particular values
	private Department department;
	
	//you can give validation to address as well if you want address in the beginning itself. update in UpdateEmployeeRequest as well
	private Address address;
	
	public Employee to() {
		
	/*	Employee employee = new Employee(); //6. its best practice to create a object and then set the properties you want to set. open Employee.java
		employee.setName(this.name);
		employee.setAddress(this.address);
		employee.setDepartment(this.department);
		employee.setAge(this.age);
		
		//kuch chize hume khud dekhni pdegi which we are getting from user
		employee.setCreatedOn(System.currentTimeMillis());
		employee.setUpdatedOn(System.currentTimeMillis());
		employee.setId(UUID.randomUUID().toString()); */
		
		//add @Builder in Employee.java and come back
		//Builder creates the object by the number attributes we provide, if its parameterized constructor is taking 5 values and we provide 3 it'll automatically set the default values to the other 2 variables.
		//bytecode mai iska implementation hai.
		
		
		Employee employee = Employee.builder() //here i am getting the reference of employee builder class. and then we'll call functions of EmployeeBuilder which returns an object of EmployeeBuilder()
				       .name(this.name)//now we can set whatever value we want to set. its a chain of functions coz these function dont return anything. meanwhile upar wale function like setName() returns void to usko connected you cant call another function.
					   .age(this.age)//doesnt return void, returns employeeBuilder.
					   .address(this.address)
					   .department(this.department)
					   .createdOn(System.currentTimeMillis())
					   .updatedOn(System.currentTimeMillis())
					   .id(UUID.randomUUID().toString())
					   .build(); //at the end when you have set all the functions then do a build. this build function returns an employee object.
		//this is just one single command there are not separate functions calling.
		//this is an easy way to set your attributes values.
		//do similar thing in UpdateEmployeeRequest
		return employee;
	}
	
}
