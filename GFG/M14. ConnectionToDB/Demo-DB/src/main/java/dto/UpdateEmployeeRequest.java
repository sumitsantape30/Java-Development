package dto;

import java.util.UUID;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.Address;
import models.Department;
import models.Employee;

@Setter
@Getter
public class UpdateEmployeeRequest {

	//9.
	@NotBlank
	private String name;
	
	@Min(18)
	@Max(60)
	private int age;
	
	@NotNull
	private Department department;
	
	private Address address;
	/*The @Valid annotation in Spring is used to trigger validation of the request body, typically in the context of a RESTful API. 
	 * When you annotate a method parameter (usually a DTO or a model class) with @Valid, Spring will automatically perform validation 
	 * checks on the request data based on validation constraints defined in the model class. open controller and @Put on requestBody */
	
	
	//7.
	public Employee to(String employeeId) { 
//		Employee employee = new Employee();
//		employee.setName(this.name);
//		employee.setAddress(this.address);
//		employee.setDepartment(this.department);
//		employee.setAge(this.age);
//		
//		//employee.setcreatedOn(System.currentTimeMillis());
//		employee.setUpdatedOn(System.currentTimeMillis());
//	//	employee.setId(UUID.randomUUID().toString()); employeeId update nhi karenge woh wahi rahegi
//		employee.setId(employeeId);
		
		return Employee.builder()
				 			.name(this.name)
				 			.age(this.age)
				 			.department(this.department)
				 			.address(this.address)
				 			.updatedOn(System.currentTimeMillis())
				 			.id(employeeId)
				 			.build();
		
	}
}
