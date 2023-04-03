package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate; 
	
	public int insert(Student student) {
        String query="insert into student(id, name, city) values(?, ?, ?)"; 
        int r= this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int change(Student student) {
		
		String query= "update student set name=?, city=? where id=?"; 
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}
	
	public int delete(int studentId) {
		String query = "delete from student where id>=?"; 
		int r= this.jdbcTemplate.update(query, studentId);
		return r;
	}

	//2. 
	public Student getStudent(int studentId) {
		//yahape select query lagani hai
		String qeury = "select * from student where id=?";
		
		//5. ab iss rowMapper class ka object bana lenge fir usko pass karenge.
		RowMapper<Student> rowMapper = new RowMapperImpl();//hume pta hai hum parent class ka variable le skte hai to store the child class object
		//RowMapper ka direct objet nhi bana skte coz it is a interface to isliye humne RowMapper ki ek imlementation class banayi, usme naya object banake data set krke woh object return kardiya
		//rowMapper aap anonymous function banake bhi yahipe imlpement kr skte ho
		
		Student student= this.jdbcTemplate.queryForObject(qeury, rowMapper, studentId); //3. queryForList multiple chizo keliye use karenge. queryForobject mai 3 chize deni hai. pehli quuery, then rowMapper ka object, and studentId
		//iss rowMapper ko implement krna padega 
		//Spring JDBC converts resultset into class object internally. For proper mapping of columns from resultSet to ClassObject we are defining the mapRow Method which will be used internally by Spring JDBC
	    //mapRow () is an abstract method inside interface RowMapper.
		//Here we'll implement this interface and give definition to mapRow() method
		//create new class RowMapperImpl 
		
		return student;
		
		//6. now open app.java and run it
	}
	

}
