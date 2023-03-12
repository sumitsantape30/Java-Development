package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Addition;

public class test {
	
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/Config.xml");
		context.registerShutdownHook(); //yeh interface keliye bhi laga hai, destroy wala method chalana hai to hook lagana hi padega

	    System.out.println("==========================================================");
	    Pepsi p1 = (Pepsi)context.getBean("p1");
	    System.out.println(p1);
	    
//	    Taking Pepsi: init --> Initialisation hua
//	    ==========================================================
//	    Pepsi [price=5.0] --> fir kam hua
//	    Going to put bottle in shop after drinking --> fir destroy hua

	}

}
