package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Student student= con.getBean("student", Student.class); 
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());

	}

}
