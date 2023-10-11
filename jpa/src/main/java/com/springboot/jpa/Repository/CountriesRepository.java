package com.springboot.jpa.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.jpa.Entity.Countries;
import com.springboot.jpa.Entity.Employees;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Integer> {

	Optional<Countries> findByid(int id);
	
	@Query("select c from Countries c where c.countrieName like ?1% ORDER By c.id ASC")
	List<Countries> getByName(String name);
}
