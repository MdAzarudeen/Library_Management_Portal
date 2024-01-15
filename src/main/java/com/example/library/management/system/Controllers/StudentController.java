package com.example.library.management.system.Controllers;

import com.example.library.management.system.Service.StudentService;
import com.example.library.management.system.entitities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent (@RequestBody Student student) {
        String res=studentService.addStudent(student);

        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }
}
