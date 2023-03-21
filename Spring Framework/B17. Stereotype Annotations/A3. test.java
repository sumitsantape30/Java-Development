package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Student student= con.getBean("student", Student.class); //apki class ka nam hai Student to first letter small karo. aur side mai btana kis class ka object hai yeh. isko ek variable mai store krlijiye
	    System.out.println(student);//yeh null value print karega coz humne value nhi di. but ha yeh print horha matlab object ban rha hai humara
	    //implicitely values dalne keliye you can use @Value annotation
	    
	    Student student1 = con.getBean("ob", Student.class);
	    System.out.println(student1);
	}

}
