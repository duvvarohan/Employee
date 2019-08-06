package com.srs.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srs.employee.domain.Employee;
import com.srs.employee.serviceImpl.EmployeeServiceImpl;

/**
 * @author SRS
 *
 */
@RestController
public class EmployeeController  {
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
    
	 @GetMapping("/List")
	    public List<Employee> getAllEmployeeData(){
			return employeeServiceImpl.getAllEmployeeData();
		 
	 }
	 
	 @PostMapping("/add")
	   public Employee addEmployeeDetails(@RequestBody Employee E) {
		return employeeServiceImpl.addEmployeeDetails(E);
		 
	 }
	 
	 @PutMapping("/update")
	   public Employee updateEmployeeDetails(@RequestBody Employee E) {
		return employeeServiceImpl.updateEmployeeDetails(E);
		 
	 }
	 @DeleteMapping("/delete/{id}")
	    public void deleteEmployeeDetails(@RequestBody @PathVariable("id") Integer id) {
		    employeeServiceImpl.deleteEmployeeDetails(id);
	 }
} 
