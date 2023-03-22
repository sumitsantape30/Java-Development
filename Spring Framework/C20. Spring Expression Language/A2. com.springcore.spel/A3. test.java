package com.springcore.spel;

import java.beans.Expression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class test {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo d1 = context.getBean("demo", Demo.class);
		System.out.println(d1);
		
		
		//spel ki ek class bhi hai
		SpelExpressionParser temp= new SpelExpressionParser();
		Expression expression =  temp.parseExpression("22+44");// is parseExpression method ke andar hum simply apna expression de skte hai
		System.out.println(expression.getValue());
		//yeh jada use nhi hota bas info keliye rakho
	} 

}
