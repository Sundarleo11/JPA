package com.springboot.jpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.Entity.City;
import com.springboot.jpa.Entity.Countries;
import com.springboot.jpa.Service.CityService;
import com.springboot.jpa.Service.CountriesService;

@RestController
public class CountriesCountroller {

	
	@Autowired
	public CountriesService countriesService;
	
	@GetMapping("/getAllCountries")
	public List<Countries> findAllCity() {
		return countriesService.findallCountries();
		
	}
	
	@PostMapping("/saveCountrieInfo")
	public Countries saveCityInfo(@RequestBody Countries countries) {
		return countriesService.SaveCountriesInfo(countries);
	}
	
	@GetMapping("/getCountrieName")
	public List<Countries> getCountrieName(@RequestParam String name) {
		return countriesService.geCounteryName(name);
		
	}
}
