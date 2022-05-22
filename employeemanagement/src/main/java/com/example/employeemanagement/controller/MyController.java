package com.example.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagement.entities.Employee;
import com.example.employeemanagement.service.EmployeeService;

@RestController
public class MyController {

	@Autowired
	private EmployeeService employeeService;
	
	//Get the employee data
	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		return this.employeeService.getEmployee();  
	}
	
	//get id wise employee data
	@GetMapping("/employee/{employeeId}")
	public Employee getSingleEmployee(@PathVariable String employeeId) {
		return this.employeeService.getSingleEmployee(Long.parseLong(employeeId));
	}
	
	//add employee
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return this.employeeService.addEmployee(employee);
	}
	
	//update Existing employee data
	@PutMapping("/employee") 
	public Employee updateEmployee(@RequestBody Employee employee ) {
		return this.employeeService.updateEmployee(employee);
	}
}
