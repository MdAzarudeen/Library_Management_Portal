package com.example.librarymanagementsystem.Repository;

import com.example.librarymanagementsystem.entitities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student,Integer> {

}
