package com.example.employeemanagement.databaseCon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeemanagement.entities.Employee;

public interface EmployeeDatabaseCon extends JpaRepository<Employee, Long> {

}
