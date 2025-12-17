package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplementation {

    @Autowired
    StudentRepository repo;

    public Student addStudent(Student obj){
        studentDB.put(obj.getId(), obj);
        return repo.save(obj);
    }

    public List<Student> getAllStudents(){
        return repo.findAll();
    }
}