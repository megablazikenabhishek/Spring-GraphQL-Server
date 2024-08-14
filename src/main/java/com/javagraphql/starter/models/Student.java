package com.javagraphql.starter.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Value;

@Entity
public class Student {
    @Id
    @GeneratedValue
    Integer studentId;

    String name;

    String email;

    Integer age;

    public Student(){}

    public Student(String name, String email, Integer age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
