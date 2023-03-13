package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Addition;

public class test {
	
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/Config.xml");
		context.registerShutdownHook(); //yeh interface keliye bhi laga hai, destroy wala method chalana hai to hook lagana hi padega

	    Example example = (Example)context.getBean("example");
	    System.out.println(example);
	}

}
