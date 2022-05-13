package com.estudosmongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudosmongodb.entity.Course;
import com.estudosmongodb.service.impl.CourseServiceImpl;

@RestController
@RequestMapping(value = "/course", produces = MediaType.APPLICATION_JSON_VALUE)
public class CourseController {
	
	@Autowired
	private CourseServiceImpl courseService;
	
	@GetMapping
	public ResponseEntity<List<Course>> findAll(){
		return ResponseEntity.ok(this.courseService.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Course> save(@RequestBody Course course) {
		return ResponseEntity.ok(this.courseService.save(course));
	}
}
