package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		
		//Student student= context.getBean("", Student.class);//humne xml mai bean nhi banaya hua hai to cotainer Student nam se bean bana dega camelcase mai or tum @Component mai nam mention kr skte ho
		//System.out.println(student); // yeh NoSuchBeanDefinitionException dega kyuki usko nhi pta yeh Student kis package mai rakha hai yeh xml file mai mention krna padega
	 
		//but agar humne xml delete krdi to hum kaise batayenge ki ek class hai jiske upar @Component laga hai aap iska object bana dijiye
		//ab hum yeh achieve karenge complete javase, open javaConfig.java
		
		//java.Config mai @ComponentScan dalne ke bad yaha aao
		//ab hum yaha ClassPathXmlApplicationContext use nhi kr skte kyuki usko xml file chahiye hogi
		//ab hum ApplicationContext ki dursi implmentation class use karenge jo annotation based configuration krhi ho
		
		ApplicationContext context2 = new AnnotationConfigApplicationContext(javaConfig.class);
		//Student student2= context2.getBean("student", Student.class);
		Student student3= context2.getBean("getStudent", Student.class); //javaConfig ke andar jo method hai woh likhenge

		System.out.println(context2);
		student3.study();
		//ab yeh pehle samosa ki method call karega then apna content print karega
	}

}
