package controller;

import java.sql.SQLException;
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
import jakarta.validation.Valid;
import models.Employee;
import service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody @Valid CreateEmployeeRequest request) throws SQLException { 

		return employeeService.create(request);
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") String id) { 
		
		return employeeService.get(id);
	}
	
	@GetMapping("/employee/all")
	public List<Employee> getEmployees() throws SQLException{
		
		return employeeService.get();
	} 
	
	@PutMapping("/employee/{employeeId}")
	public Employee updateEmployee(@PathVariable("employeeId") String employeeId,
			@RequestBody @Valid UpdateEmployeeRequest request) {
		
		return employeeService.update(employeeId, request);
		
	}
	
	@DeleteMapping("/employee")
	public Employee deleteEmployee(@RequestParam("id") String employeeId) {
		
		Employee deletedEmployee = employeeService.delete(employeeId);
		return deletedEmployee;
	} 
	
}
