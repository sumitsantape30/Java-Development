package com.spring.jdbc;


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
        
        
//        //3.  update operation
//        Student student = new Student();
//        student.setId(21); //uss bande ki id dalo jiske data upadate krna hai
//        student.setName("Alok"); //isme apko naya wala nam dena hai
//        student.setCity("HGT");
//        
//        int result = studentDao.change(student);
//        
//        System.out.println("Rows updated: "+result);
//        //SQLyog mai refresh krke dekhoge to update hojayega
        
        //4. Delete Operation
        //dao ke andar ek method banalo pehle
        
        //7.
        int delete = studentDao.delete(456);
        System.out.println("Row Deleted:"+delete);
    } 
}
