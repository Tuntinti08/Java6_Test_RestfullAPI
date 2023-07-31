package com.example.java6.controller;

import com.example.java6.Repository.StudentRepo;
import com.example.java6.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Struct;
import java.util.List;

@CrossOrigin("*")
@RestController

public class StudentRestController {

    @Autowired
    StudentRepo repo;

    @GetMapping("/rest/students")
    public List<Student> getAll(Model model) {
        return repo.findAll();
    }

    @GetMapping("/rest/students/{email}")
    public Student getOne(@PathVariable("email") String email) {
        return repo.findById(email).get();
    }

    @PostMapping("/rest/students")
    public Student post(@RequestBody Student student) {
        repo.save(student);
        return student;
    }

    @PutMapping("/rest/students/{email}")
    public Student put(@PathVariable("email") String email, @RequestBody Student student) {
        repo.save(student);
        return student;
    }

    @DeleteMapping("/rest/students/{email}")
    public void delete(@PathVariable("email") String email) {
        repo.deleteById(email);
    }
}
