package repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import models.Employee;

@Repository 
public class EmployeeRepository {
	
	private HashMap<String, Employee> employeeMap = new HashMap<>(); 
	
	public Employee create(Employee employee) {
		
		return employeeMap.put(employee.getId(), employee);
	}
	
	public Employee get(String id) {
		
		return employeeMap.get(id);
	}
	
	public List<Employee> get(){
		List<Employee> list=  employeeMap.values().stream().collect(Collectors.toList()); //values() se collection of employees mile then stream mai convert krke hahsmap ko list mai liya
		return list;
	}

	public Employee update(Employee employee) {
		
		Employee existingEmployee = employeeMap.get(employee.getId());
		if(existingEmployee != null) {
			
			employee = merge(existingEmployee, employee);
			
			employeeMap.put(employee.getId(), employee);
		}
		
		return employee;
	}
	 
	private Employee merge(Employee oldData, Employee newData) {
		
		newData.setCreatedOn(oldData.getCreatedOn());
		return newData;
	} 
	
	public Employee delete(String employeeId) {
        return employeeMap.remove(employeeId);

	}
		
}
