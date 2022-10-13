package com.bway.springdemo.bankingsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springdemo.bankingsystem.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
