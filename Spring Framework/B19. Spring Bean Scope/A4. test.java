package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Student student= con.getBean("student", Student.class); //1. humne yaha ek object manga hai to ek object banayega aur dedega
		System.out.println(student);
		
		System.out.println(student.hashCode());
		
		// ab hum student ka object dubara mangke dekhte hai container ko
		Student student1 = con.getBean("student", Student.class);
		System.out.println(student1.hashCode());
		//ab ek hi class ke 2 object get kiye hai
		//donoka same hashcode print hoga
		//jab apne container ko pehli bar bola ki apko object chahiye to usne naya object banaya aur apko dediya
		//pr jab apne 2nd timeobject manga to usne naya object nhi banaya wahi object ka reference dediya apko
		//so this is singletone scope
		
		//prototype scope-> mai chahta hu ki jab mai object mangu to woh harbar new object create kare
		//now open Student.java and @Component ke niche add Scope(" ")
		//3. @Scope("prototype") dalne ke bad firse run karo to donoka hashcode different hai
	   //4. xml use krke bhi bana skte hai, so open Teacher.java
		
      	//7.
		Teacher t1 = con.getBean("teacher", Teacher.class);
		Teacher t2 = con.getBean("teacher", Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

	}

}
