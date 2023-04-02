package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started.........." );     
//        apko requirement hai jdbctemplate object ki
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate  template =  context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
        String query="insert into student(id, name, city) values(?, ?, ?)"; //id name city keliye question mark dala hai, hum direct values bhi pass kr skte the
        
        //fire query
        int result = template.update(query, 78, "Akita Santape", "Pune");//comma lagake inki values bhi pass krni hai. muje yaha question mark ki values likhni hai isliye update lenge
        System.out.println("number of record inserted..."+result);//yeh number of rows affected return krta hai
        
    } 
}
