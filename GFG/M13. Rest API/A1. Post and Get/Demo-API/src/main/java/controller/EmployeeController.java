package controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
import dto.CreateEmployeeRequest;
import models.Employee;
import service.EmployeeService;

@RestController
public class EmployeeController {
	
	/*8. Post method mai we take input from use, there are multiple forms of taking input
	 * Passing input using Query Patameter: Params are added as an extra parameter after the path.
	 *  https://www.google.com/search?q=icc+world+cup&oq=icc+world+c&gs_lcrp=EgZjaHJvbWUqEAgAEAAYgwEY4wIYsQMYgAQyEAgAEAAYgwEY4wIYsQMYgAQyEAgBEC4YgwEY1AIYsQMYgAQyEAgCEC4YgwEY1AIYsQMYgAQyDQgDEAAYgwEYsQMYgAQyBggEEEUYOTINCAUQABiDARixAxiKBTINCAYQABiDARixAxiABDIGCAcQRRg80gEIMzc2OGoxajeoAgCwAgA&sourceid=chrome&ie=UTF-8
	 *       (q = value & oq= value2 & gs_lcrp= value3: this is query parameter, q oq are parameter and we pass the value to it.
	 * Path Variable: parameter which is added in the path itself.
	 * https://www.google.com/search/q/icc+world+cup/oq/icc+world+c&gs_lcrp=EgZjaHJvbWUqE : this is how same url would look in Path variable.
	 * 
	 * request Body: If there are like 30 40 parameters using Query parameter or path variable wont be feasible. so we use this, we pass the data in JSON format. RequestBody actually says i'm taking an JSON object.
	 * It just that how you want you url to look like, there's nothing change in the backend.
	 */
	
	//we'll use RequestBody here to pass the input in JSON format. the data which comes in JSON format from user is converted to Java Class.
	//you dont take here complete model as input, that's like showing outside world how you are storing your data but you dont want that. You should take only those parameter which are mean to be taken from frontend. Rest all the information you are taking should be hidden. like i'll store one more information in Employee.java open it and see bottom.

	//Controller -> service -> Repository
	
	//18.
	@Autowired
	EmployeeService employeeService;
	
	
	//10.
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody CreateEmployeeRequest request) { //@RequestBody hai to input JSON format mai jayega
		//now we'll create a service that'll create an employee and autowire that EmployeeService here

		//17. employeeService ko autorwire karo and call the service
		return employeeService.create(request);//you can change the return type. ideally you should return object.
		
	}
	
	//19. now also create getmap, tabhi hum check kr payenge data store hua ya nhi
	@GetMapping("/employee/{employeeId}") //we are taking input as path variable. the name you're giving in annotation should be equal to the name you're giving in path.
	public Employee getEmployee(@PathVariable("employeeId") String id) { //id is just a variable so you can name it anything.
		
		return employeeService.get(id);
		
	}
	
	//22. toget all the employees
	@GetMapping("/employee/all")
	public List<Employee> getEmployees(){
		
		return employeeService.get();
	}
	
	

}
