package com.fleetease.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fleetease.backend.dto.EmployeeDto;
import com.fleetease.backend.exceptions.EmployeeException;
import com.fleetease.backend.model.Employee;
import com.fleetease.backend.repository.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee addEmployee(EmployeeDto employeeDto) throws EmployeeException {
		// TODO Auto-generated method stub
		
		Optional<Employee> optEmployee = employeeRepo.findByMobileNo(employeeDto.getMobileNo());
		
		if(optEmployee.isEmpty()) {
			
			Employee employee = new Employee();
			employee.setAddress(employeeDto.getAddress());
			employee.setMobileNo(employeeDto.getMobileNo());
			employee.setName(employeeDto.getName());
			employee.setRole(employeeDto.getRole());
			
			Employee savedEmployee = employeeRepo.save(employee);
			if(savedEmployee!=null) {
				return savedEmployee;
			} else {
				throw new EmployeeException("Employee not added!");
			}
			
		} else {
			throw new EmployeeException("Employee already exists!");
		}

	}

	@Override
	public Employee getEmployee(Integer employeeId) throws EmployeeException {
		
		Optional<Employee> optEmployee = employeeRepo.findById(employeeId);
		
		if(optEmployee.isPresent()) {
			return optEmployee.get();
 		} else {
 			throw new EmployeeException("Employee not found!");
 		}
		
	}

	@Override
	public String deleteEmployee(Integer employeeId) throws EmployeeException {

		Optional<Employee> optEmployee = employeeRepo.findById(employeeId);
		
		if(optEmployee.isPresent()) {
			employeeRepo.delete(optEmployee.get());
			return "Employee deleted succesfully.";
 		} else {
 			throw new EmployeeException("Employee not found!");
 		}
		
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		
		Optional<Employee> optEmployee = employeeRepo.findById(employee.getEmployeeId());
		
		if(optEmployee.isPresent()) {
			Employee updatedEmployee = employeeRepo.save(employee);
			return updatedEmployee;
 		} else {
 			throw new EmployeeException("Employee not found!");
 		}
		
	}

	@Override
	public List<Employee> getAllEmployee() throws EmployeeException {

		List<Employee> employees = employeeRepo.findAll();
		
		if(!employees.isEmpty()) {
			return employees;
		} else {
			throw new EmployeeException("Employees not found!");
		}
	}

}
