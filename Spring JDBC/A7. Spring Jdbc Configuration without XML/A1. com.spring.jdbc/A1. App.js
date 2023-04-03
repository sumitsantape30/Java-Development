package com.spring.jdbc;


import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started.........." );   
        
        //yeh annotationConfigApplicationContext use krna padega. jiske andar configuration hai woh java class pass krni hai
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
        
        List<Student> students= studentDao.getAllStudent();
        for( Student s: students) {
        	System.out.println(s);
        }
    } 
}
