package com.springboot.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.Entity.Employees;
import java.util.*;
@Repository
public interface EmpoyeesRepository extends JpaRepository <Employees, Integer> {

	public List<Employees> findById(int employeeId);

	//public List<Employees> findByAllId(List<Employees> employeeId);
	
	//Employees findById(int id);
	//List<Employees> findbyEmployeename(String employeeName);
}
