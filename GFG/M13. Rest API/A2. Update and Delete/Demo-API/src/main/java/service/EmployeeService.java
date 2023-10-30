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

	//4/
	public Employee update(String employeeId, UpdateEmployeeRequest request) { //id ke bina hashmap mai update kaise karoge isliye if bhi chahiye
		Employee employee = request.to(employeeId); //employeeId niche update funtion mai bhi pass krke kr skte ho aur iss to() function mai bhi. mai update mai sirf employee object dena chahta hu isliye to mai hi de rha id coz id ke bina hashmap mai updation nhi hoga. 
		
	    return employeeRepository.update(employee);
	}
	
	//8
	public Employee delete(String employeeId) {
        return employeeRepository.delete(employeeId);

	}

}
