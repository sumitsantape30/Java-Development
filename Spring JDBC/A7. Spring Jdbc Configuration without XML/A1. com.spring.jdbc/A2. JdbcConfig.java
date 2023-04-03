package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

//1. jo bhi configuration humne xml file mai kiya tha woh kam hum iske andar karenge
@Configuration
public class JdbcConfig {

	//hume 3 methods banai padega
	//pehli datasource keliye
	@Bean("ds")
	public DataSource getDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		//DataSource ds = new DriverManagerDataSource(); //yeh bhi use kr skte hai kyuki DriverManagerDataSource dataSource ko hi extend krha (doc mai dekho)

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Sumit@123");
		return ds;
	}
	
	
	//2. jdbc template
	@Bean(name={"jdbcTemplate"}) //ek dono tarike ek hi kam krta hai bean ko name dene ke
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource()); //getDataSource ek datasource return karega and wahi datasource jdbcTemplate mai set hojayega
		return jdbcTemplate;
	}
	
	@Bean(name={"studentDao"})
	public StudentDao getStudentDao() {
		StudentDaoImpl studentDao= new StudentDaoImpl(); 
		studentDao.setJdbcTemplate(getTemplate());
		return studentDao;
		
	}
	
}
