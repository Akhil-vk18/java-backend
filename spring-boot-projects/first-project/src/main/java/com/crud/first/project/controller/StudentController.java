package com.crud.first.project.controller;

import com.crud.first.project.StudentRepo.StudentRepo;
import com.crud.first.project.model.Student;
import org.hibernate.action.internal.CollectionRecreateAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;
    @GetMapping("/student")
    public List<Student> getStudent(){
        return repo.findAll();
    }

    @GetMapping("/student/{id}")
    public Student getById(@PathVariable int id){
        return repo.findById(id).get();
    }

    @PostMapping("/create")
    public void createStudent(@RequestBody Student student){
        repo.save(student);
    }

    @DeleteMapping("/delete/{id}")
    public void  delete(@PathVariable int id){
        Student student = repo.findById(id).get();
        repo.delete(student);
    }
}
