package com.example.employeemanagement.service;

import java.util.List;

import com.example.employeemanagement.entities.Employee;

public interface EmployeeService {

	public List<Employee> getEmployee();
	
	public Employee getSingleEmployee(long employeeId);
	
	public Employee addEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
}
