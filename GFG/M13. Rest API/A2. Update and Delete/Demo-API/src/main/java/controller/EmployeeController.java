package controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
import dto.CreateEmployeeRequest;
import dto.UpdateEmployeeRequest;
import models.Employee;
import service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody CreateEmployeeRequest request) { 

		return employeeService.create(request);
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") String id) { 
		
		return employeeService.get(id);
	}
	
	@GetMapping("/employee/all")
	public List<Employee> getEmployees(){
		
		return employeeService.get();
	}
	
	//1.
	@PutMapping("/employee/{employeeId}")
	public Employee updateEmployee(@PathVariable("employeeId") String employeeId,
			@RequestBody UpdateEmployeeRequest request) { //employee create krte waqt jo data liya tha wahi data ko update krne ka allow karenge so create UpdateEmployeeRequest in dto. hum user se id lenge aur updated info in the form of object
		
		//3.
		return employeeService.update(employeeId, request);
		
	}
	
//  Dont define similar APIs in the server
//  @PutMapping("/employee/{id}")
//  public Employee updateEmployee2(@RequestParam("employeeId") String employeeId,
//                                 @RequestBody UpdateEmployeeRequest request){
//      return employeeService.update(employeeId, request);
//  }
	
	//7.
	@DeleteMapping("/employee")
	public Employee deleteEmployee(@RequestParam("id") String employeeId) {
		
		Employee deletedEmployee = employeeService.delete(employeeId);
		return deletedEmployee;
	} //call this method by URL: localhost:8080/employee?id=85fa2bf5-ad1e-4b0a-b44c-176fd01b2508 (request parameter)
	///employee?id=employeeId
	
	
	//the website endpoints are same but there are different methods.
	//A API cant have same method and path.
	

}
