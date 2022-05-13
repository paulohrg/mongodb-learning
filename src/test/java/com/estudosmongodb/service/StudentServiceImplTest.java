package com.estudosmongodb.service;

import com.estudosmongodb.model.Course;
import com.estudosmongodb.model.Student;
import com.estudosmongodb.repository.CourseRepository;
import com.estudosmongodb.repository.StudentRepository;
import com.estudosmongodb.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class StudentServiceImplTest {

	@InjectMocks
	private StudentServiceImpl studentService;
	
	@Mock
	private CourseRepository courseRepository;
	
	@Mock
	private StudentRepository studentRepository;
	
	private Student student;
	private Course course;
	
	@BeforeEach
	public void setup() {
		student = new Student().builder()
				.id("1a")
				.birthDate("01/01/2021")
				.name("Paulo")
				.ar("123")
				.course(new Course().builder()
						.id("1b").build())
				.build();

		course = new Course("1b", "TADS", 5);
		
		Student completStudent = student;
		completStudent.setCourse(course);
		
		Mockito.when(courseRepository.findById("1b")).thenReturn(Optional.of(course));
		Mockito.when(studentRepository.save(completStudent)).thenReturn(completStudent);
	}
	
	@Test
	public void SaveStudentTest() {
		Student estudanteSalvo = studentService.save(student);
		Assertions.assertEquals("TADS", estudanteSalvo.getCourse().getName());
		Assertions.assertEquals("Paulo", estudanteSalvo.getName());
		Assertions.assertEquals("123", estudanteSalvo.getAr());
	}
}
