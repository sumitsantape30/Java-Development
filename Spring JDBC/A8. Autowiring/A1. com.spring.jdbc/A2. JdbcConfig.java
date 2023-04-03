package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"}) //3. mujhe yeh bhi btana padega ki StudentDaoImpl class konse package mai hai. cotainer iss package ko scan karega aur usko studentDao wali class miljayegi
public class JdbcConfig {
	
	//1. autowiring is a powerful feature that allows automatic dependency injection of objects into another object. 
	//It is a mechanism that Spring provides to automatically wire the objects together without the need for explicit configuration in XML or Java code.
	//yahape studentDao bean manually declare nhi karenge aur StudentDaoimpl mai @Component annotation use karo taki woh bean khudse declare hojayegi
	
	
	@Bean("ds")
	public DataSource getDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Sumit@123");
		return ds;
	}
	
	@Bean(name={"jdbcTemplate"}) 
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource()); 
		return jdbcTemplate;
	}
	
	
}
