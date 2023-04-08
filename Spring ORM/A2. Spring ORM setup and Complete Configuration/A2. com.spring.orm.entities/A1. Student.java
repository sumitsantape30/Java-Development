package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // 4. isko entity banane keliye @Entity use krna pdega
@Table(name="student_details") //database mai iss name se table banegi
public class Student {

	//3. student properties
	@Id
	@Column(name= "student_id")
	private int studentId;
	
	@Column(name= "student_name")
	private String name;
	
	@Column(name= "student_city")
	private String studentCity;
	
	//5. @Coulmn se mapping hogyi so database mai jo table banenge usme jo columns honge usme student_id ek column hoga
		//student_name ek column hoga, student_city ek column hoga
		
	//6. getters setters fir hum dao banayenge
		

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String name, String studentCity) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.studentCity = studentCity;
	}
	
	
}
