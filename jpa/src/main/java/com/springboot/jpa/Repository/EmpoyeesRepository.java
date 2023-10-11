package com.springboot.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.Entity.Employees;
import java.util.*;
@Repository
public interface EmpoyeesRepository extends JpaRepository <Employees, Integer> {

	public List<Employees> findById(int employeeId);

	@Query("from Employees where id=?1")
	List<Employees> getByid(int id);
	

   
}
