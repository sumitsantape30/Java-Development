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

	//5.
	public Employee update(Employee employee) {
		
		Employee existingEmployee = employeeMap.get(employee.getId());
		if(existingEmployee != null) {
			
			//merge existing data as well as old data.
			employee = merge(existingEmployee, employee);
			
			employeeMap.put(employee.getId(), employee);
		}
		
		return employee;
	//this is actually patch and not put. even if they call it put internally they're merging data only. for put we need createOn as well from UI.
	}
	
	/*PUT works below way
	 * 
	 * d1 :{(k1,v1), (k2,v2)} d2:{(k2,v2), (k3,v3)} afer doing put d2:{(k1, v1), (k2, v2), (k3, v3)}
	 * 
	 */
	
	//6. 
	private Employee merge(Employee oldData, Employee newData) {
		
		newData.setcreatedOn(oldData.getcreatedOn());
		return newData;
	} //now delete method likhenge open EmployeeController

	//9
	public Employee delete(String employeeId) {
        return employeeMap.remove(employeeId);

	}
		
}
