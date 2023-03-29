package com.spring.jdbc;

public class Student {
	
	//1. jitne columns humne mySql promt mai liye the utne hi idhar lenge
	private int id;
	private String name;
	private String city;
	//yeh columns hai actually
	
	
	public Student() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	

	
}
