package com.estudosmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.estudosmongodb.model.Course;

@Repository
public interface CourseRepository extends MongoRepository<Course, String>{

}
