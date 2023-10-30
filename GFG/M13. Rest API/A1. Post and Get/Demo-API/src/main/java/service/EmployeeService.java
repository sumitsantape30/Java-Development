package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.CreateEmployeeRequest;
import models.Employee;
import repository.EmployeeRepository;

@Service //service bhi component ko inherit krha hai
public class EmployeeService {

	//11. here will be some function which will create the employee.
	
	//15. DAO: data access object layer, open employeeRepository.jsvs
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee create(CreateEmployeeRequest createEmployeeRequest) {
		
		Employee employee = createEmployeeRequest.to(); //create this to() function in createEmployeeRequest to create new employee
	
		//13. now you have got the employee. you need to save it in the database. for datalayer interaction we use Repository class also known as DAO.
		
		//16. 
		return employeeRepository.create(employee); //you can change the return type to Employee. now open employeecontroller
	}
	
	//20
	public Employee get(String id) {
		
		return employeeRepository.get(id);
		//you can use getOrDefault too
	}
	
	//23.
	public List<Employee> get(){
		return employeeRepository.get();
	}

	
	
	
}
