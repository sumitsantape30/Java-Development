package ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ref/reference.xml");
		A temp= (A)context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getObj().getY());//B ke object se y ki value nikali hai
		
		System.out.println(temp);
	}

}

Output:
12
90
A [x=12, obj=B [y=90]]
