package com.srs.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srs.employee.domain.Employee;
@Repository
public interface EmployeeRespository extends JpaRepository<Employee,Integer>{

}
