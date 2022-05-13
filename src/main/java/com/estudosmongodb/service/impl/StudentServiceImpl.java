package com.estudosmongodb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudosmongodb.entity.Course;
import com.estudosmongodb.entity.Student;
import com.estudosmongodb.repository.CourseRepository;
import com.estudosmongodb.repository.StudentRepository;
import com.estudosmongodb.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Student> findAll() {
		return this.studentRepository.findAll();
	}
	
	@Override
	public Student findById(String idStudent) {
		return this.studentRepository.findById(idStudent).get();
	}

	@Override
	public Student save(Student student) {
		Course course = courseRepository.findById(student.getCourse().getId()).get();
		student.setCourse(course);
		return studentRepository.save(student);
	}

}
