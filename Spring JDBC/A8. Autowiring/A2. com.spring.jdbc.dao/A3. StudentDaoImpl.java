package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("studentDao") //2.
public class StudentDaoImpl implements StudentDao {

	//4. iske andar data aane keliye simply likhe
	@Autowired //jaisehi autowired use karoge, to jo springcontainer ke pas jo jdbcTemplate ki dependency hogi woh yahape inject hojayegi
	private JdbcTemplate jdbcTemplate; 
	
	public int insert(Student student) {
        String query="insert into student(id, name, city) values(?, ?, ?)"; 
        int r= this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	//@Autowired //5. setter pe bhi autowired use kr skte ho yafr upar
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

	public List<Student> getAllStudent() {
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
	
}
