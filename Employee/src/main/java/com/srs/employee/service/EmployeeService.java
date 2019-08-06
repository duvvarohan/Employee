package com.srs.employee.service;

import java.util.List;

import com.srs.employee.domain.Employee;

public interface EmployeeService  {
     
	
	     List<Employee> getAllEmployeeData();
	     Employee addEmployeeDetails(Employee E);
	     Employee updateEmployeeDetails(Employee E);
	     void deleteEmployeeDetails(Integer id);
	        
}
