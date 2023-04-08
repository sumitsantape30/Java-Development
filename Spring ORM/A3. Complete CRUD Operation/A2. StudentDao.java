package com.spring.orm.dao;


import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		Integer i= (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	//1. Read: to get the single data(object). aap data get krhe ho to transactional ki koi jarurat nhi hai
	public Student getStudent( int studentId) { //student return krne keliye uski id lena must haii
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	//2. get multiple data
	public List<Student> getAllStudent(){
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//3. deleting the data
	@Transactional
	public void deleteStudent(int studentId) {
		//pehle object get krna pdega tabhi delete kr payenge
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
		//yeh delete method kuch return nhi krta
	}
	
	//4. updating data
	@Transactional
	public void updateStudent(Student student) {
		
		this.hibernateTemplate.update(student);
		
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
