package com.example.library.management.system.Controllers;

import com.example.library.management.system.RequestDTOs.ModifyStudentPhoneNo;
import com.example.library.management.system.Service.StudentService;
import com.example.library.management.system.entitities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping ("/getStudentFromId")
    public ResponseEntity getStudentFromId (@RequestParam int StudentId) {
        try{
            Student student= studentService.getStudentFromId(StudentId);
            return new ResponseEntity(student,HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping ("/modifyPhoneNo")
    public ResponseEntity modifyPhoneNo(@RequestBody ModifyStudentPhoneNo modifyStudentPhoneNo)  {

        try {
            return new ResponseEntity(studentService.modifyStudentPhoneNo(modifyStudentPhoneNo),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

    }
}
