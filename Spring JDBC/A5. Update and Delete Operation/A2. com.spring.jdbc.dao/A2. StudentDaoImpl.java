package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;


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

	//2. implement krdenge
	public int change(Student student) {//jdbcTemplate use krke update query chalni hai
		
		String query= "update student set name=?, city=? where id=?"; //aur columns hote to unko bhi likhte. update keliye jaise sql query likhte hai waisi likhenge. Student object se values nikalke isme put karenge
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;//kitne rows change honge yeh output ayega
	}//now open app.java to update

	//6.
	public int delete(int studentId) {
		String query = "delete from student where id>=?"; //hume uss row ko delete karna hai jiski id hum pass karenge
		int r= this.jdbcTemplate.update(query, studentId);
		return r;
	}
	
	
	

}
