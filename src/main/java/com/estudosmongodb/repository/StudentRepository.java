package com.estudosmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.estudosmongodb.model.Student;


@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

}
