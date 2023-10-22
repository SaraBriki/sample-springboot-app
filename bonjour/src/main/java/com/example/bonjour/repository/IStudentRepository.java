package com.example.bonjour.repository;

import com.example.bonjour.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends MongoRepository<Student, String> {
}

