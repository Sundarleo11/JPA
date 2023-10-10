package com.springboot.jpa.Entity;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="course")
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private int id;
	
	@Column(name="coursename")
	private String coursename;
	
	@ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(name="course_coursecontent_mapping",
	joinColumns = @JoinColumn(name="course_id"),
	inverseJoinColumns = @JoinColumn(name="content_id"))
	@JsonIgnore
	private Set<CourseContent> coursecontent = new HashSet();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Set<CourseContent> getCoursecontent() {
		return coursecontent;
	}

	public void setCoursecontent(Set<CourseContent> coursecontent) {
		this.coursecontent = coursecontent;
	};




}
