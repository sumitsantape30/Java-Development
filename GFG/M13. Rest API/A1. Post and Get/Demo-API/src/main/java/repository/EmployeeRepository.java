package repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import models.Employee;

@Repository //yeh bhi component ko inherit krhi hai
public class EmployeeRepository {
	//14.  repository is not but dao.
	
	private HashMap<String, Employee> employeeMap = new HashMap<>(); //(nicheka padho pehle) employee id(key) is string and Employee(value) object.
	
	//this function takes an employee and saves in database.
	public Employee create(Employee employee) {
		
		//which ds should we use to store Employees.: We'll use HasMap, problem with Linear ds is it make search inefficient.
	   // in HashMap you can store Employee_Id as key and Employee object as Value
		// but also think about querying? : how many employees are there with age greater than 20? think about these while choosing data structure and databases also.
		
		return employeeMap.put(employee.getId(), employee);
		//put function returns the Value, means it'll return employee object here. or you can put void too.
	}
	
	//21.
	public Employee get(String id) {
		
		return employeeMap.get(id);
	}
	
	//24.
	public List<Employee> get(){
		List<Employee> list=  employeeMap.values().stream().collect(Collectors.toList()); //values() se collection of employees mile then stream mai convert krke hahsmap ko list mai liya
		return list;
	}

}
