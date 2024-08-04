package com.qsp.springbootdemo05.Controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.qsp.springbootdemo05.dto.Employee;
import com.qsp.springbootdemo05.repository.EmployeeRepository;
import springbootdemo05.corsconfig.CorsConfig;
//@CrossOrigin("http://localhost:3000/#")
@RestController
//@CrossOrigin(origins="*" ,allowedHeaders  ="*")
@RequestMapping("/api/employees")
public class EmployeeController {   
	@Autowired  
	EmployeeRepository er;  
	CorsConfig cg;
	//@CrossOrigin(origins="http://localhost:3000/")
	@PostMapping("/hi")
   	public String m1() {
		return "hi my first Springboot Application";   
	}
	@PostMapping("/save")
	public String saveData(@RequestBody Employee employee) {
		er.save(employee);
		return "data saved Sucessfully";
}
	@GetMapping("/getdata")
	public Employee getEmployeeById(@RequestParam("id") int id) {
		Optional<Employee> optional = er.findById(id);
		Employee employee2 = optional.get();
		return employee2;
	 }      
	@DeleteMapping("/delete")
	public String deleteData(@RequestParam int id) {
		er.deleteById(id);
		return "data deleted";
	}
	@PutMapping("/updatedata")
	public String updateEmployee(@RequestBody Employee employee) {
		er.save(employee);
		return "data update sucessfully";
	}
}