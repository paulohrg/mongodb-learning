package com.estudosmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	@Id
	private String id;
	
	private String name;
	
	private int period;
	
}
