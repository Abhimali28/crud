package com.qsp.springbootdemo05.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.qsp.springbootdemo05.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}



















