package com.springboot.jpa.Entity;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;;

@Entity
@Table(name="cities")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "City_Id")
	private int cityid;

	//columnDefinition = "character varying(3) not null default 'NA'"
	@Column(name = "City_Code")
	private String citycode;

	@Column(name = "City_Name")
	private String cityname;

	public int getCityid() {
		return cityid;
	}

	@ManyToOne
	@JoinColumn(name = "countrie_Id")
	private Countries countries;

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}


	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", citycode=" + citycode + ", cityname=" + cityname + "]";
	}


}
