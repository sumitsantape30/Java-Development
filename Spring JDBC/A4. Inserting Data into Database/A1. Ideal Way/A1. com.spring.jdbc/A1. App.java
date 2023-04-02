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
        //ab hum yahape woh template nhi get karenge
        
        //StudentDao ka object banana pdega
        StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
        
        //data save krne keliye student ka object banana padega
        Student student = new Student();
        student.setId(5);
        student.setName("John");
        student.setCity("Pune");
        
        //yeh data studentDao mai insert krenge
        int result = studentDao.insert(student);
        
        System.out.println("Student added"+result);
        
        //steps
        //1. apko dao interface chahiye taki lose coupling bani rhe
        //2. aur uski implmentation class chahiye jisme hum kam karenge
        //3. jdbcTemplate leke usike help se query fire karenge
        //4. fir xml mai bean bana lenge
        //5. main file mai dao nikalenge uske pas apne aap jdbcTemplate ajayega fir usme data insert karenge
        //6. data add krne ke bad SQLyog mai refresh karoge to data visible hoga
    } 
}
