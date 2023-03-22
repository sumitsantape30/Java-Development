package com.springcore.spel;

import java.beans.Expression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class test {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo d1 = context.getBean("demo", Demo.class);
		System.out.println(d1); //output: Demo [x=33, y=96, z=5] , 25 ka sqaure root 5 print kiya
		
	} 

}
