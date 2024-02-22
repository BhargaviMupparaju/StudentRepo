package com.example.studentdetails.service;

import com.example.studentdetails.model.Student;
import com.example.studentdetails.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{


    @Autowired
    public StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
       return studentRepository.save(student);
    }

    @Override

    public List<Student> getAll(){
        return studentRepository.findAll();
    }
}
