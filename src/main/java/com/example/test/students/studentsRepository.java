package com.example.test.students;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.test.students.*;
public interface studentsRepository extends MongoRepository<students,String> {
}