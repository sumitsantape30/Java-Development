package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=  new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/config.xml");
		Emp emp1 = context.getBean("emp1", Emp.class); 
		System.out.println(emp1);
		
	}

}
