package com.estudosmongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("student")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	private String id;
	
	private String name;
	
	private String ar;
	
	private String birthDate;
	
	@DBRef
	private Course course;
}
