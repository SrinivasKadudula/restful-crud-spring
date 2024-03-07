package com.curdexample.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdexample.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
