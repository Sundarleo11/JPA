package com.springboot.jpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.Entity.City;
import com.springboot.jpa.Entity.Countries;
import com.springboot.jpa.Repository.CityRepository;
import com.springboot.jpa.Repository.CountriesRepository;

@Service
public class CountriesService {
	
	@Autowired
	public CityRepository cityRepository;
	@Autowired
	public CountriesRepository countriesRepository;

	public List<Countries> findallCountries() {
		return countriesRepository.findAll();
	}

	public Countries SaveCountriesInfo(Countries countries) {
		return countriesRepository.save(countries);
	}

}
