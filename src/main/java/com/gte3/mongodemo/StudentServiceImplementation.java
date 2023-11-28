package com.gte3.mongodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {



    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public String deleteByEmail(String email) {
        studentRepository.deleteByEmail(email);
        return "Student deleted Successfully";
    }

    @Override
    public String createStudent(Student student) {

        studentRepository.save(student);
        return "Student created Successfully";
    }

    @Override
    public String updateStudent(String email, Student student) {
        Student studentUpdate = studentRepository.findByEmail(email);
        studentUpdate.setName(student.getName());
        studentUpdate.setPhoneNumber(student.getPhoneNumber());
        studentUpdate.setCIN(student.getCIN());
        studentRepository.save(student);
        return "Student updated Successfully";
    }
}