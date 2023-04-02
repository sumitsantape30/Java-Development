package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;


public class StudentDaoImpl implements StudentDao {
	

	private JdbcTemplate jdbcTemplate; //jdbc ka template bana lenge yaha yeh hume data insert krne mai help karega

	public int insert(Student student) {
        String query="insert into student(id, name, city) values(?, ?, ?)"; //woh app.java wali query yaha likhenge
        int r= this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//StudentDaoImpl ko bhi xml mai declare krna hoga. open xml file. iss StudentDaoImpl mai hume jdbcTemplate bhi chahiye

	

}
