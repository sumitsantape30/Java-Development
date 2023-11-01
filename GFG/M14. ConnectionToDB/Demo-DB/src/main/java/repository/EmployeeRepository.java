package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import models.Address;
import models.Department;
import models.Employee;

@Repository 
public class EmployeeRepository {
	
	//1. this variable will store connection
	private Connection connection; //create only one connection and use it thoroughout application
	
	public EmployeeRepository( //jo values humne application.properties mai define kiye woh yaha annotate karenge
			@Value("${db_url}") String url,
			@Value("${db_username}") String username,
			@Value("${db_password}") String password) throws SQLException{
		
		//3.yahase call connectToDB() and pass these values
		connectToDB(url, username, password);
		
		//4.
		createEmployeeTable();
	}
	
	private void connectToDB(String url, String username, String password) throws SQLException {
		this.connection = DriverManager.getConnection(url, username, password); // i need to pass the values in this function. you can hardcode the values or you can put in config file and change it later. open application.properties
		
	}
	//Hierarchy is Database: Database Server -> Database -> Tables -> Record ( Combination of row and columns)
	//we cant create a table without connecting to the database.
	
	//5.
	private void createEmployeeTable() throws SQLException {
		
		 String sql = "CREATE TABLE if not exists employee(id varchar(40) primary key, name varchar(30), age int, department varchar(20), address varchar(256))";
	     Statement statement = this.connection.createStatement();
	     statement.execute(sql);
	     //pehle database main create a database named employee_db and then run it.
	}
	
	//6.
	public Employee create(Employee employee) throws SQLException {
		 String sql = "INSERT INTO employee (id, name, age, department, address) VALUES ('" +
	                employee.getId() + "' , '" + employee.getName() + "' , '" + employee.getAge() + "' , '" +
	                employee.getDepartment().name() + "' , '" + employee.getAddress().toString() + "')";
		 //you can use toString() too to getDepartment(). see difference between toString() and name()
		 //put '' when you are passing value in String. put '' to every string.

	        Statement statement = this.connection.createStatement();
	        statement.execute(sql);
	        return employee;
	}
	
	//7. getall
	public List<Employee> get() throws SQLException {
		String sql = " Select * from Employee";
		Statement statement = this.connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql); //this executeQuery function returns the result, so when we need some result use executeQuery

		//humko multiple Employee objects milenge to unko store krne keliye list banayenge
		List<Employee> employeeList= new ArrayList<>();
		
		//this resultSet is kind of linkedlist
		while( resultSet.next()) { //as long as there's next element we'll keep iterating
			
			//String id= resultSet.getString(1); //id 1st column number pe hai. this way you can fetch by column number
			//another way to get id is by passing column name. 
			String id= resultSet.getString("id");//this is better way to fetch
			String name = resultSet.getString("name");
			int age = resultSet.getInt("age");
			
			Department department= Department.valueOf(resultSet.getString("department")); //we need in the form of enum, so there's function valueOf() it takes string and converts it in enum.
			
			Address address = Address.fromString(resultSet.getString("address")); //write a new function in Address.java that'll convert String to address.
			
			
			//now we need to attach it with employee.
			Employee employee= Employee.builder()
					.id(id)
					.name(name)
					.department(department)
					.address(address)
					.age(age)
					.build();
			//now we have got employee object.
			//aisehi boht sare object milenge multiple employee honge database mai to unko store krne keliye list banaye
			employeeList.add(employee);
		}
		
		return employeeList;
	}
	
	//8. this is optimized version
	 public Employee create2(Employee employee) throws SQLException {

	        // static queries
	        String sql = "insert into employee (id, name, age, department, address) VALUES (?, ?, ?, ?, ?) "; //we didnt provide values instead we provided ?.

	        PreparedStatement statement = this.connection.prepareStatement(sql);//preparedStatement is another interface in java, it extends from Statement.

	        statement.setString(1, employee.getId());
	        statement.setString(2, employee.getName());
	        statement.setInt(3, employee.getAge());
	        statement.setString(4, employee.getDepartment().name());
	        statement.setString(5, employee.getAddress().toString());
	        statement.execute();

	        return employee;
	    }// these both are static and dynamic queries

	
	public Employee get(String id) {

        return null;
    }

	public Employee update(Employee employee) {
		
		return null;
	}
	 
	private Employee merge(Employee oldData, Employee newData) {
		
		return null;
	} 
	
	public Employee delete(String employeeId) {

		return null;
	}
		
}
