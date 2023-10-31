package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.CreateEmployeeRequest;
import dto.UpdateEmployeeRequest;
import models.Employee;
import repository.EmployeeRepository;

@Service
public class EmployeeService {


	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee create(CreateEmployeeRequest createEmployeeRequest) {
		
		Employee employee = createEmployeeRequest.to(); 
		
		return employeeRepository.create(employee); 
	}
	
	public Employee get(String id) {
		
		return employeeRepository.get(id);
	}
	
	public List<Employee> get(){
		return employeeRepository.get();
	}

	public Employee update(String employeeId, UpdateEmployeeRequest request) { 
		Employee employee = request.to(employeeId); 
	    return employeeRepository.update(employee);
	}
	

	public Employee delete(String employeeId) {
        return employeeRepository.delete(employeeId);

	}

}
