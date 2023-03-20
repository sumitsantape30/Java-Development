package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=  new ClassPathXmlApplicationContext("com/springcore/auto/wire/config.xml");
		Emp emp1 = context.getBean("emp", Emp.class); //yeh muje typecaste krneki jarurat nhi hai yeh khudse emp ka object dedega typecaste krke dedega
		//agar isme sirf name likhte to hume woh ek object deta aur use typecast krna pdta
		System.out.println(emp1);
		
	}

}
