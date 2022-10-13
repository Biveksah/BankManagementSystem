package com.bway.springdemo.bankingsystem.Service.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.springdemo.bankingsystem.Model.Employee;
import com.bway.springdemo.bankingsystem.Repository.EmployeeRepository;
import com.bway.springdemo.bankingsystem.Service.EmployeeService;

@Service
public class EmployeeServiceImpls implements EmployeeService{
    
	@Autowired
	EmployeeRepository empRepo;
	@Override
	public void addEmp(Employee emp) {
		
		empRepo.save(emp);
	}

	@Override
	public void deleteEmp(Long id) {
	
		empRepo.deleteById(id);
	}

	@Override
	public void updateEmp(Employee emp) {
		
		empRepo.save(emp);
	}

	@Override
	public Employee getById(Long id) {
	
		return empRepo.getById(id);
	}

	@Override
	public List<Employee> getAllEmp() {
	
		return empRepo.findAll();
	}

}
