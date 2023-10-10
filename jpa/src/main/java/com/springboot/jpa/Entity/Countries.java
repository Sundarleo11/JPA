package com.springboot.jpa.Entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Countries")
public class Countries {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="countrie_Id")
	private int id;
	
	@Column(name="Countrie_name")
	private String countrieName;
	
	
	
	@OneToMany
	@JoinColumn(name="countrie_Id")
	@JsonIgnore
	private Set<City> city;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountrieName() {
		return countrieName;
	}

	public void setCountrieName(String countrieName) {
		this.countrieName = countrieName;
	}


	/*
	 * public Set<City> getCity() { return city; }
	 * 
	 * public void setCity(Set<City> city) { this.city = city; }
	 */

	public Set<City> getCity() {
		return city;
	}

	public void setCity(Set<City> city) {
		this.city = city;
	}

	
	
	

	

	

	
	
}
