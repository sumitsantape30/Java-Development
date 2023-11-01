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
@ToString
@Builder
public class CreateEmployeeRequest {

	@NotBlank 
	private String name;
	
	@Min(18)
	@Max(60)
	private int age;
	
	@NotNull 
	private Department department;
	
	private Address address;
	
	public Employee to() {
		
		Employee employee = Employee.builder() 
						.name(this.name)
						.age(this.age)
						.address(this.address)
						.department(this.department)
						.createdOn(System.currentTimeMillis())
						.updatedOn(System.currentTimeMillis())
						.id(UUID.randomUUID().toString())
						.build(); 
		
		return employee;
	}

	
}
