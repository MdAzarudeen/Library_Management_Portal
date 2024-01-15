package com.example.library.management.system.entitities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Table (name="Student")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int StudentId;
    private String name;
    private String branch;
    private double cgpa;
    private String phoneNo;
}
