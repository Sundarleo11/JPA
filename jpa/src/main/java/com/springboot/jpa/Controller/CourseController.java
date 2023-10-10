package com.springboot.jpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.Entity.Countries;
import com.springboot.jpa.Entity.Courses;
import com.springboot.jpa.Pojos.CourseRequest;
import com.springboot.jpa.Service.CourseService;

@RestController
public class CourseController {

	@Autowired
	public CourseService courseService;
	
	
	@PostMapping("/addNew-Course")
	public Courses addCourse(@RequestBody CourseRequest courseRequest) {
		return courseService.addCourseWithContent(courseRequest);
	}
}
