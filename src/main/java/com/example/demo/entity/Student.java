package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Student{

    @Id
    private int id;
    private String name;
    private String email;
    private float gpa;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }


    public float getGpa(){
        return this.gpa;
    }

    public void setGpa(float gpa){
        this.gpa = gpa;
    }

    public Student(int id, String name, String email, float gpa){
        this.id = id;
        this.name = name;
        this.email = email;
        this.gpa = gpa;
    }

    public Student(){}
}