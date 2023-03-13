Using Annotations

@PostConstruct: properties ko contruct krne ke bad function chalana means yeh init ka kam karega.
@PreDestroy

////////////////////////////////////////////////////////////////////////////////////////////////

  package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;//kis subject ka yeh example hai

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example(String subject) {
		super();
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//hume isme init method aur destroy ki functionality chahiye but hume yaha annotations use krke krna hai
	//@PostConstruct and @PreDestroy use krne keliye hume dependency dalni hoti hai in pom.xml
	@PostConstruct
	public void start() {
		System.out.println("Starting Method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	} //now go to config file
	

}
