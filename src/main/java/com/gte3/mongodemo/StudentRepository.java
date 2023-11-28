package com.gte3.mongodemo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

    Student findByEmail(String email);
    void deleteByEmail(String email);



}
