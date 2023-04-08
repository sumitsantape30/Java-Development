package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	//19. sabse config file load karenge
    	System.out.println("1");
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	System.out.println("2");

    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
    	System.out.println("3");

    	Student student = new Student(65, "Sumit", "Pune");
    	System.out.println(student);
    	System.out.println(student.getName());
    	int r= studentDao.insert(student);
    	System.out.println("done"+r);
    	
    }
}
