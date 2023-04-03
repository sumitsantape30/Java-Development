package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {

	public int insert( Student student);
	
	public int change(Student student);
	
	public int delete(int studentId);
	
	public Student getStudent(int studentId);
	
	//1. yeh method multiple rows return karega so use List of object
	public List<Student> getAllStudent();//isme koi parameter nhi denge kyuki hume sare ke sare rows chahiye
}
