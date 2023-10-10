package com.springboot.jpa.Service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.Entity.CourseContent;
import com.springboot.jpa.Entity.Courses;
import com.springboot.jpa.Pojos.CourseRequest;
import com.springboot.jpa.Repository.CourseContentRepository;
import com.springboot.jpa.Repository.CoursesRepository;

@Service
public class CourseService {
    
	@Autowired
	public CoursesRepository coursesRepository;
	@Autowired
	public CourseContentRepository courseContentRepository;
	
	
	public Courses addCourseWithContent(CourseRequest courseRequest) {
		// TODO Auto-generated method stub
		Courses course=new Courses();
		course.setId(courseRequest.id);
		course.setCoursename(courseRequest.coursename);
		course.setCoursecontent(courseRequest.coursecontent.stream()
				.map(coursecontent->{
			 CourseContent cc=  coursecontent;
			 if(cc.getId()>0) {
		     	cc	= courseContentRepository.findById(cc.getId());
			 }
			 //cc.getCourses().add(course);
			 cc.addCourse(course);
			 return cc;
//			 
		}).collect(Collectors.toSet()));
		
		return coursesRepository.save(course);
	}
}
