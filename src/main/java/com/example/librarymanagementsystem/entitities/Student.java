package com.example.librarymanagementsystem.entitities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @OneToOne (mappedBy = "student",cascade = CascadeType.ALL)
    private LibraryCard libraryCard;
}
