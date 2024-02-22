package com.example.studentdetails.Controller;

import com.example.studentdetails.model.Student;
import com.example.studentdetails.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);

        return "New student added to the list";
    }

    @GetMapping("/getAll")
    public List<Student> getStudents(){
        return studentService.getAll();
    }

}
