package com.curdexample.springboot.service;

import java.util.List;

import com.curdexample.springboot.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee>getAllEmployees();
    Employee getEmployeeById(long id);
    Employee updateEmployee(Employee employee, long id);
    Employee deleteEmployee(long id);
}
