package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Addition;

public class test {
	
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/Config.xml");
		Samosa s1 = (Samosa)context.getBean("s1");
		System.out.println(s1);
		
		context.registerShutdownHook(); //4. yeh method AbstractApplicationContext use krne ke bad aya. maine container ko yeh bta diya ki jab muje objec destroy krna hoga to destroy method call karyiga
		// registerShutdownHook yeh method AbstracApplicationContext ke pas haii
		
//	1.	output mai setting price print hua pehle means pehle object create kiya isne then price ko set kiya, then init method call hua.
//	2.	aur destroy ko call krne keliye apko iss context pe preshutdown hook enable krna padega jisse yeh context methods ko call karega
//	3.   hume ApplicationContext ki agah AbstractApplicationContext use krna hoga jisse hume registration ka method mil jayega jiski help se hook ko register karpayenge
	}

}
