package com.springboot.jpa.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.Entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

	Optional<City> findById(int id);
	Optional<City> save(int id);
}
