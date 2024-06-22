package com.example.librarymanagementsystem.Service;

import com.example.librarymanagementsystem.Repository.StudentRepository;
import com.example.librarymanagementsystem.RequestDTOs.ModifyStudentPhoneNo;
import com.example.librarymanagementsystem.entitities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public String addStudent (Student student){
        Student savedStudent=studentRepository.save(student);
        return "Student added with Id "+ savedStudent.getStudentId();
    }


    public Student getStudentFromId(int studentId) throws Exception {
        Optional<Student> OptionalStudent=studentRepository.findById(studentId);
        if(OptionalStudent.isEmpty()){
            throw new Exception("Student id entered is incorrect");
        }

        Student student=OptionalStudent.get();
        return student;
    }

    public String modifyStudentPhoneNo(ModifyStudentPhoneNo modifyStudentPhoneNo) throws Exception {
        int studentId=modifyStudentPhoneNo.getStudentId();
        String newPhoneNo=modifyStudentPhoneNo.getStudentPhoneNo();

        Optional<Student> optionalStudent= studentRepository.findById(studentId);
        if(optionalStudent.isEmpty()){
            throw new Exception();
        }
        Student student= optionalStudent.get();
        student.setPhoneNo(newPhoneNo);
        studentRepository.save(student);
        return "StudentId "+student.getStudentId()+"  phone number updated to "+student.getPhoneNo();

    }
}
