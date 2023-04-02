package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

public interface StudentDao {

	public int insert( Student student);
	
	//1. sabse pehle yaha update method banayenge aur student ka object lenge
	public int change(Student student);//iss student ke andar 3 chize hai id, city, name. jo purani hai usme hi update krna hai
	
	//5. 
	public int delete(int studentId);
}
