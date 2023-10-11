package com.springboot.jpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.Entity.City;
import com.springboot.jpa.Entity.Employees;
import com.springboot.jpa.Service.EmployeesService;
import java.util.*;
@RestController
public class EmployeesController {

	@Autowired
	public EmployeesService employeesService;
	
	@GetMapping("/getAllEmployee")
	public List<Employees> getAllEmployee() {
		return employeesService.getAllEmployee();		
	}
	
	@PostMapping("/addEmployees")
	public List<Employees> addEmployee(@RequestBody List<Employees> employees) {
		return employeesService.addEmployee(employees);
	}
	
	@GetMapping("/Employees/{id}")
	public List<Employees>  Employee(@PathVariable int id) {
		return employeesService.findEmployeeId(id);		
	}
	
	@GetMapping("/JPQLEmployees/{id}")
	public List<Employees>  JPQLEmployee(@PathVariable int id) {
		return employeesService.getEmployeeInfo(id);		
	}
	

	
	/*@GetMapping("/EmployeesId/{ids}")
	public List<Employees>  Employees(@RequestBody List<Employees> ids) {
		return employeesService.findAllEmployeeId(ids);		
	}*/
}
