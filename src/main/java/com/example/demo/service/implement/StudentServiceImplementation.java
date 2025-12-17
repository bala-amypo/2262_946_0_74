package com.example.demo.service.implement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    StudentRepository repo;

    @Override
    public Student addStudent(Student obj){
        studentDB.put(obj.getId(), obj);
        return repo.save(obj);
    }

    @Override
    public List<Student> getAllStudents(){
        return repo.findAll();
    }
}