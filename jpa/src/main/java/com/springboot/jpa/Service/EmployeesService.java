package com.springboot.jpa.Service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.Entity.Employees;
import com.springboot.jpa.Repository.EmpoyeesRepository;

@Service
public class EmployeesService {

	@Autowired
	public EmpoyeesRepository empoyeesRepository;

	public List<Employees> addEmployee(List<Employees> employees) {

		return empoyeesRepository.saveAll(employees);
	}

	public List<Employees> getAllEmployee() {
		return empoyeesRepository.findAll();
	}

	public List<Employees> findEmployeeId(int id) {
		return empoyeesRepository.findById(id);
	}

	public List<Employees> getEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return empoyeesRepository.getByid(id);
	}

	public Employees newEmployee(Employees employees) {
		// TODO Auto-generated method stub
		return empoyeesRepository.save(employees);
	}

}
