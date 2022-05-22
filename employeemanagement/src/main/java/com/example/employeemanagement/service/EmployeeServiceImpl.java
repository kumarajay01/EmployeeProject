package com.example.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagement.databaseCon.EmployeeDatabaseCon;
import com.example.employeemanagement.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDatabaseCon employeeDatabaseCon; 
	
	public EmployeeServiceImpl() {
	}
	
	@Override
	public List<Employee> getEmployee() {
		return employeeDatabaseCon.findAll();
	}
	
	@Override
	public Employee getSingleEmployee(long employeeId) {
		return employeeDatabaseCon.getOne(employeeId);
	}
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDatabaseCon.save(employee);
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
		employeeDatabaseCon.save(employee);
		return employee;
	}

	
}
