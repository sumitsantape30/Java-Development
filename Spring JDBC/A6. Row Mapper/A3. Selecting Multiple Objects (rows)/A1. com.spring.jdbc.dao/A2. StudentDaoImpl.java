package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

import java.util.List;

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

	public Student getStudent(int studentId) {
		String qeury = "select * from student where id=?";
		
		RowMapper<Student> rowMapper = new RowMapperImpl();
		
		Student student= this.jdbcTemplate.queryForObject(qeury, rowMapper, studentId); 
		
		return student;
		
	}

	//2. unimplemented method add karenga
	public List<Student> getAllStudent() {
		//selecting mutliple students
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
	
}
