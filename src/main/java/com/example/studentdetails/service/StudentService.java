package com.example.studentdetails.service;

import com.example.studentdetails.model.Student;

import java.util.List;

public interface StudentService {


    // to do the post operation
    public Student saveStudent(Student student);

    public List<Student> getAll();

}
