package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //yaha annotation mention karenge. yeh bta rha hai ki iss class ka object banao
//agar aap chahte hai ki iss class ka object particular variable ke andar hi rakhna hai to you can do-> @Component("ob") iss class ka object ab ob variable ke andar rahega, student variable ke andar nhi rahega
public class Student {
	//implicitely values dalne keliye we can use @Value annotation
	@Value("Sumit Santape") //studentName mai mujhe dalne hai mera nam
	private String studentName;
	@Value("Nagpur")
	private String city;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
