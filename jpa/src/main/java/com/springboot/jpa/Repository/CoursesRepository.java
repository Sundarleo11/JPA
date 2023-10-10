package com.springboot.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.Entity.Courses;

@Repository
public interface CoursesRepository extends JpaRepository <Courses, Integer>{

	public Courses findById(int id);
}
