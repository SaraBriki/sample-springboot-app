package com.example.bonjour.model;

import jdk.jfr.DataAmount;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Students")
public class Student {
    @Id
    private String id;
    private String firstName;

    public Student(String id, String firstName, String lastName, int age, String university, String academicLevel, String specialization) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.university = university;
        this.academicLevel = academicLevel;
        this.specialization = specialization;
    }

    private String lastName;
    private int age;
    private String university;
    private String academicLevel;
    private String specialization;

// Getters
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
    public int getAge() {
        return this.age;
    }

    public String getUniversity(){
        return this.university;
    }
    
    public String getLevel(){
        return this.academicLevel;
    }
    
    public String getSpecialization(){
        return this.specialization;
    }
    
// Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public void setUniversity(String uni){
        this.university = uni;
    }
    
    public void setAcademicLevel(String level){
        this.academicLevel = level;
    }
    
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
}



