package dto;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import models.Address;
import models.Department;
import models.Employee;

public class CreateEmployeeRequest {

	private String name;
	
	private int age;
	
	private Department department;
	
	private Address address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee to() {
		Employee employee = new Employee();
		employee.setName(this.name);
		employee.setAddress(this.address);
		employee.setDepartment(this.department);
		employee.setAge(this.age);
		
		//kuch chize hume khud dekhni pdegi which we are getting from user
		employee.setcreatedOn(System.currentTimeMillis());
		employee.setUpdatedOn(System.currentTimeMillis());
		employee.setId(UUID.randomUUID().toString());
		
		return employee;
	}
	
}
