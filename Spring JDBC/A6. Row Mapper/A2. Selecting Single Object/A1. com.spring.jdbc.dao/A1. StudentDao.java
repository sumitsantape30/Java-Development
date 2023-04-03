package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

public interface StudentDao {

	public int insert( Student student);
	
	public int change(Student student);
	
	public int delete(int studentId);
	
	//1. yaha method add karenge pehle
	public Student getStudent(int studentId);//yeh student ki id lega aur uss id wala student return karega. iss id ka sara data object form mai return krdega. isko implement krna padega
}
