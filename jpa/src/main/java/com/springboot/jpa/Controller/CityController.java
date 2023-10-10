package com.springboot.jpa.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.Entity.City;
import com.springboot.jpa.Pojos.CityRequest;
import com.springboot.jpa.Repository.CityRepository;
import com.springboot.jpa.Service.CityService;

@RestController
public class CityController {

	@Autowired
	public CityService cityService;
	
	@GetMapping("/getAllcity")
	public List<City> findAllCity() {
		return cityService.findallCity();
		
	}
	
	@GetMapping("/findCityInfo/{id}")
	public Optional<City> FindByCityInfo(@PathVariable int id) {
		return cityService.findbyCityId(id);
		
	}
	
	@PostMapping("/saveCityInfo")
	public City saveCityInfo(@RequestBody City city) {
		return cityService.SaveCity(city);
	}
	
	@PutMapping("/updatecityInfo")
	public City saveExsiteCityInfo(@RequestBody City city) {
		return cityService.ExisttupdateCity(city);
	}
	
	@GetMapping("/deleteCity/{id}")
	public Optional<City> DeleteCity(@PathVariable int id) {
		return cityService.DeleteCity(id);
		
	}
	
	@PostMapping("/addnewCity")
	public City addnewCity(@RequestBody CityRequest cityRequest) {
		return cityService.addnewcity(cityRequest);
		
	}
}
