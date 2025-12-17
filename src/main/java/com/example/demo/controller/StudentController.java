package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import com.example.demo.service.StudentService;
import com.example.demo.entity.Student;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/student/add")
    public Student createData(@RequestBody Student obj)
    {
        return service.addStudent(obj);
    }

    @GetMapping("/student/fetch")
    public List<Student> getData() {
        return service.getAllStudents();
    }

    @GetMapping("/student/fetch/{id}")
    public Optional<Student> getDatabyID(@PathVariable int id)
    {

    }
}
