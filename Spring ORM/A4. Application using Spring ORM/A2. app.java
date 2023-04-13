package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

    //	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

    	//bufferreder ka object banayenge to read input from user
    	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    	boolean go = true;
    	
    	while(go) {
    		
    		System.out.println("Press 1 for add new student");
        	System.out.println("press 2 for displat all student");
        	System.out.println("press 3 for get detail of single student");
        	System.out.println("press 4 for delete students");
        	System.out.println("press 6 for exit");
        	
        	//loop mai dalnese yeh chalta rahega
        	
        	try {
        		
        		int input = Integer.parseInt(br.readLine()); //number ayaega input mai yaha switches laga denge
        		
        		switch (input) {
				case 1:
					//add a new student
					break;
				case 2:
					// display
					break;
				
				case 3:
					//get single student
					break;
				
				case 4:
					//delete student
					break;
					
				case 5:
					//update the student
					break;
					
				case 6:
					go = false;
					break;

				}
        		
        	}catch(Exception e) {
        		System.out.println("Invalid input try with another one");
        		System.out.println(e.getMessage());
        	}
    	}
    }
}


Output:
Press 1 for add new student
press 2 for displat all student
press 3 for get detail of single student
press 4 for delete students
press 6 for exit
1
Press 1 for add new student
press 2 for displat all student
press 3 for get detail of single student
press 4 for delete students
press 6 for exit
1
Press 1 for add new student
press 2 for displat all student
press 3 for get detail of single student
press 4 for delete students
press 6 for exit
2
Press 1 for add new student
press 2 for displat all student
press 3 for get detail of single student
press 4 for delete students
press 6 for exit
6
