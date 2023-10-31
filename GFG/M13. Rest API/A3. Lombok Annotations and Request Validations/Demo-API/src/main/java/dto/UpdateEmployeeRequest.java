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
@Builder
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
	
	//after this we'll see validations. open CreateEmployeeRequest.
}
