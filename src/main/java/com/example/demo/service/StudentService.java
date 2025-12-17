package com.example.demo.service;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.Student;
import java.util.*;

public interface StudentService{
    public Student addStudent(Student obj);
    public List<Student> getAllStudents();
    public Optional<Student> getStudent(int id);

}