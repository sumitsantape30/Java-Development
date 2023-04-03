package com.spring.jdbc;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started.........." );     
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
        
        //3. 
        List<Student> students= studentDao.getAllStudent();//sare students list mai aarhe method se so usme store karenge

        for( Student s: students) {
        	System.out.println(s);
        }
    } 
}
