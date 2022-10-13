package com.bway.springdemo.bankingsystem.Service;

import java.util.List;

import com.bway.springdemo.bankingsystem.Model.Employee;

public interface EmployeeService {

	void addEmp(Employee emp);
	void deleteEmp(Long id);
	void updateEmp(Employee emp);
	Employee getById(Long id);
	List<Employee> getAllEmp();
	
}
