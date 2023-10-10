package com.springboot.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.Entity.CourseContent;

@Repository
public interface CourseContentRepository extends JpaRepository<CourseContent, Integer> {
	
	
	public CourseContent findById(int id);

}
