package com.springboot.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.Entity.Countries;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Integer> {

}
