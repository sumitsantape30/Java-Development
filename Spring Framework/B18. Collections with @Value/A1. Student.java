package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Student {
	@Value("Sumit Santape") 
	private String studentName;
	@Value("Nagpur")
	private String city;
	
	@Value("#{temp}") //config ke andar jo list banayi uski id likh deni hai idhar
	private List<String> address; //@Value ko use krke value dalni hai to config mai standalone collection dalna hai apne. uske liye util wala schema chahiye hoga
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	public Student() {
		super();
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	

}
