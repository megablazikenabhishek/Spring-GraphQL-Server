package com.javagraphql.starter.controllers;

import com.javagraphql.starter.models.Status;
import com.javagraphql.starter.models.Student;
import com.javagraphql.starter.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @QueryMapping
    List<Student> students() {
        return studentRepository.findAll();
    }

    @MutationMapping
    Status saveStudent(@Argument String name, @Argument String email, @Argument Integer age){
        try {
            Student student = new Student(name, email, age);

            studentRepository.save(student);

            return Status.builder()
                    .success(true)
                    .message("Created Student Successfully!!")
                    .errDetails(null)
                    .build();
        } catch (Exception e) {
            return Status.builder()
                    .success(false)
                    .message("Error Creating Student!!")
                    .errDetails(e.toString())
                    .build();
        }
    }
}
