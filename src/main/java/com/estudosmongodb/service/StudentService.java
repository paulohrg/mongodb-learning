package com.estudosmongodb.service;

import java.util.List;

import com.estudosmongodb.entity.Student;

public interface StudentService {

	public List<Student> findAll();
	
	public Student findById(String idStudent);
	
	public Student save(Student student);
}
