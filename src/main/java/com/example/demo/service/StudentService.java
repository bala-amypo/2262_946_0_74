package com.example.demo.service;
import com.example.demo.repository.StudentRepository;

public interface StudentService extends StudentRepository{
    public Student addStudent(Student obj);
    public List<Student> getAllStudents();
}