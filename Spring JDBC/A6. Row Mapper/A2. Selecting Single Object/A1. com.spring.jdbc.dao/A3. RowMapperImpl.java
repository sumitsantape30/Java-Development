package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

//4. 
public class RowMapperImpl implements RowMapper<Student> { //generic mai btayenge kis type ke object ke sath deal krhe hai


	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student student = new Student();
		student.setId(rs.getInt(1));//result set mai pehle id hai. pehla column id hai
		student.setName(rs.getString(2)); //dusra column name ka hai
		student.setCity(rs.getString(3));
		return student;
	} //java yahi implmentation use karega kam krne keliye

}
