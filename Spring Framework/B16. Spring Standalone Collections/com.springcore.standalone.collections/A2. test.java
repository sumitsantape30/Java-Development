package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");
		Person person2= con.getBean("person2", Person.class);//bean ka name pass hoga isme, aur yeh bean kis object ka class hai yeh bhi btayenge
		System.out.println(person2);
		
		//konse class ko belong krta yeh dekhne keliye
		System.out.println(person2.getFriends().getClass().getName());
		System.out.println("------------------------------------");
		System.out.println(person2.getFeeStructure());
		System.out.println(person2.getFeeStructure().getClass().getName());
		System.out.println("---------------------------------------");
		System.out.println(person2.getProperties());
		System.out.println(person2.getProperties().getClass().getName());

	}

}
