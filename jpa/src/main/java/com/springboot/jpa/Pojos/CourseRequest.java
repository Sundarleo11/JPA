package com.springboot.jpa.Pojos;

import java.util.Set;

import com.springboot.jpa.Entity.CourseContent;

public class CourseRequest {

	public int id;
	public String coursename;
	public Set<CourseContent> coursecontent;
}
