package com.estudosmongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudosmongodb.entity.Student;
import com.estudosmongodb.service.impl.StudentServiceImpl;

@RestController
@RequestMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController {

	@Autowired
	private StudentServiceImpl studentService;
	
	@GetMapping
	public ResponseEntity<List<Student>> findAll() {
		return ResponseEntity.ok(this.studentService.findAll());
	}
	
	@GetMapping("/{idStudent}")
	public ResponseEntity<Student> findStudentById(@PathVariable String idStudent) {
		return ResponseEntity.ok(this.studentService.findById(idStudent));
	}
	
	@PostMapping
	public ResponseEntity<Student> SaveStudent(@RequestBody Student student) {
		return ResponseEntity.ok(this.studentService.save(student));
	}
}
