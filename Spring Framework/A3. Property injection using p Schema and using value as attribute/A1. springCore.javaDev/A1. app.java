package springCore.javaDev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //bean banane ke bad ab hum apne IOC container se bolenge ki student1 ka object mujhe dedo
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");//isme pass karenge xml file ka nam
        Student student1 = (Student)context.getBean("student1"); //jo bean tag hai context.xml mai uske andar ka jo bean chahiye uska nam. yeh as a object dega and I know yeh student ka object dega so Student object mai lenge. aur isko Student mai typecast bhi kr skte hai
    
        System.out.println(student1); //jaisehi reference print karega to woh toString method print karega yeh humne Student.java mai btaya hai
   
        Student student2 = (Student)context.getBean("student2");
        
        System.out.println(student2);
        
        Student student3 = (Student)context.getBean("student3");
        
        System.out.println(student3);
        
        Student student4 = (Student)context.getBean("student4");
        
        System.out.println(student4);
    }
}
