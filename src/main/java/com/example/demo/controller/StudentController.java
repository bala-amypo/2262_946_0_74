package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return service.getStudent(id);
    }

    @PutMapping("/student/update")
    public Optional<Student> updateDataById(@RequestBody Student obj, int id){
        return service.updateDatabyId(obj, id);
    }
}
