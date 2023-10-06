package com.springboot.jpa.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.jpa.Entity.City;
import com.springboot.jpa.Repository.CityRepository;

@Service
public class CityService {

	@Autowired
	public CityRepository cityRepository;

	public List<City> findallCity() {
		return cityRepository.findAll();
	}

	public City SaveCity(City city) {
		return cityRepository.save(city);
	}

	public Optional<City> findbyCityId(int id) {
		return cityRepository.findById(id);
	}

	public City ExisttupdateCity(City city) {
		Optional<City> c = cityRepository.findById(city.getCityid());
		City citys = new City();
		citys.setCityid(c.get().getCityid());
		citys.setCityname(city.getCityname());
		citys.setCitycode(city.getCitycode());

		return cityRepository.save(citys);
	}

	public Optional<City> DeleteCity(int id) {
		cityRepository.deleteById(id);
		return null;
	}

}
