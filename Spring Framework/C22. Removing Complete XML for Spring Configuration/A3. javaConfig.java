package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//humare project mai boht sare java classes hai to pta kaise chalega ki yahi java class configuration sambhal rhi hai
@Configuration //uske liye configuration annotation use karenge
//@ComponentScan(basePackages = "com.springcore.javaConfig")//base package btane keliye hum yaha btayenge. ek se jada bhi basepackage bta skte ho
//componentScan means which package to scan, container kis package ko scan karega apki beans ko pane keliye
//now open client.java
public class javaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	//hum yaha ek method banayege jiska return type humara bean hi hoga
	//is method ko annotate krna padega tab ioc container smjh payega ki iss method se return aya hua object mujhe lena hai kyuki mujhe koi mang skta hai 
	@Bean //Bean annotation use krte waqt ComponentScan ki jarurat nhi pdegi. iss bean mai names bhi de skte ho fir unn names ki help se aap yeh method access kr skte ho
	//@Bean(name= {"student","temp","con"})
	public Student getStudent() {
		//isme student ka object banake return karenge
		Student student = new Student(getSamosa());//samosa banane ke bad iss constructor mai samosa pass krna hai to ek getSamosa method banalo aur usmese samosa object return karo
		return student;
	}


}
