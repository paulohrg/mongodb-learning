package com.estudosmongodb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudosmongodb.model.Course;
import com.estudosmongodb.repository.CourseRepository;
import com.estudosmongodb.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> findAll() {
		return this.courseRepository.findAll();
	}

	@Override
	public Course save(Course course) {
		return this.courseRepository.save(course);
	}

	@Override
	public Course findById(String id) {
		return this.courseRepository.findById(id).get();
	}

}
