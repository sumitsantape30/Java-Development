package models;

import org.springframework.stereotype.Component;


public class Employee {
	
	private String id;
	
	private String name;
	
	private int age;
	
	private Department department;
	
	private Address address;

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
