package com.estudosmongodb.service;

import java.util.List;

import com.estudosmongodb.entity.Course;

public interface CourseService {
	
	public List<Course> findAll();
	
	public Course findById(String id);
	
	public Course save(Course course);
}
