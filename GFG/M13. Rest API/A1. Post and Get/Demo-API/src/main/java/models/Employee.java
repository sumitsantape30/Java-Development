package models;

import org.springframework.stereotype.Component;


public class Employee {
	
	//2.
	private String id;
	
	private String name;
	
	private int age;
	
	//3. we can put department, but department boht sare hote hai to hum ise aur complex kr skte hai, you can create an enum class and specify what all departments do you have.
	private Department department;
	
	//5. It'll have address, address will not be enum, it'll be normal class.
	private Address address;
	
	//7. whenever use will be creating an employee we'll get this data from UI/client.
	//so create contructor and setters and getters for retrieval purpose. then open EmployeeController.
		

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

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

	public void setAddress(Address adress) {
		this.address = address;
	}
	
	//8. i'll also store time stamp on which the employee was created
	
	//the frontend doesnt need to tell the above two time stamps, the backend can decide it.
	// so thats why i'll create DTO (data transfer object), and add all the parameters in it which you want to take.

	private long createdOn;
	private long updatedOn;

	public long getcreatedOn() {
		return createdOn;
	}

	public void setcreatedOn(long createdOn) {
		this.createdOn = createdOn;
	}

	public long getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(long updatedOn) {
		this.updatedOn = updatedOn;
	}


}
