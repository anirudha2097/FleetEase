package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.exceptions.EmployeeException;
import com.fleetease.backend.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee) throws EmployeeException;
	
	public Employee getEmployee(Integer employeeId) throws EmployeeException;
	
	public String deleteEmployee(Integer employeeId) throws EmployeeException;
	
	public Employee updateEmployee(Integer employeeId, Employee employee) throws EmployeeException;
	
	public List<Employee> getAllEmployee() throws EmployeeException;
	
}
