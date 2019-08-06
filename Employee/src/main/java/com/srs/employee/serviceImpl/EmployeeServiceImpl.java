package com.srs.employee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srs.employee.domain.Employee;
import com.srs.employee.repository.EmployeeRespository;
import com.srs.employee.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	 EmployeeRespository employeeRespository;

	@Override
	public List<Employee> getAllEmployeeData() {
		return employeeRespository.findAll();
	}

	@Override
	public Employee addEmployeeDetails(Employee E) {
		return employeeRespository.save(E);
	}

	@Override
	public Employee updateEmployeeDetails(Employee E) {
		return employeeRespository.saveAndFlush(E);
	}

	@Override
	public void deleteEmployeeDetails(Integer id) {
		   employeeRespository.deleteById(id);
	}
	        

}
