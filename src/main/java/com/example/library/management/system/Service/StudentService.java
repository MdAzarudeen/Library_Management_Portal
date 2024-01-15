package com.example.library.management.system.Service;

import com.example.library.management.system.Repository.StudentRepository;
import com.example.library.management.system.entitities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public String addStudent (Student student){
        studentRepository.save(student);
        return "Student added";
    }
}
