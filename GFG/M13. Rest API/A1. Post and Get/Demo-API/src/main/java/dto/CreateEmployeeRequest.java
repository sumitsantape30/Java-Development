package dto;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import models.Address;
import models.Department;
import models.Employee;

public class CreateEmployeeRequest {

	//9.DTO: dont add any unnecessary attribute here which you dont want to take from user.
	//even if you pass the data other than this in json format it'll automatically be discarded.
	
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

	//12. conversion from DTO to model -> isko dto se model mai convert kiya coz at the end we need to store model in data layer and not in dto. you can do this here or inside EmployeeService too but waha gardi hojati
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
